package typings.graphql

import typings.graphql.definitionMod.GraphQLCompositeType
import typings.graphql.definitionMod.GraphQLType
import typings.graphql.schemaMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/utilities/typeComparators", JSImport.Namespace)
@js.native
object typeComparatorsMod extends js.Object {
  def doTypesOverlap(schema: GraphQLSchema, typeA: GraphQLCompositeType, typeB: GraphQLCompositeType): Boolean = js.native
  def isEqualType(typeA: GraphQLType, typeB: GraphQLType): Boolean = js.native
  def isTypeSubTypeOf(schema: GraphQLSchema, maybeSubType: GraphQLType, superType: GraphQLType): Boolean = js.native
}

