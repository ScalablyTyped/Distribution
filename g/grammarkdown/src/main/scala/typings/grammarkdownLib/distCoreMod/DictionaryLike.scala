package typings
package grammarkdownLib.distCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DictionaryLike[T]
  extends /* key */ org.scalablytyped.runtime.StringDictionary[T]
     with /* key */ org.scalablytyped.runtime.NumberDictionary[T]

object DictionaryLike {
  @scala.inline
  def apply[T](
    NumberDictionary: /* key */ org.scalablytyped.runtime.NumberDictionary[T] = null,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[T] = null
  ): DictionaryLike[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[DictionaryLike[T]]
  }
}

