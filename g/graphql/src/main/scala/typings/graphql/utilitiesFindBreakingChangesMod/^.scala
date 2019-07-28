package typings.graphql.utilitiesFindBreakingChangesMod

import typings.graphql.Anon_BreakingChanges
import typings.graphql.languageDirectiveLocationMod.DirectiveLocationEnum
import typings.graphql.typeDirectivesMod.GraphQLDirective
import typings.graphql.typeSchemaMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/utilities/findBreakingChanges", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val BreakingChangeType: _BreakingChangeType = js.native
  val DangerousChangeType: _DangerousChangeType = js.native
  def findAddedNonNullDirectiveArgs(oldSchema: GraphQLSchema, newSchema: GraphQLSchema): js.Array[BreakingChange] = js.native
  def findArgChanges(oldSchema: GraphQLSchema, newSchema: GraphQLSchema): Anon_BreakingChanges = js.native
  def findBreakingChanges(oldSchema: GraphQLSchema, newSchema: GraphQLSchema): js.Array[BreakingChange] = js.native
  def findDangerousChanges(oldSchema: GraphQLSchema, newSchema: GraphQLSchema): js.Array[DangerousChange] = js.native
  def findFieldsThatChangedTypeOnInputObjectTypes(oldSchema: GraphQLSchema, newSchema: GraphQLSchema): Anon_BreakingChanges = js.native
  def findFieldsThatChangedTypeOnObjectOrInterfaceTypes(oldSchema: GraphQLSchema, newSchema: GraphQLSchema): js.Array[BreakingChange] = js.native
  def findInterfacesAddedToObjectTypes(oldSchema: GraphQLSchema, newSchema: GraphQLSchema): js.Array[DangerousChange] = js.native
  def findInterfacesRemovedFromObjectTypes(oldSchema: GraphQLSchema, newSchema: GraphQLSchema): js.Array[BreakingChange] = js.native
  def findRemovedDirectiveArgs(oldSchema: GraphQLSchema, newSchema: GraphQLSchema): js.Array[BreakingChange] = js.native
  def findRemovedDirectiveLocations(oldSchema: GraphQLSchema, newSchema: GraphQLSchema): js.Array[BreakingChange] = js.native
  def findRemovedDirectives(oldSchema: GraphQLSchema, newSchema: GraphQLSchema): js.Array[BreakingChange] = js.native
  def findRemovedLocationsForDirective(oldDirective: GraphQLDirective, newDirective: GraphQLDirective): js.Array[DirectiveLocationEnum] = js.native
  def findRemovedTypes(oldSchema: GraphQLSchema, newSchema: GraphQLSchema): js.Array[BreakingChange] = js.native
  def findTypesAddedToUnions(oldSchema: GraphQLSchema, newSchema: GraphQLSchema): js.Array[DangerousChange] = js.native
  def findTypesRemovedFromUnions(oldSchema: GraphQLSchema, newSchema: GraphQLSchema): js.Array[BreakingChange] = js.native
  def findTypesThatChangedKind(oldSchema: GraphQLSchema, newSchema: GraphQLSchema): js.Array[BreakingChange] = js.native
  def findValuesAddedToEnums(oldSchema: GraphQLSchema, newSchema: GraphQLSchema): js.Array[DangerousChange] = js.native
  def findValuesRemovedFromEnums(oldSchema: GraphQLSchema, newSchema: GraphQLSchema): js.Array[BreakingChange] = js.native
}

