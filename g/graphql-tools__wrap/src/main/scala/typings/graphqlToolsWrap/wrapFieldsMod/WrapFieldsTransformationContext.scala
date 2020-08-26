package typings.graphqlToolsWrap.wrapFieldsMod

import typings.graphqlToolsWrap.anon.Alias
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WrapFieldsTransformationContext extends js.Object {
  var nextIndex: Double = js.native
  var paths: Record[String, Alias] = js.native
}

object WrapFieldsTransformationContext {
  @scala.inline
  def apply(nextIndex: Double, paths: Record[String, Alias]): WrapFieldsTransformationContext = {
    val __obj = js.Dynamic.literal(nextIndex = nextIndex.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrapFieldsTransformationContext]
  }
  @scala.inline
  implicit class WrapFieldsTransformationContextOps[Self <: WrapFieldsTransformationContext] (val x: Self) extends AnyVal {
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
    def setNextIndex(value: Double): Self = this.set("nextIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaths(value: Record[String, Alias]): Self = this.set("paths", value.asInstanceOf[js.Any])
  }
  
}

