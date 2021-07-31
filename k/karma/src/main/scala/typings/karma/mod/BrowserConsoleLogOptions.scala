package typings.karma.mod

import typings.karma.karmaStrings.debug_
import typings.karma.karmaStrings.error_
import typings.karma.karmaStrings.info_
import typings.karma.karmaStrings.log_
import typings.karma.karmaStrings.warn_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrowserConsoleLogOptions extends StObject {
  
  /**
    * The format is a string where `%b`, `%t`, `%T`, and `%m` are replaced with the browser string,
    * log type in lower-case, log type in uppercase, and log message, respectively.
    * This format will only effect the output file
    */
  var format: js.UndefOr[String] = js.undefined
  
  /** the desired log-level, where level log always is logged */
  var level: js.UndefOr[log_ | error_ | warn_ | info_ | debug_] = js.undefined
  
  /** output-path of the output-file */
  var path: js.UndefOr[String] = js.undefined
  
  /** if the log should be written in the terminal, or not */
  var terminal: js.UndefOr[Boolean] = js.undefined
}
object BrowserConsoleLogOptions {
  
  @scala.inline
  def apply(): BrowserConsoleLogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrowserConsoleLogOptions]
  }
  
  @scala.inline
  implicit class BrowserConsoleLogOptionsMutableBuilder[Self <: BrowserConsoleLogOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setLevel(value: log_ | error_ | warn_ | info_ | debug_): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setTerminal(value: Boolean): Self = StObject.set(x, "terminal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerminalUndefined: Self = StObject.set(x, "terminal", js.undefined)
  }
}
