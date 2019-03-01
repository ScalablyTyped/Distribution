package typings
package loopbackLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_From extends js.Object {
  var from: java.lang.String
  var html: java.lang.String
  var subject: java.lang.String
  var text: java.lang.String
  var to: java.lang.String
}

object Anon_From {
  @scala.inline
  def apply(
    from: java.lang.String,
    html: java.lang.String,
    subject: java.lang.String,
    text: java.lang.String,
    to: java.lang.String
  ): Anon_From = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("from")(from)
    __obj.updateDynamic("html")(html)
    __obj.updateDynamic("subject")(subject)
    __obj.updateDynamic("text")(text)
    __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[Anon_From]
  }
}

