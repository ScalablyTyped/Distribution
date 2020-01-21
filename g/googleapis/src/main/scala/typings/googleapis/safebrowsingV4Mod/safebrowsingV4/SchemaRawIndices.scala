package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of raw indices to remove from a local list.
  */
@js.native
trait SchemaRawIndices extends js.Object {
  /**
    * The indices to remove from a lexicographically-sorted local list.
    */
  var indices: js.UndefOr[js.Array[Double]] = js.native
}

object SchemaRawIndices {
  @scala.inline
  def apply(indices: js.Array[Double] = null): SchemaRawIndices = {
    val __obj = js.Dynamic.literal()
    if (indices != null) __obj.updateDynamic("indices")(indices.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRawIndices]
  }
}

