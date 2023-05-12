package typings.k6.anon

import typings.k6.k6Strings.`no-preference`
import typings.k6.k6Strings.dark
import typings.k6.k6Strings.light
import typings.k6.k6Strings.print
import typings.k6.k6Strings.reduce
import typings.k6.k6Strings.screen
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorScheme extends StObject {
  
  /**
    * Emulates `'prefers-colors-scheme'` media feature, supported values are
    * `'light'`, `'dark'`, and `'no-preference'`.
    */
  var colorScheme: js.UndefOr[light | dark | `no-preference`] = js.undefined
  
  /**
    * Changes the CSS media type of the page. The only allowed values are
    * `'screen'`, and `'print'`.
    */
  var media: js.UndefOr[screen | print] = js.undefined
  
  /**
    * Emulates `'prefers-reduced-motion'` media feature, supported values are
    * `'reduce'`, `'no-preference'`.
    */
  var reducedMotion: js.UndefOr[reduce | `no-preference`] = js.undefined
}
object ColorScheme {
  
  inline def apply(): ColorScheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorScheme]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColorScheme] (val x: Self) extends AnyVal {
    
    inline def setColorScheme(value: light | dark | `no-preference`): Self = StObject.set(x, "colorScheme", value.asInstanceOf[js.Any])
    
    inline def setColorSchemeUndefined: Self = StObject.set(x, "colorScheme", js.undefined)
    
    inline def setMedia(value: screen | print): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    inline def setReducedMotion(value: reduce | `no-preference`): Self = StObject.set(x, "reducedMotion", value.asInstanceOf[js.Any])
    
    inline def setReducedMotionUndefined: Self = StObject.set(x, "reducedMotion", js.undefined)
  }
}
