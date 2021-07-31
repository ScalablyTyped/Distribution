package typings.kendoUi.global.kendo.data

import typings.kendoUi.kendo.data.DataSourceTransportReadOptionsData
import typings.kendoUi.kendo.data.QueryResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.data.Query")
@js.native
class Query protected ()
  extends StObject
     with typings.kendoUi.kendo.data.Query {
  def this(data: js.Array[js.Any]) = this()
}
object Query {
  
  @JSGlobal("kendo.data.Query")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def process(data: js.Array[js.Any], options: DataSourceTransportReadOptionsData): QueryResult = (^.asInstanceOf[js.Dynamic].applyDynamic("process")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[QueryResult]
}
