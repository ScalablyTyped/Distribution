package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.DataSourceSchemaModelField
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Editable
  extends StObject
     with Widget {
  
  def editor(field: String, modelField: String): Unit = js.native
  def editor(field: String, modelField: DataSourceSchemaModelField): Unit = js.native
  def editor(field: EditorField, modelField: String): Unit = js.native
  def editor(field: EditorField, modelField: DataSourceSchemaModelField): Unit = js.native
  
  def end(): Unit = js.native
  
  @JSName("options")
  var options_Editable: EditableOptions = js.native
  
  def refresh(): Unit = js.native
  
  var validatable: js.UndefOr[Validator] = js.native
}
