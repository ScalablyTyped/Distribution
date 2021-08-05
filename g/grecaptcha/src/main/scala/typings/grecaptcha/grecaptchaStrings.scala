package typings.grecaptcha

import typings.grecaptcha.ReCaptchaV2.Badge
import typings.grecaptcha.ReCaptchaV2.Size
import typings.grecaptcha.ReCaptchaV2.Theme
import typings.grecaptcha.ReCaptchaV2.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object grecaptchaStrings {
  
  @js.native
  sealed trait audio
    extends StObject
       with Type
  inline def audio: audio = "audio".asInstanceOf[audio]
  
  @js.native
  sealed trait bottomleft
    extends StObject
       with Badge
  inline def bottomleft: bottomleft = "bottomleft".asInstanceOf[bottomleft]
  
  @js.native
  sealed trait bottomright
    extends StObject
       with Badge
  inline def bottomright: bottomright = "bottomright".asInstanceOf[bottomright]
  
  @js.native
  sealed trait compact
    extends StObject
       with Size
  inline def compact: compact = "compact".asInstanceOf[compact]
  
  @js.native
  sealed trait dark
    extends StObject
       with Theme
  inline def dark: dark = "dark".asInstanceOf[dark]
  
  @js.native
  sealed trait image
    extends StObject
       with Type
  inline def image: image = "image".asInstanceOf[image]
  
  @js.native
  sealed trait `inline`
    extends StObject
       with Badge
  inline def `inline`: `inline` = "inline".asInstanceOf[`inline`]
  
  @js.native
  sealed trait invisible
    extends StObject
       with Size
  inline def invisible: invisible = "invisible".asInstanceOf[invisible]
  
  @js.native
  sealed trait light
    extends StObject
       with Theme
  inline def light: light = "light".asInstanceOf[light]
  
  @js.native
  sealed trait normal
    extends StObject
       with Size
  inline def normal: normal = "normal".asInstanceOf[normal]
}
