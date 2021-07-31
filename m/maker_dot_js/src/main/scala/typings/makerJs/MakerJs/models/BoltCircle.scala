package typings.makerJs.MakerJs.models

import typings.makerJs.MakerJs.IModel
import typings.makerJs.MakerJs.IPathMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoltCircle
  extends StObject
     with IModel {
  
  @JSName("paths")
  var paths_BoltCircle: IPathMap
}
object BoltCircle {
  
  @scala.inline
  def apply(paths: IPathMap): BoltCircle = {
    val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoltCircle]
  }
  
  @scala.inline
  implicit class BoltCircleMutableBuilder[Self <: BoltCircle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPaths(value: IPathMap): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
  }
}
