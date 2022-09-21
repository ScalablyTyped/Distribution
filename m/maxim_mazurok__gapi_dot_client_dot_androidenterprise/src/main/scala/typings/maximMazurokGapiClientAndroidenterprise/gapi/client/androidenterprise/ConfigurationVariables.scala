package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigurationVariables extends StObject {
  
  /** The ID of the managed configurations settings. */
  var mcmId: js.UndefOr[String] = js.undefined
  
  /** The variable set that is attributed to the user. */
  var variableSet: js.UndefOr[js.Array[VariableSet]] = js.undefined
}
object ConfigurationVariables {
  
  inline def apply(): ConfigurationVariables = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationVariables]
  }
  
  extension [Self <: ConfigurationVariables](x: Self) {
    
    inline def setMcmId(value: String): Self = StObject.set(x, "mcmId", value.asInstanceOf[js.Any])
    
    inline def setMcmIdUndefined: Self = StObject.set(x, "mcmId", js.undefined)
    
    inline def setVariableSet(value: js.Array[VariableSet]): Self = StObject.set(x, "variableSet", value.asInstanceOf[js.Any])
    
    inline def setVariableSetUndefined: Self = StObject.set(x, "variableSet", js.undefined)
    
    inline def setVariableSetVarargs(value: VariableSet*): Self = StObject.set(x, "variableSet", js.Array(value*))
  }
}
