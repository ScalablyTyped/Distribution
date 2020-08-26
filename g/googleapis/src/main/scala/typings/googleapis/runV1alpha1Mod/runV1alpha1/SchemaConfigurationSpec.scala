package typings.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ConfigurationSpec holds the desired state of the Configuration (from the
  * client).
  */
@js.native
trait SchemaConfigurationSpec extends js.Object {
  /**
    * Deprecated and not currently populated by Cloud Run. See
    * metadata.generation instead, which is the sequence number containing the
    * latest generation of the desired state.  Read-only.
    */
  var generation: js.UndefOr[Double] = js.native
  /**
    * RevisionTemplate holds the latest specification for the Revision to be
    * stamped out. The template references the container image, and may also
    * include labels and annotations that should be attached to the Revision.
    * To correlate a Revision, and/or to force a Revision to be created when
    * the spec doesn&#39;t otherwise change, a nonce label may be provided in
    * the template metadata. For more details, see:
    * https://github.com/knative/serving/blob/master/docs/client-conventions.md#associate-modifications-with-revisions
    * Cloud Run does not currently support referencing a build that is
    * responsible for materializing the container image from source.
    */
  var revisionTemplate: js.UndefOr[SchemaRevisionTemplate] = js.native
}

object SchemaConfigurationSpec {
  @scala.inline
  def apply(): SchemaConfigurationSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfigurationSpec]
  }
  @scala.inline
  implicit class SchemaConfigurationSpecOps[Self <: SchemaConfigurationSpec] (val x: Self) extends AnyVal {
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
    def setGeneration(value: Double): Self = this.set("generation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeneration: Self = this.set("generation", js.undefined)
    @scala.inline
    def setRevisionTemplate(value: SchemaRevisionTemplate): Self = this.set("revisionTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevisionTemplate: Self = this.set("revisionTemplate", js.undefined)
  }
  
}

