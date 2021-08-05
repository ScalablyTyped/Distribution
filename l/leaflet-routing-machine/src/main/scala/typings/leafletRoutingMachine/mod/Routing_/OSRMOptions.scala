package typings.leafletRoutingMachine.mod.Routing_

import org.scalablytyped.runtime.StringDictionary
import typings.leafletRoutingMachine.anon.LegCount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OSRMOptions extends StObject {
  
  var language: js.UndefOr[String] = js.undefined
  
  var polylinePrecision: js.UndefOr[Double] = js.undefined
  
  var profile: js.UndefOr[String] = js.undefined
  
  var requestParameters: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  var routingOptions: js.UndefOr[js.Any] = js.undefined
  
  var serviceUrl: js.UndefOr[String] = js.undefined
  
  var stepToText: js.UndefOr[js.Function2[/* step */ js.Any, /* leg */ LegCount, js.Any]] = js.undefined
  
  var suppressDemoServerWarning: js.UndefOr[Boolean] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var useHints: js.UndefOr[Boolean] = js.undefined
}
object OSRMOptions {
  
  inline def apply(): OSRMOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OSRMOptions]
  }
  
  extension [Self <: OSRMOptions](x: Self) {
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setPolylinePrecision(value: Double): Self = StObject.set(x, "polylinePrecision", value.asInstanceOf[js.Any])
    
    inline def setPolylinePrecisionUndefined: Self = StObject.set(x, "polylinePrecision", js.undefined)
    
    inline def setProfile(value: String): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    inline def setRequestParameters(value: StringDictionary[js.Any]): Self = StObject.set(x, "requestParameters", value.asInstanceOf[js.Any])
    
    inline def setRequestParametersUndefined: Self = StObject.set(x, "requestParameters", js.undefined)
    
    inline def setRoutingOptions(value: js.Any): Self = StObject.set(x, "routingOptions", value.asInstanceOf[js.Any])
    
    inline def setRoutingOptionsUndefined: Self = StObject.set(x, "routingOptions", js.undefined)
    
    inline def setServiceUrl(value: String): Self = StObject.set(x, "serviceUrl", value.asInstanceOf[js.Any])
    
    inline def setServiceUrlUndefined: Self = StObject.set(x, "serviceUrl", js.undefined)
    
    inline def setStepToText(value: (/* step */ js.Any, /* leg */ LegCount) => js.Any): Self = StObject.set(x, "stepToText", js.Any.fromFunction2(value))
    
    inline def setStepToTextUndefined: Self = StObject.set(x, "stepToText", js.undefined)
    
    inline def setSuppressDemoServerWarning(value: Boolean): Self = StObject.set(x, "suppressDemoServerWarning", value.asInstanceOf[js.Any])
    
    inline def setSuppressDemoServerWarningUndefined: Self = StObject.set(x, "suppressDemoServerWarning", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setUseHints(value: Boolean): Self = StObject.set(x, "useHints", value.asInstanceOf[js.Any])
    
    inline def setUseHintsUndefined: Self = StObject.set(x, "useHints", js.undefined)
  }
}
