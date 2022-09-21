package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWindowsVersion extends StObject {
  
  /**
    * Windows server image type
    */
  var imageType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Windows server build number
    */
  var osVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Mainstream support end date
    */
  var supportEndDate: js.UndefOr[SchemaDate] = js.undefined
}
object SchemaWindowsVersion {
  
  inline def apply(): SchemaWindowsVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWindowsVersion]
  }
  
  extension [Self <: SchemaWindowsVersion](x: Self) {
    
    inline def setImageType(value: String): Self = StObject.set(x, "imageType", value.asInstanceOf[js.Any])
    
    inline def setImageTypeNull: Self = StObject.set(x, "imageType", null)
    
    inline def setImageTypeUndefined: Self = StObject.set(x, "imageType", js.undefined)
    
    inline def setOsVersion(value: String): Self = StObject.set(x, "osVersion", value.asInstanceOf[js.Any])
    
    inline def setOsVersionNull: Self = StObject.set(x, "osVersion", null)
    
    inline def setOsVersionUndefined: Self = StObject.set(x, "osVersion", js.undefined)
    
    inline def setSupportEndDate(value: SchemaDate): Self = StObject.set(x, "supportEndDate", value.asInstanceOf[js.Any])
    
    inline def setSupportEndDateUndefined: Self = StObject.set(x, "supportEndDate", js.undefined)
  }
}
