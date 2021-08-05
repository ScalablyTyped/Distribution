package typings.googleapis.scriptV1Mod.scriptV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a function in a script project.
  */
trait SchemaGoogleAppsScriptTypeFunction extends StObject {
  
  /**
    * The function name in the script project.
    */
  var name: js.UndefOr[String] = js.undefined
}
object SchemaGoogleAppsScriptTypeFunction {
  
  inline def apply(): SchemaGoogleAppsScriptTypeFunction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsScriptTypeFunction]
  }
  
  extension [Self <: SchemaGoogleAppsScriptTypeFunction](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
