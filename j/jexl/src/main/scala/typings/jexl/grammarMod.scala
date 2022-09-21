package typings.jexl

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object grammarMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.jexl.anon.`0`
    - typings.jexl.anon.`1`
    - typings.jexl.anon.`2`
    - typings.jexl.anon.`3`
    - typings.jexl.anon.`4`
    - typings.jexl.anon.`5`
    - typings.jexl.anon.`6`
    - typings.jexl.anon.`7`
    - typings.jexl.anon.`8`
    - typings.jexl.anon.`9`
    - typings.jexl.anon.`10`
    - typings.jexl.anon.Eval
  */
  trait Element extends StObject
  object Element {
    
    inline def `0`(): typings.jexl.anon.`0` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("dot")
      __obj.asInstanceOf[typings.jexl.anon.`0`]
    }
    
    inline def `1`(): typings.jexl.anon.`1` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("openBracket")
      __obj.asInstanceOf[typings.jexl.anon.`1`]
    }
    
    inline def `10`(): typings.jexl.anon.`10` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("question")
      __obj.asInstanceOf[typings.jexl.anon.`10`]
    }
    
    inline def `2`(): typings.jexl.anon.`2` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("closeBracket")
      __obj.asInstanceOf[typings.jexl.anon.`2`]
    }
    
    inline def `3`(): typings.jexl.anon.`3` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("pipe")
      __obj.asInstanceOf[typings.jexl.anon.`3`]
    }
    
    inline def `4`(): typings.jexl.anon.`4` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("openCurl")
      __obj.asInstanceOf[typings.jexl.anon.`4`]
    }
    
    inline def `5`(): typings.jexl.anon.`5` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("closeCurl")
      __obj.asInstanceOf[typings.jexl.anon.`5`]
    }
    
    inline def `6`(): typings.jexl.anon.`6` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("colon")
      __obj.asInstanceOf[typings.jexl.anon.`6`]
    }
    
    inline def `7`(): typings.jexl.anon.`7` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("comma")
      __obj.asInstanceOf[typings.jexl.anon.`7`]
    }
    
    inline def `8`(): typings.jexl.anon.`8` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("openParen")
      __obj.asInstanceOf[typings.jexl.anon.`8`]
    }
    
    inline def `9`(): typings.jexl.anon.`9` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("closeParen")
      __obj.asInstanceOf[typings.jexl.anon.`9`]
    }
    
    inline def Eval(precedence: Double): typings.jexl.anon.Eval = {
      val __obj = js.Dynamic.literal(precedence = precedence.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("binaryOp")
      __obj.asInstanceOf[typings.jexl.anon.Eval]
    }
  }
  
  trait Grammar extends StObject {
    
    var elements: StringDictionary[Element]
    
    var functions: StringDictionary[js.Function1[/* repeated */ Any, Any]]
    
    var transform: StringDictionary[js.Function1[/* args */ Array[Any], Any]]
  }
  object Grammar {
    
    inline def apply(
      elements: StringDictionary[Element],
      functions: StringDictionary[js.Function1[/* repeated */ Any, Any]],
      transform: StringDictionary[js.Function1[/* args */ Array[Any], Any]]
    ): Grammar = {
      val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], functions = functions.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
      __obj.asInstanceOf[Grammar]
    }
    
    extension [Self <: Grammar](x: Self) {
      
      inline def setElements(value: StringDictionary[Element]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
      
      inline def setFunctions(value: StringDictionary[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
      
      inline def setTransform(value: StringDictionary[js.Function1[/* args */ Array[Any], Any]]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    }
  }
}
