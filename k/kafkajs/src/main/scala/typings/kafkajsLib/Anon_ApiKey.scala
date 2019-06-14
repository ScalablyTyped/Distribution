package typings
package kafkajsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApiKey extends js.Object {
  var apiKey: scala.Double
  var apiName: java.lang.String
  var apiVersion: scala.Double
  var broker: java.lang.String
  var clientId: java.lang.String
  var correlationId: scala.Double
  var createdAt: scala.Double
  var duration: scala.Double
  var pendingDuration: scala.Double
  var sentAt: scala.Double
  var size: scala.Double
}

object Anon_ApiKey {
  @scala.inline
  def apply(
    apiKey: scala.Double,
    apiName: java.lang.String,
    apiVersion: scala.Double,
    broker: java.lang.String,
    clientId: java.lang.String,
    correlationId: scala.Double,
    createdAt: scala.Double,
    duration: scala.Double,
    pendingDuration: scala.Double,
    sentAt: scala.Double,
    size: scala.Double
  ): Anon_ApiKey = {
    val __obj = js.Dynamic.literal(apiKey = apiKey, apiName = apiName, apiVersion = apiVersion, broker = broker, clientId = clientId, correlationId = correlationId, createdAt = createdAt, duration = duration, pendingDuration = pendingDuration, sentAt = sentAt, size = size)
  
    __obj.asInstanceOf[Anon_ApiKey]
  }
}

