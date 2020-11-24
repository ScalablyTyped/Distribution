package typings.jsrender.JsViews

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewModel
  extends /* prop */ StringDictionary[js.Any] {
  
  def apply(args: js.Any*): js.Any = js.native
  
  var extend: Hash[_] = js.native
  
  /* ViewModel options hash */
  var getters: js.Array[String] = js.native
  
  def map(data: js.Any): js.Any = js.native
}
