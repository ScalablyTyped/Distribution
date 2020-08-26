package typings.graphqlQueryComplexity.queryComplexityMod

import typings.graphql.mod.GraphQLError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryComplexityOptions extends js.Object {
  var createError: js.UndefOr[js.Function2[/* max */ Double, /* actual */ Double, GraphQLError]] = js.native
  var estimators: js.Array[ComplexityEstimator] = js.native
  var maximumComplexity: Double = js.native
  var onComplete: js.UndefOr[js.Function1[/* complexity */ Double, Unit]] = js.native
  var operationName: js.UndefOr[String] = js.native
  var variables: js.UndefOr[js.Object] = js.native
}

object QueryComplexityOptions {
  @scala.inline
  def apply(estimators: js.Array[ComplexityEstimator], maximumComplexity: Double): QueryComplexityOptions = {
    val __obj = js.Dynamic.literal(estimators = estimators.asInstanceOf[js.Any], maximumComplexity = maximumComplexity.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryComplexityOptions]
  }
  @scala.inline
  implicit class QueryComplexityOptionsOps[Self <: QueryComplexityOptions] (val x: Self) extends AnyVal {
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
    def setEstimatorsVarargs(value: ComplexityEstimator*): Self = this.set("estimators", js.Array(value :_*))
    @scala.inline
    def setEstimators(value: js.Array[ComplexityEstimator]): Self = this.set("estimators", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaximumComplexity(value: Double): Self = this.set("maximumComplexity", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateError(value: (/* max */ Double, /* actual */ Double) => GraphQLError): Self = this.set("createError", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCreateError: Self = this.set("createError", js.undefined)
    @scala.inline
    def setOnComplete(value: /* complexity */ Double => Unit): Self = this.set("onComplete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnComplete: Self = this.set("onComplete", js.undefined)
    @scala.inline
    def setOperationName(value: String): Self = this.set("operationName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationName: Self = this.set("operationName", js.undefined)
    @scala.inline
    def setVariables(value: js.Object): Self = this.set("variables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariables: Self = this.set("variables", js.undefined)
  }
  
}

