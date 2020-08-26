package typings.graphqlToolsWrap.renameRootTypesMod

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsUtils.interfacesMod.ExecutionResult
import typings.graphqlToolsUtils.interfacesMod.Request
import typings.graphqlToolsUtils.interfacesMod.Transform
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenameRootTypes
  extends Transform[Record[String, js.Any]] {
  var map: js.Any = js.native
  val renamer: js.Any = js.native
  var reverseMap: js.Any = js.native
  @JSName("transformRequest")
  def transformRequest_MRenameRootTypes(originalRequest: Request): Request = js.native
  @JSName("transformResult")
  def transformResult_MRenameRootTypes(result: ExecutionResult[Record[String, _]]): ExecutionResult[Record[String, _]] = js.native
  @JSName("transformSchema")
  def transformSchema_MRenameRootTypes(originalSchema: GraphQLSchema): GraphQLSchema = js.native
}

object RenameRootTypes {
  @scala.inline
  def apply(
    map: js.Any,
    renamer: js.Any,
    reverseMap: js.Any,
    transformRequest: Request => Request,
    transformResult: ExecutionResult[Record[String, _]] => ExecutionResult[Record[String, _]],
    transformSchema: GraphQLSchema => GraphQLSchema
  ): RenameRootTypes = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], renamer = renamer.asInstanceOf[js.Any], reverseMap = reverseMap.asInstanceOf[js.Any], transformRequest = js.Any.fromFunction1(transformRequest), transformResult = js.Any.fromFunction1(transformResult), transformSchema = js.Any.fromFunction1(transformSchema))
    __obj.asInstanceOf[RenameRootTypes]
  }
  @scala.inline
  implicit class RenameRootTypesOps[Self <: RenameRootTypes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMap(value: js.Any): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenamer(value: js.Any): Self = this.set("renamer", value.asInstanceOf[js.Any])
    @scala.inline
    def setReverseMap(value: js.Any): Self = this.set("reverseMap", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransformRequest(value: Request => Request): Self = this.set("transformRequest", js.Any.fromFunction1(value))
    @scala.inline
    def setTransformResult(value: ExecutionResult[Record[String, _]] => ExecutionResult[Record[String, _]]): Self = this.set("transformResult", js.Any.fromFunction1(value))
    @scala.inline
    def setTransformSchema(value: GraphQLSchema => GraphQLSchema): Self = this.set("transformSchema", js.Any.fromFunction1(value))
  }
  
}

