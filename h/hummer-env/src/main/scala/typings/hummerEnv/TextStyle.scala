package typings.hummerEnv

import typings.hummerEnv.hummerEnvStrings.`line-through`
import typings.hummerEnv.hummerEnvStrings.bottom
import typings.hummerEnv.hummerEnvStrings.center
import typings.hummerEnv.hummerEnvStrings.clip
import typings.hummerEnv.hummerEnvStrings.ellipsis
import typings.hummerEnv.hummerEnvStrings.italic
import typings.hummerEnv.hummerEnvStrings.left
import typings.hummerEnv.hummerEnvStrings.none
import typings.hummerEnv.hummerEnvStrings.normal
import typings.hummerEnv.hummerEnvStrings.right
import typings.hummerEnv.hummerEnvStrings.top
import typings.hummerEnv.hummerEnvStrings.underline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextStyle
  extends StObject
     with HummerCommonStyle {
  
  var color: js.UndefOr[String] = js.undefined
  
  // color: '#000000'
  /**
    * @summary fontFamily: 'Times New Roman'
    */
  var fontFamily: js.UndefOr[String] = js.undefined
  
  /**
    * @summary fontSize: 16 | '48px'
    */
  var fontSize: js.UndefOr[Double | String] = js.undefined
  
  /**
    * @summary fontStyle: 'normal' | 'italic'
    */
  var fontStyle: js.UndefOr[normal | italic] = js.undefined
  
  /**
    * @summary fontWeight: 'normal' | 'bold'
    */
  var fontWeight: js.UndefOr[String] = js.undefined
  
  /**
    * @summary letterSpacing: 0.5
    */
  var letterSpacing: js.UndefOr[Double] = js.undefined
  
  /**
    * @summary lineSpacingMulti: 1.2
    */
  var lineSpacingMulti: js.UndefOr[Double] = js.undefined
  
  /**
    * @summary textAlign: 'left' | 'center' | 'right'
    */
  var textAlign: js.UndefOr[left | center | right] = js.undefined
  
  /**
    * @summary textDecoration: 'none' | 'underline' | 'line-through'
    */
  var textDecoration: js.UndefOr[none | underline | `line-through`] = js.undefined
  
  /**
    * @summary textLineClamp: 1
    */
  var textLineClamp: js.UndefOr[Double] = js.undefined
  
  /**
    * @summary textOverflow: 'clip' | 'ellipsis'
    */
  var textOverflow: js.UndefOr[clip | ellipsis] = js.undefined
  
  /**
    * @summary textVerticalAlign: 'top' | 'center' | 'bottom'
    */
  var textVerticalAlign: js.UndefOr[top | center | bottom] = js.undefined
}
object TextStyle {
  
  inline def apply(): TextStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextStyle] (val x: Self) extends AnyVal {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    inline def setFontSize(value: Double | String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setFontStyle(value: normal | italic): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    inline def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    inline def setLetterSpacing(value: Double): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    inline def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
    
    inline def setLineSpacingMulti(value: Double): Self = StObject.set(x, "lineSpacingMulti", value.asInstanceOf[js.Any])
    
    inline def setLineSpacingMultiUndefined: Self = StObject.set(x, "lineSpacingMulti", js.undefined)
    
    inline def setTextAlign(value: left | center | right): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
    
    inline def setTextDecoration(value: none | underline | `line-through`): Self = StObject.set(x, "textDecoration", value.asInstanceOf[js.Any])
    
    inline def setTextDecorationUndefined: Self = StObject.set(x, "textDecoration", js.undefined)
    
    inline def setTextLineClamp(value: Double): Self = StObject.set(x, "textLineClamp", value.asInstanceOf[js.Any])
    
    inline def setTextLineClampUndefined: Self = StObject.set(x, "textLineClamp", js.undefined)
    
    inline def setTextOverflow(value: clip | ellipsis): Self = StObject.set(x, "textOverflow", value.asInstanceOf[js.Any])
    
    inline def setTextOverflowUndefined: Self = StObject.set(x, "textOverflow", js.undefined)
    
    inline def setTextVerticalAlign(value: top | center | bottom): Self = StObject.set(x, "textVerticalAlign", value.asInstanceOf[js.Any])
    
    inline def setTextVerticalAlignUndefined: Self = StObject.set(x, "textVerticalAlign", js.undefined)
  }
}
