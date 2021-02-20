package typings.makerJs.MakerJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options to pass to path.intersection()
  */
@js.native
trait IPathIntersectionBaseOptions extends StObject {
  
  /**
    * Optional boolean to only return deep intersections, i.e. not on an end point or tangent.
    */
  var excludeTangents: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional output variable which will be set to true if the paths are overlapped.
    */
  var out_AreOverlapped: js.UndefOr[Boolean] = js.native
}
object IPathIntersectionBaseOptions {
  
  @scala.inline
  def apply(): IPathIntersectionBaseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPathIntersectionBaseOptions]
  }
  
  @scala.inline
  implicit class IPathIntersectionBaseOptionsMutableBuilder[Self <: IPathIntersectionBaseOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExcludeTangents(value: Boolean): Self = StObject.set(x, "excludeTangents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeTangentsUndefined: Self = StObject.set(x, "excludeTangents", js.undefined)
    
    @scala.inline
    def setOut_AreOverlapped(value: Boolean): Self = StObject.set(x, "out_AreOverlapped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOut_AreOverlappedUndefined: Self = StObject.set(x, "out_AreOverlapped", js.undefined)
  }
}
