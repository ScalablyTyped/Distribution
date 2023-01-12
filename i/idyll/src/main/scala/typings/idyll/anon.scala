package typings.idyll

import typings.idyllCompiler.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Compiler extends StObject {
    
    var compiler: Options
    
    var components: Any
    
    var transform: js.Array[Any]
  }
  object Compiler {
    
    inline def apply(compiler: Options, components: Any, transform: js.Array[Any]): Compiler = {
      val __obj = js.Dynamic.literal(compiler = compiler.asInstanceOf[js.Any], components = components.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
      __obj.asInstanceOf[Compiler]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Compiler] (val x: Self) extends AnyVal {
      
      inline def setCompiler(value: Options): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
      
      inline def setComponents(value: Any): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setTransform(value: js.Array[Any]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setTransformVarargs(value: Any*): Self = StObject.set(x, "transform", js.Array(value*))
    }
  }
}
