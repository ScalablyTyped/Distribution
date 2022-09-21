package typings.makePlural.examplesMod

import typings.makePlural.anon.ManyOther
import typings.makePlural.anon.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scn {
  
  @JSImport("make-plural/examples", "scn")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("make-plural/examples", "scn.cardinal")
  @js.native
  def cardinal: `1` = js.native
  inline def cardinal_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cardinal")(x.asInstanceOf[js.Any])
  
  @JSImport("make-plural/examples", "scn.ordinal")
  @js.native
  def ordinal: ManyOther = js.native
  inline def ordinal_=(x: ManyOther): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ordinal")(x.asInstanceOf[js.Any])
}
