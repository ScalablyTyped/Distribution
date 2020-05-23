package typings.jsoneditoronline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONFormatter extends js.Object {
  def get(): js.Object
  def getText(): String
  def onError(err: String): Unit
  def set(json: js.Object): Unit
  def setText(jsonString: String): Unit
}

object JSONFormatter {
  @scala.inline
  def apply(
    get: () => js.Object,
    getText: () => String,
    onError: String => Unit,
    set: js.Object => Unit,
    setText: String => Unit
  ): JSONFormatter = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), getText = js.Any.fromFunction0(getText), onError = js.Any.fromFunction1(onError), set = js.Any.fromFunction1(set), setText = js.Any.fromFunction1(setText))
    __obj.asInstanceOf[JSONFormatter]
  }
}

