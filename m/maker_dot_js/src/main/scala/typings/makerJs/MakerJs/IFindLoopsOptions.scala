package typings.makerJs.MakerJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options to pass to model.findLoops.
  */
trait IFindLoopsOptions
  extends StObject
     with IPointMatchOptions {
  
  /**
    * Flag to remove looped paths from the original model.
    */
  var removeFromOriginal: js.UndefOr[Boolean] = js.undefined
}
object IFindLoopsOptions {
  
  @scala.inline
  def apply(): IFindLoopsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFindLoopsOptions]
  }
  
  @scala.inline
  implicit class IFindLoopsOptionsMutableBuilder[Self <: IFindLoopsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRemoveFromOriginal(value: Boolean): Self = StObject.set(x, "removeFromOriginal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveFromOriginalUndefined: Self = StObject.set(x, "removeFromOriginal", js.undefined)
  }
}
