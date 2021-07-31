package typings.kendoUi.global.kendo.data

import typings.kendoUi.kendo.data.DataSourceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.data.DataSource")
@js.native
class DataSource ()
  extends StObject
     with typings.kendoUi.kendo.data.DataSource {
  def this(options: DataSourceOptions) = this()
}
object DataSource {
  
  @JSGlobal("kendo.data.DataSource")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def create(): typings.kendoUi.kendo.data.DataSource = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.kendoUi.kendo.data.DataSource]
  @scala.inline
  def create(options: DataSourceOptions): typings.kendoUi.kendo.data.DataSource = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.data.DataSource]
}
