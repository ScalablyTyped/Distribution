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
  def apply(): SchemaWindowsDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWindowsDetail]
  }
  @scala.inline
  implicit class SchemaWindowsDetailOps[Self <: SchemaWindowsDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCpeUri(value: String): Self = this.set("cpeUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCpeUri: Self = this.set("cpeUri", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setFixingKbsVarargs(value: SchemaKnowledgeBase*): Self = this.set("fixingKbs", js.Array(value :_*))
    @scala.inline
    def setFixingKbs(value: js.Array[SchemaKnowledgeBase]): Self = this.set("fixingKbs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixingKbs: Self = this.set("fixingKbs", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

