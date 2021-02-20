package typings.ink

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Context
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appContextMod extends Shortcut {
  
  /**
    * `AppContext` is a React context, which exposes a method to manually exit the app (unmount).
    */
  @JSImport("ink/build/components/AppContext", JSImport.Default)
  @js.native
  val default: Context[Props] = js.native
  
  @js.native
  trait Props extends StObject {
    
    /**
      * Exit (unmount) the whole Ink app.
      */
    def exit(): Unit = js.native
    def exit(error: Error): Unit = js.native
  }
  
  type _To = Context[Props]
  
  /* This means you don't have to write `default`, but can instead just say `appContextMod.foo` */
  override def _to: Context[Props] = default
}
