package typings.makerjs.MakerJs

import typings.makerjs.MakerJs.measure.Atlas
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options to pass to model.combine.
  */
trait ICombineOptions
  extends StObject
     with IPointMatchOptions {
  
  /**
    * Point which is known to be outside of the model.
    */
  var farPoint: js.UndefOr[IPoint] = js.undefined
  
  /**
    * Cached measurements for model A.
    */
  var measureA: js.UndefOr[Atlas] = js.undefined
  
  /**
    * Cached measurements for model B.
    */
  var measureB: js.UndefOr[Atlas] = js.undefined
  
  /**
    * Output array of 2 models (corresponding to the input models) containing paths that were deleted in the combination.
    * Each path will be of type IPathRemoved, which has a .reason property describing why it was removed.
    */
  var out_deleted: js.UndefOr[js.Array[IModel]] = js.undefined
  
  /**
    * Flag to remove paths which are not part of a loop.
    */
  var trimDeadEnds: js.UndefOr[Boolean] = js.undefined
}
object ICombineOptions {
  
  inline def apply(): ICombineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICombineOptions]
  }
  
  extension [Self <: ICombineOptions](x: Self) {
    
    inline def setFarPoint(value: IPoint): Self = StObject.set(x, "farPoint", value.asInstanceOf[js.Any])
    
    inline def setFarPointUndefined: Self = StObject.set(x, "farPoint", js.undefined)
    
    inline def setMeasureA(value: Atlas): Self = StObject.set(x, "measureA", value.asInstanceOf[js.Any])
    
    inline def setMeasureAUndefined: Self = StObject.set(x, "measureA", js.undefined)
    
    inline def setMeasureB(value: Atlas): Self = StObject.set(x, "measureB", value.asInstanceOf[js.Any])
    
    inline def setMeasureBUndefined: Self = StObject.set(x, "measureB", js.undefined)
    
    inline def setOut_deleted(value: js.Array[IModel]): Self = StObject.set(x, "out_deleted", value.asInstanceOf[js.Any])
    
    inline def setOut_deletedUndefined: Self = StObject.set(x, "out_deleted", js.undefined)
    
    inline def setOut_deletedVarargs(value: IModel*): Self = StObject.set(x, "out_deleted", js.Array(value*))
    
    inline def setTrimDeadEnds(value: Boolean): Self = StObject.set(x, "trimDeadEnds", value.asInstanceOf[js.Any])
    
    inline def setTrimDeadEndsUndefined: Self = StObject.set(x, "trimDeadEnds", js.undefined)
  }
}
