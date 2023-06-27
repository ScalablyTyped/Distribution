package typings.lezerMarkdown.distMarkdownMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LeafBlockParser extends StObject {
  
  def finish(cx: BlockContext, leaf: LeafBlock): Boolean
  
  def nextLine(cx: BlockContext, line: Line, leaf: LeafBlock): Boolean
}
object LeafBlockParser {
  
  inline def apply(finish: (BlockContext, LeafBlock) => Boolean, nextLine: (BlockContext, Line, LeafBlock) => Boolean): LeafBlockParser = {
    val __obj = js.Dynamic.literal(finish = js.Any.fromFunction2(finish), nextLine = js.Any.fromFunction3(nextLine))
    __obj.asInstanceOf[LeafBlockParser]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LeafBlockParser] (val x: Self) extends AnyVal {
    
    inline def setFinish(value: (BlockContext, LeafBlock) => Boolean): Self = StObject.set(x, "finish", js.Any.fromFunction2(value))
    
    inline def setNextLine(value: (BlockContext, Line, LeafBlock) => Boolean): Self = StObject.set(x, "nextLine", js.Any.fromFunction3(value))
  }
}
