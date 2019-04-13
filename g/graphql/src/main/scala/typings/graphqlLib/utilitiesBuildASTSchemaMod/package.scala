package typings
package graphqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object utilitiesBuildASTSchemaMod {
  type TypeDefinitionsMap = org.scalablytyped.runtime.StringDictionary[graphqlLib.languageAstMod.TypeDefinitionNode]
  type TypeResolver = js.Function1[
    /* typeRef */ graphqlLib.languageAstMod.NamedTypeNode, 
    graphqlLib.typeDefinitionMod.GraphQLNamedType
  ]
}
