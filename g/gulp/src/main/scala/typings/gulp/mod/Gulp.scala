package typings.gulp.mod

import typings.gulp.FnFile
import typings.node.NodeJS.ReadWriteStream
import typings.node.fsMod.FSWatcher
import typings.vinyl.mod.File
import typings.vinylFs.AnonCwd
import typings.vinylFs.AnonCwdDirMode
import typings.vinylFs.mod.DestOptions
import typings.vinylFs.mod.SrcOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Gulp
  extends typings.undertaker.mod.^ {
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
  @JSName("src")
  var src_Original: SrcMethod = js.native
  /**
    * Functions exactly like gulp.dest, but will create symlinks instead of copying a directory.
    * @param folder A folder path or a function that receives in a file and returns a folder path.
    */
  @JSName("symlink")
  var symlink_Original: FnFile = js.native
  /**
    * Takes a path string, an array of path strings, a glob string or an array of glob strings as globs to watch on the filesystem.
    * Also optionally takes options to configure the watcher and a fn to execute when a file changes.
    * @globs A path string, an array of path strings, a glob string or an array of glob strings that indicate which files to watch for changes.
    * @opts Options that are passed to chokidar.
    * @fn Once async completion is signalled, if another run is queued, it will be executed.
    */
  @JSName("watch")
  var watch_Original: WatchMethod = js.native
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
  def dest(getFolderPath: js.Function1[/* file */ File, String]): ReadWriteStream = js.native
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
    * Functions exactly like gulp.dest, but will create symlinks instead of copying a directory.
    * @param folder A folder path or a function that receives in a file and returns a folder path.
    */
  def symlink(folder: String): ReadWriteStream = js.native
  /**
    * Functions exactly like gulp.dest, but will create symlinks instead of copying a directory.
    * @param folder A folder path or a function that receives in a file and returns a folder path.
    */
  def symlink(folder: String, opts: AnonCwd): ReadWriteStream = js.native
  /**
    * Functions exactly like gulp.dest, but will create symlinks instead of copying a directory.
    * @param folder A folder path or a function that receives in a file and returns a folder path.
    */
  def symlink(getFolderPath: js.Function1[/* File */ File, String]): ReadWriteStream = js.native
  /**
    * Functions exactly like gulp.dest, but will create symlinks instead of copying a directory.
    * @param folder A folder path or a function that receives in a file and returns a folder path.
    */
  def symlink(getFolderPath: js.Function1[/* File */ File, String], opts: AnonCwdDirMode): ReadWriteStream = js.native
  /**
    * Takes a path string, an array of path strings, a glob string or an array of glob strings as globs to watch on the filesystem.
    * Also optionally takes options to configure the watcher and a fn to execute when a file changes.
    * @globs A path string, an array of path strings, a glob string or an array of glob strings that indicate which files to watch for changes.
    * @opts Options that are passed to chokidar.
    * @fn Once async completion is signalled, if another run is queued, it will be executed.
    */
  def watch(globs: Globs): FSWatcher = js.native
  def watch(globs: Globs, fn: typings.undertaker.mod.TaskFunction): FSWatcher = js.native
  def watch(globs: Globs, opts: WatchOptions): FSWatcher = js.native
  def watch(globs: Globs, opts: WatchOptions, fn: typings.undertaker.mod.TaskFunction): FSWatcher = js.native
}

