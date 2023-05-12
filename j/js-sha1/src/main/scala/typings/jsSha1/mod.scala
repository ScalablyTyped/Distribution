package typings.jsSha1

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("js-sha1", JSImport.Namespace)
  @js.native
  val ^ : JsSha1 = js.native
  
  @js.native
  trait JsSha1 extends StObject {
    
    def apply(message: String): String = js.native
    
    def array(message: String): js.Array[Double] = js.native
    
    def arrayBuffer(message: String): js.typedarray.ArrayBuffer = js.native
    
    def digest(message: String): js.Array[Double] = js.native
    
    def hex(message: String): String = js.native
    
    def update(message: String): String = js.native
  }
  
  type _To = JsSha1
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: JsSha1 = ^
}
