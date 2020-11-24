package typings.jqueryCropper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends js.Object {
  
  def cropper(): JQuery = js.native
  def cropper(method: String, arguments: js.Any*): JQuery = js.native
  def cropper(options: CropperOptions): JQuery = js.native
  
  var selector: JQuery = js.native
}
