package typings.imagemagickNative.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICompositeOptions extends js.Object {
  var compositeData: Buffer = js.native
  var debug: js.UndefOr[Boolean] = js.native
  var gravity: js.UndefOr[String] = js.native
  var ignoreWarnings: js.UndefOr[Boolean] = js.native
  var srcData: Buffer = js.native
}

object ICompositeOptions {
  @scala.inline
  def apply(compositeData: Buffer, srcData: Buffer): ICompositeOptions = {
    val __obj = js.Dynamic.literal(compositeData = compositeData.asInstanceOf[js.Any], srcData = srcData.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICompositeOptions]
  }
  @scala.inline
  implicit class ICompositeOptionsOps[Self <: ICompositeOptions] (val x: Self) extends AnyVal {
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
    def setCompositeData(value: Buffer): Self = this.set("compositeData", value.asInstanceOf[js.Any])
    @scala.inline
    def setSrcData(value: Buffer): Self = this.set("srcData", value.asInstanceOf[js.Any])
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setGravity(value: String): Self = this.set("gravity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGravity: Self = this.set("gravity", js.undefined)
    @scala.inline
    def setIgnoreWarnings(value: Boolean): Self = this.set("ignoreWarnings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreWarnings: Self = this.set("ignoreWarnings", js.undefined)
  }
  
}

