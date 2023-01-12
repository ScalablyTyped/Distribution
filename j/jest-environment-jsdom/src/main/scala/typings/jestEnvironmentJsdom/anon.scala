package typings.jestEnvironmentJsdom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait StackTraceLimit extends StObject {
    
    var stackTraceLimit: Double
  }
  object StackTraceLimit {
    
    inline def apply(stackTraceLimit: Double): StackTraceLimit = {
      val __obj = js.Dynamic.literal(stackTraceLimit = stackTraceLimit.asInstanceOf[js.Any])
      __obj.asInstanceOf[StackTraceLimit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StackTraceLimit] (val x: Self) extends AnyVal {
      
      inline def setStackTraceLimit(value: Double): Self = StObject.set(x, "stackTraceLimit", value.asInstanceOf[js.Any])
    }
  }
}
