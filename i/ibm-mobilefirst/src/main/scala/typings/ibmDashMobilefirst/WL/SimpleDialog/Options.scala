package typings.ibmDashMobilefirst.WL.SimpleDialog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var text: String
  var title: String
}

object Options {
  @scala.inline
  def apply(text: String, title: String): Options = {
    val __obj = js.Dynamic.literal(text = text, title = title)
  
    __obj.asInstanceOf[Options]
  }
}

