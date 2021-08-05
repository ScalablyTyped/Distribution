package typings.mangopay2NodejsSdk.anon

import typings.mangopay2NodejsSdk.mod.kycDocument.DocumentStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.uboDeclaration.UboDeclarationData> */
trait PartialUboDeclarationData extends StObject {
  
  var CreationDate: js.UndefOr[Double] = js.undefined
  
  var DeclaredUBOs: js.UndefOr[js.Array[String]] = js.undefined
  
  var Id: js.UndefOr[String] = js.undefined
  
  var RefusedReasonMessage: js.UndefOr[String] = js.undefined
  
  var RefusedReasonTypes: js.UndefOr[js.Array[String]] = js.undefined
  
  var Status: js.UndefOr[DocumentStatus] = js.undefined
  
  var Tag: js.UndefOr[String] = js.undefined
  
  var UserId: js.UndefOr[String] = js.undefined
}
object PartialUboDeclarationData {
  
  inline def apply(): PartialUboDeclarationData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialUboDeclarationData]
  }
  
  extension [Self <: PartialUboDeclarationData](x: Self) {
    
    inline def setCreationDate(value: Double): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setDeclaredUBOs(value: js.Array[String]): Self = StObject.set(x, "DeclaredUBOs", value.asInstanceOf[js.Any])
    
    inline def setDeclaredUBOsUndefined: Self = StObject.set(x, "DeclaredUBOs", js.undefined)
    
    inline def setDeclaredUBOsVarargs(value: String*): Self = StObject.set(x, "DeclaredUBOs", js.Array(value :_*))
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setRefusedReasonMessage(value: String): Self = StObject.set(x, "RefusedReasonMessage", value.asInstanceOf[js.Any])
    
    inline def setRefusedReasonMessageUndefined: Self = StObject.set(x, "RefusedReasonMessage", js.undefined)
    
    inline def setRefusedReasonTypes(value: js.Array[String]): Self = StObject.set(x, "RefusedReasonTypes", value.asInstanceOf[js.Any])
    
    inline def setRefusedReasonTypesUndefined: Self = StObject.set(x, "RefusedReasonTypes", js.undefined)
    
    inline def setRefusedReasonTypesVarargs(value: String*): Self = StObject.set(x, "RefusedReasonTypes", js.Array(value :_*))
    
    inline def setStatus(value: DocumentStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "UserId", js.undefined)
  }
}
