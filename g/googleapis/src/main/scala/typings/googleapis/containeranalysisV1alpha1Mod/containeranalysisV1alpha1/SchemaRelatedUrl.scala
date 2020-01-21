package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata for any related URL information
  */
@js.native
trait SchemaRelatedUrl extends js.Object {
  /**
    * Label to describe usage of the URL
    */
  var label: js.UndefOr[String] = js.native
  /**
    * Specific URL to associate with the note
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaRelatedUrl {
  @scala.inline
  def apply(label: String = null, url: String = null): SchemaRelatedUrl = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRelatedUrl]
  }
}

