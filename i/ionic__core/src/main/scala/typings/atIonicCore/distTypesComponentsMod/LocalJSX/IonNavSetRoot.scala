package typings.atIonicCore.distTypesComponentsMod.LocalJSX

import typings.atIonicCore.atIonicCoreMod.ComponentProps
import typings.atIonicCore.distTypesComponentsNavNavDashInterfaceMod.NavComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonNavSetRoot extends js.Object {
  /**
    * Component you want to make root for the navigation stack
    */
  var component: js.UndefOr[NavComponent] = js.undefined
  /**
    * Data you want to pass to the component as props
    */
  var componentProps: js.UndefOr[ComponentProps[Null]] = js.undefined
}

object IonNavSetRoot {
  @scala.inline
  def apply(component: NavComponent = null, componentProps: ComponentProps[Null] = null): IonNavSetRoot = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (componentProps != null) __obj.updateDynamic("componentProps")(componentProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonNavSetRoot]
  }
}

