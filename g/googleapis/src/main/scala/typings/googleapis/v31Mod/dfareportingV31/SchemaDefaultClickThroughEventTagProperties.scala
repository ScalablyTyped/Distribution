package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Properties of inheriting and overriding the default click-through event
  * tag. A campaign may override the event tag defined at the advertiser level,
  * and an ad may also override the campaign&#39;s setting further.
  */
@js.native
trait SchemaDefaultClickThroughEventTagProperties extends js.Object {
  /**
    * ID of the click-through event tag to apply to all ads in this
    * entity&#39;s scope.
    */
  var defaultClickThroughEventTagId: js.UndefOr[String] = js.native
  /**
    * Whether this entity should override the inherited default click-through
    * event tag with its own defined value.
    */
  var overrideInheritedEventTag: js.UndefOr[Boolean] = js.native
}

object SchemaDefaultClickThroughEventTagProperties {
  @scala.inline
  def apply(
    defaultClickThroughEventTagId: String = null,
    overrideInheritedEventTag: js.UndefOr[Boolean] = js.undefined
  ): SchemaDefaultClickThroughEventTagProperties = {
    val __obj = js.Dynamic.literal()
    if (defaultClickThroughEventTagId != null) __obj.updateDynamic("defaultClickThroughEventTagId")(defaultClickThroughEventTagId.asInstanceOf[js.Any])
    if (!js.isUndefined(overrideInheritedEventTag)) __obj.updateDynamic("overrideInheritedEventTag")(overrideInheritedEventTag.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDefaultClickThroughEventTagProperties]
  }
}

