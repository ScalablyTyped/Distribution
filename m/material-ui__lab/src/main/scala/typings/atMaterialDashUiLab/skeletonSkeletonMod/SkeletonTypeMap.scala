package typings.atMaterialDashUiLab.skeletonSkeletonMod

import typings.atMaterialDashUiLab.Anon_Circle
import typings.atMaterialDashUiLab.atMaterialDashUiLabStrings.div
import typings.react.reactMod.ElementType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkeletonTypeMap[P, D /* <: ElementType[_] */] extends js.Object {
  var classKey: SkeletonClassKey
  var defaultComponent: div
  var props: P with Anon_Circle
}

object SkeletonTypeMap {
  @scala.inline
  def apply[P, D /* <: ElementType[_] */](classKey: SkeletonClassKey, defaultComponent: div, props: P with Anon_Circle): SkeletonTypeMap[P, D] = {
    val __obj = js.Dynamic.literal(classKey = classKey, defaultComponent = defaultComponent, props = props.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SkeletonTypeMap[P, D]]
  }
}

