package typings.lokijs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionIndex extends js.Object {
  var collectionIndex: js.UndefOr[Double] = js.undefined
  var delimited: js.UndefOr[Boolean] = js.undefined
  var delimiter: js.UndefOr[String] = js.undefined
}

object CollectionIndex {
  @scala.inline
  def apply(
    collectionIndex: js.UndefOr[Double] = js.undefined,
    delimited: js.UndefOr[Boolean] = js.undefined,
    delimiter: String = null
  ): CollectionIndex = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collectionIndex)) __obj.updateDynamic("collectionIndex")(collectionIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(delimited)) __obj.updateDynamic("delimited")(delimited.get.asInstanceOf[js.Any])
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionIndex]
  }
}

