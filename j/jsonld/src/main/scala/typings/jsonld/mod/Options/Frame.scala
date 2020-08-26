package typings.jsonld.mod.Options

import typings.jsonld.jsonldStrings.`@always`
import typings.jsonld.jsonldStrings.`@last`
import typings.jsonld.jsonldStrings.`@link`
import typings.jsonld.jsonldStrings.`@never`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Frame extends js.Object {
  var embed: js.UndefOr[`@last` | `@always` | `@never` | `@link`] = js.native
  var explicit: js.UndefOr[Boolean] = js.native
  var omitDefault: js.UndefOr[Boolean] = js.native
  var requireAll: js.UndefOr[Boolean] = js.native
}

object Frame {
  @scala.inline
  def apply(): Frame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Frame]
  }
  @scala.inline
  implicit class FrameOps[Self <: Frame] (val x: Self) extends AnyVal {
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
    def setEmbed(value: `@last` | `@always` | `@never` | `@link`): Self = this.set("embed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmbed: Self = this.set("embed", js.undefined)
    @scala.inline
    def setExplicit(value: Boolean): Self = this.set("explicit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExplicit: Self = this.set("explicit", js.undefined)
    @scala.inline
    def setOmitDefault(value: Boolean): Self = this.set("omitDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOmitDefault: Self = this.set("omitDefault", js.undefined)
    @scala.inline
    def setRequireAll(value: Boolean): Self = this.set("requireAll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequireAll: Self = this.set("requireAll", js.undefined)
  }
  
}

