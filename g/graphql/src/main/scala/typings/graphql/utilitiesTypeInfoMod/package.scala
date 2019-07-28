package typings.graphql

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.languageAstMod.FieldNode
import typings.graphql.tsutilsMaybeMod.Maybe
import typings.graphql.typeDefinitionMod.GraphQLField
import typings.graphql.typeDefinitionMod.GraphQLType
import typings.graphql.typeSchemaMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object utilitiesTypeInfoMod {
  type getFieldDef = js.Function3[
    /* schema */ GraphQLSchema, 
    /* parentType */ GraphQLType, 
    /* fieldNode */ FieldNode, 
    Maybe[GraphQLField[js.Any, js.Any, StringDictionary[js.Any]]]
  ]
}
