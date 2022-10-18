package typings.jsdevtoolsOno

import org.scalablytyped.runtime.Shortcut
import typings.jsdevtoolsOno.esmTypesMod.OnoSingleton
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@jsdevtools/ono", JSImport.Default)
  @js.native
  val default: OnoSingleton = js.native
  
  @JSImport("@jsdevtools/ono", "ono")
  @js.native
  val ono: OnoSingleton = js.native
  
  type _To = OnoSingleton
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: OnoSingleton = default
}
