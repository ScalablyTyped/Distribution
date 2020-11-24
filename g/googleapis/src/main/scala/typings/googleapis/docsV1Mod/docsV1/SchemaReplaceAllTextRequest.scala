package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Replaces all instances of text matching a criteria with replace text.
  */
@js.native
trait SchemaReplaceAllTextRequest extends js.Object {
  
  /**
    * Finds text in the document matching this substring.
    */
  var containsText: js.UndefOr[SchemaSubstringMatchCriteria] = js.native
  
  /**
    * The text that will replace the matched text.
    */
  var replaceText: js.UndefOr[String] = js.native
}
object SchemaReplaceAllTextRequest {
  
  @scala.inline
  def apply(): SchemaReplaceAllTextRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReplaceAllTextRequest]
  }
  
  @scala.inline
  implicit class SchemaReplaceAllTextRequestOps[Self <: SchemaReplaceAllTextRequest] (val x: Self) extends AnyVal {
    
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
    def setContainsText(value: SchemaSubstringMatchCriteria): Self = this.set("containsText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainsText: Self = this.set("containsText", js.undefined)
    
    @scala.inline
    def setReplaceText(value: String): Self = this.set("replaceText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplaceText: Self = this.set("replaceText", js.undefined)
  }
}
