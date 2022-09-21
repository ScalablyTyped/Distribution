package typings.makePlural.examplesMod

import typings.makePlural.anon.TwoZero
import typings.makePlural.anon.Zero
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cy {
  
  @JSImport("make-plural/examples", "cy")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("make-plural/examples", "cy.cardinal")
  @js.native
  def cardinal: Zero = js.native
  inline def cardinal_=(x: Zero): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cardinal")(x.asInstanceOf[js.Any])
  
  @JSImport("make-plural/examples", "cy.ordinal")
  @js.native
  def ordinal: TwoZero = js.native
  inline def ordinal_=(x: TwoZero): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ordinal")(x.asInstanceOf[js.Any])
}
