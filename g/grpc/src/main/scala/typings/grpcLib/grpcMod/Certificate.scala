package typings
package grpcLib.grpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Certificate extends js.Object {
  /**
    * The raw certificate in DER form.
    */
  var raw: nodeLib.Buffer
}

object Certificate {
  @scala.inline
  def apply(raw: nodeLib.Buffer): Certificate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("raw")(raw)
    __obj.asInstanceOf[Certificate]
  }
}

