package typings
package jwsLib.jwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Header
  extends /* name */ org.scalablytyped.runtime.StringDictionary[java.lang.String] {
  var alg: Algorithm
}

object Header {
  @scala.inline
  def apply(
    alg: Algorithm,
    StringDictionary: /* name */ org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): Header = {
    val __obj = js.Dynamic.literal(alg = alg)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Header]
  }
}

