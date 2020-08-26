package typings.mapsjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BleedRatio extends js.Object {
  var bleedRatio: js.UndefOr[Double] = js.native
  var clipToRenderBounds: js.UndefOr[Boolean] = js.native
  var fieldNames: js.UndefOr[js.Array[String]] = js.native
  var simplifyEnabled: js.UndefOr[Boolean] = js.native
  var version: js.UndefOr[String] = js.native
}

object BleedRatio {
  @scala.inline
  def apply(): BleedRatio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BleedRatio]
  }
  @scala.inline
  implicit class BleedRatioOps[Self <: BleedRatio] (val x: Self) extends AnyVal {
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
    def setBleedRatio(value: Double): Self = this.set("bleedRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBleedRatio: Self = this.set("bleedRatio", js.undefined)
    @scala.inline
    def setClipToRenderBounds(value: Boolean): Self = this.set("clipToRenderBounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClipToRenderBounds: Self = this.set("clipToRenderBounds", js.undefined)
    @scala.inline
    def setFieldNamesVarargs(value: String*): Self = this.set("fieldNames", js.Array(value :_*))
    @scala.inline
    def setFieldNames(value: js.Array[String]): Self = this.set("fieldNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldNames: Self = this.set("fieldNames", js.undefined)
    @scala.inline
    def setSimplifyEnabled(value: Boolean): Self = this.set("simplifyEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSimplifyEnabled: Self = this.set("simplifyEnabled", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

