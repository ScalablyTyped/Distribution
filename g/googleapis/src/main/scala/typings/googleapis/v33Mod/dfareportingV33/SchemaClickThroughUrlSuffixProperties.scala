package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Click Through URL Suffix settings.
  */
@js.native
trait SchemaClickThroughUrlSuffixProperties extends js.Object {
  /**
    * Click-through URL suffix to apply to all ads in this entity&#39;s scope.
    * Must be less than 128 characters long.
    */
  var clickThroughUrlSuffix: js.UndefOr[String] = js.native
  /**
    * Whether this entity should override the inherited click-through URL
    * suffix with its own defined value.
    */
  var overrideInheritedSuffix: js.UndefOr[Boolean] = js.native
}

object SchemaClickThroughUrlSuffixProperties {
  @scala.inline
  def apply(clickThroughUrlSuffix: String = null, overrideInheritedSuffix: js.UndefOr[Boolean] = js.undefined): SchemaClickThroughUrlSuffixProperties = {
    val __obj = js.Dynamic.literal()
    if (clickThroughUrlSuffix != null) __obj.updateDynamic("clickThroughUrlSuffix")(clickThroughUrlSuffix.asInstanceOf[js.Any])
    if (!js.isUndefined(overrideInheritedSuffix)) __obj.updateDynamic("overrideInheritedSuffix")(overrideInheritedSuffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaClickThroughUrlSuffixProperties]
  }
}

