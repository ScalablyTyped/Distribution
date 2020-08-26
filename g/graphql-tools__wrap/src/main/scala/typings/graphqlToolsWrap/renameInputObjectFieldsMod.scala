package typings.graphqlToolsWrap

import typings.graphql.definitionMod.GraphQLInputFieldConfig
import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsUtils.interfacesMod.Request
import typings.graphqlToolsUtils.interfacesMod.Transform
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/wrap/transforms/RenameInputObjectFields", JSImport.Namespace)
@js.native
object renameInputObjectFieldsMod extends js.Object {
  @js.native
  trait RenameInputObjectFields
    extends Transform[Record[String, js.Any]] {
    val renamer: js.Any = js.native
    var reverseMap: js.Any = js.native
    val transformer: js.Any = js.native
    @JSName("transformRequest")
    def transformRequest_MRenameInputObjectFields(originalRequest: Request): Request = js.native
    @JSName("transformRequest")
    def transformRequest_MRenameInputObjectFields(originalRequest: Request, delegationContext: Record[String, _]): Request = js.native
    @JSName("transformSchema")
    def transformSchema_MRenameInputObjectFields(originalSchema: GraphQLSchema): GraphQLSchema = js.native
  }
  
  @js.native
  class default protected () extends RenameInputObjectFields {
    def this(renamer: js.Function3[
            /* typeName */ String, 
            /* fieldName */ String, 
            /* inputFieldConfig */ GraphQLInputFieldConfig, 
            String
          ]) = this()
  }
  
}

