package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConfidentialInstanceConfig extends StObject {
  
  /**
    * Optional. Defines whether the instance should have confidential compute enabled.
    */
  var enableConfidentialCompute: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaConfidentialInstanceConfig {
  
  inline def apply(): SchemaConfidentialInstanceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfidentialInstanceConfig]
  }
  
  extension [Self <: SchemaConfidentialInstanceConfig](x: Self) {
    
    inline def setEnableConfidentialCompute(value: Boolean): Self = StObject.set(x, "enableConfidentialCompute", value.asInstanceOf[js.Any])
    
    inline def setEnableConfidentialComputeNull: Self = StObject.set(x, "enableConfidentialCompute", null)
    
    inline def setEnableConfidentialComputeUndefined: Self = StObject.set(x, "enableConfidentialCompute", js.undefined)
  }
}
