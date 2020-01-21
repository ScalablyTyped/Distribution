package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaWindowsDetail extends js.Object {
  /**
    * Required. The CPE URI in [cpe
    * format](https://cpe.mitre.org/specification/) in which the vulnerability
    * manifests. Examples include distro or storage location for vulnerable
    * jar.
    */
  var cpeUri: js.UndefOr[String] = js.native
  /**
    * The description of the vulnerability.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Required. The names of the KBs which have hotfixes to mitigate this
    * vulnerability. Note that there may be multiple hotfixes (and thus
    * multiple KBs) that mitigate a given vulnerability. Currently any listed
    * kb&#39;s presence is considered a fix.
    */
  var fixingKbs: js.UndefOr[js.Array[SchemaKnowledgeBase]] = js.native
  /**
    * Required. The name of the vulnerability.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaWindowsDetail {
  @scala.inline
  def apply(
    cpeUri: String = null,
    description: String = null,
    fixingKbs: js.Array[SchemaKnowledgeBase] = null,
    name: String = null
  ): SchemaWindowsDetail = {
    val __obj = js.Dynamic.literal()
    if (cpeUri != null) __obj.updateDynamic("cpeUri")(cpeUri.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (fixingKbs != null) __obj.updateDynamic("fixingKbs")(fixingKbs.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaWindowsDetail]
  }
}

