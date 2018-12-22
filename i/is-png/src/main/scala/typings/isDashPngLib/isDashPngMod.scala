package typings
package isDashPngLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("is-png", JSImport.Namespace)
@js.native
object isDashPngMod extends js.Object {
  /**
   * Check whether a buffer contains a PNG image.
   * @remarks This only performs a header check, and the buffer may not parse as a PNG file.
   * @param buffer The buffer to check.
   * @returns Whether the given buffer contains a PNG image.
   */
  def apply(buffer: stdLib.Uint8Array | nodeLib.Buffer): scala.Boolean = js.native
}

