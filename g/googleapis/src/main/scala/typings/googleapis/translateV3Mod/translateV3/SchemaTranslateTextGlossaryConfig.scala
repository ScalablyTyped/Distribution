package typings.googleapis.translateV3Mod.translateV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTranslateTextGlossaryConfig extends StObject {
  
  /**
    * Required. The `glossary` to be applied for this translation. The format depends on glossary: - User provided custom glossary: `projects/{project-number-or-id\}/locations/{location-id\}/glossaries/{glossary-id\}`
    */
  var glossary: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Indicates match is case-insensitive. Default value is false if missing.
    */
  var ignoreCase: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaTranslateTextGlossaryConfig {
  
  inline def apply(): SchemaTranslateTextGlossaryConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTranslateTextGlossaryConfig]
  }
  
  extension [Self <: SchemaTranslateTextGlossaryConfig](x: Self) {
    
    inline def setGlossary(value: String): Self = StObject.set(x, "glossary", value.asInstanceOf[js.Any])
    
    inline def setGlossaryNull: Self = StObject.set(x, "glossary", null)
    
    inline def setGlossaryUndefined: Self = StObject.set(x, "glossary", js.undefined)
    
    inline def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
    
    inline def setIgnoreCaseNull: Self = StObject.set(x, "ignoreCase", null)
    
    inline def setIgnoreCaseUndefined: Self = StObject.set(x, "ignoreCase", js.undefined)
  }
}
