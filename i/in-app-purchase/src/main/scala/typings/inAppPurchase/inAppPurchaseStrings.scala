package typings.inAppPurchase

import typings.inAppPurchase.mod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object inAppPurchaseStrings {
  @js.native
  sealed trait amazon extends Service
  
  @js.native
  sealed trait apple extends Service
  
  @js.native
  sealed trait facebook extends Service
  
  @js.native
  sealed trait google extends Service
  
  @js.native
  sealed trait roku extends Service
  
  @js.native
  sealed trait unity extends Service
  
  @js.native
  sealed trait windows extends Service
  
  @scala.inline
  def amazon: amazon = "amazon".asInstanceOf[amazon]
  @scala.inline
  def apple: apple = "apple".asInstanceOf[apple]
  @scala.inline
  def facebook: facebook = "facebook".asInstanceOf[facebook]
  @scala.inline
  def google: google = "google".asInstanceOf[google]
  @scala.inline
  def roku: roku = "roku".asInstanceOf[roku]
  @scala.inline
  def unity: unity = "unity".asInstanceOf[unity]
  @scala.inline
  def windows: windows = "windows".asInstanceOf[windows]
}

