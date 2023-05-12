package typings.jsonStream

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import typings.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("json-stream", JSImport.Namespace)
  @js.native
  val ^ : Export = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("json-stream", "JSONStream")
  @js.native
  open class JSONStreamCls () extends Transform
  
  @js.native
  trait Export extends StObject {
    
    def apply(): JSONStream = js.native
    
    var JSONStream: Instantiable0[typings.jsonStream.mod.JSONStream] = js.native
  }
  
  type JSONStream = Transform
  
  type _To = Export
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Export = ^
}
