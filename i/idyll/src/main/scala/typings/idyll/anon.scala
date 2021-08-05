package typings.idyll

import typings.idyllCompiler.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Compiler extends StObject {
    
    var compiler: Options
    
    var components: js.Any
    
    var transform: js.Array[js.Any]
  }
  object Compiler {
    
    inline def apply(compiler: Options, components: js.Any, transform: js.Array[js.Any]): Compiler = {
      val __obj = js.Dynamic.literal(compiler = compiler.asInstanceOf[js.Any], components = components.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
      __obj.asInstanceOf[Compiler]
    }
    
    extension [Self <: Compiler](x: Self) {
      
      inline def setCompiler(value: Options): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
      
      inline def setComponents(value: js.Any): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setTransform(value: js.Array[js.Any]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setTransformVarargs(value: js.Any*): Self = StObject.set(x, "transform", js.Array(value :_*))
    }
  }
}
