package typings.googleapis.v1configurationMod.gamesConfigurationV1configuration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for a localized string bundle resource.
  */
trait SchemaLocalizedStringBundle extends StObject {
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string gamesConfiguration#localizedStringBundle.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The locale strings.
    */
  var translations: js.UndefOr[js.Array[SchemaLocalizedString]] = js.undefined
}
object SchemaLocalizedStringBundle {
  
  inline def apply(): SchemaLocalizedStringBundle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLocalizedStringBundle]
  }
  
  extension [Self <: SchemaLocalizedStringBundle](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setTranslations(value: js.Array[SchemaLocalizedString]): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    
    inline def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    
    inline def setTranslationsVarargs(value: SchemaLocalizedString*): Self = StObject.set(x, "translations", js.Array(value :_*))
  }
}
