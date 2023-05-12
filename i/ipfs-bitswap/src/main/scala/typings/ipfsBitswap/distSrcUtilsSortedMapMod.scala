package typings.ipfsBitswap

import typings.ipfsBitswap.ipfsBitswapInts.`-1`
import typings.ipfsBitswap.ipfsBitswapInts.`0`
import typings.ipfsBitswap.ipfsBitswapInts.`1`
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsSortedMapMod {
  
  @JSImport("ipfs-bitswap/dist/src/utils/sorted-map", "SortedMap")
  @js.native
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
    
    /* private */ val _cmp: Any = js.native
    
    def _defaultSort(a: js.Tuple2[Key, Value], b: js.Tuple2[Key, Value]): `0` | `1` | `-1` = js.native
    
    def _find(k: Key): Double = js.native
    
    def _kCmp(a: Key, b: Key): Double = js.native
    
    /* private */ var _keys: Any = js.native
    
    def forEach(cb: js.Function1[/* entry */ js.Tuple2[Key, Value], Unit]): Unit = js.native
    def forEach(cb: js.Function1[/* entry */ js.Tuple2[Key, Value], Unit], thisArg: SortedMap[Key, Value]): Unit = js.native
    
    def indexOf(k: Key): Double = js.native
    
    /**
      * Call update to update the position of the key when it should change.
      * For example if the compare function sorts by the priority field, and the
      * priority changes, call update.
      * Call indexOf() to get the index _before_ the change happens.
      */
    def update(i: Double): Unit = js.native
  }
}
