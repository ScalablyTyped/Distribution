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
  def apply(
    generation: js.UndefOr[Double] = js.undefined,
    manual: SchemaServiceSpecManualType = null,
    pinned: SchemaServiceSpecPinnedType = null,
    release: SchemaServiceSpecReleaseType = null,
    runLatest: SchemaServiceSpecRunLatest = null
  ): SchemaServiceSpec = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(generation)) __obj.updateDynamic("generation")(generation.get.asInstanceOf[js.Any])
    if (manual != null) __obj.updateDynamic("manual")(manual.asInstanceOf[js.Any])
    if (pinned != null) __obj.updateDynamic("pinned")(pinned.asInstanceOf[js.Any])
    if (release != null) __obj.updateDynamic("release")(release.asInstanceOf[js.Any])
    if (runLatest != null) __obj.updateDynamic("runLatest")(runLatest.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaServiceSpec]
  }
}

