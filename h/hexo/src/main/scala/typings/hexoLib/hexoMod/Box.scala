package typings
package hexoLib.hexoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Box
  extends nodeLib.eventsMod.^ {
  def addProcessor(
    pattern: hexoDashUtilLib.hexoDashUtilMod.Pattern[scala.Boolean],
    fn: js.Function1[/* file */ hexoLib.hexoMod.BoxNs.File, scala.Unit]
  ): scala.Unit = js.native
  /**
    * A processor is an essential element of `Box` and is used to process files.
    * You can use path matching as described above to restrict what exactly the processor should process.
    * Register a new processor with the `addProcessor` method.
    */
  def addProcessor(pattern: java.lang.String, fn: js.Function1[/* file */ hexoLib.hexoMod.BoxNs.File, scala.Unit]): scala.Unit = js.native
  def addProcessor(pattern: stdLib.RegExp, fn: js.Function1[/* file */ hexoLib.hexoMod.BoxNs.File, scala.Unit]): scala.Unit = js.native
  /**
    * Loads all files in the folder.
    */
  def process(fn: js.Function1[/* err */ js.Any, scala.Unit]): js.Promise[scala.Unit] = js.native
  /**
    * Stop watching.
    */
  def unwatch(): scala.Unit = js.native
  /**
    * Loads all files in the folder and start watching for file changes.
    */
  def watch(): js.Promise[scala.Unit] = js.native
  def watch(fn: js.Function1[/* err */ js.Any, scala.Unit]): js.Promise[scala.Unit] = js.native
}

