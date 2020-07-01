package typings.highcharts.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoJSONFeature
  extends Dictionary[js.Any] {
  /**
    * Data type of the geographic feature.
    */
  var `type`: String
}

object GeoJSONFeature {
  @scala.inline
  def apply(`type`: String, StringDictionary: StringDictionary[js.Any] = null): GeoJSONFeature = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[GeoJSONFeature]
  }
}

