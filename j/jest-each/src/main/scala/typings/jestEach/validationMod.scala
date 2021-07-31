package typings.jestEach

import typings.jestTypes.globalMod.TemplateData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validationMod {
  
  @JSImport("jest-each/build/validation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def validateArrayTable(table: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateArrayTable")(table.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def validateTemplateTableHeadings(headings: js.Array[String], data: TemplateData): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateTemplateTableHeadings")(headings.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
