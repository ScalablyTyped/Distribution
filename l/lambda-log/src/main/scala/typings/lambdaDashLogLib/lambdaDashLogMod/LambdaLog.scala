package typings
package lambdaDashLogLib.lambdaDashLogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lambda-log", "LambdaLog")
@js.native
class LambdaLog ()
  extends nodeLib.eventsMod.EventEmitter
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  def this(options: LambdaLogOptions) = this()
  def this(options: LambdaLogOptions, levels: js.Any) = this()
  var LambdaLog: LambdaLog = js.native
  var _levels: js.Any = js.native
  var _logLevels: js.Any = js.native
  var console: nodeLib.Console = js.native
  var options: LambdaLogOptions = js.native
  def assert(test: js.Any, msg: java.lang.String, meta: js.Object, tags: js.Array[java.lang.String]): scala.Boolean | java.lang.String = js.native
  def log(level: java.lang.String, msg: java.lang.String, meta: js.Object, tags: js.Array[java.lang.String]): java.lang.String = js.native
}

