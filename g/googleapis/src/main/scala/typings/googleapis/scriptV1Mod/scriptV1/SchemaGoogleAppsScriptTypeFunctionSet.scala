package typings.googleapis.scriptV1Mod.scriptV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsScriptTypeFunctionSet extends StObject {
  
  /**
    * A list of functions composing the set.
    */
  var values: js.UndefOr[js.Array[SchemaGoogleAppsScriptTypeFunction]] = js.undefined
}
object SchemaGoogleAppsScriptTypeFunctionSet {
  
  inline def apply(): SchemaGoogleAppsScriptTypeFunctionSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsScriptTypeFunctionSet]
  }
  
  extension [Self <: SchemaGoogleAppsScriptTypeFunctionSet](x: Self) {
    
    inline def setValues(value: js.Array[SchemaGoogleAppsScriptTypeFunction]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: SchemaGoogleAppsScriptTypeFunction*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
