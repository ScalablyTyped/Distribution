package typings.makePlural.examplesMod

import typings.makePlural.anon.One
import typings.makePlural.anon.`10`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hu {
  
  @JSImport("make-plural/examples", "hu")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("make-plural/examples", "hu.cardinal")
  @js.native
  def cardinal: One = js.native
  inline def cardinal_=(x: One): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cardinal")(x.asInstanceOf[js.Any])
  
  @JSImport("make-plural/examples", "hu.ordinal")
  @js.native
  def ordinal: `10` = js.native
  inline def ordinal_=(x: `10`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ordinal")(x.asInstanceOf[js.Any])
}
