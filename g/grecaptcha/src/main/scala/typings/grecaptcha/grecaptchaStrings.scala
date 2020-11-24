package typings.grecaptcha

import typings.grecaptcha.ReCaptchaV2.Badge
import typings.grecaptcha.ReCaptchaV2.Size
import typings.grecaptcha.ReCaptchaV2.Theme
import typings.grecaptcha.ReCaptchaV2.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object grecaptchaStrings {
  
  @scala.inline
  def audio: audio = "audio".asInstanceOf[audio]
  
  @scala.inline
  def bottomleft: bottomleft = "bottomleft".asInstanceOf[bottomleft]
  
  @scala.inline
  def bottomright: bottomright = "bottomright".asInstanceOf[bottomright]
  
  @scala.inline
  def compact: compact = "compact".asInstanceOf[compact]
  
  @scala.inline
  def dark: dark = "dark".asInstanceOf[dark]
  
  @scala.inline
  def image: image = "image".asInstanceOf[image]
  
  @scala.inline
  def `inline`: `inline` = "inline".asInstanceOf[`inline`]
  
  @scala.inline
  def invisible: invisible = "invisible".asInstanceOf[invisible]
  
  @scala.inline
  def light: light = "light".asInstanceOf[light]
  
  @scala.inline
  def normal: normal = "normal".asInstanceOf[normal]
  
  @js.native
  sealed trait audio extends Type
  
  @js.native
  sealed trait bottomleft extends Badge
  
  @js.native
  sealed trait bottomright extends Badge
  
  @js.native
  sealed trait compact extends Size
  
  @js.native
  sealed trait dark extends Theme
  
  @js.native
  sealed trait image extends Type
  
  @js.native
  sealed trait `inline` extends Badge
  
  @js.native
  sealed trait invisible extends Size
  
  @js.native
  sealed trait light extends Theme
  
  @js.native
  sealed trait normal extends Size
}
