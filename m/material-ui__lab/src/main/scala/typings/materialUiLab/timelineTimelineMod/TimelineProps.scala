package typings.materialUiLab.timelineTimelineMod

import typings.materialUiLab.anon.PartialClassNameMapTimeli
import typings.materialUiLab.materialUiLabStrings.alternate
import typings.materialUiLab.materialUiLabStrings.left
import typings.materialUiLab.materialUiLabStrings.right
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent @material-ui/core.@material-ui/core.StandardProps<{}, @material-ui/lab.@material-ui/lab/Timeline/Timeline.TimelineClassKey, never> */
@js.native
trait TimelineProps extends js.Object {
  /**
    * The position where the timeline's content should appear.
    */
  var align: js.UndefOr[left | right | alternate] = js.native
  /**
    * The content of the component.
    */
  var children: js.UndefOr[ReactNode] = js.native
  var className: js.UndefOr[String] = js.native
  var classes: js.UndefOr[PartialClassNameMapTimeli] = js.native
  var innerRef: js.UndefOr[Ref[_] | RefObject[_]] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object TimelineProps {
  @scala.inline
  def apply(): TimelineProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimelineProps]
  }
  @scala.inline
  implicit class TimelinePropsOps[Self <: TimelineProps] (val x: Self) extends AnyVal {
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
    def setAlign(value: left | right | alternate): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setClasses(value: PartialClassNameMapTimeli): Self = this.set("classes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    @scala.inline
    def setInnerRefFunction1(value: /* instance */ _ | Null => Unit): Self = this.set("innerRef", js.Any.fromFunction1(value))
    @scala.inline
    def setInnerRef(value: Ref[_] | RefObject[_]): Self = this.set("innerRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerRef: Self = this.set("innerRef", js.undefined)
    @scala.inline
    def setInnerRefNull: Self = this.set("innerRef", null)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

