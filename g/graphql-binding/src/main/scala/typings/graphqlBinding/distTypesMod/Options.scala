package typings.graphqlBinding.distTypesMod

import typings.graphqlToolsUtils.interfacesMod.Transform
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var context: js.UndefOr[Context] = js.native
  var transforms: js.UndefOr[js.Array[Transform[Record[String, _]]]] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setContext(value: Context): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setTransformsVarargs(value: (Transform[Record[String, js.Any]])*): Self = this.set("transforms", js.Array(value :_*))
    @scala.inline
    def setTransforms(value: js.Array[Transform[Record[String, _]]]): Self = this.set("transforms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransforms: Self = this.set("transforms", js.undefined)
  }
  
}

