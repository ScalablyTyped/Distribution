package typings
package imageDashTypeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Input extends js.Object {
  /**
  	 * The minimum amount of bytes needed to detect a file type. Currently, it's 4100 bytes, but it can change, so don't hard-code it.
  	 */
  val minimumBytes: scala.Double = js.native
  def apply(input: nodeLib.Buffer): imageDashTypeLib.imageDashTypeMod.ImageTypeResult | scala.Null = js.native
  def apply(input: stdLib.Uint8Array): imageDashTypeLib.imageDashTypeMod.ImageTypeResult | scala.Null = js.native
}

