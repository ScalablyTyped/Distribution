package typings.graphqlDashTools.distTransformsMod

import typings.graphql.typeDefinitionMod.GraphQLNamedType
import typings.graphqlDashTools.distTransformsFilterTypesMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/transforms", "FilterTypes")
@js.native
class FilterTypes protected () extends default {
  def this(filter: js.Function1[/* type */ GraphQLNamedType, Boolean]) = this()
}

