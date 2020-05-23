package typings.jsrsasign.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pass extends js.Object {
  var alg: String
  var pass: StringDictionary[String]
}

object Pass {
  @scala.inline
  def apply(alg: String, pass: StringDictionary[String]): Pass = {
    val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pass]
  }
}

