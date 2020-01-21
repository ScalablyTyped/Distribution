package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details of an image occurrence.
  */
@js.native
trait SchemaGrafeasV1beta1ImageDetails extends js.Object {
  /**
    * Required. Immutable. The child image derived from the base image.
    */
  var derivedImage: js.UndefOr[SchemaDerived] = js.native
}

object SchemaGrafeasV1beta1ImageDetails {
  @scala.inline
  def apply(derivedImage: SchemaDerived = null): SchemaGrafeasV1beta1ImageDetails = {
    val __obj = js.Dynamic.literal()
    if (derivedImage != null) __obj.updateDynamic("derivedImage")(derivedImage.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGrafeasV1beta1ImageDetails]
  }
}

