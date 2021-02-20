package typings.makerJs.MakerJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A line, curved line or other simple two dimensional shape.
  */
@js.native
trait IPath extends StObject {
  
  /**
    * Optional layer of this path.
    */
  var layer: js.UndefOr[String] = js.native
  
  /**
    * The main point of reference for this path.
    */
  var origin: IPoint = js.native
  
  /**
    * The type of the path, e.g. "line", "circle", or "arc". These strings are enumerated in pathType.
    */
  var `type`: String = js.native
}
object IPath {
  
  @scala.inline
  def apply(origin: IPoint, `type`: String): IPath = {
    val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPath]
  }
  
  @scala.inline
  implicit class IPathMutableBuilder[Self <: IPath] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayer(value: String): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
    
    @scala.inline
    def setOrigin(value: IPoint): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
