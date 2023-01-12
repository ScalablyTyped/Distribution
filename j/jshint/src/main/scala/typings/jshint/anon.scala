package typings.jshint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Complexity extends StObject {
    
    var complexity: Double
    
    var parameters: Double
    
    var statements: Double
  }
  object Complexity {
    
    inline def apply(complexity: Double, parameters: Double, statements: Double): Complexity = {
      val __obj = js.Dynamic.literal(complexity = complexity.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], statements = statements.asInstanceOf[js.Any])
      __obj.asInstanceOf[Complexity]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Complexity] (val x: Self) extends AnyVal {
      
      inline def setComplexity(value: Double): Self = StObject.set(x, "complexity", value.asInstanceOf[js.Any])
      
      inline def setParameters(value: Double): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setStatements(value: Double): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    }
  }
}
