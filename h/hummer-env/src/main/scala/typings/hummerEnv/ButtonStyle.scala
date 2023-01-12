package typings.hummerEnv

import typings.hummerEnv.hummerEnvStrings.center
import typings.hummerEnv.hummerEnvStrings.left
import typings.hummerEnv.hummerEnvStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonStyle
  extends StObject
     with HummerCommonStyle {
  
  /**
    * @summary color: '#000000'
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * @summary fontFamily: 'Times New Roman'
    */
  var fontFamily: js.UndefOr[String] = js.undefined
  
  /**
    * @summary fontSize: 16 | '48px'
    */
  var fontSize: js.UndefOr[Double | String] = js.undefined
  
  /**
    * @summary textAlign: 'left' | 'center' | 'right'
    */
  var textAlign: js.UndefOr[left | center | right] = js.undefined
}
object ButtonStyle {
  
  inline def apply(): ButtonStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ButtonStyle] (val x: Self) extends AnyVal {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    inline def setFontSize(value: Double | String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setTextAlign(value: left | center | right): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
  }
}
