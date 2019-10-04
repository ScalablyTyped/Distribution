package typings.atIonicReact.distTypesComponentsCreateOverlayComponentMod

import typings.react.reactMod.ReactNode
import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactOverlayProps extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
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

object ReactOverlayProps {
  @scala.inline
  def apply(
    isOpen: Boolean,
    children: ReactNode = null,
    onDidDismiss: /* event */ CustomEvent[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify OverlayEventDetail */ _
    ] => Unit = null
  ): ReactOverlayProps = {
    val __obj = js.Dynamic.literal(isOpen = isOpen)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (onDidDismiss != null) __obj.updateDynamic("onDidDismiss")(js.Any.fromFunction1(onDidDismiss))
    __obj.asInstanceOf[ReactOverlayProps]
  }
}

