package typings.atMaterialDashUiCore.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.atMaterialDashUiCore.rootRefMod.default
import typings.atMaterialDashUiCore.rootRefRootRefMod.RootRefProps
import typings.react.reactMod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RootRef
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.atMaterialDashUiCore.rootRefMod.default].asInstanceOf[String | js.Object]
  def apply[T](rootRef: (js.Function1[/* instance */ T | Null, Unit]) | RefObject[T] = null): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (rootRef != null) __obj.updateDynamic("rootRef")(rootRef.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = RootRefProps[js.Any]
}

