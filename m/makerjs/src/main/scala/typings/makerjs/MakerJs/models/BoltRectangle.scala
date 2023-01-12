package typings.makerjs.MakerJs.models

import typings.makerjs.MakerJs.IModel
import typings.makerjs.MakerJs.IPathMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoltRectangle
  extends StObject
     with IModel {
  
  @JSName("paths")
  var paths_BoltRectangle: IPathMap
}
object BoltRectangle {
  
  inline def apply(paths: IPathMap): BoltRectangle = {
    val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoltRectangle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BoltRectangle] (val x: Self) extends AnyVal {
    
    inline def setPaths(value: IPathMap): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
  }
}
