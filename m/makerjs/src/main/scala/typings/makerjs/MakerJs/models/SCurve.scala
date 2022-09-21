package typings.makerjs.MakerJs.models

import typings.makerjs.MakerJs.IModel
import typings.makerjs.MakerJs.IPathMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SCurve
  extends StObject
     with IModel {
  
  @JSName("paths")
  var paths_SCurve: IPathMap
}
object SCurve {
  
  inline def apply(paths: IPathMap): SCurve = {
    val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[SCurve]
  }
  
  extension [Self <: SCurve](x: Self) {
    
    inline def setPaths(value: IPathMap): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
  }
}
