package typings.luminoKeyboard.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.luminoKeyboard.mod.KeycodeLayout.CodeMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/keyboard", "KeycodeLayout")
@js.native
class KeycodeLayout protected () extends IKeyboardLayout {
  /**
    * Construct a new keycode layout.
    *
    * @param name - The human readable name for the layout.
    *
    * @param codes - A mapping of keycode to key value.
    */
  def this(name: String, codes: CodeMap) = this()
  
  var _codes: js.Any = js.native
  
  var _keys: js.Any = js.native
}
@JSImport("@lumino/keyboard", "KeycodeLayout")
@js.native
object KeycodeLayout extends js.Object {
  
  /**
    * Extract the set of keys from a code map.
    *
    * @param code - The code map of interest.
    *
    * @returns A set of the keys in the code map.
    */
  def extractKeys(codes: CodeMap): KeySet = js.native
  
  /**
    * A type alias for a keycode map.
    */
  type CodeMap = NumberDictionary[String]
  
  /**
    * A type alias for a key set.
    */
  type KeySet = StringDictionary[Boolean]
}
