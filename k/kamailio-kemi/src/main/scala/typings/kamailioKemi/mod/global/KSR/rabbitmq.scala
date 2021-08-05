package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rabbitmq {
  
  @JSGlobal("KSR.rabbitmq")
  @js.native
  val ^ : js.Any = js.native
  
  inline def publish(exchange: String, routingkey: String, contenttype: String, messagebody: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("publish")(exchange.asInstanceOf[js.Any], routingkey.asInstanceOf[js.Any], contenttype.asInstanceOf[js.Any], messagebody.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def publishConsume(exchange: String, routingkey: String, contenttype: String, messagebody: String, dpv: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("publish_consume")(exchange.asInstanceOf[js.Any], routingkey.asInstanceOf[js.Any], contenttype.asInstanceOf[js.Any], messagebody.asInstanceOf[js.Any], dpv.asInstanceOf[js.Any])).asInstanceOf[Double]
}
