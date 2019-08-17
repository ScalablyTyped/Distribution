package typings.graphql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object utilitiesBuildASTSchemaMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.graphql.languageAstMod.NamedTypeNode
  import typings.graphql.languageAstMod.TypeDefinitionNode
  import typings.graphql.typeDefinitionMod.GraphQLNamedType

  type TypeDefinitionsMap = StringDictionary[TypeDefinitionNode]
  type TypeResolver = js.Function1[/* typeRef */ NamedTypeNode, GraphQLNamedType]
}
