package typings.logkitty

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("logkitty/build/errors", JSImport.Namespace)
@js.native
object errorsMod extends js.Object {
  
  val ERR_ANDROID_CANNOT_CLEAN_LOGCAT_BUFFER: /* "ERR_ANDROID_CANNOT_CLEAN_LOGCAT_BUFFER" */ String = js.native
  
  val ERR_ANDROID_CANNOT_GET_APP_PID: /* "ERR_ANDROID_CANNOT_GET_APP_PID" */ String = js.native
  
  val ERR_ANDROID_CANNOT_START_LOGCAT: /* "ERR_ANDROID_CANNOT_START_LOGCAT" */ String = js.native
  
  val ERR_ANDROID_UNPROCESSABLE_PID: /* "ERR_ANDROID_UNPROCESSABLE_PID" */ String = js.native
  
  val ERR_IOS_CANNOT_LIST_SIMULATORS: /* "ERR_IOS_CANNOT_LIST_SIMULATORS" */ String = js.native
  
  val ERR_IOS_CANNOT_START_SYSLOG: /* "ERR_IOS_CANNOT_START_SYSLOG" */ String = js.native
  
  val ERR_IOS_NO_SIMULATORS_BOOTED: /* "ERR_IOS_NO_SIMULATORS_BOOTED" */ String = js.native
  
  @js.native
  class CodeError protected () extends Error {
    def this(code: String) = this()
    def this(code: String, message: String) = this()
    
    var code: String = js.native
  }
}
