package typings.makerJs.MakerJs.models

import typings.makerJs.MakerJs.IModel
import typings.makerJs.MakerJs.IPathMap
import typings.makerJs.MakerJs.IPoint
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
  
  extension [Self <: RoundRectangle](x: Self) {
    
    inline def setOrigin(value: IPoint): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setPaths(value: IPathMap): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
  }
}
