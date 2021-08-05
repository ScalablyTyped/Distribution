package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Criteria for showing/hiding rows in a filter or filter view.
  */
trait SchemaFilterCriteria extends StObject {
  
  /**
    * A condition that must be true for values to be shown. (This does not
    * override hiddenValues -- if a value is listed there,  it will still be
    * hidden.)
    */
  var condition: js.UndefOr[SchemaBooleanCondition] = js.undefined
  
  /**
    * Values that should be hidden.
    */
  var hiddenValues: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaFilterCriteria {
  
  inline def apply(): SchemaFilterCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFilterCriteria]
  }
  
  extension [Self <: SchemaFilterCriteria](x: Self) {
    
    inline def setCondition(value: SchemaBooleanCondition): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setHiddenValues(value: js.Array[String]): Self = StObject.set(x, "hiddenValues", value.asInstanceOf[js.Any])
    
    inline def setHiddenValuesUndefined: Self = StObject.set(x, "hiddenValues", js.undefined)
    
    inline def setHiddenValuesVarargs(value: String*): Self = StObject.set(x, "hiddenValues", js.Array(value :_*))
  }
}
