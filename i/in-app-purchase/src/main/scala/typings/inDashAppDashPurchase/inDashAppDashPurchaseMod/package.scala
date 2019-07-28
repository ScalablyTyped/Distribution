package typings.inDashAppDashPurchase

import typings.inDashAppDashPurchase.Anon_Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object inDashAppDashPurchaseMod {
  type AmazonReceipt = js.Object | String
  type AppleReceipt = String
  type GoogleReceipt = Anon_Date | String
  type Receipt = UnityReceipt | AppleReceipt | GoogleReceipt | WindowsReceipt | AmazonReceipt | RokuReceipt
  type RokuReceipt = String
  type UnityReceipt = js.Object | String
  type WindowsReceipt = String
}
