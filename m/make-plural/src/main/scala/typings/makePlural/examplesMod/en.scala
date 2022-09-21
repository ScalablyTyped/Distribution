package typings.makePlural.examplesMod

import typings.makePlural.anon.OneOtherTwo
import typings.makePlural.anon.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object en {
  
  @JSImport("make-plural/examples", "en")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("make-plural/examples", "en.cardinal")
  @js.native
  def cardinal: `1` = js.native
  inline def cardinal_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cardinal")(x.asInstanceOf[js.Any])
  
  @JSImport("make-plural/examples", "en.ordinal")
  @js.native
  def ordinal: OneOtherTwo = js.native
  inline def ordinal_=(x: OneOtherTwo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ordinal")(x.asInstanceOf[js.Any])
}
