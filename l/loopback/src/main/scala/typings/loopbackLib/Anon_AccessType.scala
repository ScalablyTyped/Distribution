package typings
package loopbackLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccessType extends js.Object {
  var accessType: java.lang.String
  var id: js.Any
  var model: java.lang.String | loopbackLib.loopbackMod.lNs.Model
  var principals: js.Array[_]
  var property: java.lang.String
}

object Anon_AccessType {
  @scala.inline
  def apply(
    accessType: java.lang.String,
    id: js.Any,
    model: java.lang.String | loopbackLib.loopbackMod.lNs.Model,
    principals: js.Array[_],
    property: java.lang.String
  ): Anon_AccessType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accessType")(accessType)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    __obj.updateDynamic("principals")(principals)
    __obj.updateDynamic("property")(property)
    __obj.asInstanceOf[Anon_AccessType]
  }
}

