package typings
package graphqlDashToolsLib.distTransformsFilterTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/transforms/FilterTypes", JSImport.Default)
@js.native
class default protected () extends FilterTypes {
  def this(filter: js.Function1[/* type */ graphqlLib.typeDefinitionMod.GraphQLNamedType, scala.Boolean]) = this()
  /* CompleteClass */
  override var filter: js.Any = js.native
  /* CompleteClass */
  @JSName("transformSchema")
  override def transformSchema_MFilterTypes(schema: graphqlLib.graphqlMod.GraphQLSchema): graphqlLib.graphqlMod.GraphQLSchema = js.native
}

