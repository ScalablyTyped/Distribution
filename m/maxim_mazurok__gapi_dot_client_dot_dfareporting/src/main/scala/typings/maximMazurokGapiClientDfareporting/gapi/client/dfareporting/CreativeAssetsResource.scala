package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDfareporting.anon.AccesstokenAdvertiserId
import typings.maximMazurokGapiClientDfareporting.anon.AdvertiserIdAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreativeAssetsResource extends js.Object {
  
  /** Inserts a new creative asset. */
  def insert(request: AccesstokenAdvertiserId): Request[CreativeAssetMetadata] = js.native
  def insert(request: AdvertiserIdAlt, body: CreativeAssetMetadata): Request[CreativeAssetMetadata] = js.native
}
