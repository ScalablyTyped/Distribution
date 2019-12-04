package typings.graphqlDashBinding

import typings.graphql.graphqlMod.GraphQLSchema
import typings.graphql.languageAstMod.DocumentNode
import typings.graphql.typeDefinitionMod.GraphQLResolveInfo
import typings.graphqlDashBinding.distTypesMod.BindingOptions
import typings.graphqlDashBinding.distTypesMod.FragmentReplacement
import typings.graphqlDashBinding.distTypesMod.Operation
import typings.graphqlDashTools.distInterfacesMod.IResolvers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-binding", JSImport.Namespace)
@js.native
object graphqlDashBindingMod extends js.Object {
  @js.native
  class Binding protected ()
    extends typings.graphqlDashBinding.distBindingMod.Binding {
    def this(hasSchemaFragmentReplacementsBeforeDisableCache: BindingOptions) = this()
  }
  
  @js.native
  class Delegate protected ()
    extends typings.graphqlDashBinding.distDelegateMod.Delegate {
    def this(hasSchemaFragmentReplacementsBeforeDisableCache: BindingOptions) = this()
  }
  
  @js.native
  class FlowGenerator protected ()
    extends typings.graphqlDashBinding.distCodegenFlowGeneratorMod.FlowGenerator {
    def this(hasSchemaInputSchemaPathOutputBindingPathIsDefaultExport: Anon_InputSchemaPath) = this()
  }
  
  @js.native
  class Generator protected ()
    extends typings.graphqlDashBinding.distCodegenGeneratorMod.Generator {
    def this(hasSchemaInputSchemaPathOutputBindingPathIsDefaultExport: Anon_InputSchemaPath) = this()
  }
  
  @js.native
  class TypescriptGenerator protected ()
    extends typings.graphqlDashBinding.distCodegenTypescriptGeneratorMod.TypescriptGenerator {
    def this(hasSchemaInputSchemaPathOutputBindingPathIsDefaultExport: Anon_InputSchemaPath) = this()
  }
  
  def addFragmentToInfo(info: GraphQLResolveInfo, fragment: String): GraphQLResolveInfo = js.native
  def buildInfo(rootFieldName: String, operation: Operation, schema: GraphQLSchema): GraphQLResolveInfo = js.native
  def buildInfo(rootFieldName: String, operation: Operation, schema: GraphQLSchema, info: String): GraphQLResolveInfo = js.native
  def buildInfo(rootFieldName: String, operation: Operation, schema: GraphQLSchema, info: DocumentNode): GraphQLResolveInfo = js.native
  def buildInfo(rootFieldName: String, operation: Operation, schema: GraphQLSchema, info: GraphQLResolveInfo): GraphQLResolveInfo = js.native
  def extractFragmentReplacements(resolvers: IResolvers[_, _]): js.Array[FragmentReplacement] = js.native
  def forwardTo(bindingName: String): js.Function4[
    /* parent */ js.Any, 
    /* args */ js.Any, 
    /* context */ js.Any, 
    /* info */ GraphQLResolveInfo, 
    _
  ] = js.native
  def makeBindingClass[T](hasSchema: Anon_Schema): T = js.native
}

