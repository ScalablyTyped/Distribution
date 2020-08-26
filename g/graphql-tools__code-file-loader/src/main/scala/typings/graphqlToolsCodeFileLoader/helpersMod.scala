package typings.graphqlToolsCodeFileLoader

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/code-file-loader/helpers", JSImport.Namespace)
@js.native
object helpersMod extends js.Object {
  def isSchemaAst(obj: js.Any): /* is graphql.graphql/language/ast.DocumentNode */ Boolean = js.native
  def isSchemaJson(obj: js.Any): /* is graphql.graphql/utilities/getIntrospectionQuery.IntrospectionQuery */ Boolean = js.native
  def isSchemaText(obj: js.Any): /* is string */ Boolean = js.native
  def isWrappedSchemaJson(obj: js.Any): /* is @graphql-tools/code-file-loader.anon.Data */ Boolean = js.native
  def pick[T](obj: js.Any, keys: js.Array[String]): T = js.native
}

