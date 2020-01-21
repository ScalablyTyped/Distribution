package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Floodlight Activity GenerateTag Response
  */
@js.native
trait SchemaFloodlightActivitiesGenerateTagResponse extends js.Object {
  /**
    * Generated tag for this Floodlight activity. For global site tags, this is
    * the event snippet.
    */
  var floodlightActivityTag: js.UndefOr[String] = js.native
  /**
    * The global snippet section of a global site tag. The global site tag sets
    * new cookies on your domain, which will store a unique identifier for a
    * user or the ad click that brought the user to your site. Learn more.
    */
  var globalSiteTagGlobalSnippet: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#floodlightActivitiesGenerateTagResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaFloodlightActivitiesGenerateTagResponse {
  @scala.inline
  def apply(
    floodlightActivityTag: String = null,
    globalSiteTagGlobalSnippet: String = null,
    kind: String = null
  ): SchemaFloodlightActivitiesGenerateTagResponse = {
    val __obj = js.Dynamic.literal()
    if (floodlightActivityTag != null) __obj.updateDynamic("floodlightActivityTag")(floodlightActivityTag.asInstanceOf[js.Any])
    if (globalSiteTagGlobalSnippet != null) __obj.updateDynamic("globalSiteTagGlobalSnippet")(globalSiteTagGlobalSnippet.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFloodlightActivitiesGenerateTagResponse]
  }
}

