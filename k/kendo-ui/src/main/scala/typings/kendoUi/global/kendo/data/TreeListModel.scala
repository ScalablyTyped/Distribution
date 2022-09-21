package typings.kendoUi.global.kendo.data

import org.scalablytyped.runtime.Instantiable1
import typings.kendoUi.anon.TypeofTreeListModel
import typings.kendoUi.kendo.data.DataSourceSchemaModelFields
import typings.kendoUi.kendo.data.DataSourceSchemaModelWithFieldsArray
import typings.kendoUi.kendo.data.DataSourceSchemaModelWithFieldsObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.data.TreeListModel")
@js.native
open class TreeListModel ()
  extends StObject
     with typings.kendoUi.kendo.data.TreeListModel {
  def this(data: Any) = this()
}
object TreeListModel {
  
  @JSGlobal("kendo.data.TreeListModel")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def define(options: DataSourceSchemaModelWithFieldsArray): TypeofTreeListModel & (Instantiable1[/* data */ js.UndefOr[Any], typings.kendoUi.kendo.data.TreeListModel]) = ^.asInstanceOf[js.Dynamic].applyDynamic("define")(options.asInstanceOf[js.Any]).asInstanceOf[TypeofTreeListModel & (Instantiable1[/* data */ js.UndefOr[Any], typings.kendoUi.kendo.data.TreeListModel])]
  /* static member */
  inline def define(options: DataSourceSchemaModelWithFieldsObject): TypeofTreeListModel & (Instantiable1[/* data */ js.UndefOr[Any], typings.kendoUi.kendo.data.TreeListModel]) = ^.asInstanceOf[js.Dynamic].applyDynamic("define")(options.asInstanceOf[js.Any]).asInstanceOf[TypeofTreeListModel & (Instantiable1[/* data */ js.UndefOr[Any], typings.kendoUi.kendo.data.TreeListModel])]
  
  /* static member */
  @JSGlobal("kendo.data.TreeListModel.fields")
  @js.native
  def fields: DataSourceSchemaModelFields = js.native
  inline def fields_=(x: DataSourceSchemaModelFields): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fields")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("kendo.data.TreeListModel.idField")
  @js.native
  def idField: String = js.native
  inline def idField_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("idField")(x.asInstanceOf[js.Any])
}
