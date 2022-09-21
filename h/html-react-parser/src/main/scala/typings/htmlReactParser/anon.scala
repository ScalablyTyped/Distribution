package typings.htmlReactParser

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.global.JSX.Element
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Dictkey
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    def cloneElement(
      element: Element,
      props: js.Object,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param children because its type any is not an array type */ children: Any
    ): Element = js.native
    def cloneElement(
      element: Element,
      props: Unit,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param children because its type any is not an array type */ children: Any
    ): Element = js.native
    
    def createElement(
      `type`: Any,
      props: js.Object,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param children because its type any is not an array type */ children: Any
    ): Element = js.native
    def createElement(
      `type`: Any,
      props: Unit,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param children because its type any is not an array type */ children: Any
    ): Element = js.native
    
    def isValidElement(element: Any): Boolean = js.native
  }
  
  trait Style extends StObject {
    
    var style: Record[String, String]
  }
  object Style {
    
    inline def apply(style: Record[String, String]): Style = {
      val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[Style]
    }
    
    extension [Self <: Style](x: Self) {
      
      inline def setStyle(value: Record[String, String]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
}
