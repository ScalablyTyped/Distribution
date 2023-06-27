package typings.lezerMarkdown.distMarkdownMod

import org.scalablytyped.runtime.StringDictionary
import typings.lezerHighlight.mod.Tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeSpec extends StObject {
  
  var block: js.UndefOr[Boolean] = js.undefined
  
  var composite: js.UndefOr[
    js.Function3[/* cx */ BlockContext, /* line */ Line, /* value */ Double, Boolean]
  ] = js.undefined
  
  var name: String
  
  var style: js.UndefOr[Tag | js.Array[Tag] | (StringDictionary[Tag | js.Array[Tag]])] = js.undefined
}
object NodeSpec {
  
  inline def apply(name: String): NodeSpec = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeSpec]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodeSpec] (val x: Self) extends AnyVal {
    
    inline def setBlock(value: Boolean): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    inline def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
    
    inline def setComposite(value: (/* cx */ BlockContext, /* line */ Line, /* value */ Double) => Boolean): Self = StObject.set(x, "composite", js.Any.fromFunction3(value))
    
    inline def setCompositeUndefined: Self = StObject.set(x, "composite", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: Tag | js.Array[Tag] | (StringDictionary[Tag | js.Array[Tag]])): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setStyleVarargs(value: Tag*): Self = StObject.set(x, "style", js.Array(value*))
  }
}
