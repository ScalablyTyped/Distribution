package typings.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Managed Short Link.
  */
@js.native
trait SchemaManagedShortLink extends js.Object {
  /**
    * Creation timestamp of the short link.
    */
  var creationTime: js.UndefOr[String] = js.native
  /**
    * Attributes that have been flagged about this short url.
    */
  var flaggedAttribute: js.UndefOr[js.Array[String]] = js.native
  /**
    * Full Dyamic Link info
    */
  var info: js.UndefOr[SchemaDynamicLinkInfo] = js.native
  /**
    * Short durable link url, for example,
    * &quot;https://sample.app.goo.gl/xyz123&quot;.  Required.
    */
  var link: js.UndefOr[String] = js.native
  /**
    * Link name defined by the creator.  Required.
    */
  var linkName: js.UndefOr[String] = js.native
  /**
    * Visibility status of link.
    */
  var visibility: js.UndefOr[String] = js.native
}

object SchemaManagedShortLink {
  @scala.inline
  def apply(
    creationTime: String = null,
    flaggedAttribute: js.Array[String] = null,
    info: SchemaDynamicLinkInfo = null,
    link: String = null,
    linkName: String = null,
    visibility: String = null
  ): SchemaManagedShortLink = {
    val __obj = js.Dynamic.literal()
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime.asInstanceOf[js.Any])
    if (flaggedAttribute != null) __obj.updateDynamic("flaggedAttribute")(flaggedAttribute.asInstanceOf[js.Any])
    if (info != null) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (linkName != null) __obj.updateDynamic("linkName")(linkName.asInstanceOf[js.Any])
    if (visibility != null) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaManagedShortLink]
  }
}

