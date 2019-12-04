package typings.graphqlDashBinding

import typings.graphql.graphqlMod.GraphQLSchema
import typings.graphqlDashBinding.distCodegenGeneratorMod.Generator
import typings.graphqlDashBinding.distCodegenTypesMod.Interpolation
import typings.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-binding/dist/codegen/Generator", JSImport.Namespace)
@js.native
object distCodegenGeneratorMod extends js.Object {
  @js.native
  class Generator protected () extends js.Object {
    def this(hasSchemaInputSchemaPathOutputBindingPathIsDefaultExport: Anon_InputSchemaPath) = this()
    var inputSchemaPath: String = js.native
    var isDefaultExport: Boolean = js.native
    var outputBindingPath: String = js.native
    var schema: GraphQLSchema = js.native
    def compile(strings: TemplateStringsArray, interpolations: Interpolation[Generator]*): String = js.native
    def getRelativeSchemaPath(): String = js.native
    def render(): String = js.native
    def renderExports(): String = js.native
    def renderImports(): String = js.native
  }
  
}

