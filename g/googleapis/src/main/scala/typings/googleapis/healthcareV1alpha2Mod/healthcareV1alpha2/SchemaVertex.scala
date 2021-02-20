package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A 2D coordinate in an image. The origin is the top-left.
  */
@js.native
trait SchemaVertex extends StObject {
  
  /**
    * X coordinate.
    */
  var x: js.UndefOr[Double] = js.native
  
  /**
    * Y coordinate.
    */
  var y: js.UndefOr[Double] = js.native
}
object SchemaVertex {
  
  @scala.inline
  def apply(): SchemaVertex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVertex]
  }
  
  @scala.inline
  implicit class SchemaVertexMutableBuilder[Self <: SchemaVertex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
