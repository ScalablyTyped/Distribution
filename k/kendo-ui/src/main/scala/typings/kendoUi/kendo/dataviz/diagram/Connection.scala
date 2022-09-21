package typings.kendoUi.kendo.dataviz.diagram

import typings.kendoUi.kendo.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Connection
  extends StObject
     with Observable {
  
  def allPoints(): Any = js.native
  
  var dataItem: Any = js.native
  
  var from: Shape = js.native
  
  var options: ConnectionOptions = js.native
  
  def points(): Any = js.native
  
  def redraw(): Unit = js.native
  def redraw(options: Any): Unit = js.native
  
  def select(value: Boolean): Unit = js.native
  
  def source(): Any = js.native
  def source(source: Connector): Unit = js.native
  def source(source: Point): Unit = js.native
  def source(source: Shape): Unit = js.native
  
  var sourceConnector: Connector = js.native
  
  def sourcePoint(): Point = js.native
  
  def target(): Any = js.native
  def target(target: Connector): Unit = js.native
  def target(target: Point): Unit = js.native
  def target(target: Shape): Unit = js.native
  
  var targetConnector: Connector = js.native
  
  def targetPoint(): Point = js.native
  
  var to: Shape = js.native
  
  def `type`(): Unit = js.native
  def `type`(value: String): Unit = js.native
}
