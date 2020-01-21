package typings.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to batch get of Photos.
  */
@js.native
trait SchemaBatchGetPhotosResponse extends js.Object {
  /**
    * List of results for each individual Photo requested, in the same order as
    * the requests in BatchGetPhotos.
    */
  var results: js.UndefOr[js.Array[SchemaPhotoResponse]] = js.native
}

object SchemaBatchGetPhotosResponse {
  @scala.inline
  def apply(results: js.Array[SchemaPhotoResponse] = null): SchemaBatchGetPhotosResponse = {
    val __obj = js.Dynamic.literal()
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBatchGetPhotosResponse]
  }
}

