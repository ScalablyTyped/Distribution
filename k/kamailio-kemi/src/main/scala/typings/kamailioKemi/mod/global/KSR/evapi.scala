package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object evapi {
  
  @JSGlobal("KSR.evapi")
  @js.native
  val ^ : js.Any = js.native
  
  inline def asyncRelay(sdata: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("async_relay")(sdata.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def close(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("close")().asInstanceOf[Double]
  
  inline def relay(sdata: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("relay")(sdata.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def relayMulticast(sdata: String, stag: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("relay_multicast")(sdata.asInstanceOf[js.Any], stag.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def relayUnicast(sdata: String, stag: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("relay_unicast")(sdata.asInstanceOf[js.Any], stag.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def setTag(stag: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("set_tag")(stag.asInstanceOf[js.Any]).asInstanceOf[Double]
}
