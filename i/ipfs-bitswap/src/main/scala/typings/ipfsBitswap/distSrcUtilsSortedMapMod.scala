package typings.ipfsBitswap

import typings.std.Generator
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsSortedMapMod {
  
  @JSImport("ipfs-bitswap/dist/src/utils/sorted-map", "SortedMap")
  @js.native
  /**
    * @param {Array<[Key, Value]>} [entries]
    * @param {(a:[Key, Value], b:[Key, Value]) => number} [cmp] - compares [k1, v1] to [k2, v2]
    */
  open class SortedMap[Key, Value] ()
    extends StObject
       with Map[Key, Value] {
    def this(entries: js.Array[js.Tuple2[Key, Value]]) = this()
    def this(
      entries: js.Array[js.Tuple2[Key, Value]],
      cmp: js.Function2[/* a */ js.Tuple2[Key, Value], /* b */ js.Tuple2[Key, Value], Double]
    ) = this()
    def this(
      entries: Unit,
      cmp: js.Function2[/* a */ js.Tuple2[Key, Value], /* b */ js.Tuple2[Key, Value], Double]
    ) = this()
    
    def _cmp(a: js.Tuple2[Key, Value], b: js.Tuple2[Key, Value]): Double = js.native
    
    /**
      * @private
      * @param {[Key, Value]} a
      * @param {[Key, Value]} b
      * @returns {0|1|-1}
      */
    /* private */ var _defaultSort: Any = js.native
    
    /**
      * @private
      * @param {Key} k
      * @returns {number}
      */
    /* private */ var _find: Any = js.native
    
    /**
      * @private
      * @param {Key} a
      * @param {Key} b
      */
    /* private */ var _kCmp: Any = js.native
    
    /** @type {Key[]} */
    var _keys: js.Array[Key] = js.native
    
    /**
      * @template This
      * @param {(entry:[Key, Value]) => void} cb
      * @param {This} [thisArg]
      */
    def forEach[This](cb: js.Function1[/* entry */ js.Tuple2[Key, Value], Unit]): Unit = js.native
    def forEach[This](cb: js.Function1[/* entry */ js.Tuple2[Key, Value], Unit], thisArg: This): Unit = js.native
    
    /**
      * @param {Key} k
      */
    def indexOf(k: Key): Double = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator_SortedMap: js.Function0[Generator[js.Tuple2[Key, Value], Unit, Unit]] = js.native
    
    /**
      * Call update to update the position of the key when it should change.
      * For example if the compare function sorts by the priority field, and the
      * priority changes, call update.
      * Call indexOf() to get the index _before_ the change happens.
      *
      * @param {number} i - the index of entry whose position should be updated.
      */
    def update(i: Double): Unit = js.native
  }
}
