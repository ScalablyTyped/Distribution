package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rabbitmq {
  
  @JSGlobal("KSR.rabbitmq.publish")
  @js.native
  def publish(exchange: String, routingkey: String, contenttype: String, messagebody: String): Double = js.native
  
  @JSGlobal("KSR.rabbitmq.publish_consume")
  @js.native
  def publishConsume(exchange: String, routingkey: String, contenttype: String, messagebody: String, dpv: String): Double = js.native
}
