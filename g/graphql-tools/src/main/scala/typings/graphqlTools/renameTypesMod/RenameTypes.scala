package typings.graphqlTools.renameTypesMod

import typings.graphql.mod.GraphQLSchema
import typings.graphqlTools.interfacesMod.Request
import typings.graphqlTools.interfacesMod.Result
import typings.graphqlTools.interfacesMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenameTypes extends Transform {
  var renameBuiltins: js.Any
  var renameScalars: js.Any
  var renameTypes: js.Any
  var renamer: js.Any
  var reverseMap: js.Any
  @JSName("transformRequest")
  def transformRequest_MRenameTypes(originalRequest: Request): Request
  @JSName("transformResult")
  def transformResult_MRenameTypes(result: Result): Result
  @JSName("transformSchema")
  def transformSchema_MRenameTypes(originalSchema: GraphQLSchema): GraphQLSchema
}

object RenameTypes {
  @scala.inline
  def apply(
    renameBuiltins: js.Any,
    renameScalars: js.Any,
    renameTypes: js.Any,
    renamer: js.Any,
    reverseMap: js.Any,
    transformRequest: Request => Request,
    transformResult: Result => Result,
    transformSchema: GraphQLSchema => GraphQLSchema
  ): RenameTypes = {
    val __obj = js.Dynamic.literal(renameBuiltins = renameBuiltins.asInstanceOf[js.Any], renameScalars = renameScalars.asInstanceOf[js.Any], renameTypes = renameTypes.asInstanceOf[js.Any], renamer = renamer.asInstanceOf[js.Any], reverseMap = reverseMap.asInstanceOf[js.Any], transformRequest = js.Any.fromFunction1(transformRequest), transformResult = js.Any.fromFunction1(transformResult), transformSchema = js.Any.fromFunction1(transformSchema))
    __obj.asInstanceOf[RenameTypes]
  }
}

