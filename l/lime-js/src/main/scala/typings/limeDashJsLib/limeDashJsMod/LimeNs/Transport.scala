package typings
package limeDashJsLib.limeDashJsMod.LimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Transport extends ITransportStateListener {
  var compression: java.lang.String
  var encryption: java.lang.String
  def close(): scala.Unit
  def getSupportedCompression(): js.Array[java.lang.String]
  def getSupportedEncryption(): js.Array[java.lang.String]
  def onEnvelope(envelope: Envelope): js.Any
  def open(uri: java.lang.String): scala.Unit
  def send(envelope: Envelope): scala.Unit
  def setCompression(compression: java.lang.String): scala.Unit
  def setEncryption(encryption: java.lang.String): scala.Unit
}

