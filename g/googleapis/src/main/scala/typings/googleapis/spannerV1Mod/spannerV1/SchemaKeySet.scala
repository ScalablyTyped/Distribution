package typings.googleapis.spannerV1Mod.spannerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `KeySet` defines a collection of Cloud Spanner keys and/or key ranges. All
  * the keys are expected to be in the same table or index. The keys need not
  * be sorted in any particular way.  If the same key is specified multiple
  * times in the set (for example if two ranges, two keys, or a key and a range
  * overlap), Cloud Spanner behaves as if the key were only specified once.
  */
@js.native
trait SchemaKeySet extends js.Object {
  /**
    * For convenience `all` can be set to `true` to indicate that this `KeySet`
    * matches all keys in the table or index. Note that any keys specified in
    * `keys` or `ranges` are only yielded once.
    */
  var all: js.UndefOr[Boolean] = js.native
  /**
    * A list of specific keys. Entries in `keys` should have exactly as many
    * elements as there are columns in the primary or index key with which this
    * `KeySet` is used.  Individual key values are encoded as described here.
    */
  var keys: js.UndefOr[js.Array[js.Array[_]]] = js.native
  /**
    * A list of key ranges. See KeyRange for more information about key range
    * specifications.
    */
  var ranges: js.UndefOr[js.Array[SchemaKeyRange]] = js.native
}

object SchemaKeySet {
  @scala.inline
  def apply(
    all: js.UndefOr[Boolean] = js.undefined,
    keys: js.Array[js.Array[_]] = null,
    ranges: js.Array[SchemaKeyRange] = null
  ): SchemaKeySet = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(all)) __obj.updateDynamic("all")(all.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    if (ranges != null) __obj.updateDynamic("ranges")(ranges.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaKeySet]
  }
}

