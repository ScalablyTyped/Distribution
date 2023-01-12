package typings.makerjs.MakerJs.models

import typings.makerjs.MakerJs.IModel
import typings.makerjs.MakerJs.IPathMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dome
  extends StObject
     with IModel {
  
  @JSName("paths")
  var paths_Dome: IPathMap
}
object Dome {
  
  inline def apply(paths: IPathMap): Dome = {
    val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dome]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Dome] (val x: Self) extends AnyVal {
    
    inline def setPaths(value: IPathMap): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
  }
}
