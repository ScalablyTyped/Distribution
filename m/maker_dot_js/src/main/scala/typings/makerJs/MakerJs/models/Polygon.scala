package typings.makerJs.MakerJs.models

import typings.makerJs.MakerJs.IModel
import typings.makerJs.MakerJs.IPathMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Polygon
  extends StObject
     with IModel {
  
  @JSName("paths")
  var paths_Polygon: IPathMap
}
object Polygon {
  
  inline def apply(paths: IPathMap): Polygon = {
    val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[Polygon]
  }
  
  extension [Self <: Polygon](x: Self) {
    
    inline def setPaths(value: IPathMap): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
  }
}
