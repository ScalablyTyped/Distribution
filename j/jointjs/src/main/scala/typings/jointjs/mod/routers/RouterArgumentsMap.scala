package typings.jointjs.mod.routers

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouterArgumentsMap
  extends /* key */ StringDictionary[StringDictionary[js.Any]] {
  
  var manhattan: ManhattanRouterArguments = js.native
  
  var metro: ManhattanRouterArguments = js.native
  
  var normal: NormalRouterArguments = js.native
  
  var oneSide: OneSideRouterArguments = js.native
  
  var orthogonal: OrthogonalRouterArguments = js.native
}
object RouterArgumentsMap {
  
  @scala.inline
  def apply(
    manhattan: ManhattanRouterArguments,
    metro: ManhattanRouterArguments,
    normal: NormalRouterArguments,
    oneSide: OneSideRouterArguments,
    orthogonal: OrthogonalRouterArguments
  ): RouterArgumentsMap = {
    val __obj = js.Dynamic.literal(manhattan = manhattan.asInstanceOf[js.Any], metro = metro.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any], oneSide = oneSide.asInstanceOf[js.Any], orthogonal = orthogonal.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterArgumentsMap]
  }
  
  @scala.inline
  implicit class RouterArgumentsMapOps[Self <: RouterArgumentsMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setManhattan(value: ManhattanRouterArguments): Self = this.set("manhattan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetro(value: ManhattanRouterArguments): Self = this.set("metro", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormal(value: NormalRouterArguments): Self = this.set("normal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOneSide(value: OneSideRouterArguments): Self = this.set("oneSide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrthogonal(value: OrthogonalRouterArguments): Self = this.set("orthogonal", value.asInstanceOf[js.Any])
  }
}
