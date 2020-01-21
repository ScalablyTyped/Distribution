package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaValueFilter extends js.Object {
  /**
    * The `operator_name` applied to the query, such as *price_greater_than*.
    * The filter can work against both types of filters defined in the schema
    * for your data source: &lt;br/&gt;&lt;br/&gt; 1. `operator_name`, where
    * the query filters results by the property that matches the value.
    * &lt;br/&gt; 2. `greater_than_operator_name` or `less_than_operator_name`
    * in your schema. The query filters the results for the property values
    * that are greater than or less than  the supplied value in the query.
    */
  var operatorName: js.UndefOr[String] = js.native
  /**
    * The value to be compared with.
    */
  var value: js.UndefOr[SchemaValue] = js.native
}

object SchemaValueFilter {
  @scala.inline
  def apply(operatorName: String = null, value: SchemaValue = null): SchemaValueFilter = {
    val __obj = js.Dynamic.literal()
    if (operatorName != null) __obj.updateDynamic("operatorName")(operatorName.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaValueFilter]
  }
}

