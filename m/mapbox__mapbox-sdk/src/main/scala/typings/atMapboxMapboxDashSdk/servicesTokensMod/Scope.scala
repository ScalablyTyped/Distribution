package typings.atMapboxMapboxDashSdk.servicesTokensMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scope extends js.Object {
  var description: String
  var id: String
  var public: Boolean
}

object Scope {
  @scala.inline
  def apply(description: String, id: String, public: Boolean): Scope = {
    val __obj = js.Dynamic.literal(description = description, id = id, public = public)
  
    __obj.asInstanceOf[Scope]
  }
}

