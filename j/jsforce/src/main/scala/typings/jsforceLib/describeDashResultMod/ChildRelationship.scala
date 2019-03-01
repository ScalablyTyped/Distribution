package typings
package jsforceLib.describeDashResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChildRelationship extends js.Object {
  var cascadeDelete: scala.Boolean
  var childSObject: java.lang.String
  var deprecatedAndHidden: scala.Boolean
  var field: java.lang.String
  var junctionIdListNames: js.Array[java.lang.String]
  var junctionReferenceTo: js.Array[java.lang.String]
  var relationshipName: js.UndefOr[maybe[java.lang.String]] = js.undefined
  var restrictedDelete: scala.Boolean
}

object ChildRelationship {
  @scala.inline
  def apply(
    cascadeDelete: scala.Boolean,
    childSObject: java.lang.String,
    deprecatedAndHidden: scala.Boolean,
    field: java.lang.String,
    junctionIdListNames: js.Array[java.lang.String],
    junctionReferenceTo: js.Array[java.lang.String],
    restrictedDelete: scala.Boolean,
    relationshipName: maybe[java.lang.String] = null
  ): ChildRelationship = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cascadeDelete")(cascadeDelete)
    __obj.updateDynamic("childSObject")(childSObject)
    __obj.updateDynamic("deprecatedAndHidden")(deprecatedAndHidden)
    __obj.updateDynamic("field")(field)
    __obj.updateDynamic("junctionIdListNames")(junctionIdListNames)
    __obj.updateDynamic("junctionReferenceTo")(junctionReferenceTo)
    __obj.updateDynamic("restrictedDelete")(restrictedDelete)
    if (relationshipName != null) __obj.updateDynamic("relationshipName")(relationshipName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildRelationship]
  }
}

