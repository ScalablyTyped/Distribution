package typings.makerJs.MakerJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options to pass to model.walk().
  */
trait IWalkOptions extends StObject {
  
  var afterChildWalk: js.UndefOr[IWalkModelCallback] = js.undefined
  
  var beforeChildWalk: js.UndefOr[IWalkModelCancellableCallback] = js.undefined
  
  var onPath: js.UndefOr[IWalkPathCallback] = js.undefined
}
object IWalkOptions {
  
  inline def apply(): IWalkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWalkOptions]
  }
  
  extension [Self <: IWalkOptions](x: Self) {
    
    inline def setAfterChildWalk(value: /* context */ IWalkModel => Unit): Self = StObject.set(x, "afterChildWalk", js.Any.fromFunction1(value))
    
    inline def setAfterChildWalkUndefined: Self = StObject.set(x, "afterChildWalk", js.undefined)
    
    inline def setBeforeChildWalk(value: /* context */ IWalkModel => Boolean): Self = StObject.set(x, "beforeChildWalk", js.Any.fromFunction1(value))
    
    inline def setBeforeChildWalkUndefined: Self = StObject.set(x, "beforeChildWalk", js.undefined)
    
    inline def setOnPath(value: /* context */ IWalkPath => Unit): Self = StObject.set(x, "onPath", js.Any.fromFunction1(value))
    
    inline def setOnPathUndefined: Self = StObject.set(x, "onPath", js.undefined)
  }
}
