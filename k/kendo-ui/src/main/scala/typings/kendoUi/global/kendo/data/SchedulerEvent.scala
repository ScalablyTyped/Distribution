package typings.kendoUi.global.kendo.data

import org.scalablytyped.runtime.Instantiable1
import typings.kendoUi.anon.TypeofSchedulerEvent
import typings.kendoUi.kendo.data.DataSourceSchemaModelFields
import typings.kendoUi.kendo.data.DataSourceSchemaModelWithFieldsArray
import typings.kendoUi.kendo.data.DataSourceSchemaModelWithFieldsObject
import typings.kendoUi.kendo.data.SchedulerEventData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.data.SchedulerEvent")
@js.native
open class SchedulerEvent ()
  extends StObject
     with typings.kendoUi.kendo.data.SchedulerEvent {
  def this(data: SchedulerEventData) = this()
}
object SchedulerEvent {
  
  @JSGlobal("kendo.data.SchedulerEvent")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def define(options: DataSourceSchemaModelWithFieldsArray): TypeofSchedulerEvent & (Instantiable1[
    /* data */ js.UndefOr[SchedulerEventData], 
    typings.kendoUi.kendo.data.SchedulerEvent
  ]) = ^.asInstanceOf[js.Dynamic].applyDynamic("define")(options.asInstanceOf[js.Any]).asInstanceOf[TypeofSchedulerEvent & (Instantiable1[
    /* data */ js.UndefOr[SchedulerEventData], 
    typings.kendoUi.kendo.data.SchedulerEvent
  ])]
  /* static member */
  inline def define(options: DataSourceSchemaModelWithFieldsObject): TypeofSchedulerEvent & (Instantiable1[
    /* data */ js.UndefOr[SchedulerEventData], 
    typings.kendoUi.kendo.data.SchedulerEvent
  ]) = ^.asInstanceOf[js.Dynamic].applyDynamic("define")(options.asInstanceOf[js.Any]).asInstanceOf[TypeofSchedulerEvent & (Instantiable1[
    /* data */ js.UndefOr[SchedulerEventData], 
    typings.kendoUi.kendo.data.SchedulerEvent
  ])]
  
  /* static member */
  @JSGlobal("kendo.data.SchedulerEvent.fields")
  @js.native
  def fields: DataSourceSchemaModelFields = js.native
  inline def fields_=(x: DataSourceSchemaModelFields): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fields")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("kendo.data.SchedulerEvent.idField")
  @js.native
  def idField: String = js.native
  inline def idField_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("idField")(x.asInstanceOf[js.Any])
}
