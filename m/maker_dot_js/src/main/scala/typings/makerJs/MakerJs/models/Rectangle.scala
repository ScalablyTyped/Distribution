package typings.makerJs.MakerJs.models

import typings.makerJs.MakerJs.IModel
import typings.makerJs.MakerJs.IPathMap
import typings.makerJs.MakerJs.IPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rectangle extends IModel {
  
  @JSName("origin")
  var origin_Rectangle: IPoint = js.native
  
  @JSName("paths")
  var paths_Rectangle: IPathMap = js.native
}
object Rectangle {
  
  @scala.inline
  def apply(origin: IPoint, paths: IPathMap): Rectangle = {
    val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rectangle]
  }
  
  @scala.inline
  implicit class RectangleMutableBuilder[Self <: Rectangle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrigin(value: IPoint): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaths(value: IPathMap): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
  }
}
