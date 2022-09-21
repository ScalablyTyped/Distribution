package typings.htmlhint

import typings.htmlhint.htmlparserMod.Attr
import typings.htmlhint.htmlparserMod.Block
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Col extends StObject {
    
    var col: Double
    
    var line: Double
  }
  object Col {
    
    inline def apply(col: Double, line: Double): Col = {
      val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[Col]
    }
    
    extension [Self <: Col](x: Self) {
      
      inline def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
  
  trait Message extends StObject {
    
    var message: String
    
    var regId: js.RegExp
  }
  object Message {
    
    inline def apply(message: String, regId: js.RegExp): Message = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], regId = regId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    extension [Self <: Message](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setRegId(value: js.RegExp): Self = StObject.set(x, "regId", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<htmlhint.htmlhint/htmlparser.Block> */
  trait PartialBlock extends StObject {
    
    var attrs: js.UndefOr[js.Array[Attr]] = js.undefined
    
    var close: js.UndefOr[String] = js.undefined
    
    var col: js.UndefOr[Double] = js.undefined
    
    var content: js.UndefOr[String] = js.undefined
    
    var lastEvent: js.UndefOr[Partial[Block]] = js.undefined
    
    var line: js.UndefOr[Double] = js.undefined
    
    var long: js.UndefOr[Boolean] = js.undefined
    
    var pos: js.UndefOr[Double] = js.undefined
    
    var raw: js.UndefOr[String] = js.undefined
    
    var tagName: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object PartialBlock {
    
    inline def apply(): PartialBlock = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialBlock]
    }
    
    extension [Self <: PartialBlock](x: Self) {
      
      inline def setAttrs(value: js.Array[Attr]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
      
      inline def setAttrsVarargs(value: Attr*): Self = StObject.set(x, "attrs", js.Array(value*))
      
      inline def setClose(value: String): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      inline def setColUndefined: Self = StObject.set(x, "col", js.undefined)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setLastEvent(value: Partial[Block]): Self = StObject.set(x, "lastEvent", value.asInstanceOf[js.Any])
      
      inline def setLastEventUndefined: Self = StObject.set(x, "lastEvent", js.undefined)
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
      
      inline def setLong(value: Boolean): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
      
      inline def setLongUndefined: Self = StObject.set(x, "long", js.undefined)
      
      inline def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      inline def setPosUndefined: Self = StObject.set(x, "pos", js.undefined)
      
      inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
      inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      inline def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
