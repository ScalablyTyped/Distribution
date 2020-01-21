package typings.graphql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildASTSchemaMod {
  type TypeDefinitionsMap = org.scalablytyped.runtime.StringDictionary[typings.graphql.astMod.TypeDefinitionNode]
  type TypeResolver = js.Function1[
    /* typeRef */ typings.graphql.astMod.NamedTypeNode, 
    typings.graphql.definitionMod.GraphQLNamedType
  ]
}
