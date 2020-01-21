package typings.instagramPrivateApi.highlightsRepositoryCreateReelResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlightsRepositoryCreateReelResponseFullImageVersion extends js.Object {
  var estimated_scans_sizes: js.Array[Double]
  var height: Double
  var url: String
  var width: Double
}

object HighlightsRepositoryCreateReelResponseFullImageVersion {
  @scala.inline
  def apply(estimated_scans_sizes: js.Array[Double], height: Double, url: String, width: Double): HighlightsRepositoryCreateReelResponseFullImageVersion = {
    val __obj = js.Dynamic.literal(estimated_scans_sizes = estimated_scans_sizes.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HighlightsRepositoryCreateReelResponseFullImageVersion]
  }
}

