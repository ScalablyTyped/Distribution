package typings.httpErrors

import org.scalablytyped.runtime.StringDictionary
import typings.httpErrors.mod.HttpErrorConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCode extends /* code */ StringDictionary[HttpErrorConstructor] {
  var HttpError: HttpErrorConstructor
}

object AnonCode {
  @scala.inline
  def apply(
    HttpError: HttpErrorConstructor,
    StringDictionary: /* code */ StringDictionary[HttpErrorConstructor] = null
  ): AnonCode = {
    val __obj = js.Dynamic.literal(HttpError = HttpError.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonCode]
  }
}

