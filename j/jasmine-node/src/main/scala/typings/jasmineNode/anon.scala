package typings.jasmineNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Consolidate extends StObject {
    
    var consolidate: Boolean = js.native
    
    var report: Boolean = js.native
    
    var savePath: String = js.native
    
    var useDotNotation: Boolean = js.native
  }
  object Consolidate {
    
    @scala.inline
    def apply(consolidate: Boolean, report: Boolean, savePath: String, useDotNotation: Boolean): Consolidate = {
      val __obj = js.Dynamic.literal(consolidate = consolidate.asInstanceOf[js.Any], report = report.asInstanceOf[js.Any], savePath = savePath.asInstanceOf[js.Any], useDotNotation = useDotNotation.asInstanceOf[js.Any])
      __obj.asInstanceOf[Consolidate]
    }
    
    @scala.inline
    implicit class ConsolidateMutableBuilder[Self <: Consolidate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConsolidate(value: Boolean): Self = StObject.set(x, "consolidate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReport(value: Boolean): Self = StObject.set(x, "report", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSavePath(value: String): Self = StObject.set(x, "savePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseDotNotation(value: Boolean): Self = StObject.set(x, "useDotNotation", value.asInstanceOf[js.Any])
    }
  }
}
