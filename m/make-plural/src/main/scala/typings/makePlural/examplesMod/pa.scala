package typings.makePlural.examplesMod

import typings.makePlural.anon.OneOther
import typings.makePlural.anon.Other
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pa {
  
  @JSImport("make-plural/examples", "pa")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("make-plural/examples", "pa.cardinal")
  @js.native
  def cardinal: OneOther = js.native
  inline def cardinal_=(x: OneOther): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cardinal")(x.asInstanceOf[js.Any])
  
  @JSImport("make-plural/examples", "pa.ordinal")
  @js.native
  def ordinal: Other = js.native
  inline def ordinal_=(x: Other): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ordinal")(x.asInstanceOf[js.Any])
}
