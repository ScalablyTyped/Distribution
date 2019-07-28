package typings.jws.jwsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Header extends /* name */ StringDictionary[String] {
  var alg: Algorithm
}

object Header {
  @scala.inline
  def apply(alg: Algorithm, StringDictionary: /* name */ StringDictionary[String] = null): Header = {
    val __obj = js.Dynamic.literal(alg = alg)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Header]
  }
}

