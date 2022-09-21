package typings.makePlural.examplesMod

import typings.makePlural.anon.FewMany
import typings.makePlural.anon.One
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object az {
  
  @JSImport("make-plural/examples", "az")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("make-plural/examples", "az.cardinal")
  @js.native
  def cardinal: One = js.native
  inline def cardinal_=(x: One): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cardinal")(x.asInstanceOf[js.Any])
  
  @JSImport("make-plural/examples", "az.ordinal")
  @js.native
  def ordinal: FewMany = js.native
  inline def ordinal_=(x: FewMany): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ordinal")(x.asInstanceOf[js.Any])
}
