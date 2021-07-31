package typings.googleapis.v1configurationMod.gamesConfigurationV1configuration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for a localized string resource.
  */
trait SchemaLocalizedString extends StObject {
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string gamesConfiguration#localizedString.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The locale string.
    */
  var locale: js.UndefOr[String] = js.undefined
  
  /**
    * The string value.
    */
  var value: js.UndefOr[String] = js.undefined
}
object SchemaLocalizedString {
  
  @scala.inline
  def apply(): SchemaLocalizedString = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLocalizedString]
  }
  
  @scala.inline
  implicit class SchemaLocalizedStringMutableBuilder[Self <: SchemaLocalizedString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
