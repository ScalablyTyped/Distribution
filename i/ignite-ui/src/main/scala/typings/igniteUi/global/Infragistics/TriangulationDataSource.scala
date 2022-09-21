package typings.igniteUi.global.Infragistics

import typings.igniteUi.TriangulationDataSourceSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Infragistics.TriangulationDataSource")
@js.native
open class TriangulationDataSource protected ()
  extends StObject
     with typings.igniteUi.Infragistics.TriangulationDataSource {
  def this(settings: TriangulationDataSourceSettings) = this()
  
  /**
    * Returns the current converter instance
    */
  /* CompleteClass */
  override def converter(): js.Object = js.native
  
  /**
    * Loads to the current data source
    */
  /* CompleteClass */
  override def dataBind(): Unit = js.native
  
  /* CompleteClass */
  override def dataView(): Unit = js.native
  
  /**
    * Returns true if data is loaded
    */
  /* CompleteClass */
  override def isBound(): Boolean = js.native
}
