package typings.jjv.mod

import org.scalablytyped.runtime.StringDictionary
import typings.jjv.AnonRequired
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Errors extends js.Object {
  var validation: StringDictionary[AnonRequired]
}

object Errors {
  @scala.inline
  def apply(validation: StringDictionary[AnonRequired]): Errors = {
    val __obj = js.Dynamic.literal(validation = validation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Errors]
  }
}

