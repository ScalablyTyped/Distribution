package typings.ink

import typings.ink.anon.ShowCursor
import typings.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ink/build/log-update", JSImport.Namespace)
@js.native
object logUpdateMod extends js.Object {
  
  @js.native
  trait LogUpdate extends js.Object {
    
    def apply(str: String): Unit = js.native
    
    def clear(): Unit = js.native
    
    def done(): Unit = js.native
  }
  
  @js.native
  object default extends js.Object {
    
    def create(stream: Writable): LogUpdate = js.native
    def create(stream: Writable, hasShowCursor: ShowCursor): LogUpdate = js.native
  }
}
