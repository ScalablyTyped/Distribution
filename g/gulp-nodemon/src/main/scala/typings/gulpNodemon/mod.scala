package typings.gulpNodemon

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("gulp-nodemon", JSImport.Namespace)
  @js.native
  val ^ : Nodemon = js.native
  
  @js.native
  trait EventEmitter
    extends typings.node.eventsMod.global.NodeJS.EventEmitter {
    
    def addListener(event: String, listener: js.Function): this.type = js.native
    def addListener(event: String, tasks: js.Array[String]): this.type = js.native
    
    def on(event: String, listener: js.Function): this.type = js.native
    def on(event: String, tasks: js.Array[String]): this.type = js.native
    
    def once(event: String, listener: js.Function): this.type = js.native
    def once(event: String, tasks: js.Array[String]): this.type = js.native
  }
  
  type Nodemon = js.Function1[/* option */ js.UndefOr[Option], EventEmitter]
  
  @js.native
  trait Option extends _Option {
    
    var tasks: js.UndefOr[
        js.Array[String] | (js.Function1[/* changedFiles */ js.Array[String], js.Array[String]])
      ] = js.native
  }
  object Option {
    
    @scala.inline
    def apply(): Option = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Option]
    }
    
    @scala.inline
    implicit class OptionMutableBuilder[Self <: Option] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTasks(value: js.Array[String] | (js.Function1[/* changedFiles */ js.Array[String], js.Array[String]])): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTasksFunction1(value: /* changedFiles */ js.Array[String] => js.Array[String]): Self = StObject.set(x, "tasks", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTasksUndefined: Self = StObject.set(x, "tasks", js.undefined)
      
      @scala.inline
      def setTasksVarargs(value: String*): Self = StObject.set(x, "tasks", js.Array(value :_*))
    }
  }
  
  // TODO: Properties may be insufficient
  // TODO: In future this interface should be moved to nodemon.d.ts
  @js.native
  trait _Option extends StObject {
    
    var args: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Debounce restart in seconds.
      */
    var delay: js.UndefOr[Double] = js.native
    
    var env: js.UndefOr[StringDictionary[String | Boolean | Double]] = js.native
    
    var events: js.UndefOr[StringDictionary[String]] = js.native
    
    /**
      * Execute script with "app", ie. -x "python -v".
      */
    var exec: js.UndefOr[String] = js.native
    
    var execMap: js.UndefOr[StringDictionary[String | Boolean | Double]] = js.native
    
    /**
      * Exit on crash, allows use of nodemon with daemon tools like forever.js.
      */
    var exitcrash: js.UndefOr[Boolean] = js.native
    
    /**
      * Extensions to look for, ie. js,jade,hbs.
      */
    var ext: js.UndefOr[String] = js.native
    
    /**
      * Ignore specific files or directories.
      */
    var ignore: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Forces node to use the most compatible version for watching file changes.
      */
    var legacyWatch: js.UndefOr[Boolean] = js.native
    
    var nodeArgs: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Minimise nodemon messages to start/stop only.
      */
    var quiet: js.UndefOr[Boolean] = js.native
    
    var restartable: js.UndefOr[String] = js.native
    
    /**
      * Execute script on change only, not startup
      */
    var runOnChangeOnly: js.UndefOr[Boolean] = js.native
    
    var script: js.UndefOr[String] = js.native
    
    var scriptPosition: js.UndefOr[Double] = js.native
    
    /**
      * Try to read from stdin.
      */
    var stdin: js.UndefOr[Boolean] = js.native
    
    var stdout: js.UndefOr[Boolean] = js.native
    
    /**
      * Show detail on what is causing restarts.
      */
    var verbose: js.UndefOr[Boolean] = js.native
    
    /**
      * Watch directory "dir" or files. use once for each directory or file to watch.
      */
    var watch: js.UndefOr[js.Array[String]] = js.native
  }
  object _Option {
    
    @scala.inline
    def apply(): _Option = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[_Option]
    }
    
    @scala.inline
    implicit class _OptionMutableBuilder[Self <: _Option] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      @scala.inline
      def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setEnv(value: StringDictionary[String | Boolean | Double]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      @scala.inline
      def setEvents(value: StringDictionary[String]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      @scala.inline
      def setExec(value: String): Self = StObject.set(x, "exec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecMap(value: StringDictionary[String | Boolean | Double]): Self = StObject.set(x, "execMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecMapUndefined: Self = StObject.set(x, "execMap", js.undefined)
      
      @scala.inline
      def setExecUndefined: Self = StObject.set(x, "exec", js.undefined)
      
      @scala.inline
      def setExitcrash(value: Boolean): Self = StObject.set(x, "exitcrash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExitcrashUndefined: Self = StObject.set(x, "exitcrash", js.undefined)
      
      @scala.inline
      def setExt(value: String): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
      
      @scala.inline
      def setIgnore(value: js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      @scala.inline
      def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value :_*))
      
      @scala.inline
      def setLegacyWatch(value: Boolean): Self = StObject.set(x, "legacyWatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLegacyWatchUndefined: Self = StObject.set(x, "legacyWatch", js.undefined)
      
      @scala.inline
      def setNodeArgs(value: js.Array[String]): Self = StObject.set(x, "nodeArgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeArgsUndefined: Self = StObject.set(x, "nodeArgs", js.undefined)
      
      @scala.inline
      def setNodeArgsVarargs(value: String*): Self = StObject.set(x, "nodeArgs", js.Array(value :_*))
      
      @scala.inline
      def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
      
      @scala.inline
      def setRestartable(value: String): Self = StObject.set(x, "restartable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestartableUndefined: Self = StObject.set(x, "restartable", js.undefined)
      
      @scala.inline
      def setRunOnChangeOnly(value: Boolean): Self = StObject.set(x, "runOnChangeOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRunOnChangeOnlyUndefined: Self = StObject.set(x, "runOnChangeOnly", js.undefined)
      
      @scala.inline
      def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScriptPosition(value: Double): Self = StObject.set(x, "scriptPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScriptPositionUndefined: Self = StObject.set(x, "scriptPosition", js.undefined)
      
      @scala.inline
      def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
      
      @scala.inline
      def setStdin(value: Boolean): Self = StObject.set(x, "stdin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStdinUndefined: Self = StObject.set(x, "stdin", js.undefined)
      
      @scala.inline
      def setStdout(value: Boolean): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStdoutUndefined: Self = StObject.set(x, "stdout", js.undefined)
      
      @scala.inline
      def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
      
      @scala.inline
      def setWatch(value: js.Array[String]): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
      
      @scala.inline
      def setWatchVarargs(value: String*): Self = StObject.set(x, "watch", js.Array(value :_*))
    }
  }
  
  type _To = Nodemon
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Nodemon = ^
}
