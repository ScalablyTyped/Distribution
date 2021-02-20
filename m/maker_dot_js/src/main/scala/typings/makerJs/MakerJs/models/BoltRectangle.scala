package typings.makerJs.MakerJs.models

import typings.makerJs.MakerJs.IModel
import typings.makerJs.MakerJs.IPathMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoltRectangle extends IModel {
  
  @JSName("paths")
  var paths_BoltRectangle: IPathMap = js.native
}
object BoltRectangle {
  
  @scala.inline
  def apply(paths: IPathMap): BoltRectangle = {
    val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoltRectangle]
  }
  
  @scala.inline
  implicit class BoltRectangleMutableBuilder[Self <: BoltRectangle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPaths(value: IPathMap): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
  }
}
