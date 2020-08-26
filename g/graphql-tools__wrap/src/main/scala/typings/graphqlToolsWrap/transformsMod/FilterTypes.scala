package typings.graphqlToolsWrap.transformsMod

import typings.graphql.definitionMod.GraphQLNamedType
import typings.graphqlToolsWrap.filterTypesMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/wrap/transforms", "FilterTypes")
@js.native
class FilterTypes protected () extends default {
  def this(filter: js.Function1[/* type */ GraphQLNamedType, Boolean]) = this()
}

