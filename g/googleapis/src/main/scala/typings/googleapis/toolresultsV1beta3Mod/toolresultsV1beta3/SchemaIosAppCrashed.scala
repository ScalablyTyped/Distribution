package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIosAppCrashed extends StObject {
  
  /**
    * The stack trace, if one is available. Optional.
    */
  var stackTrace: js.UndefOr[SchemaStackTrace] = js.undefined
}
object SchemaIosAppCrashed {
  
  inline def apply(): SchemaIosAppCrashed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIosAppCrashed]
  }
  
  extension [Self <: SchemaIosAppCrashed](x: Self) {
    
    inline def setStackTrace(value: SchemaStackTrace): Self = StObject.set(x, "stackTrace", value.asInstanceOf[js.Any])
    
    inline def setStackTraceUndefined: Self = StObject.set(x, "stackTrace", js.undefined)
  }
}
