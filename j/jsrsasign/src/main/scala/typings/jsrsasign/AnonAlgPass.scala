package typings.jsrsasign

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlgPass extends js.Object {
  var alg: String
  var pass: StringDictionary[String]
}

object AnonAlgPass {
  @scala.inline
  def apply(alg: String, pass: StringDictionary[String]): AnonAlgPass = {
    val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAlgPass]
  }
}

