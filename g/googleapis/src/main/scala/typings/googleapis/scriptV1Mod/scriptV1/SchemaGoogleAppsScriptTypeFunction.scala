package typings.googleapis.scriptV1Mod.scriptV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a function in a script project.
  */
@js.native
trait SchemaGoogleAppsScriptTypeFunction extends StObject {
  
  /**
    * The function name in the script project.
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaGoogleAppsScriptTypeFunction {
  
  @scala.inline
  def apply(): SchemaGoogleAppsScriptTypeFunction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsScriptTypeFunction]
  }
  
  @scala.inline
  implicit class SchemaGoogleAppsScriptTypeFunctionMutableBuilder[Self <: SchemaGoogleAppsScriptTypeFunction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
