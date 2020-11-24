package typings.karma.mod

import typings.node.eventsMod.global.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("karma", "launcher")
@js.native
object launcher extends js.Object {
  
  @js.native
  class Launcher protected () extends js.Object {
    def this(emitter: EventEmitter, injector: js.Any) = this()
    
    def areAllCaptured(): Boolean = js.native
    
    def kill(id: String, callback: js.Function0[Unit]): Boolean = js.native
    
    def killAll(callback: js.Function0[Unit]): Unit = js.native
    
    // TODO: Can this return value ever be typified?
    def launch(names: js.Array[String], protocol: String, hostname: String, port: Double, urlRoot: String): js.Array[_] = js.native
    
    def markCaptured(id: String): Unit = js.native
    
    def restart(id: String): Boolean = js.native
  }
  /* static members */
  @js.native
  object Launcher extends js.Object {
    
    def generateId(): String = js.native
  }
}
