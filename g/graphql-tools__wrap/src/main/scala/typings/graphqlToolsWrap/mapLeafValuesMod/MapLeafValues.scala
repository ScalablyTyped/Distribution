package typings.graphqlToolsWrap.mapLeafValuesMod

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsUtils.interfacesMod.ExecutionResult
import typings.graphqlToolsUtils.interfacesMod.Request
import typings.graphqlToolsUtils.interfacesMod.Transform
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapLeafValues extends Transform[MapLeafValuesTransformationContext] {
  val inputValueTransformer: js.Any = js.native
  var originalSchema: js.Any = js.native
  val outputValueTransformer: js.Any = js.native
  val resultVisitorMap: js.Any = js.native
  var transformFieldNode: js.Any = js.native
  var transformOperations: js.Any = js.native
  var typeInfo: js.Any = js.native
  @JSName("transformRequest")
  def transformRequest_MMapLeafValues(originalRequest: Request): Request = js.native
  @JSName("transformRequest")
  def transformRequest_MMapLeafValues(
    originalRequest: Request,
    _delegationContext: js.UndefOr[scala.Nothing],
    transformationContext: MapLeafValuesTransformationContext
  ): Request = js.native
  @JSName("transformRequest")
  def transformRequest_MMapLeafValues(originalRequest: Request, _delegationContext: Record[String, _]): Request = js.native
  @JSName("transformRequest")
  def transformRequest_MMapLeafValues(
    originalRequest: Request,
    _delegationContext: Record[String, _],
    transformationContext: MapLeafValuesTransformationContext
  ): Request = js.native
  @JSName("transformResult")
  def transformResult_MMapLeafValues(originalResult: ExecutionResult[Record[String, _]]): js.Any = js.native
  @JSName("transformResult")
  def transformResult_MMapLeafValues(
    originalResult: ExecutionResult[Record[String, _]],
    _delegationContext: js.UndefOr[scala.Nothing],
    transformationContext: MapLeafValuesTransformationContext
  ): js.Any = js.native
  @JSName("transformResult")
  def transformResult_MMapLeafValues(originalResult: ExecutionResult[Record[String, _]], _delegationContext: Record[String, _]): js.Any = js.native
  @JSName("transformResult")
  def transformResult_MMapLeafValues(
    originalResult: ExecutionResult[Record[String, _]],
    _delegationContext: Record[String, _],
    transformationContext: MapLeafValuesTransformationContext
  ): js.Any = js.native
  @JSName("transformSchema")
  def transformSchema_MMapLeafValues(originalSchema: GraphQLSchema): GraphQLSchema = js.native
}

