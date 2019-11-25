package typings.atIonicCore.distTypesComponentsMod.LocalJSX

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonNavSetRoot extends js.Object {
  /**
    * Component you want to make root for the navigation stack
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

object IonNavSetRoot {
  @scala.inline
  def apply(
    component: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavComponent */ js.Any = null,
    componentProps: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentProps */ js.Any = null
  ): IonNavSetRoot = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (componentProps != null) __obj.updateDynamic("componentProps")(componentProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonNavSetRoot]
  }
}

