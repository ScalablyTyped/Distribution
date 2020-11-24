package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A condition that can evaluate to true or false. BooleanConditions are used
  * by conditional formatting, data validation, and the criteria in filters.
  */
@js.native
trait SchemaBooleanCondition extends js.Object {
  
  /**
    * The type of condition.
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * The values of the condition. The number of supported values depends on
    * the condition type.  Some support zero values, others one or two values,
    * and ConditionType.ONE_OF_LIST supports an arbitrary number of values.
    */
  var values: js.UndefOr[js.Array[SchemaConditionValue]] = js.native
}
object SchemaBooleanCondition {
  
  @scala.inline
  def apply(): SchemaBooleanCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBooleanCondition]
  }
  
  @scala.inline
  implicit class SchemaBooleanConditionOps[Self <: SchemaBooleanCondition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: SchemaConditionValue*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[SchemaConditionValue]): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
}
