package typings.magicString

import typings.magicString.mod.MagicString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Content extends StObject {
    
    var content: MagicString
    
    var filename: js.UndefOr[String] = js.undefined
    
    var ignoreList: js.UndefOr[Boolean] = js.undefined
  }
  object Content {
    
    inline def apply(content: MagicString): Content = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[Content]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Content] (val x: Self) extends AnyVal {
      
      inline def setContent(value: MagicString): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setIgnoreList(value: Boolean): Self = StObject.set(x, "ignoreList", value.asInstanceOf[js.Any])
      
      inline def setIgnoreListUndefined: Self = StObject.set(x, "ignoreList", js.undefined)
    }
  }
}
