package typings.makePlural.examplesMod

import typings.makePlural.anon.FewOther
import typings.makePlural.anon.ManyOne
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object be {
  
  @JSImport("make-plural/examples", "be")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("make-plural/examples", "be.cardinal")
  @js.native
  def cardinal: ManyOne = js.native
  inline def cardinal_=(x: ManyOne): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cardinal")(x.asInstanceOf[js.Any])
  
  @JSImport("make-plural/examples", "be.ordinal")
  @js.native
  def ordinal: FewOther = js.native
  inline def ordinal_=(x: FewOther): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ordinal")(x.asInstanceOf[js.Any])
}
