package typings.jointjs.mod.attributes

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NativeSVGAttributes
  extends SVGCoreAttributes
     with SVGPresentationAttributes
     with SVGConditionalProcessingAttributes
     with SVGXLinkAttributes
     with /* key */ StringDictionary[js.Any] {
  var `class`: js.UndefOr[String] = js.native
  var externalResourcesRequired: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[js.Any] = js.native
  var transform: js.UndefOr[String] = js.native
}

object NativeSVGAttributes {
  @scala.inline
  def apply(): NativeSVGAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NativeSVGAttributes]
  }
  @scala.inline
  implicit class NativeSVGAttributesOps[Self <: NativeSVGAttributes] (val x: Self) extends AnyVal {
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
    def setClass(value: String): Self = this.set("class", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClass: Self = this.set("class", js.undefined)
    @scala.inline
    def setExternalResourcesRequired(value: Boolean): Self = this.set("externalResourcesRequired", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalResourcesRequired: Self = this.set("externalResourcesRequired", js.undefined)
    @scala.inline
    def setStyle(value: js.Any): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTransform(value: String): Self = this.set("transform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
  }
  
}

