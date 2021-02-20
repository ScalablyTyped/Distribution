package typings.kendoUi.global.kendo.data

import org.scalablytyped.runtime.Instantiable1
import typings.kendoUi.anon.TypeofTreeListModel
import typings.kendoUi.kendo.data.DataSourceSchemaModelFields
import typings.kendoUi.kendo.data.DataSourceSchemaModelWithFieldsArray
import typings.kendoUi.kendo.data.DataSourceSchemaModelWithFieldsObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.data.TreeListModel")
@js.native
class TreeListModel ()
  extends typings.kendoUi.kendo.data.TreeListModel {
  def this(data: js.Any) = this()
}
object TreeListModel {
  
  @JSGlobal("kendo.data.TreeListModel")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("kendo.data.TreeListModel.define")
  @js.native
  def define(options: DataSourceSchemaModelWithFieldsArray): TypeofTreeListModel with (Instantiable1[/* data */ js.UndefOr[js.Any], typings.kendoUi.kendo.data.TreeListModel]) = js.native
  /* static member */
  @JSGlobal("kendo.data.TreeListModel.define")
  @js.native
  def define(options: DataSourceSchemaModelWithFieldsObject): TypeofTreeListModel with (Instantiable1[/* data */ js.UndefOr[js.Any], typings.kendoUi.kendo.data.TreeListModel]) = js.native
  
  /* static member */
  @JSGlobal("kendo.data.TreeListModel.fields")
  @js.native
  def fields: DataSourceSchemaModelFields = js.native
  @scala.inline
  def fields_=(x: DataSourceSchemaModelFields): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fields")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("kendo.data.TreeListModel.idField")
  @js.native
  def idField: String = js.native
  @scala.inline
  def idField_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("idField")(x.asInstanceOf[js.Any])
}
