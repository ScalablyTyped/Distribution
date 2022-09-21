package typings.makerjs.MakerJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options to pass to path.intersection()
  */
trait IPathIntersectionOptions
  extends StObject
     with IPathIntersectionBaseOptions {
  
  /**
    * Optional boolean to only return deep intersections, i.e. not on an end point or tangent.
    */
  var path1Offset: js.UndefOr[IPoint] = js.undefined
  
  /**
    * Optional output variable which will be set to true if the paths are overlapped.
    */
  var path2Offset: js.UndefOr[IPoint] = js.undefined
}
object IPathIntersectionOptions {
  
  inline def apply(): IPathIntersectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPathIntersectionOptions]
  }
  
  extension [Self <: IPathIntersectionOptions](x: Self) {
    
    inline def setPath1Offset(value: IPoint): Self = StObject.set(x, "path1Offset", value.asInstanceOf[js.Any])
    
    inline def setPath1OffsetUndefined: Self = StObject.set(x, "path1Offset", js.undefined)
    
    inline def setPath2Offset(value: IPoint): Self = StObject.set(x, "path2Offset", value.asInstanceOf[js.Any])
    
    inline def setPath2OffsetUndefined: Self = StObject.set(x, "path2Offset", js.undefined)
  }
}
