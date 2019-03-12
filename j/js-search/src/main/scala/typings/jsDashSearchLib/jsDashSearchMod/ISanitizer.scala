package typings
package jsDashSearchLib.jsDashSearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISanitizer extends js.Object {
  def sanitize(text: java.lang.String): java.lang.String
}

object ISanitizer {
  @scala.inline
  def apply(sanitize: java.lang.String => java.lang.String): ISanitizer = {
    val __obj = js.Dynamic.literal(sanitize = js.Any.fromFunction1(sanitize))
  
    __obj.asInstanceOf[ISanitizer]
  }
}

