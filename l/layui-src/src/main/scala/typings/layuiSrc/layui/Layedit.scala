package typings.layuiSrc.layui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Layedit extends js.Object {
  
  def build(id: String): js.Any = js.native
  def build(id: String, options: EditOption): js.Any = js.native
  
  def getContent(index: Double): String = js.native
  
  def getSelection(index: Double): String = js.native
  
  def getText(index: Double): String = js.native
  
  def set(options: EditOption): Unit = js.native
  
  def sync(index: Double): Unit = js.native
}
