package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rule extends StObject {
  
  /** This is deprecated and has no effect. Do not use. */
  var action: js.UndefOr[String] = js.undefined
  
  /** This is deprecated and has no effect. Do not use. */
  var conditions: js.UndefOr[js.Array[Condition]] = js.undefined
  
  /** This is deprecated and has no effect. Do not use. */
  var description: js.UndefOr[String] = js.undefined
  
  /** This is deprecated and has no effect. Do not use. */
  var ins: js.UndefOr[js.Array[String]] = js.undefined
  
  /** This is deprecated and has no effect. Do not use. */
  var logConfigs: js.UndefOr[js.Array[LogConfig]] = js.undefined
  
  /** This is deprecated and has no effect. Do not use. */
  var notIns: js.UndefOr[js.Array[String]] = js.undefined
  
  /** This is deprecated and has no effect. Do not use. */
  var permissions: js.UndefOr[js.Array[String]] = js.undefined
}
object Rule {
  
  inline def apply(): Rule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Rule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Rule] (val x: Self) extends AnyVal {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setConditions(value: js.Array[Condition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    inline def setConditionsVarargs(value: Condition*): Self = StObject.set(x, "conditions", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIns(value: js.Array[String]): Self = StObject.set(x, "ins", value.asInstanceOf[js.Any])
    
    inline def setInsUndefined: Self = StObject.set(x, "ins", js.undefined)
    
    inline def setInsVarargs(value: String*): Self = StObject.set(x, "ins", js.Array(value*))
    
    inline def setLogConfigs(value: js.Array[LogConfig]): Self = StObject.set(x, "logConfigs", value.asInstanceOf[js.Any])
    
    inline def setLogConfigsUndefined: Self = StObject.set(x, "logConfigs", js.undefined)
    
    inline def setLogConfigsVarargs(value: LogConfig*): Self = StObject.set(x, "logConfigs", js.Array(value*))
    
    inline def setNotIns(value: js.Array[String]): Self = StObject.set(x, "notIns", value.asInstanceOf[js.Any])
    
    inline def setNotInsUndefined: Self = StObject.set(x, "notIns", js.undefined)
    
    inline def setNotInsVarargs(value: String*): Self = StObject.set(x, "notIns", js.Array(value*))
    
    inline def setPermissions(value: js.Array[String]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    inline def setPermissionsVarargs(value: String*): Self = StObject.set(x, "permissions", js.Array(value*))
  }
}
