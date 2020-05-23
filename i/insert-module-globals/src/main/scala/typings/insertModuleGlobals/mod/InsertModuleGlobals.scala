package typings.insertModuleGlobals.mod

import typings.insertModuleGlobals.anon.Buffer
import typings.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsertModuleGlobals extends js.Object {
  /**
    * Defaults
    */
  val vars: Buffer = js.native
  /**
    * Return a transform stream inserter for the filename file that will accept a javascript file as input and
    * will output the file with a closure around the contents as necessary to define extra builtins.
    */
  def apply(file: String): Transform = js.native
  def apply(file: String, opts: Options): Transform = js.native
}

