package typings
package kafkajsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApiKeyApiName extends js.Object {
  var apiKey: scala.Double
  var apiName: java.lang.String
  var apiVersion: scala.Double
  var broker: java.lang.String
  var clientId: java.lang.String
  var correlationId: scala.Double
  var createdAt: scala.Double
  var pendingDuration: scala.Double
  var sentAt: scala.Double
}

object Anon_ApiKeyApiName {
  @scala.inline
  def apply(
    apiKey: scala.Double,
    apiName: java.lang.String,
    apiVersion: scala.Double,
    broker: java.lang.String,
    clientId: java.lang.String,
    correlationId: scala.Double,
    createdAt: scala.Double,
    pendingDuration: scala.Double,
    sentAt: scala.Double
  ): Anon_ApiKeyApiName = {
    val __obj = js.Dynamic.literal(apiKey = apiKey, apiName = apiName, apiVersion = apiVersion, broker = broker, clientId = clientId, correlationId = correlationId, createdAt = createdAt, pendingDuration = pendingDuration, sentAt = sentAt)
  
    __obj.asInstanceOf[Anon_ApiKeyApiName]
  }
}

