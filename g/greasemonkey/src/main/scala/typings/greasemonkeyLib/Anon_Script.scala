package typings
package greasemonkeyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Script extends js.Object {
  /** An object containing data about the currently running script */
  var script: greasemonkeyLib.GMNs.ScriptInfo
  /**
    * The name of the user script engine handling this script's execution.
    * The string `Greasemonkey`
    */
  var scriptHandler: java.lang.String
  /**
    * A string, the entire literal Metadata Block (without the delimiters)
    * for the currently running script
    */
  var scriptMetaStr: java.lang.String
  /** The version of Greasemonkey, a string e.g. `4.0` */
  var version: java.lang.String
}

object Anon_Script {
  @scala.inline
  def apply(
    script: greasemonkeyLib.GMNs.ScriptInfo,
    scriptHandler: java.lang.String,
    scriptMetaStr: java.lang.String,
    version: java.lang.String
  ): Anon_Script = {
    val __obj = js.Dynamic.literal(script = script, scriptHandler = scriptHandler, scriptMetaStr = scriptMetaStr, version = version)
  
    __obj.asInstanceOf[Anon_Script]
  }
}

