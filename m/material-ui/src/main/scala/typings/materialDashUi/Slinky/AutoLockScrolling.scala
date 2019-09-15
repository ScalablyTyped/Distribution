package typings.materialDashUi.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.materialDashUi.internalAutoLockScrollingMod.AutoLockScrollingProps
import typings.materialDashUi.internalAutoLockScrollingMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: children */
object AutoLockScrolling
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.materialDashUi.internalAutoLockScrollingMod.default].asInstanceOf[String | js.Object]
  def apply(lock: Boolean): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(lock = lock)
  
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = AutoLockScrollingProps
}

