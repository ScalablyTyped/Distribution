package typings.jsonfile

import typings.jsonfile.mod.JFReadOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsonfile/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  
  def stringify(obj: js.Any): String = js.native
  def stringify(obj: js.Any, options: JFReadOptions): String = js.native
  
  def stripBom(content: String): String = js.native
}
