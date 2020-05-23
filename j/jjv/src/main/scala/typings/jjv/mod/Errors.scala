package typings.jjv.mod

import org.scalablytyped.runtime.StringDictionary
import typings.jjv.anon.Required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Errors extends js.Object {
  var validation: StringDictionary[Required]
}

object Errors {
  @scala.inline
  def apply(validation: StringDictionary[Required]): Errors = {
    val __obj = js.Dynamic.literal(validation = validation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Errors]
  }
}

