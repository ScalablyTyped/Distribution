package typings.htmltojsx

import typings.htmltojsx.anon.CreateClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("htmltojsx", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with HTMLtoJSX {
    def this(options: CreateClass) = this()
    
    /* CompleteClass */
    override def convert(html: String): String = js.native
  }
  
  trait HTMLtoJSX extends StObject {
    
    def convert(html: String): String
  }
  object HTMLtoJSX {
    
    inline def apply(convert: String => String): HTMLtoJSX = {
      val __obj = js.Dynamic.literal(convert = js.Any.fromFunction1(convert))
      __obj.asInstanceOf[HTMLtoJSX]
    }
    
    extension [Self <: HTMLtoJSX](x: Self) {
      
      inline def setConvert(value: String => String): Self = StObject.set(x, "convert", js.Any.fromFunction1(value))
    }
  }
}
