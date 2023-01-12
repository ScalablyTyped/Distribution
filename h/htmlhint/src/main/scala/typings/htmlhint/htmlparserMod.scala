package typings.htmlhint

import org.scalablytyped.runtime.StringDictionary
import typings.htmlhint.anon.Col
import typings.htmlhint.anon.PartialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object htmlparserMod {
  
  @JSImport("htmlhint/htmlparser", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with HTMLParser
  
  trait Attr extends StObject {
    
    var index: Double
    
    var name: String
    
    var quote: String
    
    var raw: String
    
    var value: String
  }
  object Attr {
    
    inline def apply(index: Double, name: String, quote: String, raw: String, value: String): Attr = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], quote = quote.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Attr]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Attr] (val x: Self) extends AnyVal {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setQuote(value: String): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
      
      inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Block extends StObject {
    
    var attrs: js.Array[Attr]
    
    var close: String
    
    var col: Double
    
    var content: String
    
    var lastEvent: js.UndefOr[PartialBlock] = js.undefined
    
    var line: Double
    
    var long: Boolean
    
    var pos: Double
    
    var raw: String
    
    var tagName: String
    
    var `type`: String
  }
  object Block {
    
    inline def apply(
      attrs: js.Array[Attr],
      close: String,
      col: Double,
      content: String,
      line: Double,
      long: Boolean,
      pos: Double,
      raw: String,
      tagName: String,
      `type`: String
    ): Block = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], col = col.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], long = long.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Block]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Block] (val x: Self) extends AnyVal {
      
      inline def setAttrs(value: js.Array[Attr]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setAttrsVarargs(value: Attr*): Self = StObject.set(x, "attrs", js.Array(value*))
      
      inline def setClose(value: String): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setLastEvent(value: PartialBlock): Self = StObject.set(x, "lastEvent", value.asInstanceOf[js.Any])
      
      inline def setLastEventUndefined: Self = StObject.set(x, "lastEvent", js.undefined)
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setLong(value: Boolean): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
      
      inline def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait HTMLParser extends StObject {
    
    /* private */ var _arrBlocks: js.Array[PartialBlock] = js.native
    
    /* private */ var _listeners: StringDictionary[js.Array[Listener]] = js.native
    
    /* private */ var _mapCdataTags: StringDictionary[Boolean] = js.native
    
    def addListener(types: String, listener: Listener): Unit = js.native
    
    def fire(`type`: String): Unit = js.native
    def fire(`type`: String, data: PartialBlock): Unit = js.native
    
    def fixPos(event: Block, index: Double): Col = js.native
    
    def getMapAttrs(arrAttrs: js.Array[Attr]): StringDictionary[String] = js.native
    
    var lastEvent: PartialBlock | Null = js.native
    
    def makeMap(str: String): StringDictionary[Boolean] = js.native
    
    def parse(html: String): Unit = js.native
    
    def removeListener(`type`: String, listener: Listener): Unit = js.native
  }
  
  type Listener = js.Function1[/* event */ Block, Unit]
}
