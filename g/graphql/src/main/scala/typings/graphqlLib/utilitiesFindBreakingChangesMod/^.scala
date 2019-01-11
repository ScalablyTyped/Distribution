package typings
package graphqlLib.utilitiesFindBreakingChangesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/utilities/findBreakingChanges", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val BreakingChangeType: graphqlLib.utilitiesFindBreakingChangesMod._BreakingChangeType = js.native
  val DangerousChangeType: graphqlLib.utilitiesFindBreakingChangesMod._DangerousChangeType = js.native
  def findAddedNonNullDirectiveArgs(
    oldSchema: graphqlLib.typeSchemaMod.GraphQLSchema,
    newSchema: graphqlLib.typeSchemaMod.GraphQLSchema
  ): js.Array[graphqlLib.utilitiesFindBreakingChangesMod.BreakingChange] = js.native
  def findArgChanges(
    oldSchema: graphqlLib.typeSchemaMod.GraphQLSchema,
    newSchema: graphqlLib.typeSchemaMod.GraphQLSchema
  ): graphqlLib.Anon_BreakingChanges = js.native
  def findBreakingChanges(
    oldSchema: graphqlLib.typeSchemaMod.GraphQLSchema,
    newSchema: graphqlLib.typeSchemaMod.GraphQLSchema
  ): js.Array[graphqlLib.utilitiesFindBreakingChangesMod.BreakingChange] = js.native
  def findDangerousChanges(
    oldSchema: graphqlLib.typeSchemaMod.GraphQLSchema,
    newSchema: graphqlLib.typeSchemaMod.GraphQLSchema
  ): js.Array[graphqlLib.utilitiesFindBreakingChangesMod.DangerousChange] = js.native
  def findFieldsThatChangedTypeOnInputObjectTypes(
    oldSchema: graphqlLib.typeSchemaMod.GraphQLSchema,
    newSchema: graphqlLib.typeSchemaMod.GraphQLSchema
  ): graphqlLib.Anon_BreakingChanges = js.native
  def findFieldsThatChangedTypeOnObjectOrInterfaceTypes(
    oldSchema: graphqlLib.typeSchemaMod.GraphQLSchema,
    newSchema: graphqlLib.typeSchemaMod.GraphQLSchema
  ): js.Array[graphqlLib.utilitiesFindBreakingChangesMod.BreakingChange] = js.native
  def findInterfacesAddedToObjectTypes(
    oldSchema: graphqlLib.typeSchemaMod.GraphQLSchema,
    newSchema: graphqlLib.typeSchemaMod.GraphQLSchema
  ): js.Array[graphqlLib.utilitiesFindBreakingChangesMod.DangerousChange] = js.native
  def findInterfacesRemovedFromObjectTypes(
    oldSchema: graphqlLib.typeSchemaMod.GraphQLSchema,
    newSchema: graphqlLib.typeSchemaMod.GraphQLSchema
  ): js.Array[graphqlLib.utilitiesFindBreakingChangesMod.BreakingChange] = js.native
  def findRemovedDirectiveArgs(
    oldSchema: graphqlLib.typeSchemaMod.GraphQLSchema,
    newSchema: graphqlLib.typeSchemaMod.GraphQLSchema
  ): js.Array[graphqlLib.utilitiesFindBreakingChangesMod.BreakingChange] = js.native
  def findRemovedDirectiveLocations(
    oldSchema: graphqlLib.typeSchemaMod.GraphQLSchema,
    newSchema: graphqlLib.typeSchemaMod.GraphQLSchema
  ): js.Array[graphqlLib.utilitiesFindBreakingChangesMod.BreakingChange] = js.native
  def findRemovedDirectives(
    oldSchema: graphqlLib.typeSchemaMod.GraphQLSchema,
    newSchema: graphqlLib.typeSchemaMod.GraphQLSchema
  ): js.Array[graphqlLib.utilitiesFindBreakingChangesMod.BreakingChange] = js.native
  def findRemovedLocationsForDirective(
    oldDirective: graphqlLib.typeDirectivesMod.GraphQLDirective,
    newDirective: graphqlLib.typeDirectivesMod.GraphQLDirective
  ): js.Array[graphqlLib.languageDirectiveLocationMod.DirectiveLocationEnum] = js.native
  def findRemovedTypes(
    oldSchema: graphqlLib.typeSchemaMod.GraphQLSchema,
    newSchema: graphqlLib.typeSchemaMod.GraphQLSchema
  ): js.Array[graphqlLib.utilitiesFindBreakingChangesMod.BreakingChange] = js.native
  def findTypesAddedToUnions(
    oldSchema: graphqlLib.typeSchemaMod.GraphQLSchema,
    newSchema: graphqlLib.typeSchemaMod.GraphQLSchema
  ): js.Array[graphqlLib.utilitiesFindBreakingChangesMod.DangerousChange] = js.native
  def findTypesRemovedFromUnions(
    oldSchema: graphqlLib.typeSchemaMod.GraphQLSchema,
    newSchema: graphqlLib.typeSchemaMod.GraphQLSchema
  ): js.Array[graphqlLib.utilitiesFindBreakingChangesMod.BreakingChange] = js.native
  def findTypesThatChangedKind(
    oldSchema: graphqlLib.typeSchemaMod.GraphQLSchema,
    newSchema: graphqlLib.typeSchemaMod.GraphQLSchema
  ): js.Array[graphqlLib.utilitiesFindBreakingChangesMod.BreakingChange] = js.native
  def findValuesAddedToEnums(
    oldSchema: graphqlLib.typeSchemaMod.GraphQLSchema,
    newSchema: graphqlLib.typeSchemaMod.GraphQLSchema
  ): js.Array[graphqlLib.utilitiesFindBreakingChangesMod.DangerousChange] = js.native
  def findValuesRemovedFromEnums(
    oldSchema: graphqlLib.typeSchemaMod.GraphQLSchema,
    newSchema: graphqlLib.typeSchemaMod.GraphQLSchema
  ): js.Array[graphqlLib.utilitiesFindBreakingChangesMod.BreakingChange] = js.native
}

