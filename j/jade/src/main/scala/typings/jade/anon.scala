package typings.jade

import typings.jade.mod.JadeGenerationFunction
import typings.jade.mod.TemplateLocals
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Body extends StObject {
    
    def body(): String
    def body(locals: TemplateLocals): String
    @JSName("body")
    var body_Original: JadeGenerationFunction
    
    var dependencies: js.Array[String]
  }
  object Body {
    
    inline def apply(body: /* locals */ js.UndefOr[TemplateLocals] => String, dependencies: js.Array[String]): Body = {
      val __obj = js.Dynamic.literal(body = js.Any.fromFunction1(body), dependencies = dependencies.asInstanceOf[js.Any])
      __obj.asInstanceOf[Body]
    }
    
    extension [Self <: Body](x: Self) {
      
      inline def setBody(value: /* locals */ js.UndefOr[TemplateLocals] => String): Self = StObject.set(x, "body", js.Any.fromFunction1(value))
      
      inline def setDependencies(value: js.Array[String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesVarargs(value: String*): Self = StObject.set(x, "dependencies", js.Array(value :_*))
    }
  }
}
