package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNativeCrash extends StObject {
  
  /**
    * The stack trace of the native crash. Optional.
    */
  var stackTrace: js.UndefOr[SchemaStackTrace] = js.undefined
}
object SchemaNativeCrash {
  
  inline def apply(): SchemaNativeCrash = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNativeCrash]
  }
  
  extension [Self <: SchemaNativeCrash](x: Self) {
    
    inline def setStackTrace(value: SchemaStackTrace): Self = StObject.set(x, "stackTrace", value.asInstanceOf[js.Any])
    
    inline def setStackTraceUndefined: Self = StObject.set(x, "stackTrace", js.undefined)
  }
}
