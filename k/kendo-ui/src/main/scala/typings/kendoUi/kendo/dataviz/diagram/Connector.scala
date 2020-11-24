package typings.kendoUi.kendo.dataviz.diagram

import typings.kendoUi.kendo.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Connector extends Observable {
  
  var connections: js.Any = js.native
  
  var options: ConnectorOptions = js.native
  
  def position(): Point = js.native
  
  var shape: Shape = js.native
}
