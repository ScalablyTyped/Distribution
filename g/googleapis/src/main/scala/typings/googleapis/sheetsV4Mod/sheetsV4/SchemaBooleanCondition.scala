package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A condition that can evaluate to true or false. BooleanConditions are used
  * by conditional formatting, data validation, and the criteria in filters.
  */
trait SchemaBooleanCondition extends StObject {
  
  /**
    * The type of condition.
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * The values of the condition. The number of supported values depends on
    * the condition type.  Some support zero values, others one or two values,
    * and ConditionType.ONE_OF_LIST supports an arbitrary number of values.
    */
  var values: js.UndefOr[js.Array[SchemaConditionValue]] = js.undefined
}
object SchemaBooleanCondition {
  
  @scala.inline
  def apply(): SchemaBooleanCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBooleanCondition]
  }
  
  @scala.inline
  implicit class SchemaBooleanConditionMutableBuilder[Self <: SchemaBooleanCondition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValues(value: js.Array[SchemaConditionValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: SchemaConditionValue*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
