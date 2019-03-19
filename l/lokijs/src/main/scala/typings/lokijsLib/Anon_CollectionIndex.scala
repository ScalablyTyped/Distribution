package typings
package lokijsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CollectionIndex extends js.Object {
  var collectionIndex: js.UndefOr[scala.Double] = js.undefined
  var delimited: js.UndefOr[scala.Boolean] = js.undefined
  var delimiter: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_CollectionIndex {
  @scala.inline
  def apply(
    collectionIndex: scala.Int | scala.Double = null,
    delimited: js.UndefOr[scala.Boolean] = js.undefined,
    delimiter: java.lang.String = null
  ): Anon_CollectionIndex = {
    val __obj = js.Dynamic.literal()
    if (collectionIndex != null) __obj.updateDynamic("collectionIndex")(collectionIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(delimited)) __obj.updateDynamic("delimited")(delimited)
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter)
    __obj.asInstanceOf[Anon_CollectionIndex]
  }
}

