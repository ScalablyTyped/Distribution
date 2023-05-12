package typings.gulp

import org.scalablytyped.runtime.Shortcut
import typings.gulp.anon.FnCall
import typings.node.NodeJS.ReadWriteStream
import typings.node.fsMod.FSWatcher
import typings.vinyl.mod.File
import typings.vinylFs.anon.Cwd
import typings.vinylFs.mod.DestOptions
import typings.vinylFs.mod.SrcOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("gulp", JSImport.Namespace)
  @js.native
  val ^ : Gulp = js.native
  
  @js.native
  trait DestMethod extends StObject {
    
    def apply(folder: String): ReadWriteStream = js.native
    def apply(folder: String, opt: DestOptions): ReadWriteStream = js.native
    def apply(folder: js.Function1[/* file */ File, String]): ReadWriteStream = js.native
    def apply(folder: js.Function1[/* file */ File, String], opt: DestOptions): ReadWriteStream = js.native
  }
  
  type Globs = String | js.Array[String]
  
  @js.native
  trait Gulp
    extends typings.undertaker.mod.^ {
    
    /**
      * Can be piped to and it will write files. Re-emits all data passed to it so you can pipe to multiple folders.
      * Folders that don't exist will be created.
      * @param path The path (output folder) to write files to. Or a function that returns it, the function will be provided a vinyl File instance.
      */
    def dest(folder: String): ReadWriteStream = js.native
    /**
      * Can be piped to and it will write files. Re-emits all data passed to it so you can pipe to multiple folders.
      * Folders that don't exist will be created.
      * @param path The path (output folder) to write files to. Or a function that returns it, the function will be provided a vinyl File instance.
      */
    def dest(folder: String, opt: DestOptions): ReadWriteStream = js.native
    /**
      * Can be piped to and it will write files. Re-emits all data passed to it so you can pipe to multiple folders.
      * Folders that don't exist will be created.
      * @param path The path (output folder) to write files to. Or a function that returns it, the function will be provided a vinyl File instance.
      */
    def dest(folder: js.Function1[/* file */ File, String]): ReadWriteStream = js.native
    /**
      * Can be piped to and it will write files. Re-emits all data passed to it so you can pipe to multiple folders.
      * Folders that don't exist will be created.
      * @param path The path (output folder) to write files to. Or a function that returns it, the function will be provided a vinyl File instance.
      */
    def dest(folder: js.Function1[/* file */ File, String], opt: DestOptions): ReadWriteStream = js.native
    /**
      * Can be piped to and it will write files. Re-emits all data passed to it so you can pipe to multiple folders.
      * Folders that don't exist will be created.
      * @param path The path (output folder) to write files to. Or a function that returns it, the function will be provided a vinyl File instance.
      */
    @JSName("dest")
    var dest_Original: DestMethod = js.native
    
    /**
      * Emits files matching provided glob or array of globs. Returns a stream of Vinyl files that can be piped to plugins.
      * @param globs Glob or array of globs to read.
      * @param options Options to pass to node-glob through glob-stream.
      */
    def src(globs: String): ReadWriteStream = js.native
    /**
      * Emits files matching provided glob or array of globs. Returns a stream of Vinyl files that can be piped to plugins.
      * @param globs Glob or array of globs to read.
      * @param options Options to pass to node-glob through glob-stream.
      */
    def src(globs: String, opt: SrcOptions): ReadWriteStream = js.native
    /**
      * Emits files matching provided glob or array of globs. Returns a stream of Vinyl files that can be piped to plugins.
      * @param globs Glob or array of globs to read.
      * @param options Options to pass to node-glob through glob-stream.
      */
    def src(globs: js.Array[String]): ReadWriteStream = js.native
    /**
      * Emits files matching provided glob or array of globs. Returns a stream of Vinyl files that can be piped to plugins.
      * @param globs Glob or array of globs to read.
      * @param options Options to pass to node-glob through glob-stream.
      */
    def src(globs: js.Array[String], opt: SrcOptions): ReadWriteStream = js.native
    /**
      * Emits files matching provided glob or array of globs. Returns a stream of Vinyl files that can be piped to plugins.
      * @param globs Glob or array of globs to read.
      * @param options Options to pass to node-glob through glob-stream.
      */
    @JSName("src")
    var src_Original: SrcMethod = js.native
    
    /**
      * Functions exactly like gulp.dest, but will create symlinks instead of copying a directory.
      * @param folder A folder path or a function that receives in a file and returns a folder path.
      */
    def symlink(folder: String): ReadWriteStream = js.native
    /**
      * Functions exactly like gulp.dest, but will create symlinks instead of copying a directory.
      * @param folder A folder path or a function that receives in a file and returns a folder path.
      */
    def symlink(folder: String, opts: Cwd): ReadWriteStream = js.native
    /**
      * Functions exactly like gulp.dest, but will create symlinks instead of copying a directory.
      * @param folder A folder path or a function that receives in a file and returns a folder path.
      */
    def symlink(folder: js.Function1[/* File */ File, String]): ReadWriteStream = js.native
    /**
      * Functions exactly like gulp.dest, but will create symlinks instead of copying a directory.
      * @param folder A folder path or a function that receives in a file and returns a folder path.
      */
    def symlink(folder: js.Function1[/* File */ File, String], opts: Cwd): ReadWriteStream = js.native
    /**
      * Functions exactly like gulp.dest, but will create symlinks instead of copying a directory.
      * @param folder A folder path or a function that receives in a file and returns a folder path.
      */
    @JSName("symlink")
    var symlink_Original: FnCall = js.native
    
    /**
      * Takes a path string, an array of path strings, a glob string or an array of glob strings as globs to watch on the filesystem.
      * Also optionally takes options to configure the watcher and a fn to execute when a file changes.
      * @globs A path string, an array of path strings, a glob string or an array of glob strings that indicate which files to watch for changes.
      * @opts Options that are passed to chokidar.
      * @fn Once async completion is signalled, if another run is queued, it will be executed.
      */
    def watch(globs: Globs): FSWatcher = js.native
    def watch(globs: Globs, fn: typings.undertaker.mod.TaskFunction): FSWatcher = js.native
    def watch(globs: Globs, opts: Unit, fn: typings.undertaker.mod.TaskFunction): FSWatcher = js.native
    def watch(globs: Globs, opts: WatchOptions): FSWatcher = js.native
    def watch(globs: Globs, opts: WatchOptions, fn: typings.undertaker.mod.TaskFunction): FSWatcher = js.native
    /**
      * Takes a path string, an array of path strings, a glob string or an array of glob strings as globs to watch on the filesystem.
      * Also optionally takes options to configure the watcher and a fn to execute when a file changes.
      * @globs A path string, an array of path strings, a glob string or an array of glob strings that indicate which files to watch for changes.
      * @opts Options that are passed to chokidar.
      * @fn Once async completion is signalled, if another run is queued, it will be executed.
      */
    @JSName("watch")
    var watch_Original: WatchMethod = js.native
  }
  
  @js.native
  trait SrcMethod extends StObject {
    
    def apply(globs: String): ReadWriteStream = js.native
    def apply(globs: String, opt: SrcOptions): ReadWriteStream = js.native
    def apply(globs: js.Array[String]): ReadWriteStream = js.native
    def apply(globs: js.Array[String], opt: SrcOptions): ReadWriteStream = js.native
  }
  
  /**
    * @deprecated - Now use `TaskFunction`.
    */
  type TaskCallback = TaskFunction
  
  type TaskFunction = typings.undertaker.mod.TaskFunction
  
  type TaskFunctionCallback = typings.undertaker.mod.TaskCallback
  
  @js.native
  trait WatchMethod extends StObject {
    
    def apply(globs: Globs): FSWatcher = js.native
    def apply(globs: Globs, fn: typings.undertaker.mod.TaskFunction): FSWatcher = js.native
    def apply(globs: Globs, opts: Unit, fn: typings.undertaker.mod.TaskFunction): FSWatcher = js.native
    def apply(globs: Globs, opts: WatchOptions): FSWatcher = js.native
    def apply(globs: Globs, opts: WatchOptions, fn: typings.undertaker.mod.TaskFunction): FSWatcher = js.native
  }
  
  trait WatchOptions
    extends StObject
       with typings.chokidar.mod.WatchOptions {
    
    /**
      * The delay to wait before triggering the fn.
      * Useful for waiting on many changes before doing the work on changed files, e.g. find-and-replace on many files.
      * @default 200
      */
    var delay: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether or not a file change should queue the fn execution if the fn is already running. Useful for a long running fn.
      * @default true
      */
    var queue: js.UndefOr[Boolean] = js.undefined
  }
  object WatchOptions {
    
    inline def apply(): WatchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WatchOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WatchOptions] (val x: Self) extends AnyVal {
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setQueue(value: Boolean): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
      
      inline def setQueueUndefined: Self = StObject.set(x, "queue", js.undefined)
    }
  }
  
  type _To = Gulp
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Gulp = ^
}
