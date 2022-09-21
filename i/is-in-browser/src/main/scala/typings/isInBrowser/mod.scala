package typings.isInBrowser

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("is-in-browser", JSImport.Default)
  @js.native
  val default: Boolean = js.native
  
  @JSImport("is-in-browser", "isBrowser")
  @js.native
  val isBrowser: Boolean = js.native
  
  @JSImport("is-in-browser", "isJsDom")
  @js.native
  val isJsDom: Boolean = js.native
  
  @JSImport("is-in-browser", "isNode")
  @js.native
  val isNode: Boolean = js.native
  
  type _To = Boolean
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: Boolean = default
}
