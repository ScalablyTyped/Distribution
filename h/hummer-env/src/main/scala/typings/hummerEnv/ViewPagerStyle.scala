package typings.hummerEnv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewPagerStyle
  extends StObject
     with HummerCommonStyle {
  
  /**
    * @summary alphaFactor: 0.6
    */
  var alphaFactor: js.UndefOr[Double] = js.undefined
  
  /**
    * @summary autoPlay: true
    */
  var autoPlay: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @summary canLoop: true
    */
  var canLoop: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @summary edgeSpacing: 4
    */
  var edgeSpacing: js.UndefOr[Double | String] = js.undefined
  
  /**
    * @summary itemSpacing: 4
    */
  var itemSpacing: js.UndefOr[Double | String] = js.undefined
  
  /**
    * @summary loopInterval: 2000
    */
  var loopInterval: js.UndefOr[Double] = js.undefined
  
  /**
    * @summary scaleFactor: 0.6
    */
  var scaleFactor: js.UndefOr[Double] = js.undefined
}
object ViewPagerStyle {
  
  inline def apply(): ViewPagerStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewPagerStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ViewPagerStyle] (val x: Self) extends AnyVal {
    
    inline def setAlphaFactor(value: Double): Self = StObject.set(x, "alphaFactor", value.asInstanceOf[js.Any])
    
    inline def setAlphaFactorUndefined: Self = StObject.set(x, "alphaFactor", js.undefined)
    
    inline def setAutoPlay(value: Boolean): Self = StObject.set(x, "autoPlay", value.asInstanceOf[js.Any])
    
    inline def setAutoPlayUndefined: Self = StObject.set(x, "autoPlay", js.undefined)
    
    inline def setCanLoop(value: Boolean): Self = StObject.set(x, "canLoop", value.asInstanceOf[js.Any])
    
    inline def setCanLoopUndefined: Self = StObject.set(x, "canLoop", js.undefined)
    
    inline def setEdgeSpacing(value: Double | String): Self = StObject.set(x, "edgeSpacing", value.asInstanceOf[js.Any])
    
    inline def setEdgeSpacingUndefined: Self = StObject.set(x, "edgeSpacing", js.undefined)
    
    inline def setItemSpacing(value: Double | String): Self = StObject.set(x, "itemSpacing", value.asInstanceOf[js.Any])
    
    inline def setItemSpacingUndefined: Self = StObject.set(x, "itemSpacing", js.undefined)
    
    inline def setLoopInterval(value: Double): Self = StObject.set(x, "loopInterval", value.asInstanceOf[js.Any])
    
    inline def setLoopIntervalUndefined: Self = StObject.set(x, "loopInterval", js.undefined)
    
    inline def setScaleFactor(value: Double): Self = StObject.set(x, "scaleFactor", value.asInstanceOf[js.Any])
    
    inline def setScaleFactorUndefined: Self = StObject.set(x, "scaleFactor", js.undefined)
  }
}
