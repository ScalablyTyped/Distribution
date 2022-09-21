package typings.hummerEnv

import typings.hummerEnv.hummerEnvStrings.grid
import typings.hummerEnv.hummerEnvStrings.horizontal
import typings.hummerEnv.hummerEnvStrings.list
import typings.hummerEnv.hummerEnvStrings.vertical
import typings.hummerEnv.hummerEnvStrings.waterfall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStyle
  extends StObject
     with HummerCommonStyle {
  
  /**
    * @summary bottomSpacing: 4
    */
  var bottomSpacing: js.UndefOr[Double | String] = js.undefined
  
  /**
    * @summary column: 3
    */
  var column: js.UndefOr[Double] = js.undefined
  
  /**
    * @summary itemSpacing: 4
    */
  var itemSpacing: js.UndefOr[Double | String] = js.undefined
  
  /**
    * @summary leftSpacing: 4
    */
  var leftSpacing: js.UndefOr[Double | String] = js.undefined
  
  /**
    * @summary lineSpacing: 4
    */
  var lineSpacing: js.UndefOr[Double | String] = js.undefined
  
  /**
    * @summary mode: 'list' | 'grid' | 'waterfall'
    */
  var mode: js.UndefOr[list | grid | waterfall] = js.undefined
  
  /**
    * @summary rightSpacing: 4
    */
  var rightSpacing: js.UndefOr[Double | String] = js.undefined
  
  /**
    * @summary scrollDirection: 'vertical' | 'horizontal'
    */
  var scrollDirection: js.UndefOr[vertical | horizontal] = js.undefined
  
  /**
    * @summary topSpacing: 4
    */
  var topSpacing: js.UndefOr[Double | String] = js.undefined
}
object ListStyle {
  
  inline def apply(): ListStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStyle]
  }
  
  extension [Self <: ListStyle](x: Self) {
    
    inline def setBottomSpacing(value: Double | String): Self = StObject.set(x, "bottomSpacing", value.asInstanceOf[js.Any])
    
    inline def setBottomSpacingUndefined: Self = StObject.set(x, "bottomSpacing", js.undefined)
    
    inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setItemSpacing(value: Double | String): Self = StObject.set(x, "itemSpacing", value.asInstanceOf[js.Any])
    
    inline def setItemSpacingUndefined: Self = StObject.set(x, "itemSpacing", js.undefined)
    
    inline def setLeftSpacing(value: Double | String): Self = StObject.set(x, "leftSpacing", value.asInstanceOf[js.Any])
    
    inline def setLeftSpacingUndefined: Self = StObject.set(x, "leftSpacing", js.undefined)
    
    inline def setLineSpacing(value: Double | String): Self = StObject.set(x, "lineSpacing", value.asInstanceOf[js.Any])
    
    inline def setLineSpacingUndefined: Self = StObject.set(x, "lineSpacing", js.undefined)
    
    inline def setMode(value: list | grid | waterfall): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setRightSpacing(value: Double | String): Self = StObject.set(x, "rightSpacing", value.asInstanceOf[js.Any])
    
    inline def setRightSpacingUndefined: Self = StObject.set(x, "rightSpacing", js.undefined)
    
    inline def setScrollDirection(value: vertical | horizontal): Self = StObject.set(x, "scrollDirection", value.asInstanceOf[js.Any])
    
    inline def setScrollDirectionUndefined: Self = StObject.set(x, "scrollDirection", js.undefined)
    
    inline def setTopSpacing(value: Double | String): Self = StObject.set(x, "topSpacing", value.asInstanceOf[js.Any])
    
    inline def setTopSpacingUndefined: Self = StObject.set(x, "topSpacing", js.undefined)
  }
}
