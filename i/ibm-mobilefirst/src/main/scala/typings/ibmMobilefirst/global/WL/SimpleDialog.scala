package typings.ibmMobilefirst.global.WL

import typings.ibmMobilefirst.WL.SimpleDialog.Button
import typings.ibmMobilefirst.WL.SimpleDialog.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("WL.SimpleDialog")
@js.native
object SimpleDialog extends js.Object {
  
  def show(title: String, text: String, buttons: js.Array[Button]): Unit = js.native
  def show(title: String, text: String, buttons: js.Array[Button], options: Options): Unit = js.native
}
