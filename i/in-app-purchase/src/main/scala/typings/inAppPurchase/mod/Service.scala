package typings.inAppPurchase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.inAppPurchase.inAppPurchaseStrings.unity
  - typings.inAppPurchase.inAppPurchaseStrings.apple
  - typings.inAppPurchase.inAppPurchaseStrings.google
  - typings.inAppPurchase.inAppPurchaseStrings.windows
  - typings.inAppPurchase.inAppPurchaseStrings.amazon
  - typings.inAppPurchase.inAppPurchaseStrings.roku
*/
trait Service extends js.Object

object Service {
  @scala.inline
  def amazon: typings.inAppPurchase.inAppPurchaseStrings.amazon = this.cast("amazon")
  @scala.inline
  def apple: typings.inAppPurchase.inAppPurchaseStrings.apple = this.cast("apple")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def google: typings.inAppPurchase.inAppPurchaseStrings.google = this.cast("google")
  @scala.inline
  def roku: typings.inAppPurchase.inAppPurchaseStrings.roku = this.cast("roku")
  @scala.inline
  def unity: typings.inAppPurchase.inAppPurchaseStrings.unity = this.cast("unity")
  @scala.inline
  def windows: typings.inAppPurchase.inAppPurchaseStrings.windows = this.cast("windows")
}

