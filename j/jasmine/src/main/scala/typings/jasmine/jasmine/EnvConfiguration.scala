package typings.jasmine.jasmine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration that can be used when configuring Jasmine via {@link jasmine.Env.configure}
  */
trait EnvConfiguration extends StObject {
  
  var failFast: js.UndefOr[Boolean] = js.undefined
  
  var failSpecWithNoExpectations: js.UndefOr[Boolean] = js.undefined
  
  var hideDisabled: js.UndefOr[Boolean] = js.undefined
  
  var oneFailurePerSpec: js.UndefOr[Boolean] = js.undefined
  
  var promise: js.UndefOr[js.Function] = js.undefined
  
  var random: js.UndefOr[Boolean] = js.undefined
  
  var seed: js.UndefOr[Double] = js.undefined
  
  var specFilter: js.UndefOr[js.Function] = js.undefined
}
object EnvConfiguration {
  
  inline def apply(): EnvConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvConfiguration]
  }
  
  extension [Self <: EnvConfiguration](x: Self) {
    
    inline def setFailFast(value: Boolean): Self = StObject.set(x, "failFast", value.asInstanceOf[js.Any])
    
    inline def setFailFastUndefined: Self = StObject.set(x, "failFast", js.undefined)
    
    inline def setFailSpecWithNoExpectations(value: Boolean): Self = StObject.set(x, "failSpecWithNoExpectations", value.asInstanceOf[js.Any])
    
    inline def setFailSpecWithNoExpectationsUndefined: Self = StObject.set(x, "failSpecWithNoExpectations", js.undefined)
    
    inline def setHideDisabled(value: Boolean): Self = StObject.set(x, "hideDisabled", value.asInstanceOf[js.Any])
    
    inline def setHideDisabledUndefined: Self = StObject.set(x, "hideDisabled", js.undefined)
    
    inline def setOneFailurePerSpec(value: Boolean): Self = StObject.set(x, "oneFailurePerSpec", value.asInstanceOf[js.Any])
    
    inline def setOneFailurePerSpecUndefined: Self = StObject.set(x, "oneFailurePerSpec", js.undefined)
    
    inline def setPromise(value: js.Function): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
    
    inline def setPromiseUndefined: Self = StObject.set(x, "promise", js.undefined)
    
    inline def setRandom(value: Boolean): Self = StObject.set(x, "random", value.asInstanceOf[js.Any])
    
    inline def setRandomUndefined: Self = StObject.set(x, "random", js.undefined)
    
    inline def setSeed(value: Double): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
    
    inline def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
    
    inline def setSpecFilter(value: js.Function): Self = StObject.set(x, "specFilter", value.asInstanceOf[js.Any])
    
    inline def setSpecFilterUndefined: Self = StObject.set(x, "specFilter", js.undefined)
  }
}
