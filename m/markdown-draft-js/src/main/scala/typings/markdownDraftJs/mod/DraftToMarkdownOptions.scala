package typings.markdownDraftJs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.markdownDraftJs.anon.Close
import typings.markdownDraftJs.anon.Open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DraftToMarkdownOptions extends js.Object {
  
  var entityItems: js.UndefOr[StringDictionary[Close]] = js.native
  
  var preserveNewlines: js.UndefOr[Boolean] = js.native
  
  var styleItems: js.UndefOr[StringDictionary[Open]] = js.native
}
object DraftToMarkdownOptions {
  
  @scala.inline
  def apply(): DraftToMarkdownOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DraftToMarkdownOptions]
  }
  
  @scala.inline
  implicit class DraftToMarkdownOptionsOps[Self <: DraftToMarkdownOptions] (val x: Self) extends AnyVal {
    
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
    def setEntityItems(value: StringDictionary[Close]): Self = this.set("entityItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntityItems: Self = this.set("entityItems", js.undefined)
    
    @scala.inline
    def setPreserveNewlines(value: Boolean): Self = this.set("preserveNewlines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveNewlines: Self = this.set("preserveNewlines", js.undefined)
    
    @scala.inline
    def setStyleItems(value: StringDictionary[Open]): Self = this.set("styleItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyleItems: Self = this.set("styleItems", js.undefined)
  }
}
