package typings.kendoUi.kendo.data

import typings.kendoUi.kendo.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotDataSourceV2
  extends StObject
     with Observable {
  
  def axes(): Any = js.native
  
  def catalog(): String = js.native
  def catalog(name: String): Unit = js.native
  
  def columns(): Any = js.native
  def columns(`val`: Any): Unit = js.native
  
  def cube(): String = js.native
  def cube(name: String): Unit = js.native
  
  def discover(options: String): Any = js.native
  
  def measures(): Any = js.native
  def measures(`val`: Any): Unit = js.native
  
  def measuresAxis(): String = js.native
  
  var options: PivotDataSourceV2Options = js.native
  
  def rows(): Any = js.native
  def rows(`val`: Any): Unit = js.native
  
  def schemaCatalogs(): Any = js.native
  
  def schemaCubes(): Any = js.native
  
  def schemaDimensions(): Any = js.native
  
  def schemaHierarchies(dimensionName: String): Any = js.native
  
  def schemaLevels(hierarchyName: String): Any = js.native
  
  def schemaMeasures(): Any = js.native
}
