package typings.jupyterlabServices.libKernelMessagesMod

import typings.jupyterlabServices.jupyterlabServicesStrings.search
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHistoryRequestSearch extends StObject {
  
  var hist_access_type: search
  
  var n: Double
  
  var output: Boolean
  
  var pattern: String
  
  var raw: Boolean
  
  var unique: Boolean
}
object IHistoryRequestSearch {
  
  inline def apply(n: Double, output: Boolean, pattern: String, raw: Boolean, unique: Boolean): IHistoryRequestSearch = {
    val __obj = js.Dynamic.literal(hist_access_type = "search", n = n.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], unique = unique.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHistoryRequestSearch]
  }
  
  extension [Self <: IHistoryRequestSearch](x: Self) {
    
    inline def setHist_access_type(value: search): Self = StObject.set(x, "hist_access_type", value.asInstanceOf[js.Any])
    
    inline def setN(value: Double): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
    
    inline def setOutput(value: Boolean): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setUnique(value: Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
  }
}
