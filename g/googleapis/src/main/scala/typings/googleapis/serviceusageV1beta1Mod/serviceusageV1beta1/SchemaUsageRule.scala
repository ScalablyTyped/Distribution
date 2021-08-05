package typings.googleapis.serviceusageV1beta1Mod.serviceusageV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Usage configuration rules for the service.  NOTE: Under development.   Use
  * this rule to configure unregistered calls for the service. Unregistered
  * calls are calls that do not contain consumer project identity. (Example:
  * calls that do not contain an API key). By default, API methods do not allow
  * unregistered calls, and each method call must be identified by a consumer
  * project identity. Use this rule to allow/disallow unregistered calls.
  * Example of an API that wants to allow unregistered calls for entire
  * service.      usage:       rules:       - selector: &quot;*&quot;
  * allow_unregistered_calls: true  Example of a method that wants to allow
  * unregistered calls.      usage:       rules:       - selector:
  * &quot;google.example.library.v1.LibraryService.CreateBook&quot;
  * allow_unregistered_calls: true
  */
trait SchemaUsageRule extends StObject {
  
  /**
    * If true, the selected method allows unregistered calls, e.g. calls that
    * don&#39;t identify any user or application.
    */
  var allowUnregisteredCalls: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Selects the methods to which this rule applies. Use &#39;*&#39; to
    * indicate all methods in all APIs.  Refer to selector for syntax details.
    */
  var selector: js.UndefOr[String] = js.undefined
  
  /**
    * If true, the selected method should skip service control and the control
    * plane features, such as quota and billing, will not be available. This
    * flag is used by Google Cloud Endpoints to bypass checks for internal
    * methods, such as service health check methods.
    */
  var skipServiceControl: js.UndefOr[Boolean] = js.undefined
}
object SchemaUsageRule {
  
  inline def apply(): SchemaUsageRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUsageRule]
  }
  
  extension [Self <: SchemaUsageRule](x: Self) {
    
    inline def setAllowUnregisteredCalls(value: Boolean): Self = StObject.set(x, "allowUnregisteredCalls", value.asInstanceOf[js.Any])
    
    inline def setAllowUnregisteredCallsUndefined: Self = StObject.set(x, "allowUnregisteredCalls", js.undefined)
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    inline def setSkipServiceControl(value: Boolean): Self = StObject.set(x, "skipServiceControl", value.asInstanceOf[js.Any])
    
    inline def setSkipServiceControlUndefined: Self = StObject.set(x, "skipServiceControl", js.undefined)
  }
}
