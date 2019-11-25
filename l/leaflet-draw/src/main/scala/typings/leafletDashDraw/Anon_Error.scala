package typings.leafletDashDraw

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error extends js.Object {
  var error: String
  var tooltip: Anon_Cont
}

object Anon_Error {
  @scala.inline
  def apply(error: String, tooltip: Anon_Cont): Anon_Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Error]
  }
}

