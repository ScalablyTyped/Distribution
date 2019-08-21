package typings.jsrsasign

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlgPass extends js.Object {
  var alg: String
  var pass: StringDictionary[String]
}

object Anon_AlgPass {
  @scala.inline
  def apply(alg: String, pass: StringDictionary[String]): Anon_AlgPass = {
    val __obj = js.Dynamic.literal(alg = alg, pass = pass)
  
    __obj.asInstanceOf[Anon_AlgPass]
  }
}

