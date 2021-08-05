package typings.makerJs.MakerJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options to pass to path.intersection()
  */
trait IPathIntersectionBaseOptions extends StObject {
  
  /**
    * Optional boolean to only return deep intersections, i.e. not on an end point or tangent.
    */
  var excludeTangents: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional output variable which will be set to true if the paths are overlapped.
    */
  var out_AreOverlapped: js.UndefOr[Boolean] = js.undefined
}
object IPathIntersectionBaseOptions {
  
  inline def apply(): IPathIntersectionBaseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPathIntersectionBaseOptions]
  }
  
  extension [Self <: IPathIntersectionBaseOptions](x: Self) {
    
    inline def setExcludeTangents(value: Boolean): Self = StObject.set(x, "excludeTangents", value.asInstanceOf[js.Any])
    
    inline def setExcludeTangentsUndefined: Self = StObject.set(x, "excludeTangents", js.undefined)
    
    inline def setOut_AreOverlapped(value: Boolean): Self = StObject.set(x, "out_AreOverlapped", value.asInstanceOf[js.Any])
    
    inline def setOut_AreOverlappedUndefined: Self = StObject.set(x, "out_AreOverlapped", js.undefined)
  }
}
