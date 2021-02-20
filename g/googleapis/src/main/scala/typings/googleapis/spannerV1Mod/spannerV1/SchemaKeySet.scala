package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * `KeySet` defines a collection of Cloud Spanner keys and/or key ranges. All
  * the keys are expected to be in the same table or index. The keys need not
  * be sorted in any particular way.  If the same key is specified multiple
  * times in the set (for example if two ranges, two keys, or a key and a range
  * overlap), Cloud Spanner behaves as if the key were only specified once.
  */
@js.native
trait SchemaKeySet extends StObject {
  
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
  implicit class SchemaKeySetMutableBuilder[Self <: SchemaKeySet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
    
    @scala.inline
    def setKeys(value: js.Array[js.Array[_]]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    @scala.inline
    def setKeysVarargs(value: js.Array[js.Any]*): Self = StObject.set(x, "keys", js.Array(value :_*))
    
    @scala.inline
    def setRanges(value: js.Array[SchemaKeyRange]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
    
    @scala.inline
    def setRangesVarargs(value: SchemaKeyRange*): Self = StObject.set(x, "ranges", js.Array(value :_*))
  }
}
