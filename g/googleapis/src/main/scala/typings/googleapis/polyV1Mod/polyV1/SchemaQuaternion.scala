package typings.googleapis.polyV1Mod.polyV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A [Quaternion](//en.wikipedia.org/wiki/Quaternion). Please note: if in the
  * response you see &quot;w: 1&quot; and nothing else this is the default
  * value of [0, 0, 0, 1] where x,y, and z are 0.
  */
@js.native
trait SchemaQuaternion extends StObject {
  
  /**
    * The scalar component.
    */
  var w: js.UndefOr[Double] = js.native
  
  /**
    * The x component.
    */
  var x: js.UndefOr[Double] = js.native
  
  /**
    * The y component.
    */
  var y: js.UndefOr[Double] = js.native
  
  /**
    * The z component.
    */
  var z: js.UndefOr[Double] = js.native
}
object SchemaQuaternion {
  
  @scala.inline
  def apply(): SchemaQuaternion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQuaternion]
  }
  
  @scala.inline
  implicit class SchemaQuaternionMutableBuilder[Self <: SchemaQuaternion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWUndefined: Self = StObject.set(x, "w", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    @scala.inline
    def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZUndefined: Self = StObject.set(x, "z", js.undefined)
  }
}
