package typings.graphqlQueryComplexity.anon

import typings.graphql.astMod.DocumentNode
import typings.graphql.mod.GraphQLSchema
import typings.graphqlQueryComplexity.queryComplexityMod.ComplexityEstimator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Estimators extends js.Object {
  var estimators: js.Array[ComplexityEstimator] = js.native
  var operationName: js.UndefOr[String] = js.native
  var query: DocumentNode = js.native
  var schema: GraphQLSchema = js.native
  var variables: js.UndefOr[js.Object] = js.native
}

object Estimators {
  @scala.inline
  def apply(estimators: js.Array[ComplexityEstimator], query: DocumentNode, schema: GraphQLSchema): Estimators = {
    val __obj = js.Dynamic.literal(estimators = estimators.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[Estimators]
  }
  @scala.inline
  implicit class EstimatorsOps[Self <: Estimators] (val x: Self) extends AnyVal {
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
    def setQuery(value: DocumentNode): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchema(value: GraphQLSchema): Self = this.set("schema", value.asInstanceOf[js.Any])
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

