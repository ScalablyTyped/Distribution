package typings.lezerMarkdown.distMarkdownMod

import typings.lezerCommon.anon.From
import typings.lezerCommon.distParseMod.Input
import typings.lezerCommon.distParseMod.ParseWrapper
import typings.lezerCommon.distParseMod.PartialParse
import typings.lezerCommon.distParseMod.TreeFragment
import typings.lezerCommon.distTreeMod.NodePropSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkdownConfig extends StObject {
  
  var defineNodes: js.UndefOr[js.Array[String | NodeSpec]] = js.undefined
  
  var parseBlock: js.UndefOr[js.Array[BlockParser]] = js.undefined
  
  var parseInline: js.UndefOr[js.Array[InlineParser]] = js.undefined
  
  var props: js.UndefOr[js.Array[NodePropSource]] = js.undefined
  
  var remove: js.UndefOr[js.Array[String]] = js.undefined
  
  var wrap: js.UndefOr[ParseWrapper] = js.undefined
}
object MarkdownConfig {
  
  inline def apply(): MarkdownConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkdownConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MarkdownConfig] (val x: Self) extends AnyVal {
    
    inline def setDefineNodes(value: js.Array[String | NodeSpec]): Self = StObject.set(x, "defineNodes", value.asInstanceOf[js.Any])
    
    inline def setDefineNodesUndefined: Self = StObject.set(x, "defineNodes", js.undefined)
    
    inline def setDefineNodesVarargs(value: (String | NodeSpec)*): Self = StObject.set(x, "defineNodes", js.Array(value*))
    
    inline def setParseBlock(value: js.Array[BlockParser]): Self = StObject.set(x, "parseBlock", value.asInstanceOf[js.Any])
    
    inline def setParseBlockUndefined: Self = StObject.set(x, "parseBlock", js.undefined)
    
    inline def setParseBlockVarargs(value: BlockParser*): Self = StObject.set(x, "parseBlock", js.Array(value*))
    
    inline def setParseInline(value: js.Array[InlineParser]): Self = StObject.set(x, "parseInline", value.asInstanceOf[js.Any])
    
    inline def setParseInlineUndefined: Self = StObject.set(x, "parseInline", js.undefined)
    
    inline def setParseInlineVarargs(value: InlineParser*): Self = StObject.set(x, "parseInline", js.Array(value*))
    
    inline def setProps(value: js.Array[NodePropSource]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
    
    inline def setPropsVarargs(value: NodePropSource*): Self = StObject.set(x, "props", js.Array(value*))
    
    inline def setRemove(value: js.Array[String]): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    inline def setRemoveVarargs(value: String*): Self = StObject.set(x, "remove", js.Array(value*))
    
    inline def setWrap(
      value: (/* inner */ PartialParse, /* input */ Input, /* fragments */ js.Array[TreeFragment], /* ranges */ js.Array[From]) => PartialParse
    ): Self = StObject.set(x, "wrap", js.Any.fromFunction4(value))
    
    inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
  }
}
