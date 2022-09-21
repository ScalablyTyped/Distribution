package typings.googleapis.translateV3beta1Mod.translateV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGlossary extends StObject {
  
  /**
    * Output only. When the glossary creation was finished.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The number of entries defined in the glossary.
    */
  var entryCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Required. Provides examples to build the glossary from. Total glossary must not exceed 10M Unicode codepoints.
    */
  var inputConfig: js.UndefOr[SchemaGlossaryInputConfig] = js.undefined
  
  /**
    * Used with equivalent term set glossaries.
    */
  var languageCodesSet: js.UndefOr[SchemaLanguageCodesSet] = js.undefined
  
  /**
    * Used with unidirectional glossaries.
    */
  var languagePair: js.UndefOr[SchemaLanguageCodePair] = js.undefined
  
  /**
    * Required. The resource name of the glossary. Glossary names have the form `projects/{project-number-or-id\}/locations/{location-id\}/glossaries/{glossary-id\}`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. When CreateGlossary was called.
    */
  var submitTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaGlossary {
  
  inline def apply(): SchemaGlossary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGlossary]
  }
  
  extension [Self <: SchemaGlossary](x: Self) {
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setEntryCount(value: Double): Self = StObject.set(x, "entryCount", value.asInstanceOf[js.Any])
    
    inline def setEntryCountNull: Self = StObject.set(x, "entryCount", null)
    
    inline def setEntryCountUndefined: Self = StObject.set(x, "entryCount", js.undefined)
    
    inline def setInputConfig(value: SchemaGlossaryInputConfig): Self = StObject.set(x, "inputConfig", value.asInstanceOf[js.Any])
    
    inline def setInputConfigUndefined: Self = StObject.set(x, "inputConfig", js.undefined)
    
    inline def setLanguageCodesSet(value: SchemaLanguageCodesSet): Self = StObject.set(x, "languageCodesSet", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodesSetUndefined: Self = StObject.set(x, "languageCodesSet", js.undefined)
    
    inline def setLanguagePair(value: SchemaLanguageCodePair): Self = StObject.set(x, "languagePair", value.asInstanceOf[js.Any])
    
    inline def setLanguagePairUndefined: Self = StObject.set(x, "languagePair", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSubmitTime(value: String): Self = StObject.set(x, "submitTime", value.asInstanceOf[js.Any])
    
    inline def setSubmitTimeNull: Self = StObject.set(x, "submitTime", null)
    
    inline def setSubmitTimeUndefined: Self = StObject.set(x, "submitTime", js.undefined)
  }
}
