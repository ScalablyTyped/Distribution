package typings.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for a relation entry.
  */
@js.native
trait SchemaUserRelation extends js.Object {
  
  /**
    * Custom Type.
    */
  var customType: js.UndefOr[String] = js.native
  
  /**
    * The relation of the user. Some of the possible values are mother, father,
    * sister, brother, manager, assistant, partner.
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * The name of the relation.
    */
  var value: js.UndefOr[String] = js.native
}
object SchemaUserRelation {
  
  @scala.inline
  def apply(): SchemaUserRelation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserRelation]
  }
  
  @scala.inline
  implicit class SchemaUserRelationOps[Self <: SchemaUserRelation] (val x: Self) extends AnyVal {
    
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
    def setCustomType(value: String): Self = this.set("customType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomType: Self = this.set("customType", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
