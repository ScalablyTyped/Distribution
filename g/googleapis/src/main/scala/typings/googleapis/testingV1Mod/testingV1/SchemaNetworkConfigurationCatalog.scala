package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNetworkConfigurationCatalog extends StObject {
  
  var configurations: js.UndefOr[js.Array[SchemaNetworkConfiguration]] = js.undefined
}
object SchemaNetworkConfigurationCatalog {
  
  inline def apply(): SchemaNetworkConfigurationCatalog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkConfigurationCatalog]
  }
  
  extension [Self <: SchemaNetworkConfigurationCatalog](x: Self) {
    
    inline def setConfigurations(value: js.Array[SchemaNetworkConfiguration]): Self = StObject.set(x, "configurations", value.asInstanceOf[js.Any])
    
    inline def setConfigurationsUndefined: Self = StObject.set(x, "configurations", js.undefined)
    
    inline def setConfigurationsVarargs(value: SchemaNetworkConfiguration*): Self = StObject.set(x, "configurations", js.Array(value*))
  }
}
