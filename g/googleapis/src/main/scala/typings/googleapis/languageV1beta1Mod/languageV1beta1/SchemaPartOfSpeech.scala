package typings.googleapis.languageV1beta1Mod.languageV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents part of speech information for a token.
  */
trait SchemaPartOfSpeech extends StObject {
  
  /**
    * The grammatical aspect.
    */
  var aspect: js.UndefOr[String] = js.undefined
  
  /**
    * The grammatical case.
    */
  var `case`: js.UndefOr[String] = js.undefined
  
  /**
    * The grammatical form.
    */
  var form: js.UndefOr[String] = js.undefined
  
  /**
    * The grammatical gender.
    */
  var gender: js.UndefOr[String] = js.undefined
  
  /**
    * The grammatical mood.
    */
  var mood: js.UndefOr[String] = js.undefined
  
  /**
    * The grammatical number.
    */
  var number: js.UndefOr[String] = js.undefined
  
  /**
    * The grammatical person.
    */
  var person: js.UndefOr[String] = js.undefined
  
  /**
    * The grammatical properness.
    */
  var proper: js.UndefOr[String] = js.undefined
  
  /**
    * The grammatical reciprocity.
    */
  var reciprocity: js.UndefOr[String] = js.undefined
  
  /**
    * The part of speech tag.
    */
  var tag: js.UndefOr[String] = js.undefined
  
  /**
    * The grammatical tense.
    */
  var tense: js.UndefOr[String] = js.undefined
  
  /**
    * The grammatical voice.
    */
  var voice: js.UndefOr[String] = js.undefined
}
object SchemaPartOfSpeech {
  
  inline def apply(): SchemaPartOfSpeech = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPartOfSpeech]
  }
  
  extension [Self <: SchemaPartOfSpeech](x: Self) {
    
    inline def setAspect(value: String): Self = StObject.set(x, "aspect", value.asInstanceOf[js.Any])
    
    inline def setAspectUndefined: Self = StObject.set(x, "aspect", js.undefined)
    
    inline def setCase(value: String): Self = StObject.set(x, "case", value.asInstanceOf[js.Any])
    
    inline def setCaseUndefined: Self = StObject.set(x, "case", js.undefined)
    
    inline def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    inline def setGender(value: String): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
    
    inline def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
    
    inline def setMood(value: String): Self = StObject.set(x, "mood", value.asInstanceOf[js.Any])
    
    inline def setMoodUndefined: Self = StObject.set(x, "mood", js.undefined)
    
    inline def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    inline def setPerson(value: String): Self = StObject.set(x, "person", value.asInstanceOf[js.Any])
    
    inline def setPersonUndefined: Self = StObject.set(x, "person", js.undefined)
    
    inline def setProper(value: String): Self = StObject.set(x, "proper", value.asInstanceOf[js.Any])
    
    inline def setProperUndefined: Self = StObject.set(x, "proper", js.undefined)
    
    inline def setReciprocity(value: String): Self = StObject.set(x, "reciprocity", value.asInstanceOf[js.Any])
    
    inline def setReciprocityUndefined: Self = StObject.set(x, "reciprocity", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    
    inline def setTense(value: String): Self = StObject.set(x, "tense", value.asInstanceOf[js.Any])
    
    inline def setTenseUndefined: Self = StObject.set(x, "tense", js.undefined)
    
    inline def setVoice(value: String): Self = StObject.set(x, "voice", value.asInstanceOf[js.Any])
    
    inline def setVoiceUndefined: Self = StObject.set(x, "voice", js.undefined)
  }
}
