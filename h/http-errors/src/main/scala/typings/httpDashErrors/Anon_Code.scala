package typings.httpDashErrors

import org.scalablytyped.runtime.StringDictionary
import typings.httpDashErrors.httpDashErrorsMod.HttpErrorConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Code extends /* code */ StringDictionary[HttpErrorConstructor] {
  var HttpError: HttpErrorConstructor
}

object Anon_Code {
  @scala.inline
  def apply(
    HttpError: HttpErrorConstructor,
    StringDictionary: /* code */ StringDictionary[HttpErrorConstructor] = null
  ): Anon_Code = {
    val __obj = js.Dynamic.literal(HttpError = HttpError)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Code]
  }
}

