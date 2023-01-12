package typings.karmaJasmine

import typings.jasmine.jasmine.Spec
import typings.jasmine.jasmine.SpecFilter
import typings.std.PromiseConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined jasmine.jasmine.Configuration & {  timeoutInterval :number | undefined} */
  trait ConfigurationtimeoutInter extends StObject {
    
    /**
      * Set to provide a custom promise library that Jasmine will use if it needs
      * to create a promise. If not set, it will default to whatever global Promise
      * library is available (if any).
      * @since 3.5.0
      * @default undefined
      */
    var Promise: js.UndefOr[PromiseConstructor] = js.undefined
    
    /**
      * Clean closures when a suite is done running (done by clearing the stored function reference).
      * This prevents memory leaks, but you won't be able to run jasmine multiple times.
      * @since 3.10.0
      * @default true
      */
    var autoCleanClosures: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to fail the spec if it ran no expectations. By default
      * a spec that ran no expectations is reported as passed. Setting this
      * to true will report such spec as a failure.
      * @since 3.5.0
      * @default false
      */
    var failSpecWithNoExpectations: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether or not reporters should hide disabled specs from their output.
      * Currently only supported by Jasmine's HTMLReporter
      * @since 3.3.0
      * @default false
      */
    var hideDisabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to randomize spec execution order
      * @since 3.3.0
      * @default true
      */
    var random: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Seed to use as the basis of randomization.
      * Null causes the seed to be determined randomly at the start of execution.
      * @since 3.3.0
      * @default null
      */
    var seed: js.UndefOr[Double | String | Null] = js.undefined
    
    /**
      * Function to use to filter specs
      * @since 3.3.0
      * @default A function that always returns true.
      */
    var specFilter: js.UndefOr[SpecFilter] = js.undefined
    
    /**
      * Whether to stop execution of the suite after the first spec failure
      * @since 3.9.0
      * @default false
      */
    var stopOnSpecFailure: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to cause specs to only have one expectation failure.
      * @since 3.3.0
      * @default false
      */
    var stopSpecOnExpectationFailure: js.UndefOr[Boolean] = js.undefined
    
    /** @deprecated undocumented to be removed */
    var timeoutInterval: js.UndefOr[Double] = js.undefined
  }
  object ConfigurationtimeoutInter {
    
    inline def apply(): ConfigurationtimeoutInter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigurationtimeoutInter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigurationtimeoutInter] (val x: Self) extends AnyVal {
      
      inline def setAutoCleanClosures(value: Boolean): Self = StObject.set(x, "autoCleanClosures", value.asInstanceOf[js.Any])
      
      inline def setAutoCleanClosuresUndefined: Self = StObject.set(x, "autoCleanClosures", js.undefined)
      
      inline def setFailSpecWithNoExpectations(value: Boolean): Self = StObject.set(x, "failSpecWithNoExpectations", value.asInstanceOf[js.Any])
      
      inline def setFailSpecWithNoExpectationsUndefined: Self = StObject.set(x, "failSpecWithNoExpectations", js.undefined)
      
      inline def setHideDisabled(value: Boolean): Self = StObject.set(x, "hideDisabled", value.asInstanceOf[js.Any])
      
      inline def setHideDisabledUndefined: Self = StObject.set(x, "hideDisabled", js.undefined)
      
      inline def setPromise(value: PromiseConstructor): Self = StObject.set(x, "Promise", value.asInstanceOf[js.Any])
      
      inline def setPromiseUndefined: Self = StObject.set(x, "Promise", js.undefined)
      
      inline def setRandom(value: Boolean): Self = StObject.set(x, "random", value.asInstanceOf[js.Any])
      
      inline def setRandomUndefined: Self = StObject.set(x, "random", js.undefined)
      
      inline def setSeed(value: Double | String): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
      
      inline def setSeedNull: Self = StObject.set(x, "seed", null)
      
      inline def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
      
      inline def setSpecFilter(value: /* spec */ Spec => Boolean): Self = StObject.set(x, "specFilter", js.Any.fromFunction1(value))
      
      inline def setSpecFilterUndefined: Self = StObject.set(x, "specFilter", js.undefined)
      
      inline def setStopOnSpecFailure(value: Boolean): Self = StObject.set(x, "stopOnSpecFailure", value.asInstanceOf[js.Any])
      
      inline def setStopOnSpecFailureUndefined: Self = StObject.set(x, "stopOnSpecFailure", js.undefined)
      
      inline def setStopSpecOnExpectationFailure(value: Boolean): Self = StObject.set(x, "stopSpecOnExpectationFailure", value.asInstanceOf[js.Any])
      
      inline def setStopSpecOnExpectationFailureUndefined: Self = StObject.set(x, "stopSpecOnExpectationFailure", js.undefined)
      
      inline def setTimeoutInterval(value: Double): Self = StObject.set(x, "timeoutInterval", value.asInstanceOf[js.Any])
      
      inline def setTimeoutIntervalUndefined: Self = StObject.set(x, "timeoutInterval", js.undefined)
    }
  }
}
