package typings.inAppPurchase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AmazonReceipt = js.Object | java.lang.String
  type AppleReceipt = java.lang.String
  type FacebookReceipt = java.lang.String
  type GoogleReceipt = typings.inAppPurchase.anon.Data | java.lang.String
  type Receipt = typings.inAppPurchase.mod.UnityReceipt | typings.inAppPurchase.mod.AppleReceipt | typings.inAppPurchase.mod.GoogleReceipt | typings.inAppPurchase.mod.WindowsReceipt | typings.inAppPurchase.mod.AmazonReceipt | typings.inAppPurchase.mod.FacebookReceipt | typings.inAppPurchase.mod.RokuReceipt
  type RokuReceipt = java.lang.String
  type Service = /* "unity" */ java.lang.String
  type UnityReceipt = js.Object | java.lang.String
  type WindowsReceipt = java.lang.String
}
