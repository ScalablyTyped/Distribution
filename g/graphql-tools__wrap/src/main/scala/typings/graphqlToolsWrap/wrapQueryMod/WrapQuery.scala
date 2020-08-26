package typings.graphqlToolsWrap.wrapQueryMod

import typings.graphqlToolsUtils.interfacesMod.ExecutionResult
import typings.graphqlToolsUtils.interfacesMod.Request
import typings.graphqlToolsUtils.interfacesMod.Transform
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WrapQuery
  extends Transform[Record[String, js.Any]] {
  val extractor: js.Any = js.native
  val path: js.Any = js.native
  val wrapper: js.Any = js.native
  @JSName("transformRequest")
  def transformRequest_MWrapQuery(originalRequest: Request): Request = js.native
  @JSName("transformResult")
  def transformResult_MWrapQuery(originalResult: ExecutionResult[Record[String, _]]): ExecutionResult[Record[String, _]] = js.native
}

object WrapQuery {
  @scala.inline
  def apply(
    extractor: js.Any,
    path: js.Any,
    transformRequest: Request => Request,
    transformResult: ExecutionResult[Record[String, _]] => ExecutionResult[Record[String, _]],
    wrapper: js.Any
  ): WrapQuery = {
    val __obj = js.Dynamic.literal(extractor = extractor.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], transformRequest = js.Any.fromFunction1(transformRequest), transformResult = js.Any.fromFunction1(transformResult), wrapper = wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrapQuery]
  }
  @scala.inline
  implicit class WrapQueryOps[Self <: WrapQuery] (val x: Self) extends AnyVal {
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
    def setExtractor(value: js.Any): Self = this.set("extractor", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: js.Any): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransformRequest(value: Request => Request): Self = this.set("transformRequest", js.Any.fromFunction1(value))
    @scala.inline
    def setTransformResult(value: ExecutionResult[Record[String, _]] => ExecutionResult[Record[String, _]]): Self = this.set("transformResult", js.Any.fromFunction1(value))
    @scala.inline
    def setWrapper(value: js.Any): Self = this.set("wrapper", value.asInstanceOf[js.Any])
  }
  
}

