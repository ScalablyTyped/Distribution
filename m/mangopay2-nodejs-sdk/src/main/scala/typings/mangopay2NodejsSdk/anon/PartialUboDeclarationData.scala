package typings.mangopay2NodejsSdk.anon

import typings.mangopay2NodejsSdk.mod.kycDocument.DocumentStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.uboDeclaration.UboDeclarationData> */
@js.native
trait PartialUboDeclarationData extends js.Object {
  
  var CreationDate: js.UndefOr[Double] = js.native
  
  var DeclaredUBOs: js.UndefOr[js.Array[String]] = js.native
  
  var Id: js.UndefOr[String] = js.native
  
  var RefusedReasonMessage: js.UndefOr[String] = js.native
  
  var RefusedReasonTypes: js.UndefOr[js.Array[String]] = js.native
  
  var Status: js.UndefOr[DocumentStatus] = js.native
  
  var Tag: js.UndefOr[String] = js.native
  
  var UserId: js.UndefOr[String] = js.native
}
object PartialUboDeclarationData {
  
  @scala.inline
  def apply(): PartialUboDeclarationData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialUboDeclarationData]
  }
  
  @scala.inline
  implicit class PartialUboDeclarationDataOps[Self <: PartialUboDeclarationData] (val x: Self) extends AnyVal {
    
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
    def setCreationDate(value: Double): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationDate: Self = this.set("CreationDate", js.undefined)
    
    @scala.inline
    def setDeclaredUBOsVarargs(value: String*): Self = this.set("DeclaredUBOs", js.Array(value :_*))
    
    @scala.inline
    def setDeclaredUBOs(value: js.Array[String]): Self = this.set("DeclaredUBOs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeclaredUBOs: Self = this.set("DeclaredUBOs", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setRefusedReasonMessage(value: String): Self = this.set("RefusedReasonMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefusedReasonMessage: Self = this.set("RefusedReasonMessage", js.undefined)
    
    @scala.inline
    def setRefusedReasonTypesVarargs(value: String*): Self = this.set("RefusedReasonTypes", js.Array(value :_*))
    
    @scala.inline
    def setRefusedReasonTypes(value: js.Array[String]): Self = this.set("RefusedReasonTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefusedReasonTypes: Self = this.set("RefusedReasonTypes", js.undefined)
    
    @scala.inline
    def setStatus(value: DocumentStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = this.set("Tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("Tag", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = this.set("UserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserId: Self = this.set("UserId", js.undefined)
  }
}
