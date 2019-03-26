package typings
package graphqlDashToolsLib.distTransformsRenameTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/transforms/RenameTypes", JSImport.Default)
@js.native
class default protected () extends RenameTypes {
  def this(renamer: js.Function1[/* name */ java.lang.String, js.UndefOr[java.lang.String]]) = this()
  def this(renamer: js.Function1[/* name */ java.lang.String, js.UndefOr[java.lang.String]], options: RenameOptions) = this()
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
  override def transformRequest_MRenameTypes(originalRequest: graphqlDashToolsLib.distInterfacesMod.Request): graphqlDashToolsLib.distInterfacesMod.Request = js.native
  /* CompleteClass */
  @JSName("transformResult")
  override def transformResult_MRenameTypes(result: graphqlDashToolsLib.distInterfacesMod.Result): graphqlDashToolsLib.distInterfacesMod.Result = js.native
  /* CompleteClass */
  @JSName("transformSchema")
  override def transformSchema_MRenameTypes(originalSchema: graphqlLib.graphqlMod.GraphQLSchema): graphqlLib.graphqlMod.GraphQLSchema = js.native
}

