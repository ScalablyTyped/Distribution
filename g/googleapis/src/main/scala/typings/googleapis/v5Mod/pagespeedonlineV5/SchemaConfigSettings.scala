package typings.googleapis.v5Mod.pagespeedonlineV5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConfigSettings extends StObject {
  
  /**
    * How Lighthouse was run, e.g. from the Chrome extension or from the npm module.
    */
  var channel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The form factor the emulation should use. This field is deprecated, form_factor should be used instead.
    */
  var emulatedFormFactor: js.UndefOr[String | Null] = js.undefined
  
  /**
    * How Lighthouse should interpret this run in regards to scoring performance metrics and skipping mobile-only tests in desktop.
    */
  var formFactor: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The locale setting.
    */
  var locale: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of categories of audits the run should conduct.
    */
  var onlyCategories: js.UndefOr[Any | Null] = js.undefined
}
object SchemaConfigSettings {
  
  inline def apply(): SchemaConfigSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfigSettings]
  }
  
  extension [Self <: SchemaConfigSettings](x: Self) {
    
    inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setChannelNull: Self = StObject.set(x, "channel", null)
    
    inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
    
    inline def setEmulatedFormFactor(value: String): Self = StObject.set(x, "emulatedFormFactor", value.asInstanceOf[js.Any])
    
    inline def setEmulatedFormFactorNull: Self = StObject.set(x, "emulatedFormFactor", null)
    
    inline def setEmulatedFormFactorUndefined: Self = StObject.set(x, "emulatedFormFactor", js.undefined)
    
    inline def setFormFactor(value: String): Self = StObject.set(x, "formFactor", value.asInstanceOf[js.Any])
    
    inline def setFormFactorNull: Self = StObject.set(x, "formFactor", null)
    
    inline def setFormFactorUndefined: Self = StObject.set(x, "formFactor", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleNull: Self = StObject.set(x, "locale", null)
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setOnlyCategories(value: Any): Self = StObject.set(x, "onlyCategories", value.asInstanceOf[js.Any])
    
    inline def setOnlyCategoriesNull: Self = StObject.set(x, "onlyCategories", null)
    
    inline def setOnlyCategoriesUndefined: Self = StObject.set(x, "onlyCategories", js.undefined)
  }
}
