package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Note holding the version of the provider&#39;s builder and the signature of
  * the provenance message in the build details occurrence.
  */
@js.native
trait SchemaBuild extends js.Object {
  /**
    * Required. Immutable. Version of the builder which produced this build.
    */
  var builderVersion: js.UndefOr[String] = js.native
  /**
    * Signature of the build in occurrences pointing to this build note
    * containing build details.
    */
  var signature: js.UndefOr[SchemaBuildSignature] = js.native
}

object SchemaBuild {
  @scala.inline
  def apply(builderVersion: String = null, signature: SchemaBuildSignature = null): SchemaBuild = {
    val __obj = js.Dynamic.literal()
    if (builderVersion != null) __obj.updateDynamic("builderVersion")(builderVersion.asInstanceOf[js.Any])
    if (signature != null) __obj.updateDynamic("signature")(signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBuild]
  }
}

