package typings.makerjs.MakerJs.models

import typings.makerjs.MakerJs.IModel
import typings.makerjs.MakerJs.IPathMap
import typings.makerjs.MakerJs.IPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoundRectangle
  extends StObject
     with IModel {
  
  @JSName("origin")
  var origin_RoundRectangle: IPoint
  
  @JSName("paths")
  var paths_RoundRectangle: IPathMap
}
object RoundRectangle {
  
  inline def apply(origin: IPoint, paths: IPathMap): RoundRectangle = {
    val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoundRectangle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RoundRectangle] (val x: Self) extends AnyVal {
    
    inline def setOrigin(value: IPoint): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setPaths(value: IPathMap): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
  }
}
