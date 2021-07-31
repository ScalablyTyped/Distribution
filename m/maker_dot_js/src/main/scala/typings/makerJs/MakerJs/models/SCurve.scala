package typings.makerJs.MakerJs.models

import typings.makerJs.MakerJs.IModel
import typings.makerJs.MakerJs.IPathMap
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
  
  @scala.inline
  def apply(paths: IPathMap): SCurve = {
    val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[SCurve]
  }
  
  @scala.inline
  implicit class SCurveMutableBuilder[Self <: SCurve] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPaths(value: IPathMap): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
  }
}
