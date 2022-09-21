package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePropertiesFirebaselinksDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Format: properties/{property_id\}/firebaseLinks/{firebase_link_id\} Example: properties/1234/firebaseLinks/5678
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourcePropertiesFirebaselinksDelete {
  
  inline def apply(): ParamsResourcePropertiesFirebaselinksDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePropertiesFirebaselinksDelete]
  }
  
  extension [Self <: ParamsResourcePropertiesFirebaselinksDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
