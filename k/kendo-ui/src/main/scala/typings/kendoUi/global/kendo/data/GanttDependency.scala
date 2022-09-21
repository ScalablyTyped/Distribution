package typings.kendoUi.global.kendo.data

import org.scalablytyped.runtime.Instantiable1
import typings.kendoUi.anon.TypeofGanttDependency
import typings.kendoUi.kendo.data.DataSourceSchemaModelFields
import typings.kendoUi.kendo.data.DataSourceSchemaModelWithFieldsArray
import typings.kendoUi.kendo.data.DataSourceSchemaModelWithFieldsObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.data.GanttDependency")
@js.native
open class GanttDependency ()
  extends StObject
     with typings.kendoUi.kendo.data.GanttDependency {
  def this(data: Any) = this()
}
object GanttDependency {
  
  @JSGlobal("kendo.data.GanttDependency")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def define(options: DataSourceSchemaModelWithFieldsArray): TypeofGanttDependency & (Instantiable1[/* data */ js.UndefOr[Any], typings.kendoUi.kendo.data.GanttDependency]) = ^.asInstanceOf[js.Dynamic].applyDynamic("define")(options.asInstanceOf[js.Any]).asInstanceOf[TypeofGanttDependency & (Instantiable1[/* data */ js.UndefOr[Any], typings.kendoUi.kendo.data.GanttDependency])]
  /* static member */
  inline def define(options: DataSourceSchemaModelWithFieldsObject): TypeofGanttDependency & (Instantiable1[/* data */ js.UndefOr[Any], typings.kendoUi.kendo.data.GanttDependency]) = ^.asInstanceOf[js.Dynamic].applyDynamic("define")(options.asInstanceOf[js.Any]).asInstanceOf[TypeofGanttDependency & (Instantiable1[/* data */ js.UndefOr[Any], typings.kendoUi.kendo.data.GanttDependency])]
  
  /* static member */
  @JSGlobal("kendo.data.GanttDependency.fields")
  @js.native
  def fields: DataSourceSchemaModelFields = js.native
  inline def fields_=(x: DataSourceSchemaModelFields): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fields")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("kendo.data.GanttDependency.idField")
  @js.native
  def idField: String = js.native
  inline def idField_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("idField")(x.asInstanceOf[js.Any])
}
