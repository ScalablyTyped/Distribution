package typings.googleapis.serviceusageV1beta1Mod.serviceusageV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUsageRule extends StObject {
  
  /**
    * If true, the selected method allows unregistered calls, e.g. calls that don't identify any user or application.
    */
  var allowUnregisteredCalls: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Selects the methods to which this rule applies. Use '*' to indicate all methods in all APIs. Refer to selector for syntax details.
    */
  var selector: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If true, the selected method should skip service control and the control plane features, such as quota and billing, will not be available. This flag is used by Google Cloud Endpoints to bypass checks for internal methods, such as service health check methods.
    */
  var skipServiceControl: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaUsageRule {
  
  inline def apply(): SchemaUsageRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUsageRule]
  }
  
  extension [Self <: SchemaUsageRule](x: Self) {
    
    inline def setAllowUnregisteredCalls(value: Boolean): Self = StObject.set(x, "allowUnregisteredCalls", value.asInstanceOf[js.Any])
    
    inline def setAllowUnregisteredCallsNull: Self = StObject.set(x, "allowUnregisteredCalls", null)
    
    inline def setAllowUnregisteredCallsUndefined: Self = StObject.set(x, "allowUnregisteredCalls", js.undefined)
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorNull: Self = StObject.set(x, "selector", null)
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    inline def setSkipServiceControl(value: Boolean): Self = StObject.set(x, "skipServiceControl", value.asInstanceOf[js.Any])
    
    inline def setSkipServiceControlNull: Self = StObject.set(x, "skipServiceControl", null)
    
    inline def setSkipServiceControlUndefined: Self = StObject.set(x, "skipServiceControl", js.undefined)
  }
}
