package typings.googleapis.gkehubV1betaMod.gkehubV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConfigManagementPolicyControllerMonitoring extends StObject {
  
  /**
    * Specifies the list of backends Policy Controller will export to. An empty list would effectively disable metrics export.
    */
  var backends: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaConfigManagementPolicyControllerMonitoring {
  
  inline def apply(): SchemaConfigManagementPolicyControllerMonitoring = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfigManagementPolicyControllerMonitoring]
  }
  
  extension [Self <: SchemaConfigManagementPolicyControllerMonitoring](x: Self) {
    
    inline def setBackends(value: js.Array[String]): Self = StObject.set(x, "backends", value.asInstanceOf[js.Any])
    
    inline def setBackendsNull: Self = StObject.set(x, "backends", null)
    
    inline def setBackendsUndefined: Self = StObject.set(x, "backends", js.undefined)
    
    inline def setBackendsVarargs(value: String*): Self = StObject.set(x, "backends", js.Array(value*))
  }
}
