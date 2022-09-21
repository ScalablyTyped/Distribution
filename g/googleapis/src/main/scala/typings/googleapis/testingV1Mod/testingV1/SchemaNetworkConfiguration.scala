package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNetworkConfiguration extends StObject {
  
  /**
    * The emulation rule applying to the download traffic.
    */
  var downRule: js.UndefOr[SchemaTrafficRule] = js.undefined
  
  /**
    * The unique opaque id for this network traffic configuration.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The emulation rule applying to the upload traffic.
    */
  var upRule: js.UndefOr[SchemaTrafficRule] = js.undefined
}
object SchemaNetworkConfiguration {
  
  inline def apply(): SchemaNetworkConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkConfiguration]
  }
  
  extension [Self <: SchemaNetworkConfiguration](x: Self) {
    
    inline def setDownRule(value: SchemaTrafficRule): Self = StObject.set(x, "downRule", value.asInstanceOf[js.Any])
    
    inline def setDownRuleUndefined: Self = StObject.set(x, "downRule", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setUpRule(value: SchemaTrafficRule): Self = StObject.set(x, "upRule", value.asInstanceOf[js.Any])
    
    inline def setUpRuleUndefined: Self = StObject.set(x, "upRule", js.undefined)
  }
}
