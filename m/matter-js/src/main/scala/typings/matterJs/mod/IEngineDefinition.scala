package typings.matterJs.mod

import typings.matterJs.anon.PartialGravity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEngineDefinition extends StObject {
  
  /**
    * An integer `Number` that specifies the number of constraint iterations to perform each update.
    * The higher the value, the higher quality the simulation will be at the expense of performance.
    * The default value of `2` is usually very adequate.
    *
    * @default 2
    */
  var constraintIterations: js.UndefOr[Double] = js.undefined
  
  /**
    * A `Matter.Detector` instance.
    *
    * @default {Matter.Detector} instance
    */
  var detector: js.UndefOr[Detector] = js.undefined
  
  /**
    * A flag that specifies whether the engine should allow sleeping via the `Matter.Sleeping` module.
    * Sleeping can improve stability and performance, but often at the expense of accuracy.
    *
    * @default false
    */
  var enableSleeping: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The gravity to apply on all bodies in `engine.world`.
    *
    */
  var gravity: js.UndefOr[PartialGravity] = js.undefined
  
  /**
    * A `Matter.Grid` instance.
    *
    * @deprecated replaced by `engine.detector`
    * @default a Matter.Grid instance
    */
  var grid: js.UndefOr[Grid] = js.undefined
  
  /**
    * An object reserved for storing plugin-specific properties.
    *
    */
  var plugin: js.UndefOr[js.Object] = js.undefined
  
  /**
    * An integer `Number` that specifies the number of position iterations to perform each update.
    * The higher the value, the higher quality the simulation will be at the expense of performance.
    *
    * @default 6
    */
  var positionIterations: js.UndefOr[Double] = js.undefined
  
  /**
    * An `Object` containing properties regarding the timing systems of the engine.
    *
    */
  var timing: js.UndefOr[IEngineTimingOptions] = js.undefined
  
  /**
    * An integer `Number` that specifies the number of velocity iterations to perform each update.
    * The higher the value, the higher quality the simulation will be at the expense of performance.
    *
    * @default 4
    */
  var velocityIterations: js.UndefOr[Double] = js.undefined
  
  /**
    * A `World` composite object that will contain all simulated bodies and constraints.
    *
    * @default {Matter.World} instance
    */
  var world: js.UndefOr[World] = js.undefined
}
object IEngineDefinition {
  
  inline def apply(): IEngineDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEngineDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IEngineDefinition] (val x: Self) extends AnyVal {
    
    inline def setConstraintIterations(value: Double): Self = StObject.set(x, "constraintIterations", value.asInstanceOf[js.Any])
    
    inline def setConstraintIterationsUndefined: Self = StObject.set(x, "constraintIterations", js.undefined)
    
    inline def setDetector(value: Detector): Self = StObject.set(x, "detector", value.asInstanceOf[js.Any])
    
    inline def setDetectorUndefined: Self = StObject.set(x, "detector", js.undefined)
    
    inline def setEnableSleeping(value: Boolean): Self = StObject.set(x, "enableSleeping", value.asInstanceOf[js.Any])
    
    inline def setEnableSleepingUndefined: Self = StObject.set(x, "enableSleeping", js.undefined)
    
    inline def setGravity(value: PartialGravity): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
    
    inline def setGravityUndefined: Self = StObject.set(x, "gravity", js.undefined)
    
    inline def setGrid(value: Grid): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
    
    inline def setPlugin(value: js.Object): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
    
    inline def setPluginUndefined: Self = StObject.set(x, "plugin", js.undefined)
    
    inline def setPositionIterations(value: Double): Self = StObject.set(x, "positionIterations", value.asInstanceOf[js.Any])
    
    inline def setPositionIterationsUndefined: Self = StObject.set(x, "positionIterations", js.undefined)
    
    inline def setTiming(value: IEngineTimingOptions): Self = StObject.set(x, "timing", value.asInstanceOf[js.Any])
    
    inline def setTimingUndefined: Self = StObject.set(x, "timing", js.undefined)
    
    inline def setVelocityIterations(value: Double): Self = StObject.set(x, "velocityIterations", value.asInstanceOf[js.Any])
    
    inline def setVelocityIterationsUndefined: Self = StObject.set(x, "velocityIterations", js.undefined)
    
    inline def setWorld(value: World): Self = StObject.set(x, "world", value.asInstanceOf[js.Any])
    
    inline def setWorldUndefined: Self = StObject.set(x, "world", js.undefined)
  }
}
