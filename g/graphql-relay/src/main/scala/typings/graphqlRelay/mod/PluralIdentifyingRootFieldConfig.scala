package typings.graphqlRelay.mod

import typings.graphql.definitionMod.GraphQLInputType
import typings.graphql.definitionMod.GraphQLOutputType
import typings.graphql.definitionMod.GraphQLResolveInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluralIdentifyingRootFieldConfig extends js.Object {
  var argName: String = js.native
  var description: js.UndefOr[String] = js.native
  var inputType: GraphQLInputType = js.native
  var outputType: GraphQLOutputType = js.native
  def resolveSingleInput(input: js.Any, context: js.Any, info: GraphQLResolveInfo): js.Any = js.native
}

object PluralIdentifyingRootFieldConfig {
  @scala.inline
  def apply(
    argName: String,
    inputType: GraphQLInputType,
    outputType: GraphQLOutputType,
    resolveSingleInput: (js.Any, js.Any, GraphQLResolveInfo) => js.Any
  ): PluralIdentifyingRootFieldConfig = {
    val __obj = js.Dynamic.literal(argName = argName.asInstanceOf[js.Any], inputType = inputType.asInstanceOf[js.Any], outputType = outputType.asInstanceOf[js.Any], resolveSingleInput = js.Any.fromFunction3(resolveSingleInput))
    __obj.asInstanceOf[PluralIdentifyingRootFieldConfig]
  }
  @scala.inline
  implicit class PluralIdentifyingRootFieldConfigOps[Self <: PluralIdentifyingRootFieldConfig] (val x: Self) extends AnyVal {
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
    def setArgName(value: String): Self = this.set("argName", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputType(value: GraphQLInputType): Self = this.set("inputType", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutputType(value: GraphQLOutputType): Self = this.set("outputType", value.asInstanceOf[js.Any])
    @scala.inline
    def setResolveSingleInput(value: (js.Any, js.Any, GraphQLResolveInfo) => js.Any): Self = this.set("resolveSingleInput", js.Any.fromFunction3(value))
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
  }
  
}

