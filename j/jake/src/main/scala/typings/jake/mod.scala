package typings.jake

import typings.jake.anon.Dictname
import typings.jake.mod.global.jake.DirectoryTask
import typings.jake.mod.global.jake.FileTask
import typings.jake.mod.global.jake.FileTaskOptions
import typings.jake.mod.global.jake.NpmPublishTask
import typings.jake.mod.global.jake.Task
import typings.jake.mod.global.jake.TaskOptions
import typings.node.eventsMod.EventEmitter
import typings.std.Error
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object global {
    
    /**
      * Complets an asynchronous task, allowing Jake's execution to proceed to the next task
      * @param value A value to return from the task.
      */
    @JSGlobal("complete")
    @js.native
    def complete(): Unit = js.native
    @JSGlobal("complete")
    @js.native
    def complete(value: js.Any): Unit = js.native
    
    /**
      * Creates a description for a Jake Task (or FileTask, DirectoryTask). When invoked, the description that iscreated will be associated with whatever Task is created next.
      * @param description The description for the Task
      */
    @JSGlobal("desc")
    @js.native
    def desc(description: String): Unit = js.native
    
    /**
      * Creates a Jake DirectoryTask. Can be used as a prerequisite for FileTasks, or for simply ensuring a directory exists for use with a Task's action.
      * @param name The name of the DiretoryTask
      */
    @JSGlobal("directory")
    @js.native
    def directory(name: String): DirectoryTask = js.native
    
    /**
      * Causes Jake execution to abort with an error. Allows passing an optional error code, which will be used to set the exit-code of exiting process.
      * @param err The error to thow when aborting execution. If this argument is an Error object, it will simply be thrown. If a String, it will be used as the error-message. (If it is a multi-line String, the first line will be used as the Error message, and the remaining lines will be used as the error-stack.)
      */
    @JSGlobal("fail")
    @js.native
    def fail(err: (js.Any | Error | String)*): Unit = js.native
    
    /**
      * Creates a Jake FileTask.
      * @name name The name of the Task
      * @param prereqs Prerequisites to be run before this task
      * @param action The action to perform for this task
      * @param opts Perform this task asynchronously. If you flag a task with this option, you must call the global `complete` method inside the task's action, for execution to proceed to the next task.
      */
    @JSGlobal("file")
    @js.native
    def file(name: String): FileTask = js.native
    @JSGlobal("file")
    @js.native
    def file(
      name: String,
      prereqs: js.UndefOr[scala.Nothing],
      action: js.UndefOr[scala.Nothing],
      opts: FileTaskOptions
    ): FileTask = js.native
    @JSGlobal("file")
    @js.native
    def file(
      name: String,
      prereqs: js.UndefOr[scala.Nothing],
      action: js.ThisFunction0[/* this */ FileTask, Unit]
    ): FileTask = js.native
    @JSGlobal("file")
    @js.native
    def file(
      name: String,
      prereqs: js.UndefOr[scala.Nothing],
      action: js.ThisFunction0[/* this */ FileTask, Unit],
      opts: FileTaskOptions
    ): FileTask = js.native
    @JSGlobal("file")
    @js.native
    def file(name: String, prereqs: js.Array[String]): FileTask = js.native
    @JSGlobal("file")
    @js.native
    def file(name: String, prereqs: js.Array[String], action: js.UndefOr[scala.Nothing], opts: FileTaskOptions): FileTask = js.native
    @JSGlobal("file")
    @js.native
    def file(name: String, prereqs: js.Array[String], action: js.ThisFunction0[/* this */ FileTask, Unit]): FileTask = js.native
    @JSGlobal("file")
    @js.native
    def file(
      name: String,
      prereqs: js.Array[String],
      action: js.ThisFunction0[/* this */ FileTask, Unit],
      opts: FileTaskOptions
    ): FileTask = js.native
    
    object jake {
      
      @JSGlobal("jake")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("jake.DirectoryTask")
      @js.native
      class DirectoryTask protected () extends FileTask {
        /**
          * @param name The name of the directory to create.
          */
        def this(name: String) = this()
      }
      
      @JSGlobal("jake.FileList")
      @js.native
      class FileList () extends StObject {
        
        /**
          * Get rid of any current exclusion rules
          */
        def clearExclude(): Unit = js.native
        
        def exclude(file: (FileFilter | RegExp | String)*): Unit = js.native
        /**
          * Excludes file-patterns from the FileList. Should be called with one or more
          * pattern for finding file to include in the list. Arguments can be:
          * 1. Strings for either a glob-pattern or a specific file-name
          * 2. Regular expression literals
          * 3. Functions to be run on the filename that return a true/false
          */
        def exclude(file: js.Array[FileFilter | RegExp | String]): Unit = js.native
        
        def include(files: String*): Unit = js.native
        /**
          * Includes file-patterns in the FileList. Should be called with one or more
          * pattern for finding file to include in the list. Arguments should be strings
          * for either a glob-pattern or a specific file-name, or an array of them
          */
        def include(files: js.Array[String]): Unit = js.native
        
        /**
          * Populates the FileList from the include/exclude rules with a list of
          * actual files
          */
        def resolve(): Unit = js.native
        
        /**
          * Indicates whether a particular file would be filtered out by the current
          * exclusion rules for this FileList.
          * @param name The filename to check
          * @return Whether or not the file should be excluded
          */
        def shouldExclude(name: String): Boolean = js.native
        
        /**
          * Convert to a plain-jane array
          */
        def toArray(): js.Array[String] = js.native
      }
      
      @JSGlobal("jake.FileTask")
      @js.native
      class FileTask protected () extends Task {
        /**
          * @param name The name of the Task
          * @param prereqs Prerequisites to be run before this task
          * @param action The action to perform to create this file
          * @param opts Perform this task asynchronously. If you flag a task with this option, you must call the global `complete` method inside the task's action, for execution to proceed to the next task.
          */
        def this(name: String) = this()
        def this(name: String, prereqs: js.Array[String]) = this()
        def this(
          name: String,
          prereqs: js.UndefOr[scala.Nothing],
          action: js.ThisFunction0[/* this */ FileTask, Unit]
        ) = this()
        def this(name: String, prereqs: js.Array[String], action: js.ThisFunction0[/* this */ FileTask, Unit]) = this()
        def this(
          name: String,
          prereqs: js.UndefOr[scala.Nothing],
          action: js.UndefOr[scala.Nothing],
          opts: FileTaskOptions
        ) = this()
        def this(
          name: String,
          prereqs: js.UndefOr[scala.Nothing],
          action: js.ThisFunction0[/* this */ FileTask, Unit],
          opts: FileTaskOptions
        ) = this()
        def this(name: String, prereqs: js.Array[String], action: js.UndefOr[scala.Nothing], opts: FileTaskOptions) = this()
        def this(
          name: String,
          prereqs: js.Array[String],
          action: js.ThisFunction0[/* this */ FileTask, Unit],
          opts: FileTaskOptions
        ) = this()
      }
      
      @JSGlobal("jake.NpmPublishTask")
      @js.native
      class NpmPublishTask protected () extends StObject {
        def this(name: String) = this()
        def this(name: String, definition: js.Function0[Unit]) = this()
        def this(name: String, packageFiles: js.Array[String]) = this()
      }
      
      @JSGlobal("jake.PackageTask")
      @js.native
      class PackageTask protected () extends StObject {
        /**
          * Instantiating a PackageTask creates a number of Jake Tasks that make packaging and distributing your software easy.
          * @param name The name of the project
          * @param version The current project version (will be appended to the project-name in the package-archive
          * @param definition Defines the contents of the package, and format of the package-archive. Will be executed on the instantiated PackageTask (i.e., 'this', will be the PackageTask instance), to set the various instance-propertiess.
          */
        def this(name: String, version: String, definition: js.Function0[Unit]) = this()
        
        /**
          *     Equivalent to the '-C' command for the `tar` and `jar` commands. ("Change to this directory before adding files.")
          */
        var archiveChangeDir: String = js.native
        
        /**
          * Specifies the files and directories to include in the package-archive. If unset, this will default to the main package directory -- i.e., name + version.
          */
        var archiveContentDir: String = js.native
        
        /**
          * The shell-command to use for creating jar archives.
          */
        var jarCommand: String = js.native
        
        /**
          * Can be set to point the `jar` utility at a manifest file to use in a .jar archive. If unset, one will be automatically created by the `jar` utility. This path should be relative to the root of the package directory (this.packageDir above, likely 'pkg')
          */
        var manifestFile: String = js.native
        
        /**
          * The name of the project
          */
        var name: String = js.native
        
        /**
          * If set to true, uses the `jar` utility to create a .jar archive of the pagckage
          */
        var needJar: Boolean = js.native
        
        /**
          * If set to true, uses the `tar` utility to create a gzip .tgz archive of the pagckage
          */
        var needTar: Boolean = js.native
        
        /**
          * If set to true, uses the `tar` utility to create a bzip2 .bz2 archive of the pagckage
          */
        var needTarBz2: Boolean = js.native
        
        /**
          * If set to true, uses the `zip` utility to create a .zip archive of the pagckage
          */
        var needZip: Boolean = js.native
        
        /**
          * The list of files and directories to include in the package-archive
          */
        var packageFiles: FileList = js.native
        
        /**
          * The shell-command to use for creating tar archives.
          */
        var tarCommand: String = js.native
        
        /**
          * The project version-string
          */
        var version: String = js.native
        
        /**
          * The shell-command to use for creating zip archives.
          */
        var zipCommand: String = js.native
      }
      
      @JSGlobal("jake.Task")
      @js.native
      class Task protected () extends EventEmitter {
        /**
          * @name name The name of the Task
          * @param prereqs Prerequisites to be run before this task
          * @param action The action to perform for this task
          * @param opts Perform this task asynchronously. If you flag a task with this option, you must call the global `complete` method inside the task's action, for execution to proceed to the next task.
          */
        def this(name: String) = this()
        def this(name: String, prereqs: js.Array[String]) = this()
        def this(name: String, prereqs: js.UndefOr[scala.Nothing], action: js.ThisFunction0[/* this */ Task, Unit]) = this()
        def this(name: String, prereqs: js.Array[String], action: js.ThisFunction0[/* this */ Task, Unit]) = this()
        def this(
          name: String,
          prereqs: js.UndefOr[scala.Nothing],
          action: js.UndefOr[scala.Nothing],
          opts: TaskOptions
        ) = this()
        def this(
          name: String,
          prereqs: js.UndefOr[scala.Nothing],
          action: js.ThisFunction0[/* this */ Task, Unit],
          opts: TaskOptions
        ) = this()
        def this(name: String, prereqs: js.Array[String], action: js.UndefOr[scala.Nothing], opts: TaskOptions) = this()
        def this(
          name: String,
          prereqs: js.Array[String],
          action: js.ThisFunction0[/* this */ Task, Unit],
          opts: TaskOptions
        ) = this()
        
        var action: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
        
        def addListener(event: String, listener: js.Function): this.type = js.native
        
        var async: js.UndefOr[Boolean] = js.native
        
        def complete(): Unit = js.native
        def complete(value: js.Any): Unit = js.native
        
        var description: js.UndefOr[String] = js.native
        
        var fullName: String = js.native
        
        /**
          * Runs prerequisites, then this task. If the task has already been run, will not run the task again.
          */
        def invoke(): Unit = js.native
        
        var name: js.UndefOr[String] = js.native
        
        def on(event: String, listener: js.Function): this.type = js.native
        
        def once(event: String, listener: js.Function): this.type = js.native
        
        var prereqs: js.UndefOr[js.Array[String]] = js.native
        
        /**
          * Runs this task, without running any prerequisites. If the task has already been run, it will still run it again.
          */
        def reenable(): Unit = js.native
        
        def removeListener(event: String, listener: js.Function): this.type = js.native
        
        var taskStatus: js.UndefOr[String] = js.native
        
        var value: js.Any = js.native
      }
      
      @JSGlobal("jake.TestTask")
      @js.native
      class TestTask protected () extends StObject {
        def this(name: String) = this()
        def this(name: String, definition: js.Function0[Unit]) = this()
      }
      
      @JSGlobal("jake.addListener")
      @js.native
      def addListener(event: String, listener: js.Function): typings.node.eventsMod.global.NodeJS.EventEmitter = js.native
      
      @JSGlobal("jake.cpR")
      @js.native
      def cpR(path: String, destination: String): Unit = js.native
      @JSGlobal("jake.cpR")
      @js.native
      def cpR(path: String, destination: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
      @JSGlobal("jake.cpR")
      @js.native
      def cpR(path: String, destination: String, opts: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): Unit = js.native
      @JSGlobal("jake.cpR")
      @js.native
      def cpR(path: String, destination: String, opts: UtilOptions): Unit = js.native
      @JSGlobal("jake.cpR")
      @js.native
      def cpR(path: String, destination: String, opts: UtilOptions, callback: js.Function0[Unit]): Unit = js.native
      
      @JSGlobal("jake.createExec")
      @js.native
      def createExec(cmds: String): Exec_ = js.native
      @JSGlobal("jake.createExec")
      @js.native
      def createExec(cmds: String, callback: js.UndefOr[scala.Nothing], opts: ExecOptions): Exec_ = js.native
      @JSGlobal("jake.createExec")
      @js.native
      def createExec(cmds: String, callback: js.Function0[Unit]): Exec_ = js.native
      @JSGlobal("jake.createExec")
      @js.native
      def createExec(cmds: String, callback: js.Function0[Unit], opts: ExecOptions): Exec_ = js.native
      @JSGlobal("jake.createExec")
      @js.native
      def createExec(cmds: String, opts: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): Exec_ = js.native
      @JSGlobal("jake.createExec")
      @js.native
      def createExec(cmds: String, opts: ExecOptions): Exec_ = js.native
      @JSGlobal("jake.createExec")
      @js.native
      def createExec(cmds: String, opts: ExecOptions, callback: js.Function0[Unit]): Exec_ = js.native
      @JSGlobal("jake.createExec")
      @js.native
      def createExec(cmds: js.Array[String]): Exec_ = js.native
      @JSGlobal("jake.createExec")
      @js.native
      def createExec(cmds: js.Array[String], callback: js.UndefOr[scala.Nothing], opts: ExecOptions): Exec_ = js.native
      @JSGlobal("jake.createExec")
      @js.native
      def createExec(cmds: js.Array[String], callback: js.Function0[Unit]): Exec_ = js.native
      @JSGlobal("jake.createExec")
      @js.native
      def createExec(cmds: js.Array[String], callback: js.Function0[Unit], opts: ExecOptions): Exec_ = js.native
      @JSGlobal("jake.createExec")
      @js.native
      def createExec(cmds: js.Array[String], opts: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): Exec_ = js.native
      @JSGlobal("jake.createExec")
      @js.native
      def createExec(cmds: js.Array[String], opts: ExecOptions): Exec_ = js.native
      @JSGlobal("jake.createExec")
      @js.native
      def createExec(cmds: js.Array[String], opts: ExecOptions, callback: js.Function0[Unit]): Exec_ = js.native
      
      @JSGlobal("jake.emit")
      @js.native
      def emit(event: String, args: js.Any*): Boolean = js.native
      
      @JSGlobal("jake.exec")
      @js.native
      def exec(cmds: js.Array[String]): Unit = js.native
      @JSGlobal("jake.exec")
      @js.native
      def exec(cmds: js.Array[String], callback: js.UndefOr[scala.Nothing], opts: ExecOptions): Unit = js.native
      @JSGlobal("jake.exec")
      @js.native
      def exec(cmds: js.Array[String], callback: js.Function0[Unit]): Unit = js.native
      @JSGlobal("jake.exec")
      @js.native
      def exec(cmds: js.Array[String], callback: js.Function0[Unit], opts: ExecOptions): Unit = js.native
      
      @JSGlobal("jake.listeners")
      @js.native
      def listeners(event: String): js.Array[js.Function] = js.native
      
      @JSGlobal("jake.logger")
      @js.native
      def logger: Logger_ = js.native
      @scala.inline
      def logger_=(x: Logger_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logger")(x.asInstanceOf[js.Any])
      
      @JSGlobal("jake.mkdirP")
      @js.native
      def mkdirP(name: String): Unit = js.native
      @JSGlobal("jake.mkdirP")
      @js.native
      def mkdirP(name: String, f: js.Function2[/* er */ Error, /* made */ js.Any, Unit]): Unit = js.native
      @JSGlobal("jake.mkdirP")
      @js.native
      def mkdirP(
        name: String,
        mode: js.UndefOr[scala.Nothing],
        f: js.Function2[/* er */ Error, /* made */ js.Any, Unit]
      ): Unit = js.native
      @JSGlobal("jake.mkdirP")
      @js.native
      def mkdirP(name: String, mode: String): Unit = js.native
      @JSGlobal("jake.mkdirP")
      @js.native
      def mkdirP(name: String, mode: String, f: js.Function2[/* er */ Error, /* made */ js.Any, Unit]): Unit = js.native
      
      @JSGlobal("jake.on")
      @js.native
      def on(event: String, listener: js.Function): typings.node.eventsMod.global.NodeJS.EventEmitter = js.native
      
      @JSGlobal("jake.once")
      @js.native
      def once(event: String, listener: js.Function): typings.node.eventsMod.global.NodeJS.EventEmitter = js.native
      
      object program {
        
        @JSGlobal("jake.program")
        @js.native
        val ^ : js.Any = js.native
        
        @JSGlobal("jake.program.opts")
        @js.native
        def opts: Dictname = js.native
        @scala.inline
        def opts_=(x: Dictname): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("opts")(x.asInstanceOf[js.Any])
        
        @JSGlobal("jake.program.taskArgs")
        @js.native
        def taskArgs: js.Array[String] = js.native
        @scala.inline
        def taskArgs_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("taskArgs")(x.asInstanceOf[js.Any])
        
        @JSGlobal("jake.program.taskNames")
        @js.native
        def taskNames: js.Array[String] = js.native
        @scala.inline
        def taskNames_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("taskNames")(x.asInstanceOf[js.Any])
      }
      
      @JSGlobal("jake.readdirR")
      @js.native
      def readdirR(name: String): js.Array[String] = js.native
      @JSGlobal("jake.readdirR")
      @js.native
      def readdirR(name: String, opts: UtilOptions): js.Array[String] = js.native
      
      @JSGlobal("jake.removeAllListener")
      @js.native
      def removeAllListener(event: String): typings.node.eventsMod.global.NodeJS.EventEmitter = js.native
      
      @JSGlobal("jake.removeListener")
      @js.native
      def removeListener(event: String, listener: js.Function): typings.node.eventsMod.global.NodeJS.EventEmitter = js.native
      
      @JSGlobal("jake.rmRf")
      @js.native
      def rmRf(name: String): Unit = js.native
      @JSGlobal("jake.rmRf")
      @js.native
      def rmRf(name: String, opts: UtilOptions): Unit = js.native
      
      @JSGlobal("jake.setMaxListeners")
      @js.native
      def setMaxListeners(n: Double): Unit = js.native
      
      //////////////////////////////////////////////////////////////////////////////////////////////
      // Running shell-commands ////////////////////////////////////////////////////////////////////
      //////////////////////////////////////////////////////////////////////////////////////////////
      @js.native
      trait ExecOptions extends StObject {
        
        /**
          * stop execution on error, default true
          */
        var breakOnError: js.UndefOr[Boolean] = js.native
        
        /**
          * print to stderr, default false
          */
        var printStderr: js.UndefOr[Boolean] = js.native
        
        /**
          * print to stdout, default false
          */
        var printStdout: js.UndefOr[Boolean] = js.native
        
        /**
          *
          */
        var windowsVerbatimArguments: js.UndefOr[Boolean] = js.native
      }
      object ExecOptions {
        
        @scala.inline
        def apply(): ExecOptions = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[ExecOptions]
        }
        
        @scala.inline
        implicit class ExecOptionsMutableBuilder[Self <: ExecOptions] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setBreakOnError(value: Boolean): Self = StObject.set(x, "breakOnError", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setBreakOnErrorUndefined: Self = StObject.set(x, "breakOnError", js.undefined)
          
          @scala.inline
          def setPrintStderr(value: Boolean): Self = StObject.set(x, "printStderr", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPrintStderrUndefined: Self = StObject.set(x, "printStderr", js.undefined)
          
          @scala.inline
          def setPrintStdout(value: Boolean): Self = StObject.set(x, "printStdout", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPrintStdoutUndefined: Self = StObject.set(x, "printStdout", js.undefined)
          
          @scala.inline
          def setWindowsVerbatimArguments(value: Boolean): Self = StObject.set(x, "windowsVerbatimArguments", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWindowsVerbatimArgumentsUndefined: Self = StObject.set(x, "windowsVerbatimArguments", js.undefined)
        }
      }
      
      @js.native
      trait Exec_
        extends typings.node.eventsMod.global.NodeJS.EventEmitter {
        
        def append(cmd: String): Unit = js.native
        
        def run(): Unit = js.native
      }
      
      type FileFilter = js.Function1[/* filename */ String, Boolean]
      
      @js.native
      trait FileTaskOptions extends StObject {
        
        /**
          * Perform this task asynchronously. If you flag a task with this option, you must call the global `complete` method inside the task's action, for execution to proceed to the next task.
          * @default false
          */
        var async: js.UndefOr[Boolean] = js.native
      }
      object FileTaskOptions {
        
        @scala.inline
        def apply(): FileTaskOptions = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[FileTaskOptions]
        }
        
        @scala.inline
        implicit class FileTaskOptionsMutableBuilder[Self <: FileTaskOptions] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
        }
      }
      
      ////////////////////////////////////////////////////////////////////////////////////////////////////////////
      // Logging and output ////////////////////////////////////////////////////////////////////////////////////////
      /////////////////////////////////////////////////////////////////////////////////////////////////////////////
      @js.native
      trait Logger_ extends StObject {
        
        def error(value: js.Any): Unit = js.native
        
        def log(value: js.Any): Unit = js.native
      }
      object Logger_ {
        
        @scala.inline
        def apply(error: js.Any => Unit, log: js.Any => Unit): Logger_ = {
          val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), log = js.Any.fromFunction1(log))
          __obj.asInstanceOf[Logger_]
        }
        
        @scala.inline
        implicit class Logger_MutableBuilder[Self <: Logger_] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setError(value: js.Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
          
          @scala.inline
          def setLog(value: js.Any => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
        }
      }
      
      @js.native
      trait TaskOptions extends StObject {
        
        /**
          * Perform this task asynchronously. If you flag a task with this option, you must call the global `complete` method inside the task's action, for execution to proceed to the next task.
          * @default false
          */
        var async: js.UndefOr[Boolean] = js.native
        
        /**
          * number of parllel async tasks
          */
        var parallelLimit: js.UndefOr[Double] = js.native
      }
      object TaskOptions {
        
        @scala.inline
        def apply(): TaskOptions = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[TaskOptions]
        }
        
        @scala.inline
        implicit class TaskOptionsMutableBuilder[Self <: TaskOptions] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
          
          @scala.inline
          def setParallelLimit(value: Double): Self = StObject.set(x, "parallelLimit", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setParallelLimitUndefined: Self = StObject.set(x, "parallelLimit", js.undefined)
        }
      }
      
      ////////////////////////////////////////////////////////////////////////////////////
      // File-utils //////////////////////////////////////////////////////////////////////
      ////////////////////////////////////////////////////////////////////////////////////
      @js.native
      trait UtilOptions extends StObject {
        
        var silent: js.UndefOr[Boolean] = js.native
      }
      object UtilOptions {
        
        @scala.inline
        def apply(): UtilOptions = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[UtilOptions]
        }
        
        @scala.inline
        implicit class UtilOptionsMutableBuilder[Self <: UtilOptions] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
        }
      }
    }
    
    /**
      * Creates a namespace which allows logical grouping of tasks, and prevents name-collisions with task-names. Namespaces can be nested inside of other namespaces.
      * @param name The name of the namespace
      * @param scope The enclosing scope for the namespaced tasks
      */
    @JSGlobal("namespace")
    @js.native
    def namespace(name: String, scope: js.Function0[Unit]): Unit = js.native
    
    @JSGlobal("npmPublishTask")
    @js.native
    def npmPublishTask(name: String): NpmPublishTask = js.native
    @JSGlobal("npmPublishTask")
    @js.native
    def npmPublishTask(name: String, definition: js.Function0[Unit]): NpmPublishTask = js.native
    /**
      * @param name The name of the NpmPublishTask
      * @param packageFiles The files to include in the package
      * @param definition A function that creates the package definition
      */
    @JSGlobal("npmPublishTask")
    @js.native
    def npmPublishTask(name: String, packageFiles: js.Array[String]): NpmPublishTask = js.native
    
    /**
      * Creates Jake FileTask from regex patterns
      * @name name/pattern of the Task
      * @param source calculated from the name pattern
      * @param prereqs Prerequisites to be run before this task
      * @param action The action to perform for this task
      * @param opts Perform this task asynchronously. If you flag a task with this option, you must call the global `complete` method inside the task's action, for execution to proceed to the next task.
      */
    @JSGlobal("rule")
    @js.native
    def rule(pattern: RegExp, source: String): Unit = js.native
    @JSGlobal("rule")
    @js.native
    def rule(
      pattern: RegExp,
      source: String,
      prereqs: js.UndefOr[scala.Nothing],
      action: js.UndefOr[scala.Nothing],
      opts: TaskOptions
    ): Unit = js.native
    @JSGlobal("rule")
    @js.native
    def rule(pattern: RegExp, source: String, prereqs: js.UndefOr[scala.Nothing], action: js.Function0[Unit]): Unit = js.native
    @JSGlobal("rule")
    @js.native
    def rule(
      pattern: RegExp,
      source: String,
      prereqs: js.UndefOr[scala.Nothing],
      action: js.Function0[Unit],
      opts: TaskOptions
    ): Unit = js.native
    @JSGlobal("rule")
    @js.native
    def rule(pattern: RegExp, source: String, prereqs: js.Array[String]): Unit = js.native
    @JSGlobal("rule")
    @js.native
    def rule(
      pattern: RegExp,
      source: String,
      prereqs: js.Array[String],
      action: js.UndefOr[scala.Nothing],
      opts: TaskOptions
    ): Unit = js.native
    @JSGlobal("rule")
    @js.native
    def rule(pattern: RegExp, source: String, prereqs: js.Array[String], action: js.Function0[Unit]): Unit = js.native
    @JSGlobal("rule")
    @js.native
    def rule(
      pattern: RegExp,
      source: String,
      prereqs: js.Array[String],
      action: js.Function0[Unit],
      opts: TaskOptions
    ): Unit = js.native
    @JSGlobal("rule")
    @js.native
    def rule(pattern: RegExp, source: js.Function1[/* name */ String, String]): Unit = js.native
    @JSGlobal("rule")
    @js.native
    def rule(
      pattern: RegExp,
      source: js.Function1[/* name */ String, String],
      prereqs: js.UndefOr[scala.Nothing],
      action: js.UndefOr[scala.Nothing],
      opts: TaskOptions
    ): Unit = js.native
    @JSGlobal("rule")
    @js.native
    def rule(
      pattern: RegExp,
      source: js.Function1[/* name */ String, String],
      prereqs: js.UndefOr[scala.Nothing],
      action: js.Function0[Unit]
    ): Unit = js.native
    @JSGlobal("rule")
    @js.native
    def rule(
      pattern: RegExp,
      source: js.Function1[/* name */ String, String],
      prereqs: js.UndefOr[scala.Nothing],
      action: js.Function0[Unit],
      opts: TaskOptions
    ): Unit = js.native
    @JSGlobal("rule")
    @js.native
    def rule(pattern: RegExp, source: js.Function1[/* name */ String, String], prereqs: js.Array[String]): Unit = js.native
    @JSGlobal("rule")
    @js.native
    def rule(
      pattern: RegExp,
      source: js.Function1[/* name */ String, String],
      prereqs: js.Array[String],
      action: js.UndefOr[scala.Nothing],
      opts: TaskOptions
    ): Unit = js.native
    @JSGlobal("rule")
    @js.native
    def rule(
      pattern: RegExp,
      source: js.Function1[/* name */ String, String],
      prereqs: js.Array[String],
      action: js.Function0[Unit]
    ): Unit = js.native
    @JSGlobal("rule")
    @js.native
    def rule(
      pattern: RegExp,
      source: js.Function1[/* name */ String, String],
      prereqs: js.Array[String],
      action: js.Function0[Unit],
      opts: TaskOptions
    ): Unit = js.native
    
    /**
      * @param name The name of the Task
      * @param prereqs Prerequisites to be run before this task
      * @param action The action to perform for this task
      * @param opts
      */
    @JSGlobal("task")
    @js.native
    def task(name: String): Task = js.native
    @JSGlobal("task")
    @js.native
    def task(name: String, action: js.UndefOr[scala.Nothing], opts: TaskOptions): Task = js.native
    @JSGlobal("task")
    @js.native
    def task(name: String, action: js.ThisFunction1[/* this */ Task, /* repeated */ js.Any, _]): Task = js.native
    @JSGlobal("task")
    @js.native
    def task(
      name: String,
      action: js.ThisFunction1[/* this */ Task, /* repeated */ js.Any, _],
      opts: TaskOptions
    ): Task = js.native
    @JSGlobal("task")
    @js.native
    def task(name: String, opts: TaskOptions): Task = js.native
    @JSGlobal("task")
    @js.native
    def task(
      name: String,
      opts: TaskOptions,
      action: js.ThisFunction1[/* this */ Task, /* repeated */ js.Any, _]
    ): Task = js.native
    @JSGlobal("task")
    @js.native
    def task(
      name: String,
      prereqs: js.UndefOr[scala.Nothing],
      action: js.UndefOr[scala.Nothing],
      opts: TaskOptions
    ): Task = js.native
    @JSGlobal("task")
    @js.native
    def task(
      name: String,
      prereqs: js.UndefOr[scala.Nothing],
      action: js.ThisFunction1[/* this */ Task, /* repeated */ js.Any, _]
    ): Task = js.native
    @JSGlobal("task")
    @js.native
    def task(
      name: String,
      prereqs: js.UndefOr[scala.Nothing],
      action: js.ThisFunction1[/* this */ Task, /* repeated */ js.Any, _],
      opts: TaskOptions
    ): Task = js.native
    @JSGlobal("task")
    @js.native
    def task(name: String, prereqs: js.Array[String]): Task = js.native
    @JSGlobal("task")
    @js.native
    def task(name: String, prereqs: js.Array[String], action: js.UndefOr[scala.Nothing], opts: TaskOptions): Task = js.native
    @JSGlobal("task")
    @js.native
    def task(
      name: String,
      prereqs: js.Array[String],
      action: js.ThisFunction1[/* this */ Task, /* repeated */ js.Any, _]
    ): Task = js.native
    @JSGlobal("task")
    @js.native
    def task(
      name: String,
      prereqs: js.Array[String],
      action: js.ThisFunction1[/* this */ Task, /* repeated */ js.Any, _],
      opts: TaskOptions
    ): Task = js.native
  }
}
