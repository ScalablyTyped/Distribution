package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Criteria for showing/hiding rows in a pivot table.
  */
trait SchemaPivotFilterCriteria extends StObject {
  
  /**
    * Values that should be included.  Values not listed here are excluded.
    */
  var visibleValues: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaPivotFilterCriteria {
  
  inline def apply(): SchemaPivotFilterCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPivotFilterCriteria]
  }
  
  extension [Self <: SchemaPivotFilterCriteria](x: Self) {
    
    inline def setVisibleValues(value: js.Array[String]): Self = StObject.set(x, "visibleValues", value.asInstanceOf[js.Any])
    
    inline def setVisibleValuesUndefined: Self = StObject.set(x, "visibleValues", js.undefined)
    
    inline def setVisibleValuesVarargs(value: String*): Self = StObject.set(x, "visibleValues", js.Array(value :_*))
  }
}
