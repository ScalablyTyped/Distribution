package typings.makePlural.examplesMod

import typings.makePlural.anon.One
import typings.makePlural.anon.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bal {
  
  @JSImport("make-plural/examples", "bal")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("make-plural/examples", "bal.cardinal")
  @js.native
  def cardinal: One = js.native
  inline def cardinal_=(x: One): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cardinal")(x.asInstanceOf[js.Any])
  
  @JSImport("make-plural/examples", "bal.ordinal")
  @js.native
  def ordinal: `2` = js.native
  inline def ordinal_=(x: `2`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ordinal")(x.asInstanceOf[js.Any])
}
