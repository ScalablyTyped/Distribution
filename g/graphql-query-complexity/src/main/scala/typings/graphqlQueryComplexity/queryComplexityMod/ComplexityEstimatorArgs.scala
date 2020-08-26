package typings.graphqlQueryComplexity.queryComplexityMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.definitionMod.GraphQLCompositeType
import typings.graphql.definitionMod.GraphQLField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComplexityEstimatorArgs extends js.Object {
  var args: StringDictionary[js.Any] = js.native
  var childComplexity: Double = js.native
  var field: GraphQLField[_, _, StringDictionary[_]] = js.native
  var `type`: GraphQLCompositeType = js.native
}

object ComplexityEstimatorArgs {
  @scala.inline
  def apply(
    args: StringDictionary[js.Any],
    childComplexity: Double,
    field: GraphQLField[_, _, StringDictionary[_]],
    `type`: GraphQLCompositeType
  ): ComplexityEstimatorArgs = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], childComplexity = childComplexity.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComplexityEstimatorArgs]
  }
  @scala.inline
  implicit class ComplexityEstimatorArgsOps[Self <: ComplexityEstimatorArgs] (val x: Self) extends AnyVal {
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
    def setArgs(value: StringDictionary[js.Any]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildComplexity(value: Double): Self = this.set("childComplexity", value.asInstanceOf[js.Any])
    @scala.inline
    def setField(value: GraphQLField[_, _, StringDictionary[_]]): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: GraphQLCompositeType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

