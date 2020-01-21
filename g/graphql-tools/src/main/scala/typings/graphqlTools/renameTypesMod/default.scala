package typings.graphqlTools.renameTypesMod

import typings.graphql.mod.GraphQLSchema
import typings.graphqlTools.interfacesMod.Request
import typings.graphqlTools.interfacesMod.Result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/transforms/RenameTypes", JSImport.Default)
@js.native
class default protected () extends RenameTypes {
  def this(renamer: js.Function1[/* name */ String, js.UndefOr[String]]) = this()
  def this(renamer: js.Function1[/* name */ String, js.UndefOr[String]], options: RenameOptions) = this()
  /* CompleteClass */
  override var renameBuiltins: js.Any = js.native
  /* CompleteClass */
  override var renameScalars: js.Any = js.native
  /* CompleteClass */
  override var renameTypes: js.Any = js.native
  /* CompleteClass */
  override var renamer: js.Any = js.native
  /* CompleteClass */
  override var reverseMap: js.Any = js.native
  /* CompleteClass */
  @JSName("transformRequest")
  override def transformRequest_MRenameTypes(originalRequest: Request): Request = js.native
  /* CompleteClass */
  @JSName("transformResult")
  override def transformResult_MRenameTypes(result: Result): Result = js.native
  /* CompleteClass */
  @JSName("transformSchema")
  override def transformSchema_MRenameTypes(originalSchema: GraphQLSchema): GraphQLSchema = js.native
}

