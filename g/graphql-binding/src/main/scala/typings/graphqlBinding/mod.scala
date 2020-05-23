package typings.graphqlBinding

import typings.graphql.astMod.DocumentNode
import typings.graphql.definitionMod.GraphQLResolveInfo
import typings.graphql.mod.GraphQLSchema
import typings.graphqlBinding.anon.InputSchemaPath
import typings.graphqlBinding.anon.Schema
import typings.graphqlBinding.distTypesMod.BindingOptions
import typings.graphqlBinding.distTypesMod.FragmentReplacement
import typings.graphqlBinding.distTypesMod.Operation
import typings.graphqlTools.interfacesMod.IResolvers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-binding", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Binding protected ()
    extends typings.graphqlBinding.bindingMod.Binding {
    def this(hasSchemaFragmentReplacementsBeforeDisableCache: BindingOptions) = this()
  }
  
  @js.native
  class Delegate protected ()
    extends typings.graphqlBinding.delegateMod.Delegate {
    def this(hasSchemaFragmentReplacementsBeforeDisableCache: BindingOptions) = this()
  }
  
  @js.native
  class FlowGenerator protected ()
    extends typings.graphqlBinding.flowGeneratorMod.FlowGenerator {
    def this(hasSchemaInputSchemaPathOutputBindingPathIsDefaultExport: InputSchemaPath) = this()
  }
  
  @js.native
  class Generator protected ()
    extends typings.graphqlBinding.generatorMod.Generator {
    def this(hasSchemaInputSchemaPathOutputBindingPathIsDefaultExport: InputSchemaPath) = this()
  }
  
  @js.native
  class TypescriptGenerator protected ()
    extends typings.graphqlBinding.typescriptGeneratorMod.TypescriptGenerator {
    def this(hasSchemaInputSchemaPathOutputBindingPathIsDefaultExport: InputSchemaPath) = this()
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
  def makeBindingClass[T](hasSchema: Schema): T = js.native
}

