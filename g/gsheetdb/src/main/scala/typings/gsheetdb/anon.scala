package typings.gsheetdb

import typings.gsheetdb.mod.Row
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait RowNb extends StObject {
    
    var rowNb: Double
    
    var values: Row
  }
  object RowNb {
    
    inline def apply(rowNb: Double, values: Row): RowNb = {
      val __obj = js.Dynamic.literal(rowNb = rowNb.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowNb]
    }
    
    extension [Self <: RowNb](x: Self) {
      
      inline def setRowNb(value: Double): Self = StObject.set(x, "rowNb", value.asInstanceOf[js.Any])
      
      inline def setValues(value: Row): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: (Boolean | String | Double | Null)*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
}
