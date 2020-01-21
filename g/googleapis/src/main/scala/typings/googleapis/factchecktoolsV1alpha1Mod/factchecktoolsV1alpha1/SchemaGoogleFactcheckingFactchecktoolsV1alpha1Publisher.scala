package typings.googleapis.factchecktoolsV1alpha1Mod.factchecktoolsV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about the publisher.
  */
@js.native
trait SchemaGoogleFactcheckingFactchecktoolsV1alpha1Publisher extends js.Object {
  /**
    * The name of this publisher. For instance, &quot;Awesome Fact
    * Checks&quot;.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Host-level site name, without the protocol or &quot;www&quot; prefix. For
    * instance, &quot;awesomefactchecks.com&quot;. This value of this field is
    * based purely on the claim review URL.
    */
  var site: js.UndefOr[String] = js.native
}

object SchemaGoogleFactcheckingFactchecktoolsV1alpha1Publisher {
  @scala.inline
  def apply(name: String = null, site: String = null): SchemaGoogleFactcheckingFactchecktoolsV1alpha1Publisher = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (site != null) __obj.updateDynamic("site")(site.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleFactcheckingFactchecktoolsV1alpha1Publisher]
  }
}

