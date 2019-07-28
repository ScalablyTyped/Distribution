package typings.loopback

import typings.loopback.loopbackMod.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccessType extends js.Object {
  var accessType: String
  var id: js.Any
  var model: String | Model
  var principals: js.Array[_]
  var property: String
}

object Anon_AccessType {
  @scala.inline
  def apply(accessType: String, id: js.Any, model: String | Model, principals: js.Array[_], property: String): Anon_AccessType = {
    val __obj = js.Dynamic.literal(accessType = accessType, id = id, model = model.asInstanceOf[js.Any], principals = principals, property = property)
  
    __obj.asInstanceOf[Anon_AccessType]
  }
}

