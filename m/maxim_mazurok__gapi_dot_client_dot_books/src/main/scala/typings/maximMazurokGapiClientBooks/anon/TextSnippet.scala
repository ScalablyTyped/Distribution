package typings.maximMazurokGapiClientBooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextSnippet extends js.Object {
  
  /** A text snippet containing the search query. */
  var textSnippet: js.UndefOr[String] = js.native
}
object TextSnippet {
  
  @scala.inline
  def apply(): TextSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextSnippet]
  }
  
  @scala.inline
  implicit class TextSnippetOps[Self <: TextSnippet] (val x: Self) extends AnyVal {
    
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
    def setTextSnippet(value: String): Self = this.set("textSnippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextSnippet: Self = this.set("textSnippet", js.undefined)
  }
}
