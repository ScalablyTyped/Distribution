package typings.atIonicCore.distTypesComponentsMod.Components

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonNavLink extends js.Object {
  /**
    * Component to navigate to. Only used if the `routerDirection` is `"forward"` or `"root"`.
    */
  var component: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavComponent */ js.Any
  ] = js.undefined
  /**
    * Data you want to pass to the component as props. Only used if the `"routerDirection"` is `"forward"` or `"root"`.
    */
  var componentProps: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentProps */ js.Any
  ] = js.undefined
  /**
    * The transition direction when navigating to another page.
    */
  var routerDirection: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RouterDirection */ js.Any
}

object IonNavLink {
  @scala.inline
  def apply(
    routerDirection: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RouterDirection */ js.Any,
    component: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavComponent */ js.Any = null,
    componentProps: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentProps */ js.Any = null
  ): IonNavLink = {
    val __obj = js.Dynamic.literal(routerDirection = routerDirection.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (componentProps != null) __obj.updateDynamic("componentProps")(componentProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonNavLink]
  }
}

