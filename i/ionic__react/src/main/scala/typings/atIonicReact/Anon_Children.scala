package typings.atIonicReact

import typings.react.reactMod.ReactNode
import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var isOpen: Boolean
  var onDidDismiss: js.UndefOr[
    js.Function1[
      /* event */ CustomEvent[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_core.OverlayEventDetail<any> */ _
      ], 
      Unit
    ]
  ] = js.undefined
}

object Anon_Children {
  @scala.inline
  def apply(
    isOpen: Boolean,
    children: ReactNode = null,
    onDidDismiss: /* event */ CustomEvent[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_core.OverlayEventDetail<any> */ _
    ] => Unit = null
  ): Anon_Children = {
    val __obj = js.Dynamic.literal(isOpen = isOpen)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (onDidDismiss != null) __obj.updateDynamic("onDidDismiss")(js.Any.fromFunction1(onDidDismiss))
    __obj.asInstanceOf[Anon_Children]
  }
}

