package typings.hexo.hexoMod

import typings.hexo.hexoMod.BoxNs.File
import typings.hexoDashUtil.hexoDashUtilMod.Pattern
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Box
  extends typings.node.eventsMod.^ {
  /**
    * A processor is an essential element of `Box` and is used to process files.
    * You can use path matching as described above to restrict what exactly the processor should process.
    * Register a new processor with the `addProcessor` method.
    */
  def addProcessor(pattern: String, fn: js.Function1[/* file */ File, Unit]): Unit = js.native
  def addProcessor(pattern: Pattern[Boolean], fn: js.Function1[/* file */ File, Unit]): Unit = js.native
  def addProcessor(pattern: RegExp, fn: js.Function1[/* file */ File, Unit]): Unit = js.native
  /**
    * Loads all files in the folder.
    */
  def process(fn: js.Function1[/* err */ js.Any, Unit]): js.Promise[Unit] = js.native
  /**
    * Stop watching.
    */
  def unwatch(): Unit = js.native
  /**
    * Loads all files in the folder and start watching for file changes.
    */
  def watch(): js.Promise[Unit] = js.native
  def watch(fn: js.Function1[/* err */ js.Any, Unit]): js.Promise[Unit] = js.native
}

