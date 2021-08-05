package typings.kendoUi.global.kendo.data

import typings.kendoUi.kendo.data.DataSourceTransport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transports {
  
  @JSGlobal("kendo.data.transports")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("kendo.data.transports.odata")
  @js.native
  def odata: DataSourceTransport = js.native
  inline def odata_=(x: DataSourceTransport): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("odata")(x.asInstanceOf[js.Any])
}
