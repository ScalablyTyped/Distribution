package typings.less2sass

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("less2sass", JSImport.Namespace)
  @js.native
  val ^ : Less2Sass = js.native
  
  trait Less2Sass extends StObject {
    
    def convert(file: String): String
  }
  object Less2Sass {
    
    inline def apply(convert: String => String): Less2Sass = {
      val __obj = js.Dynamic.literal(convert = js.Any.fromFunction1(convert))
      __obj.asInstanceOf[Less2Sass]
    }
    
    extension [Self <: Less2Sass](x: Self) {
      
      inline def setConvert(value: String => String): Self = StObject.set(x, "convert", js.Any.fromFunction1(value))
    }
  }
  
  type _To = Less2Sass
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Less2Sass = ^
}
