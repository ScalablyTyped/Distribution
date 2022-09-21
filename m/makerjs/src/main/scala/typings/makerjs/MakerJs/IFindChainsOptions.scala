package typings.makerjs.MakerJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options to pass to model.findChains.
  */
trait IFindChainsOptions
  extends StObject
     with IPointMatchOptions {
  
  /**
    * Flag to separate chains by layers.
    */
  var byLayers: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Flag to order chains in a heirarchy by their paths being within one another.
    */
  var contain: js.UndefOr[Boolean | IContainChainsOptions] = js.undefined
  
  /**
    * Flag to not recurse models, look only within current model's immediate paths.
    */
  var shallow: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Flag to flatten BezierCurve arc segments into IPathBezierSeeds.
    */
  var unifyBeziers: js.UndefOr[Boolean] = js.undefined
}
object IFindChainsOptions {
  
  inline def apply(): IFindChainsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFindChainsOptions]
  }
  
  extension [Self <: IFindChainsOptions](x: Self) {
    
    inline def setByLayers(value: Boolean): Self = StObject.set(x, "byLayers", value.asInstanceOf[js.Any])
    
    inline def setByLayersUndefined: Self = StObject.set(x, "byLayers", js.undefined)
    
    inline def setContain(value: Boolean | IContainChainsOptions): Self = StObject.set(x, "contain", value.asInstanceOf[js.Any])
    
    inline def setContainUndefined: Self = StObject.set(x, "contain", js.undefined)
    
    inline def setShallow(value: Boolean): Self = StObject.set(x, "shallow", value.asInstanceOf[js.Any])
    
    inline def setShallowUndefined: Self = StObject.set(x, "shallow", js.undefined)
    
    inline def setUnifyBeziers(value: Boolean): Self = StObject.set(x, "unifyBeziers", value.asInstanceOf[js.Any])
    
    inline def setUnifyBeziersUndefined: Self = StObject.set(x, "unifyBeziers", js.undefined)
  }
}
