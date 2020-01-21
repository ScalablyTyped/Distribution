package typings.googleapis.firestoreV1Mod.firestoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A selection of a collection, such as `messages as m1`.
  */
@js.native
trait SchemaCollectionSelector extends js.Object {
  /**
    * When false, selects only collections that are immediate children of the
    * `parent` specified in the containing `RunQueryRequest`. When true,
    * selects all descendant collections.
    */
  var allDescendants: js.UndefOr[Boolean] = js.native
  /**
    * The collection ID. When set, selects only collections with this ID.
    */
  var collectionId: js.UndefOr[String] = js.native
}

object SchemaCollectionSelector {
  @scala.inline
  def apply(allDescendants: js.UndefOr[Boolean] = js.undefined, collectionId: String = null): SchemaCollectionSelector = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allDescendants)) __obj.updateDynamic("allDescendants")(allDescendants.asInstanceOf[js.Any])
    if (collectionId != null) __obj.updateDynamic("collectionId")(collectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCollectionSelector]
  }
}

