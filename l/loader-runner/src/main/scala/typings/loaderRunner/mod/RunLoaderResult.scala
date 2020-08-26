package typings.loaderRunner.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunLoaderResult extends js.Object {
  var cacheable: Boolean = js.native
  var contextDependencies: js.Array[String] = js.native
  var fileDependencies: js.Array[String] = js.native
  var resourceBuffer: js.UndefOr[Buffer | Null] = js.native
  var result: js.UndefOr[js.Array[Buffer | Null]] = js.native
}

object RunLoaderResult {
  @scala.inline
  def apply(cacheable: Boolean, contextDependencies: js.Array[String], fileDependencies: js.Array[String]): RunLoaderResult = {
    val __obj = js.Dynamic.literal(cacheable = cacheable.asInstanceOf[js.Any], contextDependencies = contextDependencies.asInstanceOf[js.Any], fileDependencies = fileDependencies.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunLoaderResult]
  }
  @scala.inline
  implicit class RunLoaderResultOps[Self <: RunLoaderResult] (val x: Self) extends AnyVal {
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
    def setCacheable(value: Boolean): Self = this.set("cacheable", value.asInstanceOf[js.Any])
    @scala.inline
    def setContextDependenciesVarargs(value: String*): Self = this.set("contextDependencies", js.Array(value :_*))
    @scala.inline
    def setContextDependencies(value: js.Array[String]): Self = this.set("contextDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileDependenciesVarargs(value: String*): Self = this.set("fileDependencies", js.Array(value :_*))
    @scala.inline
    def setFileDependencies(value: js.Array[String]): Self = this.set("fileDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceBuffer(value: Buffer): Self = this.set("resourceBuffer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceBuffer: Self = this.set("resourceBuffer", js.undefined)
    @scala.inline
    def setResourceBufferNull: Self = this.set("resourceBuffer", null)
    @scala.inline
    def setResultVarargs(value: (Buffer | Null)*): Self = this.set("result", js.Array(value :_*))
    @scala.inline
    def setResult(value: js.Array[Buffer | Null]): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
  }
  
}

