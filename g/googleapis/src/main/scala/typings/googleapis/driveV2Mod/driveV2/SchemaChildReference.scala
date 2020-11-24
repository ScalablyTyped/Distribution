package typings.googleapis.driveV2Mod.driveV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A reference to a folder&#39;s child.
  */
@js.native
trait SchemaChildReference extends js.Object {
  
  /**
    * A link to the child.
    */
  var childLink: js.UndefOr[String] = js.native
  
  /**
    * The ID of the child.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * This is always drive#childReference.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * A link back to this reference.
    */
  var selfLink: js.UndefOr[String] = js.native
}
object SchemaChildReference {
  
  @scala.inline
  def apply(): SchemaChildReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChildReference]
  }
  
  @scala.inline
  implicit class SchemaChildReferenceOps[Self <: SchemaChildReference] (val x: Self) extends AnyVal {
    
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
    def setChildLink(value: String): Self = this.set("childLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildLink: Self = this.set("childLink", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
  }
}
