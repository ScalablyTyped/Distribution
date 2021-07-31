package typings.makerJs.MakerJs.models

import typings.makerJs.MakerJs.IModel
import typings.makerJs.MakerJs.IPathMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dogbone
  extends StObject
     with IModel {
  
  @JSName("paths")
  var paths_Dogbone: IPathMap
}
object Dogbone {
  
  @scala.inline
  def apply(paths: IPathMap): Dogbone = {
    val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dogbone]
  }
  
  @scala.inline
  implicit class DogboneMutableBuilder[Self <: Dogbone] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPaths(value: IPathMap): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
  }
}
