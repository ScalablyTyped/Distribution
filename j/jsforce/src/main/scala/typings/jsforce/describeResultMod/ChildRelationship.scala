package typings.jsforce.describeResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChildRelationship extends js.Object {
  
  var cascadeDelete: Boolean = js.native
  
  var childSObject: String = js.native
  
  var deprecatedAndHidden: Boolean = js.native
  
  var field: String = js.native
  
  var junctionIdListNames: js.Array[String] = js.native
  
  var junctionReferenceTo: js.Array[String] = js.native
  
  var relationshipName: js.UndefOr[maybe[String]] = js.native
  
  var restrictedDelete: Boolean = js.native
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
    restrictedDelete: Boolean
  ): ChildRelationship = {
    val __obj = js.Dynamic.literal(cascadeDelete = cascadeDelete.asInstanceOf[js.Any], childSObject = childSObject.asInstanceOf[js.Any], deprecatedAndHidden = deprecatedAndHidden.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], junctionIdListNames = junctionIdListNames.asInstanceOf[js.Any], junctionReferenceTo = junctionReferenceTo.asInstanceOf[js.Any], restrictedDelete = restrictedDelete.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildRelationship]
  }
  
  @scala.inline
  implicit class ChildRelationshipOps[Self <: ChildRelationship] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCascadeDelete(value: Boolean): Self = this.set("cascadeDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildSObject(value: String): Self = this.set("childSObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecatedAndHidden(value: Boolean): Self = this.set("deprecatedAndHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJunctionIdListNamesVarargs(value: String*): Self = this.set("junctionIdListNames", js.Array(value :_*))
    
    @scala.inline
    def setJunctionIdListNames(value: js.Array[String]): Self = this.set("junctionIdListNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJunctionReferenceToVarargs(value: String*): Self = this.set("junctionReferenceTo", js.Array(value :_*))
    
    @scala.inline
    def setJunctionReferenceTo(value: js.Array[String]): Self = this.set("junctionReferenceTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestrictedDelete(value: Boolean): Self = this.set("restrictedDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationshipName(value: maybe[String]): Self = this.set("relationshipName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelationshipName: Self = this.set("relationshipName", js.undefined)
    
    @scala.inline
    def setRelationshipNameNull: Self = this.set("relationshipName", null)
  }
}
