package typings.logkitty.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DEBUG extends js.Object {
  var DEBUG: Double = js.native
  var ERROR: Double = js.native
  var FATAL: Double = js.native
  var INFO: Double = js.native
  var SILENT: Double = js.native
  var UNKNOWN: Double = js.native
  var VERBOSE: Double = js.native
  var WARN: Double = js.native
}

object DEBUG {
  @scala.inline
  def apply(
    DEBUG: Double,
    ERROR: Double,
    FATAL: Double,
    INFO: Double,
    SILENT: Double,
    UNKNOWN: Double,
    VERBOSE: Double,
    WARN: Double
  ): DEBUG = {
    val __obj = js.Dynamic.literal(DEBUG = DEBUG.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], FATAL = FATAL.asInstanceOf[js.Any], INFO = INFO.asInstanceOf[js.Any], SILENT = SILENT.asInstanceOf[js.Any], UNKNOWN = UNKNOWN.asInstanceOf[js.Any], VERBOSE = VERBOSE.asInstanceOf[js.Any], WARN = WARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DEBUG]
  }
  @scala.inline
  implicit class DEBUGOps[Self <: DEBUG] (val x: Self) extends AnyVal {
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
    def setDEBUG(value: Double): Self = this.set("DEBUG", value.asInstanceOf[js.Any])
    @scala.inline
    def setERROR(value: Double): Self = this.set("ERROR", value.asInstanceOf[js.Any])
    @scala.inline
    def setFATAL(value: Double): Self = this.set("FATAL", value.asInstanceOf[js.Any])
    @scala.inline
    def setINFO(value: Double): Self = this.set("INFO", value.asInstanceOf[js.Any])
    @scala.inline
    def setSILENT(value: Double): Self = this.set("SILENT", value.asInstanceOf[js.Any])
    @scala.inline
    def setUNKNOWN(value: Double): Self = this.set("UNKNOWN", value.asInstanceOf[js.Any])
    @scala.inline
    def setVERBOSE(value: Double): Self = this.set("VERBOSE", value.asInstanceOf[js.Any])
    @scala.inline
    def setWARN(value: Double): Self = this.set("WARN", value.asInstanceOf[js.Any])
  }
  
}

