package typings.graphqlBinding

import typings.graphql.mod.GraphQLSchema
import typings.graphqlBinding.typesMod.Interpolation
import typings.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-binding/dist/codegen/Generator", JSImport.Namespace)
@js.native
object generatorMod extends js.Object {
  @js.native
  class Generator protected () extends js.Object {
    def this(hasSchemaInputSchemaPathOutputBindingPathIsDefaultExport: AnonInputSchemaPath) = this()
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

