package typings.atIonicReact.distTypesComponentsIonAppMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonAppProps extends js.Object {
  var initialConfig: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify IonicConfig */ js.Any
  ] = js.undefined
}

object IonAppProps {
  @scala.inline
  def apply(
    initialConfig: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify IonicConfig */ js.Any = null
  ): IonAppProps = {
    val __obj = js.Dynamic.literal()
    if (initialConfig != null) __obj.updateDynamic("initialConfig")(initialConfig)
    __obj.asInstanceOf[IonAppProps]
  }
}

