package typings.googleapis.osconfigV1alphaMod.osconfigV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOSPolicyOSFilter extends StObject {
  
  /**
    * This should match OS short name emitted by the OS inventory agent. An empty value matches any OS.
    */
  var osShortName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This value should match the version emitted by the OS inventory agent. Prefix matches are supported if asterisk(*) is provided as the last character. For example, to match all versions with a major version of `7`, specify the following value for this field `7.*`
    */
  var osVersion: js.UndefOr[String | Null] = js.undefined
}
object SchemaOSPolicyOSFilter {
  
  inline def apply(): SchemaOSPolicyOSFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOSPolicyOSFilter]
  }
  
  extension [Self <: SchemaOSPolicyOSFilter](x: Self) {
    
    inline def setOsShortName(value: String): Self = StObject.set(x, "osShortName", value.asInstanceOf[js.Any])
    
    inline def setOsShortNameNull: Self = StObject.set(x, "osShortName", null)
    
    inline def setOsShortNameUndefined: Self = StObject.set(x, "osShortName", js.undefined)
    
    inline def setOsVersion(value: String): Self = StObject.set(x, "osVersion", value.asInstanceOf[js.Any])
    
    inline def setOsVersionNull: Self = StObject.set(x, "osVersion", null)
    
    inline def setOsVersionUndefined: Self = StObject.set(x, "osVersion", js.undefined)
  }
}
