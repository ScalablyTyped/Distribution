package typings
package graphqlDashToolsLib.distTransformsRenameTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenameTypes
  extends graphqlDashToolsLib.distInterfacesMod.Transform {
  var renameBuiltins: js.Any
  var renameScalars: js.Any
  var renameTypes: js.Any
  var renamer: js.Any
  var reverseMap: js.Any
  @JSName("transformRequest")
  def transformRequest_MRenameTypes(originalRequest: graphqlDashToolsLib.distInterfacesMod.Request): graphqlDashToolsLib.distInterfacesMod.Request
  @JSName("transformResult")
  def transformResult_MRenameTypes(result: graphqlDashToolsLib.distInterfacesMod.Result): graphqlDashToolsLib.distInterfacesMod.Result
  @JSName("transformSchema")
  def transformSchema_MRenameTypes(originalSchema: graphqlLib.graphqlMod.GraphQLSchema): graphqlLib.graphqlMod.GraphQLSchema
}

object RenameTypes {
  @scala.inline
  def apply(
    renameBuiltins: js.Any,
    renameScalars: js.Any,
    renameTypes: js.Any,
    renamer: js.Any,
    reverseMap: js.Any,
    transformRequest: graphqlDashToolsLib.distInterfacesMod.Request => graphqlDashToolsLib.distInterfacesMod.Request,
    transformResult: graphqlDashToolsLib.distInterfacesMod.Result => graphqlDashToolsLib.distInterfacesMod.Result,
    transformSchema: graphqlLib.graphqlMod.GraphQLSchema => graphqlLib.graphqlMod.GraphQLSchema
  ): RenameTypes = {
    val __obj = js.Dynamic.literal(renameBuiltins = renameBuiltins, renameScalars = renameScalars, renameTypes = renameTypes, renamer = renamer, reverseMap = reverseMap, transformRequest = js.Any.fromFunction1(transformRequest), transformResult = js.Any.fromFunction1(transformResult), transformSchema = js.Any.fromFunction1(transformSchema))
  
    __obj.asInstanceOf[RenameTypes]
  }
}

