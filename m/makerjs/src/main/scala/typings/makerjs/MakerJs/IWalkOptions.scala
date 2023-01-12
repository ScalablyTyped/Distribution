package typings.makerjs.MakerJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options to pass to model.walk().
  */
trait IWalkOptions extends StObject {
  
  /**
    * Callback for every child model in every model, after all of its children have been walked.
    */
  var afterChildWalk: js.UndefOr[IWalkModelCallback] = js.undefined
  
  /**
    * Callback for every child model in every model. Return false to stop walking down further models.
    */
  var beforeChildWalk: js.UndefOr[IWalkModelCancellableCallback] = js.undefined
  
  /**
    * Callback for every path in every model.
    */
  var onPath: js.UndefOr[IWalkPathCallback] = js.undefined
}
object IWalkOptions {
  
  inline def apply(): IWalkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWalkOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IWalkOptions] (val x: Self) extends AnyVal {
    
    inline def setAfterChildWalk(value: /* context */ IWalkModel => Unit): Self = StObject.set(x, "afterChildWalk", js.Any.fromFunction1(value))
    
    inline def setAfterChildWalkUndefined: Self = StObject.set(x, "afterChildWalk", js.undefined)
    
    inline def setBeforeChildWalk(value: /* context */ IWalkModel => Boolean): Self = StObject.set(x, "beforeChildWalk", js.Any.fromFunction1(value))
    
    inline def setBeforeChildWalkUndefined: Self = StObject.set(x, "beforeChildWalk", js.undefined)
    
    inline def setOnPath(value: /* context */ IWalkPath => Unit): Self = StObject.set(x, "onPath", js.Any.fromFunction1(value))
    
    inline def setOnPathUndefined: Self = StObject.set(x, "onPath", js.undefined)
  }
}
