package typings.karmaJasmine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined jasmine.jasmine.EnvConfiguration & {  timeoutInterval :number | undefined} */
  @js.native
  trait EnvConfigurationtimeoutIn extends StObject {
    
    var failFast: js.UndefOr[Boolean] = js.native
    
    var failSpecWithNoExpectations: js.UndefOr[Boolean] = js.native
    
    var hideDisabled: js.UndefOr[Boolean] = js.native
    
    var oneFailurePerSpec: js.UndefOr[Boolean] = js.native
    
    var promise: js.UndefOr[js.Function] = js.native
    
    var random: js.UndefOr[Boolean] = js.native
    
    var seed: js.UndefOr[Double] = js.native
    
    var specFilter: js.UndefOr[js.Function] = js.native
    
    /** @deprecated undocumented to be removed */
    var timeoutInterval: js.UndefOr[Double] = js.native
  }
  object EnvConfigurationtimeoutIn {
    
    @scala.inline
    def apply(): EnvConfigurationtimeoutIn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EnvConfigurationtimeoutIn]
    }
    
    @scala.inline
    implicit class EnvConfigurationtimeoutInMutableBuilder[Self <: EnvConfigurationtimeoutIn] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFailFast(value: Boolean): Self = StObject.set(x, "failFast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailFastUndefined: Self = StObject.set(x, "failFast", js.undefined)
      
      @scala.inline
      def setFailSpecWithNoExpectations(value: Boolean): Self = StObject.set(x, "failSpecWithNoExpectations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailSpecWithNoExpectationsUndefined: Self = StObject.set(x, "failSpecWithNoExpectations", js.undefined)
      
      @scala.inline
      def setHideDisabled(value: Boolean): Self = StObject.set(x, "hideDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideDisabledUndefined: Self = StObject.set(x, "hideDisabled", js.undefined)
      
      @scala.inline
      def setOneFailurePerSpec(value: Boolean): Self = StObject.set(x, "oneFailurePerSpec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOneFailurePerSpecUndefined: Self = StObject.set(x, "oneFailurePerSpec", js.undefined)
      
      @scala.inline
      def setPromise(value: js.Function): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromiseUndefined: Self = StObject.set(x, "promise", js.undefined)
      
      @scala.inline
      def setRandom(value: Boolean): Self = StObject.set(x, "random", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRandomUndefined: Self = StObject.set(x, "random", js.undefined)
      
      @scala.inline
      def setSeed(value: Double): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
      
      @scala.inline
      def setSpecFilter(value: js.Function): Self = StObject.set(x, "specFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpecFilterUndefined: Self = StObject.set(x, "specFilter", js.undefined)
      
      @scala.inline
      def setTimeoutInterval(value: Double): Self = StObject.set(x, "timeoutInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutIntervalUndefined: Self = StObject.set(x, "timeoutInterval", js.undefined)
    }
  }
}
