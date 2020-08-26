package typings.gulpHelpDoc.mod

import typings.gulpHelpDoc.anon.Log
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsageOptions extends js.Object {
  /**
    * Path to a gulpfile (default is gulpfile.js)
    * Normally, there is no need to change this option. It may be used
    * for some special cases, like mocking gulpfile for testing.
    */
  var gulpfile: js.UndefOr[String] = js.native
  /**
    * Defines max width of the column width tasks or args names
    * (by default is 20 characters long)
    */
  var keysColumnWidth: js.UndefOr[Double] = js.native
  /**
    * Defines  max line width for the printed output lines
    * (by default is 80 characters long)
    */
  var lineWidth: js.UndefOr[Double] = js.native
  /**
    * Printing engine (by default is console). Accepted any device
    * which has log() function defined to do output.
    */
  var logger: js.UndefOr[Log] = js.native
  /**
    * Defines number of empty characters for left-padding of the output
    */
  var padding: js.UndefOr[Double] = js.native
}

object UsageOptions {
  @scala.inline
  def apply(): UsageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsageOptions]
  }
  @scala.inline
  implicit class UsageOptionsOps[Self <: UsageOptions] (val x: Self) extends AnyVal {
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
    def setGulpfile(value: String): Self = this.set("gulpfile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGulpfile: Self = this.set("gulpfile", js.undefined)
    @scala.inline
    def setKeysColumnWidth(value: Double): Self = this.set("keysColumnWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeysColumnWidth: Self = this.set("keysColumnWidth", js.undefined)
    @scala.inline
    def setLineWidth(value: Double): Self = this.set("lineWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineWidth: Self = this.set("lineWidth", js.undefined)
    @scala.inline
    def setLogger(value: Log): Self = this.set("logger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
  }
  
}

