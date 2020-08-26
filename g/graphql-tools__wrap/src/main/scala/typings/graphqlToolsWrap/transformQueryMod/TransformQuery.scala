package typings.graphqlToolsWrap.transformQueryMod

import typings.graphqlToolsUtils.interfacesMod.ExecutionResult
import typings.graphqlToolsUtils.interfacesMod.Request
import typings.graphqlToolsUtils.interfacesMod.Transform
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransformQuery
  extends Transform[Record[String, js.Any]] {
  val errorPathTransformer: js.Any = js.native
  val fragments: js.Any = js.native
  val path: js.Any = js.native
  val queryTransformer: js.Any = js.native
  val resultTransformer: js.Any = js.native
  var transformData: js.Any = js.native
  var transformErrors: js.Any = js.native
  @JSName("transformRequest")
  def transformRequest_MTransformQuery(originalRequest: Request): Request = js.native
  @JSName("transformResult")
  def transformResult_MTransformQuery(originalResult: ExecutionResult[Record[String, _]]): ExecutionResult[Record[String, _]] = js.native
}

object TransformQuery {
  @scala.inline
  def apply(
    errorPathTransformer: js.Any,
    fragments: js.Any,
    path: js.Any,
    queryTransformer: js.Any,
    resultTransformer: js.Any,
    transformData: js.Any,
    transformErrors: js.Any,
    transformRequest: Request => Request,
    transformResult: ExecutionResult[Record[String, _]] => ExecutionResult[Record[String, _]]
  ): TransformQuery = {
    val __obj = js.Dynamic.literal(errorPathTransformer = errorPathTransformer.asInstanceOf[js.Any], fragments = fragments.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], queryTransformer = queryTransformer.asInstanceOf[js.Any], resultTransformer = resultTransformer.asInstanceOf[js.Any], transformData = transformData.asInstanceOf[js.Any], transformErrors = transformErrors.asInstanceOf[js.Any], transformRequest = js.Any.fromFunction1(transformRequest), transformResult = js.Any.fromFunction1(transformResult))
    __obj.asInstanceOf[TransformQuery]
  }
  @scala.inline
  implicit class TransformQueryOps[Self <: TransformQuery] (val x: Self) extends AnyVal {
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
    def setErrorPathTransformer(value: js.Any): Self = this.set("errorPathTransformer", value.asInstanceOf[js.Any])
    @scala.inline
    def setFragments(value: js.Any): Self = this.set("fragments", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: js.Any): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueryTransformer(value: js.Any): Self = this.set("queryTransformer", value.asInstanceOf[js.Any])
    @scala.inline
    def setResultTransformer(value: js.Any): Self = this.set("resultTransformer", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransformData(value: js.Any): Self = this.set("transformData", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransformErrors(value: js.Any): Self = this.set("transformErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransformRequest(value: Request => Request): Self = this.set("transformRequest", js.Any.fromFunction1(value))
    @scala.inline
    def setTransformResult(value: ExecutionResult[Record[String, _]] => ExecutionResult[Record[String, _]]): Self = this.set("transformResult", js.Any.fromFunction1(value))
  }
  
}

