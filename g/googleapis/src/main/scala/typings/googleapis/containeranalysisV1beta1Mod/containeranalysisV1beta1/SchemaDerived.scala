package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Derived describes the derived image portion (Occurrence) of the DockerImage
  * relationship. This image would be produced from a Dockerfile with FROM
  * &lt;DockerImage.Basis in attached Note&gt;.
  */
@js.native
trait SchemaDerived extends js.Object {
  /**
    * Output only. This contains the base image URL for the derived image
    * occurrence.
    */
  var baseResourceUrl: js.UndefOr[String] = js.native
  /**
    * Output only. The number of layers by which this image differs from the
    * associated image basis.
    */
  var distance: js.UndefOr[Double] = js.native
  /**
    * Required. The fingerprint of the derived image.
    */
  var fingerprint: js.UndefOr[SchemaFingerprint] = js.native
  /**
    * This contains layer-specific metadata, if populated it has length
    * &quot;distance&quot; and is ordered with [distance] being the layer
    * immediately following the base image and [1] being the final layer.
    */
  var layerInfo: js.UndefOr[js.Array[SchemaLayer]] = js.native
}

object SchemaDerived {
  @scala.inline
  def apply(
    baseResourceUrl: String = null,
    distance: js.UndefOr[Double] = js.undefined,
    fingerprint: SchemaFingerprint = null,
    layerInfo: js.Array[SchemaLayer] = null
  ): SchemaDerived = {
    val __obj = js.Dynamic.literal()
    if (baseResourceUrl != null) __obj.updateDynamic("baseResourceUrl")(baseResourceUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(distance)) __obj.updateDynamic("distance")(distance.get.asInstanceOf[js.Any])
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint.asInstanceOf[js.Any])
    if (layerInfo != null) __obj.updateDynamic("layerInfo")(layerInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDerived]
  }
}

