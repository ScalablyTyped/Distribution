package typings.hastscript

import org.scalablytyped.runtime.StringDictionary
import typings.hastscript.anon.`0`
import typings.hastscript.coreMod.HProperties
import typings.hastscript.coreMod.HResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsxClassicMod {
  
  /**
    * This unique symbol is declared to specify the key on which JSX children are passed, without conflicting
    * with the Attributes type.
    */
  @JSImport("hastscript/lib/jsx-classic", "children")
  @js.native
  val children: js.Symbol = js.native
  
  type Element = HResult
  
  @js.native
  trait ElementChildrenAttribute extends StObject
  
  type IntrinsicAttributes = scala.Nothing
  
  type IntrinsicElements = StringDictionary[HProperties | `0`]
}
