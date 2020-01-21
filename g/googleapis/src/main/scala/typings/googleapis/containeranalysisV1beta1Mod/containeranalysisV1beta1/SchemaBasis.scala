package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Basis describes the base image portion (Note) of the DockerImage
  * relationship. Linked occurrences are derived from this or an equivalent
  * image via:   FROM &lt;Basis.resource_url&gt; Or an equivalent reference,
  * e.g. a tag of the resource_url.
  */
@js.native
trait SchemaBasis extends js.Object {
  /**
    * Required. Immutable. The fingerprint of the base image.
    */
  var fingerprint: js.UndefOr[SchemaFingerprint] = js.native
  /**
    * Required. Immutable. The resource_url for the resource representing the
    * basis of associated occurrence images.
    */
  var resourceUrl: js.UndefOr[String] = js.native
}

object SchemaBasis {
  @scala.inline
  def apply(fingerprint: SchemaFingerprint = null, resourceUrl: String = null): SchemaBasis = {
    val __obj = js.Dynamic.literal()
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint.asInstanceOf[js.Any])
    if (resourceUrl != null) __obj.updateDynamic("resourceUrl")(resourceUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBasis]
  }
}

