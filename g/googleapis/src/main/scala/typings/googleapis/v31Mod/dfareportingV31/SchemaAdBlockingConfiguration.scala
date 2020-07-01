package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Campaign ad blocking settings.
  */
@js.native
trait SchemaAdBlockingConfiguration extends js.Object {
  /**
    * Click-through URL used by brand-neutral ads. This is a required field
    * when overrideClickThroughUrl is set to true.
    */
  var clickThroughUrl: js.UndefOr[String] = js.native
  /**
    * ID of a creative bundle to use for this campaign. If set, brand-neutral
    * ads will select creatives from this bundle. Otherwise, a default
    * transparent pixel will be used.
    */
  var creativeBundleId: js.UndefOr[String] = js.native
  /**
    * Whether this campaign has enabled ad blocking. When true, ad blocking is
    * enabled for placements in the campaign, but this may be overridden by
    * site and placement settings. When false, ad blocking is disabled for all
    * placements under the campaign, regardless of site and placement settings.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether the brand-neutral ad&#39;s click-through URL comes from the
    * campaign&#39;s creative bundle or the override URL. Must be set to true
    * if ad blocking is enabled and no creative bundle is configured.
    */
  var overrideClickThroughUrl: js.UndefOr[Boolean] = js.native
}

object SchemaAdBlockingConfiguration {
  @scala.inline
  def apply(
    clickThroughUrl: String = null,
    creativeBundleId: String = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    overrideClickThroughUrl: js.UndefOr[Boolean] = js.undefined
  ): SchemaAdBlockingConfiguration = {
    val __obj = js.Dynamic.literal()
    if (clickThroughUrl != null) __obj.updateDynamic("clickThroughUrl")(clickThroughUrl.asInstanceOf[js.Any])
    if (creativeBundleId != null) __obj.updateDynamic("creativeBundleId")(creativeBundleId.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(overrideClickThroughUrl)) __obj.updateDynamic("overrideClickThroughUrl")(overrideClickThroughUrl.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAdBlockingConfiguration]
  }
}

