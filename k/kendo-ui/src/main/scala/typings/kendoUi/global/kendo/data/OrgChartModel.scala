package typings.kendoUi.global.kendo.data

import org.scalablytyped.runtime.Instantiable1
import typings.kendoUi.anon.TypeofOrgChartModel
import typings.kendoUi.kendo.data.DataSourceSchemaModelFields
import typings.kendoUi.kendo.data.DataSourceSchemaModelWithFieldsArray
import typings.kendoUi.kendo.data.DataSourceSchemaModelWithFieldsObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.data.OrgChartModel")
@js.native
open class OrgChartModel ()
  extends StObject
     with typings.kendoUi.kendo.data.OrgChartModel {
  def this(data: Any) = this()
}
object OrgChartModel {
  
  @JSGlobal("kendo.data.OrgChartModel")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("kendo.data.OrgChartModel.avatarField")
  @js.native
  def avatarField: String = js.native
  inline def avatarField_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("avatarField")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def define(options: DataSourceSchemaModelWithFieldsArray): TypeofOrgChartModel & (Instantiable1[/* data */ js.UndefOr[Any], typings.kendoUi.kendo.data.OrgChartModel]) = ^.asInstanceOf[js.Dynamic].applyDynamic("define")(options.asInstanceOf[js.Any]).asInstanceOf[TypeofOrgChartModel & (Instantiable1[/* data */ js.UndefOr[Any], typings.kendoUi.kendo.data.OrgChartModel])]
  /* static member */
  inline def define(options: DataSourceSchemaModelWithFieldsObject): TypeofOrgChartModel & (Instantiable1[/* data */ js.UndefOr[Any], typings.kendoUi.kendo.data.OrgChartModel]) = ^.asInstanceOf[js.Dynamic].applyDynamic("define")(options.asInstanceOf[js.Any]).asInstanceOf[TypeofOrgChartModel & (Instantiable1[/* data */ js.UndefOr[Any], typings.kendoUi.kendo.data.OrgChartModel])]
  
  /* static member */
  @JSGlobal("kendo.data.OrgChartModel.fields")
  @js.native
  def fields: DataSourceSchemaModelFields = js.native
  inline def fields_=(x: DataSourceSchemaModelFields): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fields")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("kendo.data.OrgChartModel.idField")
  @js.native
  def idField: String = js.native
  inline def idField_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("idField")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("kendo.data.OrgChartModel.nameField")
  @js.native
  def nameField: String = js.native
  inline def nameField_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nameField")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("kendo.data.OrgChartModel.titleField")
  @js.native
  def titleField: String = js.native
  inline def titleField_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleField")(x.asInstanceOf[js.Any])
}
