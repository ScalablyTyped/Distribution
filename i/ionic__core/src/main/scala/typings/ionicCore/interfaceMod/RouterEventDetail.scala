package typings.ionicCore.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterEventDetail extends js.Object {
  var from: String | Null
  var redirectedFrom: String | Null
  var to: String
}

object RouterEventDetail {
  @scala.inline
  def apply(to: String, from: String = null, redirectedFrom: String = null): RouterEventDetail = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], redirectedFrom = redirectedFrom.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterEventDetail]
  }
}

