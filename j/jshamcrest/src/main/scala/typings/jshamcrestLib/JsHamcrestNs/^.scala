package typings
package jshamcrestLib.JsHamcrestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("JsHamcrest")
@js.native
object ^ extends js.Object {
  var version: java.lang.String = js.native
  def EqualTo(
    factory: js.Function1[
      /* matcher */ jshamcrestLib.JsHamcrestNs.Matcher, 
      jshamcrestLib.JsHamcrestNs.Matcher
    ]
  ): js.Function1[/* matcherOrValue */ js.Any, jshamcrestLib.JsHamcrestNs.Matcher] = js.native
  def isMatcher(obj: js.Any): scala.Boolean = js.native
}

