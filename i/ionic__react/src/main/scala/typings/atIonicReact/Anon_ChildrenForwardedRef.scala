package typings.atIonicReact

import typings.atIonicCore.distTypesComponentsMod._Global_.HTMLIonModalElement
import typings.react.reactMod.ReactNode
import typings.react.reactMod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenForwardedRef extends js.Object {
  var children: ReactNode
  var forwardedRef: js.UndefOr[RefObject[HTMLIonModalElement]] = js.undefined
}

object Anon_ChildrenForwardedRef {
  @scala.inline
  def apply(children: ReactNode = null, forwardedRef: RefObject[HTMLIonModalElement] = null): Anon_ChildrenForwardedRef = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (forwardedRef != null) __obj.updateDynamic("forwardedRef")(forwardedRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ChildrenForwardedRef]
  }
}

