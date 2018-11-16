package typings
package graphqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object utilitiesTypeInfoMod {
  type getFieldDef = js.Function3[
    /* schema */ graphqlLib.typeSchemaMod.GraphQLSchema, 
    /* parentType */ graphqlLib.typeDefinitionMod.GraphQLType, 
    /* fieldNode */ graphqlLib.languageAstMod.FieldNode, 
    graphqlLib.tsutilsMaybeMod.Maybe[
      graphqlLib.typeDefinitionMod.GraphQLField[js.Any, js.Any, ScalablyTyped.runtime.StringDictionary[js.Any]]
    ]
  ]
}
