package typings
package atJupyterlabExtensionmanagerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Displayname extends js.Object {
  /**
    * A regular expression for matching kernel display name.
    */
  var display_name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A regular expression for matching kernel language.
    */
  var language: java.lang.String
}

object Anon_Displayname {
  @scala.inline
  def apply(language: java.lang.String, display_name: java.lang.String = null): Anon_Displayname = {
    val __obj = js.Dynamic.literal(language = language)
    if (display_name != null) __obj.updateDynamic("display_name")(display_name)
    __obj.asInstanceOf[Anon_Displayname]
  }
}

