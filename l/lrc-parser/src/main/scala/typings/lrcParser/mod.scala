package typings.lrcParser

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(data: String): LrcData = ^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any]).asInstanceOf[LrcData]
  
  @JSImport("lrc-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait LrcData
    extends StObject
       with /* key */ StringDictionary[js.UndefOr[String | js.Array[ScriptItem]]] {
    
    var scripts: js.UndefOr[js.Array[ScriptItem]] = js.undefined
  }
  object LrcData {
    
    inline def apply(): LrcData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LrcData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LrcData] (val x: Self) extends AnyVal {
      
      inline def setScripts(value: js.Array[ScriptItem]): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
      
      inline def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
      
      inline def setScriptsVarargs(value: ScriptItem*): Self = StObject.set(x, "scripts", js.Array(value*))
    }
  }
  
  trait ScriptItem extends StObject {
    
    var end: Double
    
    var start: Double
    
    var text: String
  }
  object ScriptItem {
    
    inline def apply(end: Double, start: Double, text: String): ScriptItem = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScriptItem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScriptItem] (val x: Self) extends AnyVal {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
