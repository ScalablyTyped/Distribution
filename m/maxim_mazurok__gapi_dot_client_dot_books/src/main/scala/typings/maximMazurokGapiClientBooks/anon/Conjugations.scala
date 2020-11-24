package typings.maximMazurokGapiClientBooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Conjugations extends js.Object {
  
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
  implicit class ConjugationsOps[Self <: Conjugations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConjugationsVarargs(value: Type*): Self = this.set("conjugations", js.Array(value :_*))
    
    @scala.inline
    def setConjugations(value: js.Array[Type]): Self = this.set("conjugations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConjugations: Self = this.set("conjugations", js.undefined)
    
    @scala.inline
    def setDefinitionsVarargs(value: Definition*): Self = this.set("definitions", js.Array(value :_*))
    
    @scala.inline
    def setDefinitions(value: js.Array[Definition]): Self = this.set("definitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefinitions: Self = this.set("definitions", js.undefined)
    
    @scala.inline
    def setPartOfSpeech(value: String): Self = this.set("partOfSpeech", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartOfSpeech: Self = this.set("partOfSpeech", js.undefined)
    
    @scala.inline
    def setPronunciation(value: String): Self = this.set("pronunciation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePronunciation: Self = this.set("pronunciation", js.undefined)
    
    @scala.inline
    def setPronunciationUrl(value: String): Self = this.set("pronunciationUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePronunciationUrl: Self = this.set("pronunciationUrl", js.undefined)
    
    @scala.inline
    def setSource(value: Attribution): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setSyllabification(value: String): Self = this.set("syllabification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSyllabification: Self = this.set("syllabification", js.undefined)
    
    @scala.inline
    def setSynonymsVarargs(value: Source*): Self = this.set("synonyms", js.Array(value :_*))
    
    @scala.inline
    def setSynonyms(value: js.Array[Source]): Self = this.set("synonyms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSynonyms: Self = this.set("synonyms", js.undefined)
  }
}
