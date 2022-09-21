package typings.makePlural.examplesMod

import typings.makePlural.anon.Few
import typings.makePlural.anon.Other
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ar {
  
  @JSImport("make-plural/examples", "ar")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("make-plural/examples", "ar.cardinal")
  @js.native
  def cardinal: Few = js.native
  inline def cardinal_=(x: Few): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cardinal")(x.asInstanceOf[js.Any])
  
  @JSImport("make-plural/examples", "ar.ordinal")
  @js.native
  def ordinal: Other = js.native
  inline def ordinal_=(x: Other): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ordinal")(x.asInstanceOf[js.Any])
}
