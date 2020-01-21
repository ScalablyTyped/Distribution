package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Publisher Dynamic Tag
  */
@js.native
trait SchemaFloodlightActivityPublisherDynamicTag extends js.Object {
  /**
    * Whether this tag is applicable only for click-throughs.
    */
  var clickThrough: js.UndefOr[Boolean] = js.native
  /**
    * Directory site ID of this dynamic tag. This is a write-only field that
    * can be used as an alternative to the siteId field. When this resource is
    * retrieved, only the siteId field will be populated.
    */
  var directorySiteId: js.UndefOr[String] = js.native
  /**
    * Dynamic floodlight tag.
    */
  var dynamicTag: js.UndefOr[SchemaFloodlightActivityDynamicTag] = js.native
  /**
    * Site ID of this dynamic tag.
    */
  var siteId: js.UndefOr[String] = js.native
  /**
    * Dimension value for the ID of the site. This is a read-only,
    * auto-generated field.
    */
  var siteIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  /**
    * Whether this tag is applicable only for view-throughs.
    */
  var viewThrough: js.UndefOr[Boolean] = js.native
}

object SchemaFloodlightActivityPublisherDynamicTag {
  @scala.inline
  def apply(
    clickThrough: js.UndefOr[Boolean] = js.undefined,
    directorySiteId: String = null,
    dynamicTag: SchemaFloodlightActivityDynamicTag = null,
    siteId: String = null,
    siteIdDimensionValue: SchemaDimensionValue = null,
    viewThrough: js.UndefOr[Boolean] = js.undefined
  ): SchemaFloodlightActivityPublisherDynamicTag = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clickThrough)) __obj.updateDynamic("clickThrough")(clickThrough.asInstanceOf[js.Any])
    if (directorySiteId != null) __obj.updateDynamic("directorySiteId")(directorySiteId.asInstanceOf[js.Any])
    if (dynamicTag != null) __obj.updateDynamic("dynamicTag")(dynamicTag.asInstanceOf[js.Any])
    if (siteId != null) __obj.updateDynamic("siteId")(siteId.asInstanceOf[js.Any])
    if (siteIdDimensionValue != null) __obj.updateDynamic("siteIdDimensionValue")(siteIdDimensionValue.asInstanceOf[js.Any])
    if (!js.isUndefined(viewThrough)) __obj.updateDynamic("viewThrough")(viewThrough.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFloodlightActivityPublisherDynamicTag]
  }
}

