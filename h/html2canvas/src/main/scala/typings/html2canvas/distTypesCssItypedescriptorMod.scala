package typings.html2canvas

import typings.html2canvas.distTypesCoreContextMod.Context
import typings.html2canvas.distTypesCssSyntaxParserMod.CSSValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCssItypedescriptorMod {
  
  trait ITypeDescriptor[T] extends StObject {
    
    var name: String
    
    def parse(context: Context, value: CSSValue): T
  }
  object ITypeDescriptor {
    
    inline def apply[T](name: String, parse: (Context, CSSValue) => T): ITypeDescriptor[T] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], parse = js.Any.fromFunction2(parse))
      __obj.asInstanceOf[ITypeDescriptor[T]]
    }
    
    extension [Self <: ITypeDescriptor[?], T](x: Self & ITypeDescriptor[T]) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setParse(value: (Context, CSSValue) => T): Self = StObject.set(x, "parse", js.Any.fromFunction2(value))
    }
  }
}
