package typings.jestTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoverageThresholdValue extends StObject {
  
  var branches: js.UndefOr[Double] = js.undefined
  
  var functions: js.UndefOr[Double] = js.undefined
  
  var lines: js.UndefOr[Double] = js.undefined
  
  var statements: js.UndefOr[Double] = js.undefined
}
object CoverageThresholdValue {
  
  inline def apply(): CoverageThresholdValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoverageThresholdValue]
  }
  
  extension [Self <: CoverageThresholdValue](x: Self) {
    
    inline def setBranches(value: Double): Self = StObject.set(x, "branches", value.asInstanceOf[js.Any])
    
    inline def setBranchesUndefined: Self = StObject.set(x, "branches", js.undefined)
    
    inline def setFunctions(value: Double): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
    
    inline def setFunctionsUndefined: Self = StObject.set(x, "functions", js.undefined)
    
    inline def setLines(value: Double): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    inline def setLinesUndefined: Self = StObject.set(x, "lines", js.undefined)
    
    inline def setStatements(value: Double): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    
    inline def setStatementsUndefined: Self = StObject.set(x, "statements", js.undefined)
  }
}
