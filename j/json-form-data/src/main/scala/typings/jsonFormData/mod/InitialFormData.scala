package typings.jsonFormData.mod

import typings.jsonFormData.anon.FnCall
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitialFormData extends js.Object {
  
  def append(name: String, value: String): Unit = js.native
  def append(name: String, value: String, fileName: String): Unit = js.native
  def append(name: String, value: Blob): Unit = js.native
  def append(name: String, value: Blob, fileName: String): Unit = js.native
  @JSName("append")
  var append_Original: FnCall = js.native
}
