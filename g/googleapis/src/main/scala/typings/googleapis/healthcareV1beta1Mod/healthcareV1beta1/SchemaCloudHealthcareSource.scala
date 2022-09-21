package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCloudHealthcareSource extends StObject {
  
  /**
    * Full path of a Cloud Healthcare API resource.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaCloudHealthcareSource {
  
  inline def apply(): SchemaCloudHealthcareSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCloudHealthcareSource]
  }
  
  extension [Self <: SchemaCloudHealthcareSource](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
