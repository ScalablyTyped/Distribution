package typings.log4js.mod

import typings.log4js.log4jsStrings.multiFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiFileAppender extends Appender {
  // the base part of the generated log filename
  var base: String = js.native
  // the suffix for the generated log filename.
  var extension: String = js.native
  // the value to use to split files (see below).
  var property: String = js.native
  var `type`: multiFile = js.native
}

object MultiFileAppender {
  @scala.inline
  def apply(base: String, extension: String, property: String, `type`: multiFile): MultiFileAppender = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], extension = extension.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiFileAppender]
  }
  @scala.inline
  implicit class MultiFileAppenderOps[Self <: MultiFileAppender] (val x: Self) extends AnyVal {
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
    def setBase(value: String): Self = this.set("base", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtension(value: String): Self = this.set("extension", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperty(value: String): Self = this.set("property", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: multiFile): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

