package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1beta1ImportDataRequest extends StObject {
  
  /**
    * Required. Specify the input source of the data.
    */
  var inputConfig: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1InputConfig] = js.undefined
  
  /**
    * Email of the user who started the import task and should be notified by email. If empty no notification will be sent.
    */
  var userEmailAddress: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1beta1ImportDataRequest {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1beta1ImportDataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1beta1ImportDataRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1beta1ImportDataRequest](x: Self) {
    
    inline def setInputConfig(value: SchemaGoogleCloudDatalabelingV1beta1InputConfig): Self = StObject.set(x, "inputConfig", value.asInstanceOf[js.Any])
    
    inline def setInputConfigUndefined: Self = StObject.set(x, "inputConfig", js.undefined)
    
    inline def setUserEmailAddress(value: String): Self = StObject.set(x, "userEmailAddress", value.asInstanceOf[js.Any])
    
    inline def setUserEmailAddressNull: Self = StObject.set(x, "userEmailAddress", null)
    
    inline def setUserEmailAddressUndefined: Self = StObject.set(x, "userEmailAddress", js.undefined)
  }
}
