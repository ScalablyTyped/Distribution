package typings.mangopay2NodejsSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mandate {
  type MandateExecutionType = typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WEB
  /**
    * - "CREATED" - the mandate has been created
    * - "SUBMITTED" - the mandate has been submitted to the banks and you can now do payments with this mandate
    * - "ACTIVE" - the mandate is active and has been accepted by the banks and/or successfully used in a payment
    * - "FAILED" - the mandate has failed for a variety of reasons and is no longer available for payments
    */
  type MandateStatus = typings.mangopay2NodejsSdk.typesMod.ValueOf[typings.mangopay2NodejsSdk.mod.IMandateStatus]
  type MandateType = typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DIRECT_DEBIT
}
