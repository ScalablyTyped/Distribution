package typings.graphqlDashTools.distTransformsAddArgumentsAsVariablesMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.graphqlMod.GraphQLSchema
import typings.graphqlDashTools.distInterfacesMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/transforms/AddArgumentsAsVariables", JSImport.Default)
@js.native
class default protected () extends AddArgumentsAsVariablesTransform {
  def this(schema: GraphQLSchema, args: StringDictionary[js.Any]) = this()
  /* CompleteClass */
  override var args: js.Any = js.native
  /* CompleteClass */
  override var schema: js.Any = js.native
  /* CompleteClass */
  @JSName("transformRequest")
  override def transformRequest_MAddArgumentsAsVariablesTransform(originalRequest: Request): Request = js.native
}

