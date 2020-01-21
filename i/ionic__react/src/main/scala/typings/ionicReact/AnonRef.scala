package typings.ionicReact

import typings.react.mod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRef extends js.Object {
  var ref: js.UndefOr[RefObject[_]] = js.undefined
}

object AnonRef {
  @scala.inline
  def apply(ref: RefObject[_] = null): AnonRef = {
    val __obj = js.Dynamic.literal()
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRef]
  }
}

