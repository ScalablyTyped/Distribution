package typings.mapboxMapboxSdk.mod

import typings.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@mapbox/mapbox-sdk/lib/classes/mapi-client", JSImport.Default)
@js.native
class default protected () extends MapiClient {
  def this(config: SdkConfig) = this()
  /* CompleteClass */
  override var accessToken: String = js.native
  /* CompleteClass */
  override def createRequest(requestOptions: js.Any): MapiRequest = js.native
}

