package typings.atIonicReact

import typings.react.reactMod.ReactNode
import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenEvent extends js.Object {
  var children: js.UndefOr[ReactNode]
  var isOpen: Boolean
  var onDidDismiss: js.UndefOr[
    js.Function1[
      /* event */ CustomEvent[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_@ionic/core.OverlayEventDetail<any> */ _
      ], 
      Unit
    ]
  ] = js.undefined
}

object Anon_ChildrenEvent {
  @scala.inline
  def apply(
    children: ReactNode,
    isOpen: Boolean,
    onDidDismiss: /* event */ CustomEvent[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_@ionic/core.OverlayEventDetail<any> */ _
    ] => Unit = null
  ): Anon_ChildrenEvent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], isOpen = isOpen)
    if (onDidDismiss != null) __obj.updateDynamic("onDidDismiss")(js.Any.fromFunction1(onDidDismiss))
    __obj.asInstanceOf[Anon_ChildrenEvent]
  }
}

