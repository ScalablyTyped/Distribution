package typings.makerjs.MakerJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options to pass to model.simplify()
  */
trait ISimplifyOptions
  extends StObject
     with IPointMatchOptions {
  
  /**
    * Optional
    */
  var scalarMatchingDistance: js.UndefOr[Double] = js.undefined
}
object ISimplifyOptions {
  
  inline def apply(): ISimplifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISimplifyOptions]
  }
  
  extension [Self <: ISimplifyOptions](x: Self) {
    
    inline def setScalarMatchingDistance(value: Double): Self = StObject.set(x, "scalarMatchingDistance", value.asInstanceOf[js.Any])
    
    inline def setScalarMatchingDistanceUndefined: Self = StObject.set(x, "scalarMatchingDistance", js.undefined)
  }
}
