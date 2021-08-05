package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object msilo {
  
  @JSGlobal("KSR.msilo")
  @js.native
  val ^ : js.Any = js.native
  
  inline def mdump(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("mdump")().asInstanceOf[Double]
  
  inline def mdumpUri(owner_s: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("mdump_uri")(owner_s.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def mstore(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("mstore")().asInstanceOf[Double]
  
  inline def mstoreUri(owner_s: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("mstore_uri")(owner_s.asInstanceOf[js.Any]).asInstanceOf[Double]
}
