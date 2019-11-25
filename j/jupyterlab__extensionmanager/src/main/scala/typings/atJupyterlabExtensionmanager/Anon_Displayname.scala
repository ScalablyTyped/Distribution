package typings.atJupyterlabExtensionmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Displayname extends js.Object {
  /**
    * A regular expression for matching kernel display name.
    */
  var display_name: js.UndefOr[String] = js.undefined
  /**
    * A regular expression for matching kernel language.
    */
  var language: String
}

object Anon_Displayname {
  @scala.inline
  def apply(language: String, display_name: String = null): Anon_Displayname = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any])
    if (display_name != null) __obj.updateDynamic("display_name")(display_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Displayname]
  }
}

