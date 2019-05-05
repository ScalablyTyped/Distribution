package typings
package inflationLib.inflationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inflation", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Automatically unzip an HTTP stream.
    *
    * @returns a stream that emits inflated data from the given stream.
    */
  def apply(req: nodeLib.streamMod.Readable): nodeLib.streamMod.Readable = js.native
  def apply(req: nodeLib.streamMod.Readable, options: Options): nodeLib.streamMod.Readable = js.native
}

