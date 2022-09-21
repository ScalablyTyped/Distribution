package typings.makePlural.examplesMod

import typings.makePlural.anon.FewOneOther
import typings.makePlural.anon.Other
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hsb {
  
  @JSImport("make-plural/examples", "hsb")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("make-plural/examples", "hsb.cardinal")
  @js.native
  def cardinal: FewOneOther = js.native
  inline def cardinal_=(x: FewOneOther): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cardinal")(x.asInstanceOf[js.Any])
  
  @JSImport("make-plural/examples", "hsb.ordinal")
  @js.native
  def ordinal: Other = js.native
  inline def ordinal_=(x: Other): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ordinal")(x.asInstanceOf[js.Any])
}
