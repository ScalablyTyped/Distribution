package typings.greasemonkey.anon

import typings.greasemonkey.GM.ScriptInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Script extends js.Object {
  /** An object containing data about the currently running script */
  var script: ScriptInfo = js.native
  /**
    * The name of the user script engine handling this script's execution.
    * The string `Greasemonkey`
    */
  var scriptHandler: String = js.native
  /**
    * A string, the entire literal Metadata Block (without the delimiters)
    * for the currently running script
    */
  var scriptMetaStr: String = js.native
  /** The version of Greasemonkey, a string e.g. `4.0` */
  var version: String = js.native
}

object Script {
  @scala.inline
  def apply(script: ScriptInfo, scriptHandler: String, scriptMetaStr: String, version: String): Script = {
    val __obj = js.Dynamic.literal(script = script.asInstanceOf[js.Any], scriptHandler = scriptHandler.asInstanceOf[js.Any], scriptMetaStr = scriptMetaStr.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Script]
  }
  @scala.inline
  implicit class ScriptOps[Self <: Script] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setScript(value: ScriptInfo): Self = this.set("script", value.asInstanceOf[js.Any])
    @scala.inline
    def setScriptHandler(value: String): Self = this.set("scriptHandler", value.asInstanceOf[js.Any])
    @scala.inline
    def setScriptMetaStr(value: String): Self = this.set("scriptMetaStr", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

