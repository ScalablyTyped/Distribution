package typings.makerJs.MakerJs.models

import typings.makerJs.MakerJs.IModel
import typings.makerJs.MakerJs.IPathMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectTheDots extends IModel {
  
  @JSName("paths")
  var paths_ConnectTheDots: IPathMap = js.native
}
object ConnectTheDots {
  
  @scala.inline
  def apply(paths: IPathMap): ConnectTheDots = {
    val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectTheDots]
  }
  
  @scala.inline
  implicit class ConnectTheDotsMutableBuilder[Self <: ConnectTheDots] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPaths(value: IPathMap): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
  }
}
