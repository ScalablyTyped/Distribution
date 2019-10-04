package typings.atIonicReact.distTypesComponentsCreateControllerComponentMod

import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactControllerProps extends js.Object {
  var isOpen: Boolean
  var onDidDismiss: js.UndefOr[
    js.Function1[
      /* event */ CustomEvent[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify OverlayEventDetail */ _
      ], 
      Unit
    ]
  ] = js.undefined
}

object ReactControllerProps {
  @scala.inline
  def apply(
    isOpen: Boolean,
    onDidDismiss: /* event */ CustomEvent[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify OverlayEventDetail */ _
    ] => Unit = null
  ): ReactControllerProps = {
    val __obj = js.Dynamic.literal(isOpen = isOpen)
    if (onDidDismiss != null) __obj.updateDynamic("onDidDismiss")(js.Any.fromFunction1(onDidDismiss))
    __obj.asInstanceOf[ReactControllerProps]
  }
}

