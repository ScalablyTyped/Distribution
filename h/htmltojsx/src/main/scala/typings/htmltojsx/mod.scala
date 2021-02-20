package typings.htmltojsx

import typings.htmltojsx.anon.CreateClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("htmltojsx", JSImport.Namespace)
  @js.native
  class ^ () extends HTMLtoJSX {
    def this(options: CreateClass) = this()
  }
  
  @js.native
  trait HTMLtoJSX extends StObject {
    
    def convert(html: String): String = js.native
  }
  object HTMLtoJSX {
    
    @scala.inline
    def apply(convert: String => String): HTMLtoJSX = {
      val __obj = js.Dynamic.literal(convert = js.Any.fromFunction1(convert))
      __obj.asInstanceOf[HTMLtoJSX]
    }
    
    @scala.inline
    implicit class HTMLtoJSXMutableBuilder[Self <: HTMLtoJSX] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConvert(value: String => String): Self = StObject.set(x, "convert", js.Any.fromFunction1(value))
    }
  }
}
