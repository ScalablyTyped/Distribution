package typings
package atIonicCoreLib.distTypesComponentsContentContentDashInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait ScrollDetail extends ScrollBaseDetail {
  var scrollLeft: scala.Double
  var scrollTop: scala.Double
}

object ScrollDetail {
  @scala.inline
  def apply(isScrolling: scala.Boolean, scrollLeft: scala.Double, scrollTop: scala.Double): ScrollDetail = {
    val __obj = js.Dynamic.literal(isScrolling = isScrolling, scrollLeft = scrollLeft, scrollTop = scrollTop)
  
    __obj.asInstanceOf[ScrollDetail]
  }
}

