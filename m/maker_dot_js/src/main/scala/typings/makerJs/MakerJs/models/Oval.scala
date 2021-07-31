package typings.makerJs.MakerJs.models

import typings.makerJs.MakerJs.IModel
import typings.makerJs.MakerJs.IPathMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Oval
  extends StObject
     with IModel {
  
  @JSName("paths")
  var paths_Oval: IPathMap
}
object Oval {
  
  @scala.inline
  def apply(paths: IPathMap): Oval = {
    val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[Oval]
  }
  
  @scala.inline
  implicit class OvalMutableBuilder[Self <: Oval] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPaths(value: IPathMap): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
  }
}
