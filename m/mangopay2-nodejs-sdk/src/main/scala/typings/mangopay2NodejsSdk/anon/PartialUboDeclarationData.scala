package typings.mangopay2NodejsSdk.anon

import typings.mangopay2NodejsSdk.mod.kycDocument.DocumentStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.uboDeclaration.UboDeclarationData> */
@js.native
trait PartialUboDeclarationData extends StObject {
  
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
  implicit class PartialUboDeclarationDataMutableBuilder[Self <: PartialUboDeclarationData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationDate(value: Double): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    @scala.inline
    def setDeclaredUBOs(value: js.Array[String]): Self = StObject.set(x, "DeclaredUBOs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclaredUBOsUndefined: Self = StObject.set(x, "DeclaredUBOs", js.undefined)
    
    @scala.inline
    def setDeclaredUBOsVarargs(value: String*): Self = StObject.set(x, "DeclaredUBOs", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setRefusedReasonMessage(value: String): Self = StObject.set(x, "RefusedReasonMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefusedReasonMessageUndefined: Self = StObject.set(x, "RefusedReasonMessage", js.undefined)
    
    @scala.inline
    def setRefusedReasonTypes(value: js.Array[String]): Self = StObject.set(x, "RefusedReasonTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefusedReasonTypesUndefined: Self = StObject.set(x, "RefusedReasonTypes", js.undefined)
    
    @scala.inline
    def setRefusedReasonTypesVarargs(value: String*): Self = StObject.set(x, "RefusedReasonTypes", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: DocumentStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "UserId", js.undefined)
  }
}
