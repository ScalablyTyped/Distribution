package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(`type`: String = null, values: js.Array[SchemaConditionValue] = null): SchemaBooleanCondition = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBooleanCondition]
  }
}

