package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Criteria for showing/hiding rows in a filter or filter view.
  */
@js.native
trait SchemaFilterCriteria extends StObject {
  
  /**
    * A condition that must be true for values to be shown. (This does not
    * override hiddenValues -- if a value is listed there,  it will still be
    * hidden.)
    */
  var condition: js.UndefOr[SchemaBooleanCondition] = js.native
  
  /**
    * Values that should be hidden.
    */
  var hiddenValues: js.UndefOr[js.Array[String]] = js.native
}
object SchemaFilterCriteria {
  
  @scala.inline
  def apply(): SchemaFilterCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFilterCriteria]
  }
  
  @scala.inline
  implicit class SchemaFilterCriteriaMutableBuilder[Self <: SchemaFilterCriteria] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCondition(value: SchemaBooleanCondition): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    @scala.inline
    def setHiddenValues(value: js.Array[String]): Self = StObject.set(x, "hiddenValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenValuesUndefined: Self = StObject.set(x, "hiddenValues", js.undefined)
    
    @scala.inline
    def setHiddenValuesVarargs(value: String*): Self = StObject.set(x, "hiddenValues", js.Array(value :_*))
  }
}
