package typings.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dimension filter specifies the filtering options on a dimension.
  */
@js.native
trait SchemaDimensionFilter extends js.Object {
  /**
    * Should the match be case sensitive? Default is false.
    */
  var caseSensitive: js.UndefOr[Boolean] = js.native
  /**
    * The dimension to filter on. A DimensionFilter must contain a dimension.
    */
  var dimensionName: js.UndefOr[String] = js.native
  /**
    * Strings or regular expression to match against. Only the first value of
    * the list is used for comparison unless the operator is `IN_LIST`. If
    * `IN_LIST` operator, then the entire list is used to filter the dimensions
    * as explained in the description of the `IN_LIST` operator.
    */
  var expressions: js.UndefOr[js.Array[String]] = js.native
  /**
    * Logical `NOT` operator. If this boolean is set to true, then the matching
    * dimension values will be excluded in the report. The default is false.
    */
  var not: js.UndefOr[Boolean] = js.native
  /**
    * How to match the dimension to the expression. The default is REGEXP.
    */
  var operator: js.UndefOr[String] = js.native
}

object SchemaDimensionFilter {
  @scala.inline
  def apply(): SchemaDimensionFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDimensionFilter]
  }
  @scala.inline
  implicit class SchemaDimensionFilterOps[Self <: SchemaDimensionFilter] (val x: Self) extends AnyVal {
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
    def setCaseSensitive(value: Boolean): Self = this.set("caseSensitive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaseSensitive: Self = this.set("caseSensitive", js.undefined)
    @scala.inline
    def setDimensionName(value: String): Self = this.set("dimensionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimensionName: Self = this.set("dimensionName", js.undefined)
    @scala.inline
    def setExpressionsVarargs(value: String*): Self = this.set("expressions", js.Array(value :_*))
    @scala.inline
    def setExpressions(value: js.Array[String]): Self = this.set("expressions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpressions: Self = this.set("expressions", js.undefined)
    @scala.inline
    def setNot(value: Boolean): Self = this.set("not", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNot: Self = this.set("not", js.undefined)
    @scala.inline
    def setOperator(value: String): Self = this.set("operator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperator: Self = this.set("operator", js.undefined)
  }
  
}

