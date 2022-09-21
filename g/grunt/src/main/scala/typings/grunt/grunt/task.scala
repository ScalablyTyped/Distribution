package typings.grunt.grunt

import typings.grunt.grunt.config.IProjectConfig
import typings.grunt.grunt.file.IFileMap
import typings.grunt.grunt.file.IFilesArray
import typings.grunt.grunt.file.IFilesConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object task {
  
  @js.native
  trait AsyncResultCatcher extends StObject {
    
    def apply(): Unit = js.native
    def apply(error: js.Error): Unit = js.native
    def apply(result: Any): Unit = js.native
    /**
      * Either false or an Error object may be passed to the done function
      * to instruct Grunt that the task has failed.
      */
    def apply(success: Boolean): Unit = js.native
  }
  
  /**
    * {@link http://gruntjs.com/api/grunt.task}
    */
  @js.native
  trait CommonTaskModule extends StObject {
    
    /**
      * Check with the name, if a task exists in the registered tasks.
      * @param name The task name to check.
      * @since 0.4.5
      */
    def exists(name: String): Boolean = js.native
    
    def registerMultiTask(
      taskName: String,
      taskDescription: String,
      taskFunction: js.ThisFunction1[/* this */ IMultiTask[Any], /* repeated */ Any, Unit]
    ): Unit = js.native
    /**
      * Register a "multi task." A multi task is a task that implicitly iterates over all of its
      * named sub-properties (AKA targets) if no target was specified.
      * In addition to the default properties and methods, extra multi task-specific properties
      * are available inside the task function as properties of the this object.
      *
      * @note taskFunction.apply(scope: grunt.task.IMultiTask<any>, args: any[])
      */
    def registerMultiTask(
      taskName: String,
      taskFunction: js.ThisFunction1[/* this */ IMultiTask[Any], /* repeated */ Any, Unit]
    ): Unit = js.native
    
    def registerTask(
      taskName: String,
      description: String,
      taskFunction: js.ThisFunction1[/* this */ ITask, /* repeated */ Any, Unit]
    ): Unit = js.native
    def registerTask(taskName: String, description: String, taskList: js.Array[String]): Unit = js.native
    /**
      * If a description and taskFunction are passed, the specified function will be executed
      * whenever the task is run.
      *
      * In addition, the specified description will be shown when grunt --help is run.
      * Task-specific properties and methods are available inside the task function as properties
      * of the this object. The task function can return false to indicate that the task has failed.
      *
      * @note taskFunction.apply(scope: grunt.task.ITask, args: any[])
      */
    def registerTask(taskName: String, taskFunction: js.ThisFunction1[/* this */ ITask, /* repeated */ Any, Unit]): Unit = js.native
    /**
      * If a task list is specified, the new task will be an alias for one or more other tasks.
      * Whenever this "alias task" is run, every specified task in taskList will be run, in the order specified.
      * The taskList argument must be an array of tasks.
      */
    def registerTask(taskName: String, taskList: js.Array[String]): Unit = js.native
    
    /**
      * Rename a task. This might be useful if you want to override the default behavior of a task, while retaining the old name.
      * Note that if a task has been renamed, the this.name and this.nameArgs properties will change accordingly.
      * @see ITask
      * @param oldname The previous name of the task.
      * @param newname The new name for the task.
      */
    def renameTask(oldname: String, newname: String): Unit = js.native
  }
  
  /**
    * {@link http://gruntjs.com/inside-tasks#inside-multi-tasks}
    */
  @js.native
  trait IMultiTask[T]
    extends StObject
       with ITask {
    
    /**
      * In a multi task, this is the actual data stored in the Grunt config object for the given target.
      * For example, if a "sample" multi task was run as grunt sample:foo with the config data
      * {sample: {foo: "bar"}}, inside the task function, this.data would be "bar".
      *
      * @note It is recommended that this.options this.files and this.filesSrc are used instead of this.data,
      *       as their values are normalized.
      */
    var data: T = js.native
    
    /**
      * In a multi task, all files specified using any Grunt-supported file formats and options,
      * globbing patterns or dynamic mappings will automatically be normalized into a single format:
      * the Files Array file format.
      *
      * What this means is that tasks don't need to contain a ton of boilerplate for explicitly
      * handling custom file formats, globbing patterns, mapping source files to destination files
      * or filtering out files or directories. A task user can just specify files per the Configuring
      * tasks guide, and Grunt will handle all the details.
      *
      * Your task should iterate over the this.files array, utilizing the src and dest properties of
      * each object in that array. The this.files property will always be an array.
      * The src property will also always be an array, in case your task cares about multiple source
      * files per destination file.
      *
      * @note it's possible that nonexistent files might be included in src values,
      *       so you may want to explicitly test that source files exist before using them.
      */
    var files: IFilesArray = js.native
    
    /**
      * In a multi task, all src files files specified via any file format are reduced to a single array.
      * If your task is "read only" and doesn't care about destination filepaths,
      * use this array instead of this.files.
      */
    var filesSrc: js.Array[String] = js.native
    
    /**
      * In a multi task, this property contains the name of the target currently being iterated over.
      * For example, if a "sample" multi task was run as grunt sample:foo with the config data
      * {sample: {foo: "bar"}}, inside the task function, this.target would be "foo".
      */
    var target: String = js.native
  }
  
  /**
    * @link http://gruntjs.com/inside-tasks
    *
    * Grunt version 0.4.x
    */
  @js.native
  trait ITask extends StObject {
    
    /**
      * An array of arguments passed to the task.
      * For example, if a "sample" task was run as grunt sample:foo:bar,
      * inside the task function, this.args would be ["foo", "bar"].
      */
    var args: js.Array[String] = js.native
    
    /**
      * If a task is asynchronous, this method must be invoked to instruct Grunt to wait.
      * It returns a handle to a "done" function that should be called when the task has completed.
      *
      *   // Tell Grunt this task is asynchronous.
      *   var done = this.async();
      *   // Your async code.
      *   setTimeout(function() {
      *     // Let's simulate an error, sometimes.
      *     var success = Math.random() > 0.5;
      *     // All done!
      *     done(success);
      *   }, 1000);
      */
    def async(): AsyncResultCatcher = js.native
    
    /**
      * The number of grunt.log.error calls that occurred during this task.
      * This can be used to fail a task if errors were logged during the task.
      */
    var errorCount: Double = js.native
    
    /**
      * An object generated from the arguments passed to the task.
      * For example, if a "sample" task was run as grunt sample:foo:bar,
      * inside the task function, this.flags would be {foo: true, bar: true}.
      */
    var flags: js.Array[IFlag] = js.native
    
    /**
      * The name of the task, as defined in grunt.registerTask.
      * For example, if a "sample" task was run as grunt sample or grunt sample:foo,
      * inside the task function, this.name would be "sample".
      */
    var name: String = js.native
    
    /**
      * The name of the task, including any colon-separated arguments or flags specified on the command-line.
      * For example, if a "sample" task was run as grunt sample:foo,
      * inside the task function, this.nameArgs would be "sample:foo".
      */
    var nameArgs: String = js.native
    
    def options(defaultsObj: Any): ITaskOptions = js.native
    /**
      * Returns an options object.
      * Properties of the optional defaultsObj argument will be overridden by any task-level options
      * object properties, which will be further overridden in multi tasks by any target-level
      * options object properties.
      */
    @JSName("options")
    def options_T_T[T](defaultsObj: T): T = js.native
    
    def requires(tasks: String, otherTasks: String*): Unit = js.native
    /**
      * If one task depends on the successful completion of another task (or tasks),
      * this method can be used to force Grunt to abort if the other task didn't run,
      * or if the other task failed.
      *
      * @param tasks an array of task names or individual task names, as arguments.
      * @note that this won't actually run the specified task(s),
      * it will just fail the current task if they haven't already run successfully.
      */
    def requires(tasks: js.Array[String]): Unit = js.native
    def requires(tasks: js.Array[String], otherTasks: js.Array[String]*): Unit = js.native
    
    /**
      * Fail the current task if one or more required config properties is missing.
      * One or more string or array config properties may be specified.
      * this.requiresConfig(prop [, prop [, ...]])
      */
    def requiresConfig(prop: String, andProps: String*): Unit = js.native
  }
  
  /**
    * @see ITaskOptions
    */
  trait ITaskCompactOptions
    extends StObject
       with ITaskOptions
       with IFilesConfig
  object ITaskCompactOptions {
    
    inline def apply(): ITaskCompactOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITaskCompactOptions]
    }
  }
  
  /**
    * {@link http://gruntjs.com/configuring-tasks}
    *
    * A TaskConfig can be either be a full config or a compacted files config.
    * @see ITaskCompactOptions
    */
  trait ITaskOptions extends StObject {
    
    // files?: grunt.file.IFilesArray
    // files?: grunt.file.IFilesMap
    var files: js.UndefOr[Any] = js.undefined
    
    var options: js.UndefOr[Any] = js.undefined
  }
  object ITaskOptions {
    
    inline def apply(): ITaskOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITaskOptions]
    }
    
    extension [Self <: ITaskOptions](x: Self) {
      
      inline def setFiles(value: Any): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
  
  /**
    * {@link http://gruntjs.com/api/grunt.task#queueing-tasks}
    */
  @js.native
  trait TaskModule
    extends StObject
       with CommonTaskModule {
    
    /**
      * Empty the task queue completely. Unless additional tasks are enqueued, no more tasks will be run.
      */
    def clearQueue(): Unit = js.native
    
    /**
      * The currently running task or multitask.
      * @see http://gruntjs.com/api/inside-tasks
      */
    var current: IMultiTask[Any] = js.native
    
    /**
      * Normalizes a task target configuration object into an array of src-dest file mappings.
      * This method is used internally by the multi task system this.files / grunt.task.current.files property.
      */
    def normalizeMultiTaskFiles(data: IProjectConfig): js.Array[IFileMap] = js.native
    def normalizeMultiTaskFiles(data: IProjectConfig, targetname: String): js.Array[IFileMap] = js.native
    
    def run(task: String, thenTasks: String*): Unit = js.native
    /**
      * Enqueue one or more tasks.
      * Every specified task in taskList will be run immediately after the current task completes,
      * in the order specified. The task list can be an array of tasks or individual task arguments.
      */
    def run(tasks: js.Array[String]): Unit = js.native
  }
}
