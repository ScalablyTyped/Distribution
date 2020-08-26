package typings.luminoAlgorithm.iterMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lumino/algorithm/types/iter", "KeyIterator")
@js.native
class KeyIterator protected () extends IIterator[String] {
  /**
    * Construct a new key iterator.
    *
    * @param source - The object of interest.
    *
    * @param keys - The keys to iterate, if known.
    */
  def this(source: StringDictionary[js.Any]) = this()
  def this(source: StringDictionary[js.Any], keys: js.Array[String]) = this()
  var _index: js.Any = js.native
  var _keys: js.Any = js.native
  var _source: js.Any = js.native
}

