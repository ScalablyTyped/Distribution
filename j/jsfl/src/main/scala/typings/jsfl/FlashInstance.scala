package typings.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// if FlashElement.elementType == 'instance'
trait FlashInstance extends js.Object {
  var instanceType: js.UndefOr[String] = js.undefined
  var libraryItem: js.UndefOr[FlashItem] = js.undefined
}

object FlashInstance {
  @scala.inline
  def apply(instanceType: String = null, libraryItem: FlashItem = null): FlashInstance = {
    val __obj = js.Dynamic.literal()
    if (instanceType != null) __obj.updateDynamic("instanceType")(instanceType)
    if (libraryItem != null) __obj.updateDynamic("libraryItem")(libraryItem)
    __obj.asInstanceOf[FlashInstance]
  }
}

