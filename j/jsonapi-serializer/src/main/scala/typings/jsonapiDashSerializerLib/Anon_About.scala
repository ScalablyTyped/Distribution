package typings
package jsonapiDashSerializerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_About extends js.Object {
  var about: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_About {
  @scala.inline
  def apply(about: java.lang.String = null): Anon_About = {
    val __obj = js.Dynamic.literal()
    if (about != null) __obj.updateDynamic("about")(about)
    __obj.asInstanceOf[Anon_About]
  }
}

