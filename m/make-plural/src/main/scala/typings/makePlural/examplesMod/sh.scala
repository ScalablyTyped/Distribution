package typings.makePlural.examplesMod

import typings.makePlural.anon.FewOne
import typings.makePlural.anon.Other
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sh {
  
  @JSImport("make-plural/examples", "sh")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("make-plural/examples", "sh.cardinal")
  @js.native
  def cardinal: FewOne = js.native
  inline def cardinal_=(x: FewOne): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cardinal")(x.asInstanceOf[js.Any])
  
  @JSImport("make-plural/examples", "sh.ordinal")
  @js.native
  def ordinal: Other = js.native
  inline def ordinal_=(x: Other): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ordinal")(x.asInstanceOf[js.Any])
}
