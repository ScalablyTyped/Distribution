package typings.atHapiHapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Vary extends js.Object {
  var vary: Boolean
  var weak: Boolean
}

object Anon_Vary {
  @scala.inline
  def apply(vary: Boolean, weak: Boolean): Anon_Vary = {
    val __obj = js.Dynamic.literal(vary = vary.asInstanceOf[js.Any], weak = weak.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Vary]
  }
}

