package typings.kineticjs.Kinetic

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IImage
  extends StObject
     with IShape {
  
  def applyFilter(config: Any): Any = js.native
  
  def clearImageBuffer(): Any = js.native
  
  def createImageBuffer(callback: js.Function0[Any]): Any = js.native
  
  def getCrop(): Any = js.native
  
  def getFilter(): Any = js.native
  
  def getImage(): IImage = js.native
  
  def setCrop(config: CropConfig): Any = js.native
  
  def setFilter(config: Any): Any = js.native
  
  def setImage(image: IImage): Any = js.native
}
