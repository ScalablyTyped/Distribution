package typings.makerJs.MakerJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options to pass to model.findLoops.
  */
trait IFindChainsOptions
  extends StObject
     with IPointMatchOptions {
  
  /**
    * Flag to separate chains by layers.
    */
  var byLayers: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Flag to not recurse models, look only within current model's immediate paths.
    */
  var shallow: js.UndefOr[Boolean] = js.undefined
}
object IFindChainsOptions {
  
  @scala.inline
  def apply(): IFindChainsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFindChainsOptions]
  }
  
  @scala.inline
  implicit class IFindChainsOptionsMutableBuilder[Self <: IFindChainsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setByLayers(value: Boolean): Self = StObject.set(x, "byLayers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByLayersUndefined: Self = StObject.set(x, "byLayers", js.undefined)
    
    @scala.inline
    def setShallow(value: Boolean): Self = StObject.set(x, "shallow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShallowUndefined: Self = StObject.set(x, "shallow", js.undefined)
  }
}
