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
  
  @scala.inline
  def apply(): IWalkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWalkOptions]
  }
  
  @scala.inline
  implicit class IWalkOptionsMutableBuilder[Self <: IWalkOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterChildWalk(value: /* context */ IWalkModel => Unit): Self = StObject.set(x, "afterChildWalk", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAfterChildWalkUndefined: Self = StObject.set(x, "afterChildWalk", js.undefined)
    
    @scala.inline
    def setBeforeChildWalk(value: /* context */ IWalkModel => Boolean): Self = StObject.set(x, "beforeChildWalk", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeforeChildWalkUndefined: Self = StObject.set(x, "beforeChildWalk", js.undefined)
    
    @scala.inline
    def setOnPath(value: /* context */ IWalkPath => Unit): Self = StObject.set(x, "onPath", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPathUndefined: Self = StObject.set(x, "onPath", js.undefined)
  }
}
