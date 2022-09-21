package typings.kurentoClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SdpEndpoint
  extends StObject
     with MediaElement {
  
  def generateOffer(): js.Promise[String] = js.native
  def generateOffer(options: Unit, callback: Callback[String]): js.Promise[String] = js.native
  def generateOffer(options: OfferOptions): js.Promise[String] = js.native
  def generateOffer(options: OfferOptions, callback: Callback[String]): js.Promise[String] = js.native
  
  def getMaxAudioRecvBandwidth(): js.Promise[Double] = js.native
  def getMaxAudioRecvBandwidth(callback: Callback[Double]): js.Promise[Double] = js.native
  
  def getMaxVideoRecvBandwidth(): js.Promise[Double] = js.native
  def getMaxVideoRecvBandwidth(callback: Callback[Double]): js.Promise[Double] = js.native
  
  def processAnswer(answer: String): js.Promise[String] = js.native
  def processAnswer(answer: String, callback: Callback[String]): js.Promise[String] = js.native
  
  def processOffer(offer: String): js.Promise[String] = js.native
  def processOffer(offer: String, callback: Callback[String]): js.Promise[String] = js.native
  
  def setMaxAudioRecvBandwidth(value: Double): js.Promise[Unit] = js.native
  def setMaxAudioRecvBandwidth(value: Double, callback: Callback[Unit]): js.Promise[Unit] = js.native
  
  def setMaxVideoRecvBandwidth(value: Double): js.Promise[Unit] = js.native
  def setMaxVideoRecvBandwidth(value: Double, callback: Callback[Unit]): js.Promise[Unit] = js.native
}
