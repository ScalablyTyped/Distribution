package typings.googleapis.gkehubV1alphaMod.gkehubV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPolicyControllerTemplateLibraryConfig extends StObject {
  
  /**
    * Whether the standard template library should be installed or not.
    */
  var included: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaPolicyControllerTemplateLibraryConfig {
  
  inline def apply(): SchemaPolicyControllerTemplateLibraryConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPolicyControllerTemplateLibraryConfig]
  }
  
  extension [Self <: SchemaPolicyControllerTemplateLibraryConfig](x: Self) {
    
    inline def setIncluded(value: Boolean): Self = StObject.set(x, "included", value.asInstanceOf[js.Any])
    
    inline def setIncludedNull: Self = StObject.set(x, "included", null)
    
    inline def setIncludedUndefined: Self = StObject.set(x, "included", js.undefined)
  }
}
