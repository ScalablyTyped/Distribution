package typings.makeupScreenreaderTrap

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("makeup-screenreader-trap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def trap(el: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("trap")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def untrap(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("untrap")().asInstanceOf[Unit]
}
