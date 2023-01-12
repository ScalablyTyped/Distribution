package typings.marked.mod.marked.Tokens

import typings.marked.markedStrings.`def`
import typings.marked.mod.marked.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Def
  extends StObject
     with Token {
  
  var href: String
  
  var raw: String
  
  var tag: String
  
  var title: String
  
  var `type`: `def`
}
object Def {
  
  inline def apply(href: String, raw: String, tag: String, title: String): Def = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("def")
    __obj.asInstanceOf[Def]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Def] (val x: Self) extends AnyVal {
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setType(value: `def`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
