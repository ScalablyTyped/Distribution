package typings.lokijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CollectionIndex extends js.Object {
  var collectionIndex: js.UndefOr[Double] = js.undefined
  var delimited: js.UndefOr[Boolean] = js.undefined
  var delimiter: js.UndefOr[String] = js.undefined
}

object Anon_CollectionIndex {
  @scala.inline
  def apply(
    collectionIndex: Int | Double = null,
    delimited: js.UndefOr[Boolean] = js.undefined,
    delimiter: String = null
  ): Anon_CollectionIndex = {
    val __obj = js.Dynamic.literal()
    if (collectionIndex != null) __obj.updateDynamic("collectionIndex")(collectionIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(delimited)) __obj.updateDynamic("delimited")(delimited)
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter)
    __obj.asInstanceOf[Anon_CollectionIndex]
  }
}

