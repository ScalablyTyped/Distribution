package typings
package koaDashCsrfLib.koaDashCsrfMod.koaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var csrf: java.lang.String
}

object Context {
  @scala.inline
  def apply(csrf: java.lang.String): Context = {
    val __obj = js.Dynamic.literal(csrf = csrf)
  
    __obj.asInstanceOf[Context]
  }
}

