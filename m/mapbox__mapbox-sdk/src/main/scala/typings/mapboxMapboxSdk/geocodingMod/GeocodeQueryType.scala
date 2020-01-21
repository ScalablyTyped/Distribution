package typings.mapboxMapboxSdk.geocodingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.country
  - typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.region
  - typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.postcode
  - typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.district
  - typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.place
  - typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.locality
  - typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.neighborhood
  - typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.address
  - typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.poi
  - typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.poiDotlandmark
*/
trait GeocodeQueryType extends js.Object

object GeocodeQueryType {
  @scala.inline
  def address: typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.address = this.cast("address")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def country: typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.country = this.cast("country")
  @scala.inline
  def district: typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.district = this.cast("district")
  @scala.inline
  def locality: typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.locality = this.cast("locality")
  @scala.inline
  def neighborhood: typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.neighborhood = this.cast("neighborhood")
  @scala.inline
  def place: typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.place = this.cast("place")
  @scala.inline
  def poi: typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.poi = this.cast("poi")
  @scala.inline
  def poiDotlandmark: typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.poiDotlandmark = this.cast("poi.landmark")
  @scala.inline
  def postcode: typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.postcode = this.cast("postcode")
  @scala.inline
  def region: typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.region = this.cast("region")
}

