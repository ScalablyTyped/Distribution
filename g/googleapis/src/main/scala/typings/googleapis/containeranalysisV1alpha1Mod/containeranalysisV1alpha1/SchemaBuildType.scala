package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Note holding the version of the provider&#39;s builder and the signature of
  * the provenance message in linked BuildDetails.
  */
@js.native
trait SchemaBuildType extends js.Object {
  /**
    * Version of the builder which produced this Note.
    */
  var builderVersion: js.UndefOr[String] = js.native
  /**
    * Signature of the build in Occurrences pointing to the Note containing
    * this `BuilderDetails`.
    */
  var signature: js.UndefOr[SchemaBuildSignature] = js.native
}

object SchemaBuildType {
  @scala.inline
  def apply(): SchemaBuildType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildType]
  }
  @scala.inline
  implicit class SchemaBuildTypeOps[Self <: SchemaBuildType] (val x: Self) extends AnyVal {
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
    def setBuilderVersion(value: String): Self = this.set("builderVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuilderVersion: Self = this.set("builderVersion", js.undefined)
    @scala.inline
    def setSignature(value: SchemaBuildSignature): Self = this.set("signature", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignature: Self = this.set("signature", js.undefined)
  }
  
}

