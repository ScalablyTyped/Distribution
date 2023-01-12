package typings.makerjs.MakerJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Sub-options to pass to model.findChains.contain option.
  */
trait IContainChainsOptions extends StObject {
  
  /**
    * Flag to alternate direction of contained chains.
    */
  var alternateDirection: js.UndefOr[Boolean] = js.undefined
}
object IContainChainsOptions {
  
  inline def apply(): IContainChainsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IContainChainsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IContainChainsOptions] (val x: Self) extends AnyVal {
    
    inline def setAlternateDirection(value: Boolean): Self = StObject.set(x, "alternateDirection", value.asInstanceOf[js.Any])
    
    inline def setAlternateDirectionUndefined: Self = StObject.set(x, "alternateDirection", js.undefined)
  }
}
