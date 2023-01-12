package typings.ioTs

import typings.ioTs.mod.Validation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libReporterMod {
  
  trait Reporter[A] extends StObject {
    
    def report(validation: Validation[Any]): A
  }
  object Reporter {
    
    inline def apply[A](report: Validation[Any] => A): Reporter[A] = {
      val __obj = js.Dynamic.literal(report = js.Any.fromFunction1(report))
      __obj.asInstanceOf[Reporter[A]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Reporter[?], A] (val x: Self & Reporter[A]) extends AnyVal {
      
      inline def setReport(value: Validation[Any] => A): Self = StObject.set(x, "report", js.Any.fromFunction1(value))
    }
  }
}
