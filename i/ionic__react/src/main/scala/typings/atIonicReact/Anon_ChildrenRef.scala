package typings.atIonicReact

import typings.ionicons.distTypesComponentsMod.Global.HTMLIonIconElement
import typings.react.reactMod.ReactNode
import typings.react.reactMod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenRef extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var ref: js.UndefOr[RefObject[HTMLIonIconElement]] = js.undefined
}

object Anon_ChildrenRef {
  @scala.inline
  def apply(children: ReactNode = null, ref: RefObject[HTMLIonIconElement] = null): Anon_ChildrenRef = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref)
    __obj.asInstanceOf[Anon_ChildrenRef]
  }
}

