package typings.jestEach

import typings.jestTypes.globalMod.TemplateData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validationMod {
  
  @JSImport("jest-each/build/validation", "validateArrayTable")
  @js.native
  def validateArrayTable(table: js.Any): Unit = js.native
  
  @JSImport("jest-each/build/validation", "validateTemplateTableHeadings")
  @js.native
  def validateTemplateTableHeadings(headings: js.Array[String], data: TemplateData): Unit = js.native
}
