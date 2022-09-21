package typings.makePlural.examplesMod

import typings.makePlural.anon.FewManyOneOther
import typings.makePlural.anon.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ga {
  
  @JSImport("make-plural/examples", "ga")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("make-plural/examples", "ga.cardinal")
  @js.native
  def cardinal: FewManyOneOther = js.native
  inline def cardinal_=(x: FewManyOneOther): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cardinal")(x.asInstanceOf[js.Any])
  
  @JSImport("make-plural/examples", "ga.ordinal")
  @js.native
  def ordinal: `2` = js.native
  inline def ordinal_=(x: `2`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ordinal")(x.asInstanceOf[js.Any])
}
