package typings.karma.mod

import typings.karma.anon.Pattern
import typings.karma.karmaStrings.DEBUG
import typings.karma.karmaStrings.ERROR
import typings.karma.karmaStrings.INFO
import typings.karma.karmaStrings.LOG
import typings.karma.karmaStrings.OFF
import typings.karma.karmaStrings.WARN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("karma", "constants")
@js.native
object constants extends js.Object {
  
  val COLOR_PATTERN: String = js.native
  
  val DEFAULT_HOSTNAME: String = js.native
  
  val DEFAULT_LISTEN_ADDR: String = js.native
  
  val DEFAULT_PORT: String | Double = js.native
  
  val EXIT_CODE: String = js.native
  
  val LOG_DEBUG: DEBUG = js.native
  
  val LOG_DISABLE: OFF = js.native
  
  val LOG_ERROR: ERROR = js.native
  
  val LOG_INFO: INFO = js.native
  
  val LOG_LOG: LOG = js.native
  
  val LOG_PRIORITIES: js.Tuple6[OFF, ERROR, WARN, LOG, INFO, DEBUG] = js.native
  
  val LOG_WARN: WARN = js.native
  
  val NO_COLOR_PATTERN: String = js.native
  
  val VERSION: String = js.native
  
  @js.native
  object CONSOLE_APPENDER extends js.Object {
    
    var layout: Pattern = js.native
    
    var `type`: String = js.native
  }
}
