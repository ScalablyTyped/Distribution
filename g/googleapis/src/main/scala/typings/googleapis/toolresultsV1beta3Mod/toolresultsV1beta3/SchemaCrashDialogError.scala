package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCrashDialogError extends StObject {
  
  /**
    * The name of the package that caused the dialog.
    */
  var crashPackage: js.UndefOr[String | Null] = js.undefined
}
object SchemaCrashDialogError {
  
  inline def apply(): SchemaCrashDialogError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCrashDialogError]
  }
  
  extension [Self <: SchemaCrashDialogError](x: Self) {
    
    inline def setCrashPackage(value: String): Self = StObject.set(x, "crashPackage", value.asInstanceOf[js.Any])
    
    inline def setCrashPackageNull: Self = StObject.set(x, "crashPackage", null)
    
    inline def setCrashPackageUndefined: Self = StObject.set(x, "crashPackage", js.undefined)
  }
}
