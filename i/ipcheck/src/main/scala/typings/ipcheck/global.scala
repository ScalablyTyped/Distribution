package typings.ipcheck

import org.scalablytyped.runtime.Shortcut
import typings.ipcheck.mod.IPCheck
import typings.ipcheck.mod.IPCheckStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object ipcheck extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("ipcheck")
    @js.native
    open class ^ protected ()
      extends StObject
         with IPCheck {
      def this(input: String) = this()
    }
    
    @JSGlobal("ipcheck")
    @js.native
    val ^ : IPCheckStatic = js.native
    
    type _To = IPCheckStatic
    
    /* This means you don't have to write `^`, but can instead just say `ipcheck.foo` */
    override def _to: IPCheckStatic = ^
  }
}
