package typings.ink

import typings.ink.anon.ShowCursor
import typings.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logUpdateMod {
  
  object default {
    
    @JSImport("ink/build/log-update", "default.create")
    @js.native
    def create(stream: Writable): LogUpdate = js.native
    @JSImport("ink/build/log-update", "default.create")
    @js.native
    def create(stream: Writable, hasShowCursor: ShowCursor): LogUpdate = js.native
  }
  
  @js.native
  trait LogUpdate extends StObject {
    
    def apply(str: String): Unit = js.native
    
    def clear(): Unit = js.native
    
    def done(): Unit = js.native
  }
}
