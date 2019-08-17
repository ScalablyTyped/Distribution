package typings.graphql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object utilitiesTypeInfoMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.graphql.languageAstMod.FieldNode
  import typings.graphql.tsutilsMaybeMod.Maybe
  import typings.graphql.typeDefinitionMod.GraphQLField
  import typings.graphql.typeDefinitionMod.GraphQLType
  import typings.graphql.typeSchemaMod.GraphQLSchema

  type getFieldDef = js.Function3[
    /* schema */ GraphQLSchema, 
    /* parentType */ GraphQLType, 
    /* fieldNode */ FieldNode, 
    Maybe[GraphQLField[js.Any, js.Any, StringDictionary[js.Any]]]
  ]
}
