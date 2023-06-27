package typings.lezerMarkdown.distMarkdownMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockParser extends StObject {
  
  var after: js.UndefOr[String] = js.undefined
  
  var before: js.UndefOr[String] = js.undefined
  
  var endLeaf: js.UndefOr[
    js.Function3[/* cx */ BlockContext, /* line */ Line, /* leaf */ LeafBlock, Boolean]
  ] = js.undefined
  
  var leaf: js.UndefOr[
    js.Function2[/* cx */ BlockContext, /* leaf */ LeafBlock, LeafBlockParser | Null]
  ] = js.undefined
  
  var name: String
  
  var parse: js.UndefOr[js.Function2[/* cx */ BlockContext, /* line */ Line, BlockResult]] = js.undefined
}
object BlockParser {
  
  inline def apply(name: String): BlockParser = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockParser]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BlockParser] (val x: Self) extends AnyVal {
    
    inline def setAfter(value: String): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
    
    inline def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    
    inline def setEndLeaf(value: (/* cx */ BlockContext, /* line */ Line, /* leaf */ LeafBlock) => Boolean): Self = StObject.set(x, "endLeaf", js.Any.fromFunction3(value))
    
    inline def setEndLeafUndefined: Self = StObject.set(x, "endLeaf", js.undefined)
    
    inline def setLeaf(value: (/* cx */ BlockContext, /* leaf */ LeafBlock) => LeafBlockParser | Null): Self = StObject.set(x, "leaf", js.Any.fromFunction2(value))
    
    inline def setLeafUndefined: Self = StObject.set(x, "leaf", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParse(value: (/* cx */ BlockContext, /* line */ Line) => BlockResult): Self = StObject.set(x, "parse", js.Any.fromFunction2(value))
    
    inline def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
  }
}
