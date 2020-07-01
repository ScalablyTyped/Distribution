package typings.graphqlToolsUtils

import typings.graphql.definitionMod.GraphQLInputType
import typings.graphql.mod.GraphQLEnumType
import typings.graphql.mod.GraphQLScalarType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/utils/transformInputValue", JSImport.Namespace)
@js.native
object transformInputValueMod extends js.Object {
  def parseInputValue(`type`: GraphQLInputType, value: js.Any): js.Any = js.native
  def parseInputValueLiteral(`type`: GraphQLInputType, value: js.Any): js.Any = js.native
  def serializeInputValue(`type`: GraphQLInputType, value: js.Any): js.Any = js.native
  def transformInputValue(`type`: GraphQLInputType, value: js.Any, transformer: InputValueTransformer): js.Any = js.native
  type InputValueTransformer = js.Function2[/* type */ GraphQLEnumType | GraphQLScalarType, /* originalValue */ js.Any, js.Any]
}

