package typings.layuiLayer

import org.scalablytyped.runtime.Shortcut
import typings.layuiLayer.layer.Layer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object layer extends Shortcut {
    
    @JSGlobal("layer")
    @js.native
    val ^ : Layer = js.native
    
    type _To = Layer
    
    /* This means you don't have to write `^`, but can instead just say `layer.foo` */
    override def _to: Layer = ^
  }
}
