package typings.gulpNodemon

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.gulp.mod.TaskFunctionCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("gulp-nodemon", JSImport.Namespace)
  @js.native
  val ^ : Nodemon = js.native
  
  @js.native
  trait EventEmitter
    extends StObject
       with typings.node.eventsMod.global.NodeJS.EventEmitter {
    
    def addListener(event: String, listener: js.Function): this.type = js.native
    def addListener(event: String, tasks: js.Array[String]): this.type = js.native
    
    def on(event: String, listener: js.Function): this.type = js.native
    def on(event: String, tasks: js.Array[String]): this.type = js.native
    
    def once(event: String, listener: js.Function): this.type = js.native
    def once(event: String, tasks: js.Array[String]): this.type = js.native
  }
  
  type Nodemon = js.Function1[/* option */ js.UndefOr[Option], EventEmitter]
  
  trait Option
    extends StObject
       with _Option {
    
    var tasks: js.UndefOr[
        js.Array[String] | (js.Function1[/* changedFiles */ js.Array[String], js.Array[String]])
      ] = js.undefined
  }
  object Option {
    
    inline def apply(): Option = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Option]
    }
    
    extension [Self <: Option](x: Self) {
      
      inline def setTasks(value: js.Array[String] | (js.Function1[/* changedFiles */ js.Array[String], js.Array[String]])): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
      
      inline def setTasksFunction1(value: /* changedFiles */ js.Array[String] => js.Array[String]): Self = StObject.set(x, "tasks", js.Any.fromFunction1(value))
      
      inline def setTasksUndefined: Self = StObject.set(x, "tasks", js.undefined)
      
      inline def setTasksVarargs(value: String*): Self = StObject.set(x, "tasks", js.Array(value*))
    }
  }
  
  // TODO: Properties may be insufficient
  // TODO: In future this interface should be moved to nodemon.d.ts
  trait _Option extends StObject {
    
    var args: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Debounce restart in seconds.
      */
    var delay: js.UndefOr[Double] = js.undefined
    
    var done: js.UndefOr[TaskFunctionCallback] = js.undefined
    
    var env: js.UndefOr[StringDictionary[String | Boolean | Double]] = js.undefined
    
    var events: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * Execute script with "app", ie. -x "python -v".
      */
    var exec: js.UndefOr[String] = js.undefined
    
    var execMap: js.UndefOr[StringDictionary[String | Boolean | Double]] = js.undefined
    
    /**
      * Exit on crash, allows use of nodemon with daemon tools like forever.js.
      */
    var exitcrash: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Extensions to look for, ie. js,jade,hbs.
      */
    var ext: js.UndefOr[String] = js.undefined
    
    /**
      * Ignore specific files or directories.
      */
    var ignore: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Forces node to use the most compatible version for watching file changes.
      */
    var legacyWatch: js.UndefOr[Boolean] = js.undefined
    
    var nodeArgs: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Minimise nodemon messages to start/stop only.
      */
    var quiet: js.UndefOr[Boolean] = js.undefined
    
    var restartable: js.UndefOr[String] = js.undefined
    
    /**
      * Execute script on change only, not startup
      */
    var runOnChangeOnly: js.UndefOr[Boolean] = js.undefined
    
    var script: js.UndefOr[String] = js.undefined
    
    var scriptPosition: js.UndefOr[Double] = js.undefined
    
    /**
      * Try to read from stdin.
      */
    var stdin: js.UndefOr[Boolean] = js.undefined
    
    var stdout: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Show detail on what is causing restarts.
      */
    var verbose: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Watch directory "dir" or files. use once for each directory or file to watch.
      */
    var watch: js.UndefOr[js.Array[String]] = js.undefined
  }
  object _Option {
    
    inline def apply(): _Option = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[_Option]
    }
    
    extension [Self <: _Option](x: Self) {
      
      inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setDone(value: /* error */ js.UndefOr[js.Error | Null] => Unit): Self = StObject.set(x, "done", js.Any.fromFunction1(value))
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setEnv(value: StringDictionary[String | Boolean | Double]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setEvents(value: StringDictionary[String]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setExec(value: String): Self = StObject.set(x, "exec", value.asInstanceOf[js.Any])
      
      inline def setExecMap(value: StringDictionary[String | Boolean | Double]): Self = StObject.set(x, "execMap", value.asInstanceOf[js.Any])
      
      inline def setExecMapUndefined: Self = StObject.set(x, "execMap", js.undefined)
      
      inline def setExecUndefined: Self = StObject.set(x, "exec", js.undefined)
      
      inline def setExitcrash(value: Boolean): Self = StObject.set(x, "exitcrash", value.asInstanceOf[js.Any])
      
      inline def setExitcrashUndefined: Self = StObject.set(x, "exitcrash", js.undefined)
      
      inline def setExt(value: String): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      inline def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
      
      inline def setIgnore(value: js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value*))
      
      inline def setLegacyWatch(value: Boolean): Self = StObject.set(x, "legacyWatch", value.asInstanceOf[js.Any])
      
      inline def setLegacyWatchUndefined: Self = StObject.set(x, "legacyWatch", js.undefined)
      
      inline def setNodeArgs(value: js.Array[String]): Self = StObject.set(x, "nodeArgs", value.asInstanceOf[js.Any])
      
      inline def setNodeArgsUndefined: Self = StObject.set(x, "nodeArgs", js.undefined)
      
      inline def setNodeArgsVarargs(value: String*): Self = StObject.set(x, "nodeArgs", js.Array(value*))
      
      inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      inline def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
      
      inline def setRestartable(value: String): Self = StObject.set(x, "restartable", value.asInstanceOf[js.Any])
      
      inline def setRestartableUndefined: Self = StObject.set(x, "restartable", js.undefined)
      
      inline def setRunOnChangeOnly(value: Boolean): Self = StObject.set(x, "runOnChangeOnly", value.asInstanceOf[js.Any])
      
      inline def setRunOnChangeOnlyUndefined: Self = StObject.set(x, "runOnChangeOnly", js.undefined)
      
      inline def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
      
      inline def setScriptPosition(value: Double): Self = StObject.set(x, "scriptPosition", value.asInstanceOf[js.Any])
      
      inline def setScriptPositionUndefined: Self = StObject.set(x, "scriptPosition", js.undefined)
      
      inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
      
      inline def setStdin(value: Boolean): Self = StObject.set(x, "stdin", value.asInstanceOf[js.Any])
      
      inline def setStdinUndefined: Self = StObject.set(x, "stdin", js.undefined)
      
      inline def setStdout(value: Boolean): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
      
      inline def setStdoutUndefined: Self = StObject.set(x, "stdout", js.undefined)
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
      
      inline def setWatch(value: js.Array[String]): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
      
      inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
      
      inline def setWatchVarargs(value: String*): Self = StObject.set(x, "watch", js.Array(value*))
    }
  }
  
  type _To = Nodemon
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Nodemon = ^
}
