package typings.googleapis.scriptV1Mod.scriptV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A set of functions. No duplicates are permitted.
  */
@js.native
trait SchemaGoogleAppsScriptTypeFunctionSet extends StObject {
  
  /**
    * A list of functions composing the set.
    */
  var values: js.UndefOr[js.Array[SchemaGoogleAppsScriptTypeFunction]] = js.native
}
object SchemaGoogleAppsScriptTypeFunctionSet {
  
  @scala.inline
  def apply(): SchemaGoogleAppsScriptTypeFunctionSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsScriptTypeFunctionSet]
  }
  
  @scala.inline
  implicit class SchemaGoogleAppsScriptTypeFunctionSetMutableBuilder[Self <: SchemaGoogleAppsScriptTypeFunctionSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValues(value: js.Array[SchemaGoogleAppsScriptTypeFunction]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: SchemaGoogleAppsScriptTypeFunction*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
