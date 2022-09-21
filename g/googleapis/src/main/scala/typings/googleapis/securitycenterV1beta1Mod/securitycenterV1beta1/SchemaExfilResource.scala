package typings.googleapis.securitycenterV1beta1Mod.securitycenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExfilResource extends StObject {
  
  /**
    * Subcomponents of the asset that is exfiltrated - these could be URIs used during exfiltration, table names, databases, filenames, etc. For example, multiple tables may be exfiltrated from the same CloudSQL instance, or multiple files from the same Cloud Storage bucket.
    */
  var components: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Resource's URI (https://google.aip.dev/122#full-resource-names)
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaExfilResource {
  
  inline def apply(): SchemaExfilResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExfilResource]
  }
  
  extension [Self <: SchemaExfilResource](x: Self) {
    
    inline def setComponents(value: js.Array[String]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsNull: Self = StObject.set(x, "components", null)
    
    inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    inline def setComponentsVarargs(value: String*): Self = StObject.set(x, "components", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
