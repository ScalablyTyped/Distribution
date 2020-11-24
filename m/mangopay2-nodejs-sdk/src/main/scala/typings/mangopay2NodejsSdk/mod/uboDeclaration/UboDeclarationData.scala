package typings.mangopay2NodejsSdk.mod.uboDeclaration

import typings.mangopay2NodejsSdk.mod.entityBase.EntityBaseData
import typings.mangopay2NodejsSdk.mod.kycDocument.DocumentStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UboDeclarationData extends EntityBaseData {
  
  /**
    * An array of UserIDs declared as Ultimate Beneficial Owners of a BUSINESS Legal User.
    */
  var DeclaredUBOs: js.Array[String] = js.native
  
  /**
    * Refused Reason Message for a UBO Declaration
    */
  var RefusedReasonMessage: String = js.native
  
  /**
    * Reason types for a UBO Declaration
    */
  var RefusedReasonTypes: js.Array[String] = js.native
  
  /**
    * Status of a UBO Declaration
    */
  var Status: DocumentStatus = js.native
  
  /**
    * The object owner's UserId
    */
  var UserId: String = js.native
}
object UboDeclarationData {
  
  @scala.inline
  def apply(
    CreationDate: Double,
    DeclaredUBOs: js.Array[String],
    Id: String,
    RefusedReasonMessage: String,
    RefusedReasonTypes: js.Array[String],
    Status: DocumentStatus,
    Tag: String,
    UserId: String
  ): UboDeclarationData = {
    val __obj = js.Dynamic.literal(CreationDate = CreationDate.asInstanceOf[js.Any], DeclaredUBOs = DeclaredUBOs.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], RefusedReasonMessage = RefusedReasonMessage.asInstanceOf[js.Any], RefusedReasonTypes = RefusedReasonTypes.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UboDeclarationData]
  }
  
  @scala.inline
  implicit class UboDeclarationDataOps[Self <: UboDeclarationData] (val x: Self) extends AnyVal {
    
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
    def setDeclaredUBOsVarargs(value: String*): Self = this.set("DeclaredUBOs", js.Array(value :_*))
    
    @scala.inline
    def setDeclaredUBOs(value: js.Array[String]): Self = this.set("DeclaredUBOs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefusedReasonMessage(value: String): Self = this.set("RefusedReasonMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefusedReasonTypesVarargs(value: String*): Self = this.set("RefusedReasonTypes", js.Array(value :_*))
    
    @scala.inline
    def setRefusedReasonTypes(value: js.Array[String]): Self = this.set("RefusedReasonTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: DocumentStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserId(value: String): Self = this.set("UserId", value.asInstanceOf[js.Any])
  }
}
