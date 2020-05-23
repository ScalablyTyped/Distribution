package typings.greasemonkey.anon

import typings.greasemonkey.GM.ScriptInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Script extends js.Object {
  /** An object containing data about the currently running script */
  var script: ScriptInfo
  /**
    * The name of the user script engine handling this script's execution.
    * The string `Greasemonkey`
    */
  var scriptHandler: String
  /**
    * A string, the entire literal Metadata Block (without the delimiters)
    * for the currently running script
    */
  var scriptMetaStr: String
  /** The version of Greasemonkey, a string e.g. `4.0` */
  var version: String
}

object Script {
  @scala.inline
  def apply(script: ScriptInfo, scriptHandler: String, scriptMetaStr: String, version: String): Script = {
    val __obj = js.Dynamic.literal(script = script.asInstanceOf[js.Any], scriptHandler = scriptHandler.asInstanceOf[js.Any], scriptMetaStr = scriptMetaStr.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Script]
  }
}

