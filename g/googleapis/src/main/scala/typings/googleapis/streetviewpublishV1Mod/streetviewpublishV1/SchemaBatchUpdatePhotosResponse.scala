package typings.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to batch update of metadata of one or more Photos.
  */
@js.native
trait SchemaBatchUpdatePhotosResponse extends js.Object {
  /**
    * List of results for each individual Photo updated, in the same order as
    * the request.
    */
  var results: js.UndefOr[js.Array[SchemaPhotoResponse]] = js.native
}

object SchemaBatchUpdatePhotosResponse {
  @scala.inline
  def apply(results: js.Array[SchemaPhotoResponse] = null): SchemaBatchUpdatePhotosResponse = {
    val __obj = js.Dynamic.literal()
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBatchUpdatePhotosResponse]
  }
}

