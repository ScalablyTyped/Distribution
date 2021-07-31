package typings.ioTs

import typings.ioTs.mod.Validation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reporterMod {
  
  trait Reporter[A] extends StObject {
    
    def report(validation: Validation[js.Any]): A
  }
  object Reporter {
    
    @scala.inline
    def apply[A](report: Validation[js.Any] => A): Reporter[A] = {
      val __obj = js.Dynamic.literal(report = js.Any.fromFunction1(report))
      __obj.asInstanceOf[Reporter[A]]
    }
    
    @scala.inline
    implicit class ReporterMutableBuilder[Self <: Reporter[?], A] (val x: Self & Reporter[A]) extends AnyVal {
      
      @scala.inline
      def setReport(value: Validation[js.Any] => A): Self = StObject.set(x, "report", js.Any.fromFunction1(value))
    }
  }
}
