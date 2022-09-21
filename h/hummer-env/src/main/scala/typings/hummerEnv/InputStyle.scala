package typings.hummerEnv

import typings.hummerEnv.hummerEnvStrings.center
import typings.hummerEnv.hummerEnvStrings.default
import typings.hummerEnv.hummerEnvStrings.done
import typings.hummerEnv.hummerEnvStrings.email
import typings.hummerEnv.hummerEnvStrings.go
import typings.hummerEnv.hummerEnvStrings.left
import typings.hummerEnv.hummerEnvStrings.next
import typings.hummerEnv.hummerEnvStrings.number
import typings.hummerEnv.hummerEnvStrings.password
import typings.hummerEnv.hummerEnvStrings.right
import typings.hummerEnv.hummerEnvStrings.search
import typings.hummerEnv.hummerEnvStrings.send
import typings.hummerEnv.hummerEnvStrings.tel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputStyle
  extends StObject
     with HummerCommonStyle {
  
  /**
    * @summary color: '#000000'
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * @summary cursorColor: '#007AFF'
    */
  var cursorColor: js.UndefOr[String] = js.undefined
  
  /**
    * @summary fontFamily: "New Times Roma"
    */
  var fontFamily: js.UndefOr[String] = js.undefined
  
  /**
    * @summary fontSize: 16 | '48px'
    */
  var fontSize: js.UndefOr[Double | String] = js.undefined
  
  /**
    * @summary maxLength: 10
    */
  var maxLength: js.UndefOr[Double] = js.undefined
  
  /**
    * @summary placeholderColor: '#999999'
    */
  var placeholderColor: js.UndefOr[String] = js.undefined
  
  /**
    * @summary returnKeyType: 'done' | 'go' | 'next' | 'search' | 'send'
    */
  var returnKeyType: js.UndefOr[done | go | next | search | send] = js.undefined
  
  /**
    * @summary textAlign: 'left' | 'center' | 'right'
    */
  var textAlign: js.UndefOr[left | center | right] = js.undefined
  
  /**
    * @summary type: 'default' | 'number' | 'tel' | 'email' | 'password'
    */
  var `type`: js.UndefOr[default | number | tel | email | password] = js.undefined
}
object InputStyle {
  
  inline def apply(): InputStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputStyle]
  }
  
  extension [Self <: InputStyle](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setCursorColor(value: String): Self = StObject.set(x, "cursorColor", value.asInstanceOf[js.Any])
    
    inline def setCursorColorUndefined: Self = StObject.set(x, "cursorColor", js.undefined)
    
    inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    inline def setFontSize(value: Double | String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    inline def setPlaceholderColor(value: String): Self = StObject.set(x, "placeholderColor", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderColorUndefined: Self = StObject.set(x, "placeholderColor", js.undefined)
    
    inline def setReturnKeyType(value: done | go | next | search | send): Self = StObject.set(x, "returnKeyType", value.asInstanceOf[js.Any])
    
    inline def setReturnKeyTypeUndefined: Self = StObject.set(x, "returnKeyType", js.undefined)
    
    inline def setTextAlign(value: left | center | right): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
    
    inline def setType(value: default | number | tel | email | password): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
