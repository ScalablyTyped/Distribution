package typings.jsrsasign

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPass extends js.Object {
  var alg: String
  var pass: StringDictionary[String]
}

object AnonPass {
  @scala.inline
  def apply(alg: String, pass: StringDictionary[String]): AnonPass = {
    val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPass]
  }
}

