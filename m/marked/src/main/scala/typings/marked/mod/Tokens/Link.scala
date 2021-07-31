package typings.marked.mod.Tokens

import typings.marked.markedStrings.link
import typings.marked.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Link
  extends StObject
     with Token {
  
  var href: String
  
  var raw: String
  
  var text: String
  
  var title: String
  
  var tokens: js.UndefOr[js.Array[Text]] = js.undefined
  
  var `type`: link
}
object Link {
  
  @scala.inline
  def apply(href: String, raw: String, text: String, title: String): Link = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("link")
    __obj.asInstanceOf[Link]
  }
  
  @scala.inline
  implicit class LinkMutableBuilder[Self <: Link] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokens(value: js.Array[Text]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokensUndefined: Self = StObject.set(x, "tokens", js.undefined)
    
    @scala.inline
    def setTokensVarargs(value: Text*): Self = StObject.set(x, "tokens", js.Array(value :_*))
    
    @scala.inline
    def setType(value: link): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
