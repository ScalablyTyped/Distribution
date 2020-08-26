package typings.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ServiceSpec holds the desired state of the Route (from the client), which
  * is used to manipulate the underlying Route and Configuration(s).
  */
@js.native
trait SchemaServiceSpec extends js.Object {
  /**
    * Deprecated and not currently populated by Cloud Run. See
    * metadata.generation instead, which is the sequence number containing the
    * latest generation of the desired state.  Read-only.
    */
  var generation: js.UndefOr[Double] = js.native
  /**
    * Manual contains the options for configuring a manual service. See
    * ServiceSpec for more details.  Not currently supported by Cloud Run.
    */
  var manual: js.UndefOr[SchemaServiceSpecManualType] = js.native
  /**
    * Pins this service to a specific revision name. The revision must be owned
    * by the configuration provided.  Deprecated and not supported by Cloud
    * Run. +optional
    */
  var pinned: js.UndefOr[SchemaServiceSpecPinnedType] = js.native
  /**
    * Release enables gradual promotion of new revisions by allowing traffic to
    * be split between two revisions. This type replaces the deprecated Pinned
    * type.  Not currently supported by Cloud Run.
    */
  var release: js.UndefOr[SchemaServiceSpecReleaseType] = js.native
  /**
    * RunLatest defines a simple Service. It will automatically configure a
    * route that keeps the latest ready revision from the supplied
    * configuration running. +optional
    */
  var runLatest: js.UndefOr[SchemaServiceSpecRunLatest] = js.native
}

object SchemaServiceSpec {
  @scala.inline
  def apply(): SchemaServiceSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServiceSpec]
  }
  @scala.inline
  implicit class SchemaServiceSpecOps[Self <: SchemaServiceSpec] (val x: Self) extends AnyVal {
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
    def setManual(value: SchemaServiceSpecManualType): Self = this.set("manual", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManual: Self = this.set("manual", js.undefined)
    @scala.inline
    def setPinned(value: SchemaServiceSpecPinnedType): Self = this.set("pinned", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePinned: Self = this.set("pinned", js.undefined)
    @scala.inline
    def setRelease(value: SchemaServiceSpecReleaseType): Self = this.set("release", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelease: Self = this.set("release", js.undefined)
    @scala.inline
    def setRunLatest(value: SchemaServiceSpecRunLatest): Self = this.set("runLatest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRunLatest: Self = this.set("runLatest", js.undefined)
  }
  
}

