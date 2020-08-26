package typings.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The desired state of the Domain Mapping.
  */
@js.native
trait SchemaDomainMappingSpec extends js.Object {
  /**
    * The mode of the certificate.
    */
  var certificateMode: js.UndefOr[String] = js.native
  /**
    * If set, the mapping will override any mapping set before this spec was
    * set. It is recommended that the user leaves this empty to receive an
    * error warning about a potential conflict and only set it once the
    * respective UI has given such a warning.
    */
  var forceOverride: js.UndefOr[Boolean] = js.native
  /**
    * The name of the Knative Route that this DomainMapping applies to. The
    * route must exist.
    */
  var routeName: js.UndefOr[String] = js.native
}

object SchemaDomainMappingSpec {
  @scala.inline
  def apply(): SchemaDomainMappingSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDomainMappingSpec]
  }
  @scala.inline
  implicit class SchemaDomainMappingSpecOps[Self <: SchemaDomainMappingSpec] (val x: Self) extends AnyVal {
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
    def setCertificateMode(value: String): Self = this.set("certificateMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateMode: Self = this.set("certificateMode", js.undefined)
    @scala.inline
    def setForceOverride(value: Boolean): Self = this.set("forceOverride", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceOverride: Self = this.set("forceOverride", js.undefined)
    @scala.inline
    def setRouteName(value: String): Self = this.set("routeName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRouteName: Self = this.set("routeName", js.undefined)
  }
  
}

