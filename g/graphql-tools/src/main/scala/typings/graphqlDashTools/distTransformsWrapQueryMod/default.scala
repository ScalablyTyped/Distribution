package typings.graphqlDashTools.distTransformsWrapQueryMod

import typings.graphqlDashTools.distInterfacesMod.Request
import typings.graphqlDashTools.distInterfacesMod.Result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/transforms/WrapQuery", JSImport.Default)
@js.native
class default protected () extends WrapQuery {
  def this(path: js.Array[String], wrapper: QueryWrapper, extractor: js.Function1[/* result */ js.Any, _]) = this()
  /* CompleteClass */
  override var extractor: js.Any = js.native
  /* CompleteClass */
  override var path: js.Any = js.native
  /* CompleteClass */
  override var wrapper: js.Any = js.native
  /* CompleteClass */
  @JSName("transformRequest")
  override def transformRequest_MWrapQuery(originalRequest: Request): Request = js.native
  /* CompleteClass */
  @JSName("transformResult")
  override def transformResult_MWrapQuery(originalResult: Result): Result = js.native
}

