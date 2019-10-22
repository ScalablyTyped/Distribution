package typings.atIonicReact.distTypesComponentsNavigationIonTabsMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify LocalJSX.IonTabs * / any */ trait Props extends js.Object {
  var children: ReactNode
}

object Props {
  @scala.inline
  def apply(children: ReactNode = null): Props = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

