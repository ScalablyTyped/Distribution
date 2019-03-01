package typings
package ibmDashMobilefirstLib.WLNs.SimpleDialogNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var text: java.lang.String
  var title: java.lang.String
}

object Options {
  @scala.inline
  def apply(text: java.lang.String, title: java.lang.String): Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("text")(text)
    __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Options]
  }
}

