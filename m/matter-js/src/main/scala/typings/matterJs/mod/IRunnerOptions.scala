package typings.matterJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRunnerOptions extends StObject {
  
  /**
    * A `Number` that specifies the time step between updates in milliseconds.
    * If `engine.timing.isFixed` is set to `true`, then `delta` is fixed.
    * If it is `false`, then `delta` can dynamically change to maintain the correct apparent simulation speed.
    *
    * @property delta
    * @type {number}
    * @default 1000 / 60
    */
  var delta: js.UndefOr[Double] = js.undefined
  
  /**
    * A flag that specifies whether the runner is running or not.
    * @property enabled
    * @type {boolean}
    * @default true
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A `Boolean` that specifies if the runner should use a fixed timestep (otherwise it is variable).
    * If timing is fixed, then the apparent simulation speed will change depending on the frame rate (but behaviour will be deterministic).
    * If the timing is variable, then the apparent simulation speed will be constant (approximately, but at the cost of determininism).
    *
    * @property isFixed
    * @type {boolean}
    * @default false
    */
  var isFixed: js.UndefOr[Boolean] = js.undefined
}
object IRunnerOptions {
  
  inline def apply(): IRunnerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRunnerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IRunnerOptions] (val x: Self) extends AnyVal {
    
    inline def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    
    inline def setDeltaUndefined: Self = StObject.set(x, "delta", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setIsFixed(value: Boolean): Self = StObject.set(x, "isFixed", value.asInstanceOf[js.Any])
    
    inline def setIsFixedUndefined: Self = StObject.set(x, "isFixed", js.undefined)
  }
}
