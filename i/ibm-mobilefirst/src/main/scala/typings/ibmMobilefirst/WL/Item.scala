package typings.ibmMobilefirst.WL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item extends js.Object {
  def setEnabled(isEnable: String): Unit
  def setImagePath(imagePath: String): Unit
  def setTitle(title: String): Unit
}

object Item {
  @scala.inline
  def apply(setEnabled: String => Unit, setImagePath: String => Unit, setTitle: String => Unit): Item = {
    val __obj = js.Dynamic.literal(setEnabled = js.Any.fromFunction1(setEnabled), setImagePath = js.Any.fromFunction1(setImagePath), setTitle = js.Any.fromFunction1(setTitle))
    __obj.asInstanceOf[Item]
  }
}

