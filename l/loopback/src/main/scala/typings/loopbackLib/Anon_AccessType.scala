package typings
package loopbackLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccessType extends js.Object {
  var accessType: java.lang.String
  var id: js.Any
  var model: java.lang.String | loopbackLib.loopbackMod.Model
  var principals: js.Array[_]
  var property: java.lang.String
}

object Anon_AccessType {
  @scala.inline
  def apply(
    accessType: java.lang.String,
    id: js.Any,
    model: java.lang.String | loopbackLib.loopbackMod.Model,
    principals: js.Array[_],
    property: java.lang.String
  ): Anon_AccessType = {
    val __obj = js.Dynamic.literal(accessType = accessType, id = id, model = model.asInstanceOf[js.Any], principals = principals, property = property)
  
    __obj.asInstanceOf[Anon_AccessType]
  }
}

