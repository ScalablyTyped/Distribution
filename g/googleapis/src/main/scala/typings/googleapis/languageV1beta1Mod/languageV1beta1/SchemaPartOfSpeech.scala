package typings.googleapis.languageV1beta1Mod.languageV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents part of speech information for a token.
  */
@js.native
trait SchemaPartOfSpeech extends js.Object {
  
  /**
    * The grammatical aspect.
    */
  var aspect: js.UndefOr[String] = js.native
  
  /**
    * The grammatical case.
    */
  var `case`: js.UndefOr[String] = js.native
  
  /**
    * The grammatical form.
    */
  var form: js.UndefOr[String] = js.native
  
  /**
    * The grammatical gender.
    */
  var gender: js.UndefOr[String] = js.native
  
  /**
    * The grammatical mood.
    */
  var mood: js.UndefOr[String] = js.native
  
  /**
    * The grammatical number.
    */
  var number: js.UndefOr[String] = js.native
  
  /**
    * The grammatical person.
    */
  var person: js.UndefOr[String] = js.native
  
  /**
    * The grammatical properness.
    */
  var proper: js.UndefOr[String] = js.native
  
  /**
    * The grammatical reciprocity.
    */
  var reciprocity: js.UndefOr[String] = js.native
  
  /**
    * The part of speech tag.
    */
  var tag: js.UndefOr[String] = js.native
  
  /**
    * The grammatical tense.
    */
  var tense: js.UndefOr[String] = js.native
  
  /**
    * The grammatical voice.
    */
  var voice: js.UndefOr[String] = js.native
}
object SchemaPartOfSpeech {
  
  @scala.inline
  def apply(): SchemaPartOfSpeech = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPartOfSpeech]
  }
  
  @scala.inline
  implicit class SchemaPartOfSpeechOps[Self <: SchemaPartOfSpeech] (val x: Self) extends AnyVal {
    
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
    def setAspect(value: String): Self = this.set("aspect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAspect: Self = this.set("aspect", js.undefined)
    
    @scala.inline
    def setCase(value: String): Self = this.set("case", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCase: Self = this.set("case", js.undefined)
    
    @scala.inline
    def setForm(value: String): Self = this.set("form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForm: Self = this.set("form", js.undefined)
    
    @scala.inline
    def setGender(value: String): Self = this.set("gender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGender: Self = this.set("gender", js.undefined)
    
    @scala.inline
    def setMood(value: String): Self = this.set("mood", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMood: Self = this.set("mood", js.undefined)
    
    @scala.inline
    def setNumber(value: String): Self = this.set("number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumber: Self = this.set("number", js.undefined)
    
    @scala.inline
    def setPerson(value: String): Self = this.set("person", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerson: Self = this.set("person", js.undefined)
    
    @scala.inline
    def setProper(value: String): Self = this.set("proper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProper: Self = this.set("proper", js.undefined)
    
    @scala.inline
    def setReciprocity(value: String): Self = this.set("reciprocity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReciprocity: Self = this.set("reciprocity", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
    
    @scala.inline
    def setTense(value: String): Self = this.set("tense", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTense: Self = this.set("tense", js.undefined)
    
    @scala.inline
    def setVoice(value: String): Self = this.set("voice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVoice: Self = this.set("voice", js.undefined)
  }
}
