package typings.mangopay2NodejsSdk.anon

import typings.mangopay2NodejsSdk.enumsMod.enums.IUboDeclarationRefusedReasonType
import typings.mangopay2NodejsSdk.enumsMod.enums.IUboDeclarationStatus
import typings.mangopay2NodejsSdk.typesMod.Timestamp
import typings.mangopay2NodejsSdk.typesMod.ValueOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/models/uboDeclaration.uboDeclaration.UboDeclarationData> */
trait PartialUboDeclarationData extends StObject {
  
  var CreationDate: js.UndefOr[Double] = js.undefined
  
  var Id: js.UndefOr[String] = js.undefined
  
  var Message: js.UndefOr[String] = js.undefined
  
  var ProcessedDate: js.UndefOr[Timestamp] = js.undefined
  
  var Reason: js.UndefOr[ValueOf[IUboDeclarationRefusedReasonType]] = js.undefined
  
  var Status: js.UndefOr[ValueOf[IUboDeclarationStatus]] = js.undefined
  
  var Tag: js.UndefOr[String] = js.undefined
  
  var Ubos: js.UndefOr[js.Array[Any]] = js.undefined
}
object PartialUboDeclarationData {
  
  inline def apply(): PartialUboDeclarationData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialUboDeclarationData]
  }
  
  extension [Self <: PartialUboDeclarationData](x: Self) {
    
    inline def setCreationDate(value: Double): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setProcessedDate(value: Timestamp): Self = StObject.set(x, "ProcessedDate", value.asInstanceOf[js.Any])
    
    inline def setProcessedDateUndefined: Self = StObject.set(x, "ProcessedDate", js.undefined)
    
    inline def setReason(value: ValueOf[IUboDeclarationRefusedReasonType]): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "Reason", js.undefined)
    
    inline def setStatus(value: ValueOf[IUboDeclarationStatus]): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
    
    inline def setUbos(value: js.Array[Any]): Self = StObject.set(x, "Ubos", value.asInstanceOf[js.Any])
    
    inline def setUbosUndefined: Self = StObject.set(x, "Ubos", js.undefined)
    
    inline def setUbosVarargs(value: Any*): Self = StObject.set(x, "Ubos", js.Array(value*))
  }
}
