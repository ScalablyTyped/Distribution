package typings.makePlural.examplesMod

import typings.makePlural.anon.One
import typings.makePlural.anon.`32`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sq {
  
  @JSImport("make-plural/examples", "sq")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("make-plural/examples", "sq.cardinal")
  @js.native
  def cardinal: One = js.native
  inline def cardinal_=(x: One): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cardinal")(x.asInstanceOf[js.Any])
  
  @JSImport("make-plural/examples", "sq.ordinal")
  @js.native
  def ordinal: `32` = js.native
  inline def ordinal_=(x: `32`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ordinal")(x.asInstanceOf[js.Any])
}
