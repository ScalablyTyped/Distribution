package typings.atIonicCore.distTypesComponentsContentContentDashInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify GestureDetail * / any */ trait ScrollDetail extends ScrollBaseDetail {
  var scrollLeft: Double
  var scrollTop: Double
}

object ScrollDetail {
  @scala.inline
  def apply(isScrolling: Boolean, scrollLeft: Double, scrollTop: Double): ScrollDetail = {
    val __obj = js.Dynamic.literal(isScrolling = isScrolling.asInstanceOf[js.Any], scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ScrollDetail]
  }
}

