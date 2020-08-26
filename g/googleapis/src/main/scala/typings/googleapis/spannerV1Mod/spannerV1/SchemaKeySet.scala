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
  def apply(): SchemaKeySet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaKeySet]
  }
  @scala.inline
  implicit class SchemaKeySetOps[Self <: SchemaKeySet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAll(value: Boolean): Self = this.set("all", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAll: Self = this.set("all", js.undefined)
    @scala.inline
    def setKeysVarargs(value: js.Array[js.Any]*): Self = this.set("keys", js.Array(value :_*))
    @scala.inline
    def setKeys(value: js.Array[js.Array[_]]): Self = this.set("keys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeys: Self = this.set("keys", js.undefined)
    @scala.inline
    def setRangesVarargs(value: SchemaKeyRange*): Self = this.set("ranges", js.Array(value :_*))
    @scala.inline
    def setRanges(value: js.Array[SchemaKeyRange]): Self = this.set("ranges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRanges: Self = this.set("ranges", js.undefined)
  }
  
}

