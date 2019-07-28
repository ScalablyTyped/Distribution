package typings.jsforce.describeDashResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChildRelationship extends js.Object {
  var cascadeDelete: Boolean
  var childSObject: String
  var deprecatedAndHidden: Boolean
  var field: String
  var junctionIdListNames: js.Array[String]
  var junctionReferenceTo: js.Array[String]
  var relationshipName: js.UndefOr[maybe[String]] = js.undefined
  var restrictedDelete: Boolean
}

object ChildRelationship {
  @scala.inline
  def apply(
    cascadeDelete: Boolean,
    childSObject: String,
    deprecatedAndHidden: Boolean,
    field: String,
    junctionIdListNames: js.Array[String],
    junctionReferenceTo: js.Array[String],
    restrictedDelete: Boolean,
    relationshipName: maybe[String] = null
  ): ChildRelationship = {
    val __obj = js.Dynamic.literal(cascadeDelete = cascadeDelete, childSObject = childSObject, deprecatedAndHidden = deprecatedAndHidden, field = field, junctionIdListNames = junctionIdListNames, junctionReferenceTo = junctionReferenceTo, restrictedDelete = restrictedDelete)
    if (relationshipName != null) __obj.updateDynamic("relationshipName")(relationshipName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildRelationship]
  }
}

