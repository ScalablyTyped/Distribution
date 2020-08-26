package typings.graphqlToolsWrap.transformsMod

import typings.graphqlToolsUtils.interfacesMod.InputFieldFilter
import typings.graphqlToolsWrap.filterInputObjectFieldsMod.default
import typings.graphqlToolsWrap.typesMod.InputObjectNodeTransformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/wrap/transforms", "FilterInputObjectFields")
@js.native
class FilterInputObjectFields protected () extends default {
  def this(filter: InputFieldFilter) = this()
  def this(filter: InputFieldFilter, inputObjectNodeTransformer: InputObjectNodeTransformer) = this()
}

