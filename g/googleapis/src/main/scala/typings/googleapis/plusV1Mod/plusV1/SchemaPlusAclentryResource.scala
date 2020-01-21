package typings.googleapis.plusV1Mod.plusV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPlusAclentryResource extends js.Object {
  /**
    * A descriptive name for this entry. Suitable for display.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The ID of the entry. For entries of type &quot;person&quot; or
    * &quot;circle&quot;, this is the ID of the resource. For other types, this
    * property is not set.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The type of entry describing to whom access is granted. Possible values
    * are:   - &quot;person&quot; - Access to an individual.  -
    * &quot;circle&quot; - Access to members of a circle.  -
    * &quot;myCircles&quot; - Access to members of all the person&#39;s
    * circles.  - &quot;extendedCircles&quot; - Access to members of all the
    * person&#39;s circles, plus all of the people in their circles.  -
    * &quot;domain&quot; - Access to members of the person&#39;s Google Apps
    * domain.  - &quot;public&quot; - Access to anyone on the web.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaPlusAclentryResource {
  @scala.inline
  def apply(displayName: String = null, id: String = null, `type`: String = null): SchemaPlusAclentryResource = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPlusAclentryResource]
  }
}

