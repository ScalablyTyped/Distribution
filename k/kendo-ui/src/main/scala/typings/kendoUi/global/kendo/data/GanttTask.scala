package typings.kendoUi.global.kendo.data

import org.scalablytyped.runtime.Instantiable1
import typings.kendoUi.anon.TypeofGanttTask
import typings.kendoUi.kendo.data.DataSourceSchemaModelFields
import typings.kendoUi.kendo.data.DataSourceSchemaModelWithFieldsArray
import typings.kendoUi.kendo.data.DataSourceSchemaModelWithFieldsObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.data.GanttTask")
@js.native
class GanttTask ()
  extends StObject
     with typings.kendoUi.kendo.data.GanttTask {
  def this(data: js.Any) = this()
}
object GanttTask {
  
  @JSGlobal("kendo.data.GanttTask")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def define(options: DataSourceSchemaModelWithFieldsArray): TypeofGanttTask & (Instantiable1[/* data */ js.UndefOr[js.Any], typings.kendoUi.kendo.data.GanttTask]) = ^.asInstanceOf[js.Dynamic].applyDynamic("define")(options.asInstanceOf[js.Any]).asInstanceOf[TypeofGanttTask & (Instantiable1[/* data */ js.UndefOr[js.Any], typings.kendoUi.kendo.data.GanttTask])]
  /* static member */
  inline def define(options: DataSourceSchemaModelWithFieldsObject): TypeofGanttTask & (Instantiable1[/* data */ js.UndefOr[js.Any], typings.kendoUi.kendo.data.GanttTask]) = ^.asInstanceOf[js.Dynamic].applyDynamic("define")(options.asInstanceOf[js.Any]).asInstanceOf[TypeofGanttTask & (Instantiable1[/* data */ js.UndefOr[js.Any], typings.kendoUi.kendo.data.GanttTask])]
  
  /* static member */
  @JSGlobal("kendo.data.GanttTask.fields")
  @js.native
  def fields: DataSourceSchemaModelFields = js.native
  inline def fields_=(x: DataSourceSchemaModelFields): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fields")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("kendo.data.GanttTask.idField")
  @js.native
  def idField: String = js.native
  inline def idField_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("idField")(x.asInstanceOf[js.Any])
}
