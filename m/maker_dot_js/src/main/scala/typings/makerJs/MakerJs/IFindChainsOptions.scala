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
  
  inline def apply(): IFindChainsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFindChainsOptions]
  }
  
  extension [Self <: IFindChainsOptions](x: Self) {
    
    inline def setByLayers(value: Boolean): Self = StObject.set(x, "byLayers", value.asInstanceOf[js.Any])
    
    inline def setByLayersUndefined: Self = StObject.set(x, "byLayers", js.undefined)
    
    inline def setShallow(value: Boolean): Self = StObject.set(x, "shallow", value.asInstanceOf[js.Any])
    
    inline def setShallowUndefined: Self = StObject.set(x, "shallow", js.undefined)
  }
}
