package typings.makerJs.MakerJs.models

import typings.makerJs.MakerJs.IModel
import typings.makerJs.MakerJs.IPathMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Holes
  extends StObject
     with IModel {
  
  @JSName("paths")
  var paths_Holes: IPathMap
}
object Holes {
  
  inline def apply(paths: IPathMap): Holes = {
    val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[Holes]
  }
  
  extension [Self <: Holes](x: Self) {
    
    inline def setPaths(value: IPathMap): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
  }
}
