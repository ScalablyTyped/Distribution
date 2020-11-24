package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Message defining a list of words or phrases to search for in the data.
  */
@js.native
trait SchemaGooglePrivacyDlpV2WordList extends js.Object {
  
  /**
    * Words or phrases defining the dictionary. The dictionary must contain at
    * least one phrase and every phrase must contain at least 2 characters that
    * are letters or digits. [required]
    */
  var words: js.UndefOr[js.Array[String]] = js.native
}
object SchemaGooglePrivacyDlpV2WordList {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2WordList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2WordList]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2WordListOps[Self <: SchemaGooglePrivacyDlpV2WordList] (val x: Self) extends AnyVal {
    
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
    def setWordsVarargs(value: String*): Self = this.set("words", js.Array(value :_*))
    
    @scala.inline
    def setWords(value: js.Array[String]): Self = this.set("words", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWords: Self = this.set("words", js.undefined)
  }
}
