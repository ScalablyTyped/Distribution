package typings.idyll

import typings.idyllCompiler.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Compiler extends StObject {
    
    var compiler: Options = js.native
    
    var components: js.Any = js.native
    
    var transform: js.Array[_] = js.native
  }
  object Compiler {
    
    @scala.inline
    def apply(compiler: Options, components: js.Any, transform: js.Array[_]): Compiler = {
      val __obj = js.Dynamic.literal(compiler = compiler.asInstanceOf[js.Any], components = components.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
      __obj.asInstanceOf[Compiler]
    }
    
    @scala.inline
    implicit class CompilerMutableBuilder[Self <: Compiler] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompiler(value: Options): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponents(value: js.Any): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransform(value: js.Array[_]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformVarargs(value: js.Any*): Self = StObject.set(x, "transform", js.Array(value :_*))
    }
  }
}
