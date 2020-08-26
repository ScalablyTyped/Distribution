package typings.graphqlToolsUtils.interfacesMod

import typings.graphql.mod.GraphQLSchema
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transform[T] extends js.Object {
  var transformRequest: js.UndefOr[RequestTransform[T]] = js.native
  var transformResult: js.UndefOr[ResultTransform[T]] = js.native
  var transformSchema: js.UndefOr[SchemaTransform] = js.native
}

object Transform {
  @scala.inline
  def apply[T](): Transform[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Transform[T]]
  }
  @scala.inline
  implicit class TransformOps[Self <: Transform[_], T] (val x: Self with Transform[T]) extends AnyVal {
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
    def setTransformRequest(
      value: (/* originalRequest */ Request, /* delegationContext */ js.UndefOr[Record[String, js.Any]], /* transformationContext */ js.UndefOr[T]) => Request
    ): Self = this.set("transformRequest", js.Any.fromFunction3(value))
    @scala.inline
    def deleteTransformRequest: Self = this.set("transformRequest", js.undefined)
    @scala.inline
    def setTransformResult(
      value: (/* originalResult */ ExecutionResult[Record[String, js.Any]], /* delegationContext */ js.UndefOr[Record[String, js.Any]], /* transformationContext */ js.UndefOr[T]) => ExecutionResult[Record[String, js.Any]]
    ): Self = this.set("transformResult", js.Any.fromFunction3(value))
    @scala.inline
    def deleteTransformResult: Self = this.set("transformResult", js.undefined)
    @scala.inline
    def setTransformSchema(value: /* originalSchema */ GraphQLSchema => GraphQLSchema): Self = this.set("transformSchema", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTransformSchema: Self = this.set("transformSchema", js.undefined)
  }
  
}

