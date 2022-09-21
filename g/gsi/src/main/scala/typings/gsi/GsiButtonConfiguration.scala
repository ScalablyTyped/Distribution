package typings.gsi

import typings.gsi.gsiStrings.center
import typings.gsi.gsiStrings.circle
import typings.gsi.gsiStrings.continue_with
import typings.gsi.gsiStrings.filled_black
import typings.gsi.gsiStrings.filled_blue
import typings.gsi.gsiStrings.icon
import typings.gsi.gsiStrings.large
import typings.gsi.gsiStrings.left
import typings.gsi.gsiStrings.medium
import typings.gsi.gsiStrings.outline
import typings.gsi.gsiStrings.pill
import typings.gsi.gsiStrings.rectangular
import typings.gsi.gsiStrings.signin_with
import typings.gsi.gsiStrings.signup_with
import typings.gsi.gsiStrings.small
import typings.gsi.gsiStrings.square
import typings.gsi.gsiStrings.standard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GsiButtonConfiguration extends StObject {
  
  /** If set, then the button language is rendered. */
  var locale: js.UndefOr[String] = js.undefined
  
  /** The Google logo alignment: left or center. */
  var logo_alignment: js.UndefOr[left | center] = js.undefined
  
  /** The button shape. For example, rectangular or circular. */
  var shape: js.UndefOr[rectangular | pill | circle | square] = js.undefined
  
  /** The button size. For example, small or large. */
  var size: js.UndefOr[large | medium | small] = js.undefined
  
  /** The button text. For example, "Sign in with Google" or "Sign up with Google" */
  var text: js.UndefOr[signin_with | signup_with | continue_with] = js.undefined
  
  /** The button theme. For example, filled_blue or filled_black. */
  var theme: js.UndefOr[outline | filled_blue | filled_black] = js.undefined
  
  /** The button type: icon, or standard button. */
  var `type`: standard | icon
  
  /** The button width, in pixels. */
  var width: js.UndefOr[String] = js.undefined
}
object GsiButtonConfiguration {
  
  inline def apply(`type`: standard | icon): GsiButtonConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GsiButtonConfiguration]
  }
  
  extension [Self <: GsiButtonConfiguration](x: Self) {
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setLogo_alignment(value: left | center): Self = StObject.set(x, "logo_alignment", value.asInstanceOf[js.Any])
    
    inline def setLogo_alignmentUndefined: Self = StObject.set(x, "logo_alignment", js.undefined)
    
    inline def setShape(value: rectangular | pill | circle | square): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    inline def setSize(value: large | medium | small): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setText(value: signin_with | signup_with | continue_with): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTheme(value: outline | filled_blue | filled_black): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setType(value: standard | icon): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
