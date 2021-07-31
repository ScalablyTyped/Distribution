package typings.kendoUi.kendo.data

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchedulerDataSource
  extends StObject
     with DataSource {
  
  def add(model: SchedulerEvent): SchedulerEvent = js.native
  
  def cancelChanges(model: SchedulerEvent): Unit = js.native
  
  def expand(start: Date, end: Date): SchedulerEvent = js.native
  
  def indexOf(value: SchedulerEvent): Double = js.native
  
  def insert(index: Double, model: SchedulerEvent): SchedulerEvent = js.native
  
  def remove(model: SchedulerEvent): Unit = js.native
}
