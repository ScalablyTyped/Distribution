package typings
package karmaLib.karmaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("karma", "launcher")
@js.native
object launcherNs extends js.Object {
  @js.native
  class Launcher protected () extends js.Object {
    def this(emitter: nodeLib.NodeJSNs.EventEmitter, injector: js.Any) = this()
    def areAllCaptured(): scala.Boolean = js.native
    def kill(id: java.lang.String, callback: js.Function0[scala.Unit]): scala.Boolean = js.native
    def killAll(callback: js.Function0[scala.Unit]): scala.Unit = js.native
    // TODO: Can this return value ever be typified?
    def launch(
      names: js.Array[java.lang.String],
      protocol: java.lang.String,
      hostname: java.lang.String,
      port: scala.Double,
      urlRoot: java.lang.String
    ): js.Array[_] = js.native
    def markCaptured(id: java.lang.String): scala.Unit = js.native
    def restart(id: java.lang.String): scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Launcher extends js.Object {
    def generateId(): java.lang.String = js.native
  }
  
}

