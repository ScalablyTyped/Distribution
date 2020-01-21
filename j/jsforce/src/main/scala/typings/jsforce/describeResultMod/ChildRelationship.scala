package typings.jsforce.describeResultMod

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
    val __obj = js.Dynamic.literal(cascadeDelete = cascadeDelete.asInstanceOf[js.Any], childSObject = childSObject.asInstanceOf[js.Any], deprecatedAndHidden = deprecatedAndHidden.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], junctionIdListNames = junctionIdListNames.asInstanceOf[js.Any], junctionReferenceTo = junctionReferenceTo.asInstanceOf[js.Any], restrictedDelete = restrictedDelete.asInstanceOf[js.Any])
    if (relationshipName != null) __obj.updateDynamic("relationshipName")(relationshipName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildRelationship]
  }
}

