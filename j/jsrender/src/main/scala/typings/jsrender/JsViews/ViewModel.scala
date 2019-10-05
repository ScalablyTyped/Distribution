package typings.jsrender.JsViews

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewModel
  extends /* prop */ StringDictionary[js.Any] {
  var extend: Hash[_] = js.native
  /* ViewModel options hash */
  var getters: js.Array[String] = js.native
  def apply(args: js.Any*): js.Any = js.native
  def map(data: js.Any): js.Any = js.native
}

