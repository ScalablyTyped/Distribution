package typings.maximMazurokGapiClientBooks.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Conjugations extends StObject {
  
  var conjugations: js.UndefOr[js.Array[Type]] = js.undefined
  
  var definitions: js.UndefOr[js.Array[Definition]] = js.undefined
  
  var partOfSpeech: js.UndefOr[String] = js.undefined
  
  var pronunciation: js.UndefOr[String] = js.undefined
  
  var pronunciationUrl: js.UndefOr[String] = js.undefined
  
  var source: js.UndefOr[Attribution] = js.undefined
  
  var syllabification: js.UndefOr[String] = js.undefined
  
  var synonyms: js.UndefOr[js.Array[Source]] = js.undefined
}
object Conjugations {
  
  inline def apply(): Conjugations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Conjugations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Conjugations] (val x: Self) extends AnyVal {
    
    inline def setConjugations(value: js.Array[Type]): Self = StObject.set(x, "conjugations", value.asInstanceOf[js.Any])
    
    inline def setConjugationsUndefined: Self = StObject.set(x, "conjugations", js.undefined)
    
    inline def setConjugationsVarargs(value: Type*): Self = StObject.set(x, "conjugations", js.Array(value*))
    
    inline def setDefinitions(value: js.Array[Definition]): Self = StObject.set(x, "definitions", value.asInstanceOf[js.Any])
    
    inline def setDefinitionsUndefined: Self = StObject.set(x, "definitions", js.undefined)
    
    inline def setDefinitionsVarargs(value: Definition*): Self = StObject.set(x, "definitions", js.Array(value*))
    
    inline def setPartOfSpeech(value: String): Self = StObject.set(x, "partOfSpeech", value.asInstanceOf[js.Any])
    
    inline def setPartOfSpeechUndefined: Self = StObject.set(x, "partOfSpeech", js.undefined)
    
    inline def setPronunciation(value: String): Self = StObject.set(x, "pronunciation", value.asInstanceOf[js.Any])
    
    inline def setPronunciationUndefined: Self = StObject.set(x, "pronunciation", js.undefined)
    
    inline def setPronunciationUrl(value: String): Self = StObject.set(x, "pronunciationUrl", value.asInstanceOf[js.Any])
    
    inline def setPronunciationUrlUndefined: Self = StObject.set(x, "pronunciationUrl", js.undefined)
    
    inline def setSource(value: Attribution): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setSyllabification(value: String): Self = StObject.set(x, "syllabification", value.asInstanceOf[js.Any])
    
    inline def setSyllabificationUndefined: Self = StObject.set(x, "syllabification", js.undefined)
    
    inline def setSynonyms(value: js.Array[Source]): Self = StObject.set(x, "synonyms", value.asInstanceOf[js.Any])
    
    inline def setSynonymsUndefined: Self = StObject.set(x, "synonyms", js.undefined)
    
    inline def setSynonymsVarargs(value: Source*): Self = StObject.set(x, "synonyms", js.Array(value*))
  }
}
