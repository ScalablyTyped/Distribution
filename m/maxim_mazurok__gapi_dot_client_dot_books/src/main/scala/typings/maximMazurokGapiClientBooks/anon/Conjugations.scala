package typings.maximMazurokGapiClientBooks.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Conjugations extends StObject {
  
  var conjugations: js.UndefOr[js.Array[Type]] = js.native
  
  var definitions: js.UndefOr[js.Array[Definition]] = js.native
  
  var partOfSpeech: js.UndefOr[String] = js.native
  
  var pronunciation: js.UndefOr[String] = js.native
  
  var pronunciationUrl: js.UndefOr[String] = js.native
  
  var source: js.UndefOr[Attribution] = js.native
  
  var syllabification: js.UndefOr[String] = js.native
  
  var synonyms: js.UndefOr[js.Array[Source]] = js.native
}
object Conjugations {
  
  @scala.inline
  def apply(): Conjugations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Conjugations]
  }
  
  @scala.inline
  implicit class ConjugationsMutableBuilder[Self <: Conjugations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConjugations(value: js.Array[Type]): Self = StObject.set(x, "conjugations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConjugationsUndefined: Self = StObject.set(x, "conjugations", js.undefined)
    
    @scala.inline
    def setConjugationsVarargs(value: Type*): Self = StObject.set(x, "conjugations", js.Array(value :_*))
    
    @scala.inline
    def setDefinitions(value: js.Array[Definition]): Self = StObject.set(x, "definitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionsUndefined: Self = StObject.set(x, "definitions", js.undefined)
    
    @scala.inline
    def setDefinitionsVarargs(value: Definition*): Self = StObject.set(x, "definitions", js.Array(value :_*))
    
    @scala.inline
    def setPartOfSpeech(value: String): Self = StObject.set(x, "partOfSpeech", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartOfSpeechUndefined: Self = StObject.set(x, "partOfSpeech", js.undefined)
    
    @scala.inline
    def setPronunciation(value: String): Self = StObject.set(x, "pronunciation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPronunciationUndefined: Self = StObject.set(x, "pronunciation", js.undefined)
    
    @scala.inline
    def setPronunciationUrl(value: String): Self = StObject.set(x, "pronunciationUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPronunciationUrlUndefined: Self = StObject.set(x, "pronunciationUrl", js.undefined)
    
    @scala.inline
    def setSource(value: Attribution): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setSyllabification(value: String): Self = StObject.set(x, "syllabification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyllabificationUndefined: Self = StObject.set(x, "syllabification", js.undefined)
    
    @scala.inline
    def setSynonyms(value: js.Array[Source]): Self = StObject.set(x, "synonyms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSynonymsUndefined: Self = StObject.set(x, "synonyms", js.undefined)
    
    @scala.inline
    def setSynonymsVarargs(value: Source*): Self = StObject.set(x, "synonyms", js.Array(value :_*))
  }
}
