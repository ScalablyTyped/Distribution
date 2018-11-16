package typings
package graphqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/utilities/typeComparators", JSImport.Namespace)
@js.native
object utilitiesTypeComparatorsMod extends js.Object {
  def doTypesOverlap(
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    typeA: graphqlLib.typeDefinitionMod.GraphQLCompositeType,
    typeB: graphqlLib.typeDefinitionMod.GraphQLCompositeType
  ): scala.Boolean = js.native
  def isEqualType(typeA: graphqlLib.typeDefinitionMod.GraphQLType, typeB: graphqlLib.typeDefinitionMod.GraphQLType): scala.Boolean = js.native
  def isTypeSubTypeOf(
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    maybeSubType: graphqlLib.typeDefinitionMod.GraphQLType,
    superType: graphqlLib.typeDefinitionMod.GraphQLType
  ): scala.Boolean = js.native
}

