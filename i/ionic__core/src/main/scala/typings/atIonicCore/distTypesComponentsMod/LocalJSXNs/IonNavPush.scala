package typings.atIonicCore.distTypesComponentsMod.LocalJSXNs

import typings.atIonicCore.distTypesComponentsNavNavDashInterfaceMod.NavComponent
import typings.atIonicCore.distTypesInterfaceMod.ComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonNavPush extends js.Object {
  /**
    * Component to navigate to
    */
  var component: js.UndefOr[NavComponent] = js.undefined
  /**
    * Data you want to pass to the component as props
    */
  var componentProps: js.UndefOr[ComponentProps[Null]] = js.undefined
}

object IonNavPush {
  @scala.inline
  def apply(component: NavComponent = null, componentProps: ComponentProps[Null] = null): IonNavPush = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (componentProps != null) __obj.updateDynamic("componentProps")(componentProps)
    __obj.asInstanceOf[IonNavPush]
  }
}

