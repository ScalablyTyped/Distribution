package typings.mapsjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait envObject extends StObject {
  
  /**
    * @returns {number} maxX coord as integer
    */
  var maxX: Double = js.native
  
  /**
    * @returns {number} maxY coord as integer
    */
  var maxY: Double = js.native
  
  /**
    * @returns {number} minX as integer
    */
  var minX: Double = js.native
  
  /**
    * @returns {number} minY coord as integer
    */
  var minY: Double = js.native
}
object envObject {
  
  @scala.inline
  def apply(maxX: Double, maxY: Double, minX: Double, minY: Double): envObject = {
    val __obj = js.Dynamic.literal(maxX = maxX.asInstanceOf[js.Any], maxY = maxY.asInstanceOf[js.Any], minX = minX.asInstanceOf[js.Any], minY = minY.asInstanceOf[js.Any])
    __obj.asInstanceOf[envObject]
  }
  
  @scala.inline
  implicit class envObjectMutableBuilder[Self <: envObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxX(value: Double): Self = StObject.set(x, "maxX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxY(value: Double): Self = StObject.set(x, "maxY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinX(value: Double): Self = StObject.set(x, "minX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinY(value: Double): Self = StObject.set(x, "minY", value.asInstanceOf[js.Any])
  }
}
