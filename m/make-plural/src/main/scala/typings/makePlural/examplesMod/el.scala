package typings.makePlural.examplesMod

import typings.makePlural.anon.One
import typings.makePlural.anon.Other
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object el {
  
  @JSImport("make-plural/examples", "el")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("make-plural/examples", "el.cardinal")
  @js.native
  def cardinal: One = js.native
  inline def cardinal_=(x: One): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cardinal")(x.asInstanceOf[js.Any])
  
  @JSImport("make-plural/examples", "el.ordinal")
  @js.native
  def ordinal: Other = js.native
  inline def ordinal_=(x: Other): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ordinal")(x.asInstanceOf[js.Any])
}
