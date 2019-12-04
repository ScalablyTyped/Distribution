package typings.graphqlDashTools.distTransformsConvertEnumValuesMod

import typings.graphql.graphqlMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/transforms/ConvertEnumValues", JSImport.Default)
@js.native
class default protected () extends ConvertEnumValues {
  def this(enumValueMap: js.Object) = this()
  /* CompleteClass */
  override var enumValueMap: js.Any = js.native
  /* CompleteClass */
  @JSName("transformSchema")
  override def transformSchema_MConvertEnumValues(schema: GraphQLSchema): GraphQLSchema = js.native
}

