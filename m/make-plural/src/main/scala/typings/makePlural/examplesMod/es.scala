package typings.makePlural.examplesMod

import typings.makePlural.anon.ManyOneOther
import typings.makePlural.anon.Other
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object es {
  
  @JSImport("make-plural/examples", "es")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("make-plural/examples", "es.cardinal")
  @js.native
  def cardinal: ManyOneOther = js.native
  inline def cardinal_=(x: ManyOneOther): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cardinal")(x.asInstanceOf[js.Any])
  
  @JSImport("make-plural/examples", "es.ordinal")
  @js.native
  def ordinal: Other = js.native
  inline def ordinal_=(x: Other): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ordinal")(x.asInstanceOf[js.Any])
}
