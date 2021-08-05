package typings.jasmineNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Consolidate extends StObject {
    
    var consolidate: Boolean
    
    var report: Boolean
    
    var savePath: String
    
    var useDotNotation: Boolean
  }
  object Consolidate {
    
    inline def apply(consolidate: Boolean, report: Boolean, savePath: String, useDotNotation: Boolean): Consolidate = {
      val __obj = js.Dynamic.literal(consolidate = consolidate.asInstanceOf[js.Any], report = report.asInstanceOf[js.Any], savePath = savePath.asInstanceOf[js.Any], useDotNotation = useDotNotation.asInstanceOf[js.Any])
      __obj.asInstanceOf[Consolidate]
    }
    
    extension [Self <: Consolidate](x: Self) {
      
      inline def setConsolidate(value: Boolean): Self = StObject.set(x, "consolidate", value.asInstanceOf[js.Any])
      
      inline def setReport(value: Boolean): Self = StObject.set(x, "report", value.asInstanceOf[js.Any])
      
      inline def setSavePath(value: String): Self = StObject.set(x, "savePath", value.asInstanceOf[js.Any])
      
      inline def setUseDotNotation(value: Boolean): Self = StObject.set(x, "useDotNotation", value.asInstanceOf[js.Any])
    }
  }
}
