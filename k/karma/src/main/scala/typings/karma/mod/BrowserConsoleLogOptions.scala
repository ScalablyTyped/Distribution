package typings.karma.mod

import typings.karma.karmaStrings.debug_
import typings.karma.karmaStrings.error_
import typings.karma.karmaStrings.info_
import typings.karma.karmaStrings.log_
import typings.karma.karmaStrings.warn_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrowserConsoleLogOptions extends js.Object {
  
  /**
    * The format is a string where `%b`, `%t`, `%T`, and `%m` are replaced with the browser string,
    * log type in lower-case, log type in uppercase, and log message, respectively.
    * This format will only effect the output file
    */
  var format: js.UndefOr[String] = js.native
  
  /** the desired log-level, where level log always is logged */
  var level: js.UndefOr[log_ | error_ | warn_ | info_ | debug_] = js.native
  
  /** output-path of the output-file */
  var path: js.UndefOr[String] = js.native
  
  /** if the log should be written in the terminal, or not */
  var terminal: js.UndefOr[Boolean] = js.native
}
object BrowserConsoleLogOptions {
  
  @scala.inline
  def apply(): BrowserConsoleLogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrowserConsoleLogOptions]
  }
  
  @scala.inline
  implicit class BrowserConsoleLogOptionsOps[Self <: BrowserConsoleLogOptions] (val x: Self) extends AnyVal {
    
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
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setLevel(value: log_ | error_ | warn_ | info_ | debug_): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setTerminal(value: Boolean): Self = this.set("terminal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTerminal: Self = this.set("terminal", js.undefined)
  }
}
