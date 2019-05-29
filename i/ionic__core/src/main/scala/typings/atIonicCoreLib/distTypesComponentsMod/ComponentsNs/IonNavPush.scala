package typings
package atIonicCoreLib.distTypesComponentsMod.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonNavPush extends js.Object {
  /**
    * Component to navigate to
    */
  var component: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavComponent */ js.Any
  ] = js.undefined
  /**
    * Data you want to pass to the component as props
    */
  var componentProps: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentProps */ js.Any
  ] = js.undefined
}

object IonNavPush {
  @scala.inline
  def apply(
    component: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavComponent */ js.Any = null,
    componentProps: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentProps */ js.Any = null
  ): IonNavPush = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component)
    if (componentProps != null) __obj.updateDynamic("componentProps")(componentProps)
    __obj.asInstanceOf[IonNavPush]
  }
}

