package typings.materialUiLab.skeletonSkeletonMod

import typings.materialUiLab.anon.Animation
import typings.materialUiLab.materialUiLabStrings.div
import typings.react.mod.ElementType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkeletonTypeMap[P, D /* <: ElementType[_] */] extends js.Object {
  var classKey: SkeletonClassKey = js.native
  var defaultComponent: div = js.native
  var props: P with Animation = js.native
}

object SkeletonTypeMap {
  @scala.inline
  def apply[P, /* <: typings.react.mod.ElementType[_] */ D](classKey: SkeletonClassKey, defaultComponent: div, props: P with Animation): SkeletonTypeMap[P, D] = {
    val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkeletonTypeMap[P, D]]
  }
  @scala.inline
  implicit class SkeletonTypeMapOps[Self <: SkeletonTypeMap[_, _], P, /* <: typings.react.mod.ElementType[_] */ D] (val x: Self with (SkeletonTypeMap[P, D])) extends AnyVal {
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
    def setClassKey(value: SkeletonClassKey): Self = this.set("classKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultComponent(value: div): Self = this.set("defaultComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def setProps(value: P with Animation): Self = this.set("props", value.asInstanceOf[js.Any])
  }
  
}

