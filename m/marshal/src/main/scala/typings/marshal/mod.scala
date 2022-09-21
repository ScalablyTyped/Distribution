package typings.marshal

import typings.node.bufferMod.global.Buffer
import typings.node.bufferMod.global.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("marshal", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Marshal {
    def this(buffer: String) = this()
    def this(buffer: Buffer) = this()
    def this(buffer: String, encoding: BufferEncoding) = this()
  }
  
  @js.native
  trait Marshal extends StObject {
    
    def load(buffer: String): this.type = js.native
    def load(buffer: String, encoding: BufferEncoding): this.type = js.native
    def load(buffer: Buffer): this.type = js.native
    
    var parsed: js.UndefOr[Any] = js.native
    
    def toJSON(): Any = js.native
    
    def toString(encoding: BufferEncoding): String = js.native
  }
}
