package typings.materialUi.MaterialUI

import typings.react.mod.HTMLAttributes
import typings.react.mod.Key
import typings.react.mod.LegacyRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.react.mod.Props because var conflicts: children. Inlined key, ref */ @js.native
trait PaperProps
  extends HTMLAttributes[js.Object] {
  var circle: js.UndefOr[Boolean] = js.native
  var height: js.UndefOr[Double | String] = js.native
  var key: js.UndefOr[Key] = js.native
  var ref: js.UndefOr[LegacyRef[Paper]] = js.native
  var rounded: js.UndefOr[Boolean] = js.native
  var transitionEnabled: js.UndefOr[Boolean] = js.native
  var width: js.UndefOr[Double | String] = js.native
  var zDepth: js.UndefOr[Double] = js.native
}

object PaperProps {
  @scala.inline
  def apply(): PaperProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaperProps]
  }
  @scala.inline
  implicit class PaperPropsOps[Self <: PaperProps] (val x: Self) extends AnyVal {
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
    def setCircle(value: Boolean): Self = this.set("circle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCircle: Self = this.set("circle", js.undefined)
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setKey(value: Key): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setRefFunction1(value: /* instance */ Paper | Null => Unit): Self = this.set("ref", js.Any.fromFunction1(value))
    @scala.inline
    def setRef(value: LegacyRef[Paper]): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    @scala.inline
    def setRefNull: Self = this.set("ref", null)
    @scala.inline
    def setRounded(value: Boolean): Self = this.set("rounded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRounded: Self = this.set("rounded", js.undefined)
    @scala.inline
    def setTransitionEnabled(value: Boolean): Self = this.set("transitionEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitionEnabled: Self = this.set("transitionEnabled", js.undefined)
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setZDepth(value: Double): Self = this.set("zDepth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZDepth: Self = this.set("zDepth", js.undefined)
  }
  
}

