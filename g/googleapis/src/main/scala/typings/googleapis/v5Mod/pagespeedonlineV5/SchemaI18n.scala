package typings.googleapis.v5Mod.pagespeedonlineV5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaI18n extends StObject {
  
  /**
    * Internationalized strings that are formatted to the locale in configSettings.
    */
  var rendererFormattedStrings: js.UndefOr[SchemaRendererFormattedStrings] = js.undefined
}
object SchemaI18n {
  
  inline def apply(): SchemaI18n = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaI18n]
  }
  
  extension [Self <: SchemaI18n](x: Self) {
    
    inline def setRendererFormattedStrings(value: SchemaRendererFormattedStrings): Self = StObject.set(x, "rendererFormattedStrings", value.asInstanceOf[js.Any])
    
    inline def setRendererFormattedStringsUndefined: Self = StObject.set(x, "rendererFormattedStrings", js.undefined)
  }
}
