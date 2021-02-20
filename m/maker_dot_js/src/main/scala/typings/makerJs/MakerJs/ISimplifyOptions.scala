package typings.makerJs.MakerJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options to pass to model.simplify()
  */
@js.native
trait ISimplifyOptions extends StObject {
  
  /**
    * Optional
    */
  var pointMatchingDistance: js.UndefOr[Double] = js.native
  
  /**
    * Optional
    */
  var scalarMatchingDistance: js.UndefOr[Double] = js.native
}
object ISimplifyOptions {
  
  @scala.inline
  def apply(): ISimplifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISimplifyOptions]
  }
  
  @scala.inline
  implicit class ISimplifyOptionsMutableBuilder[Self <: ISimplifyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPointMatchingDistance(value: Double): Self = StObject.set(x, "pointMatchingDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointMatchingDistanceUndefined: Self = StObject.set(x, "pointMatchingDistance", js.undefined)
    
    @scala.inline
    def setScalarMatchingDistance(value: Double): Self = StObject.set(x, "scalarMatchingDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalarMatchingDistanceUndefined: Self = StObject.set(x, "scalarMatchingDistance", js.undefined)
  }
}
