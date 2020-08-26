package typings.jss.anon

import typings.jss.mod.CreateGenerateIdOptions
import typings.jss.mod.CreateGenerateId_
import typings.jss.mod.GenerateId
import typings.jss.mod.InsertionPoint
import typings.jss.mod.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<jss.jss.JssOptions> */
@js.native
trait PartialJssOptions extends js.Object {
  var Renderer: js.UndefOr[Instantiable | Null] = js.native
  var createGenerateId: js.UndefOr[CreateGenerateId_] = js.native
  var id: js.UndefOr[CreateGenerateIdOptions] = js.native
  var insertionPoint: js.UndefOr[InsertionPoint] = js.native
  var plugins: js.UndefOr[js.Array[Plugin]] = js.native
}

object PartialJssOptions {
  @scala.inline
  def apply(): PartialJssOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialJssOptions]
  }
  @scala.inline
  implicit class PartialJssOptionsOps[Self <: PartialJssOptions] (val x: Self) extends AnyVal {
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
    def setRenderer(value: Instantiable): Self = this.set("Renderer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderer: Self = this.set("Renderer", js.undefined)
    @scala.inline
    def setRendererNull: Self = this.set("Renderer", null)
    @scala.inline
    def setCreateGenerateId(value: /* options */ js.UndefOr[CreateGenerateIdOptions] => GenerateId): Self = this.set("createGenerateId", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCreateGenerateId: Self = this.set("createGenerateId", js.undefined)
    @scala.inline
    def setId(value: CreateGenerateIdOptions): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInsertionPoint(value: InsertionPoint): Self = this.set("insertionPoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsertionPoint: Self = this.set("insertionPoint", js.undefined)
    @scala.inline
    def setPluginsVarargs(value: Plugin*): Self = this.set("plugins", js.Array(value :_*))
    @scala.inline
    def setPlugins(value: js.Array[Plugin]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
  }
  
}

