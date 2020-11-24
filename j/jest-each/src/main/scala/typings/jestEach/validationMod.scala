package typings.jestEach

import typings.jestTypes.globalMod.TemplateData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-each/build/validation", JSImport.Namespace)
@js.native
object validationMod extends js.Object {
  
  def validateArrayTable(table: js.Any): Unit = js.native
  
  def validateTemplateTableHeadings(headings: js.Array[String], data: TemplateData): Unit = js.native
}
