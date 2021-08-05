package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Label to provide extra metadata for the web detection.
  */
trait SchemaWebLabel extends StObject {
  
  /**
    * Label for extra metadata.
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * The BCP-47 language code for `label`, such as &quot;en-US&quot; or
    * &quot;sr-Latn&quot;. For more information, see
    * http://www.unicode.org/reports/tr35/#Unicode_locale_identifier.
    */
  var languageCode: js.UndefOr[String] = js.undefined
}
object SchemaWebLabel {
  
  inline def apply(): SchemaWebLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWebLabel]
  }
  
  extension [Self <: SchemaWebLabel](x: Self) {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
  }
}
