package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CA
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GB
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IBAN
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NotSpecified
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.US
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBankAccountType extends js.Object {
  var CA: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CA
  var GB: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GB
  var IBAN: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IBAN
  var NotSpecified: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NotSpecified
  var OTHER: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER
  var US: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.US
}

object IBankAccountType {
  @scala.inline
  def apply(CA: CA, GB: GB, IBAN: IBAN, NotSpecified: NotSpecified, OTHER: OTHER, US: US): IBankAccountType = {
    val __obj = js.Dynamic.literal(CA = CA.asInstanceOf[js.Any], GB = GB.asInstanceOf[js.Any], IBAN = IBAN.asInstanceOf[js.Any], NotSpecified = NotSpecified.asInstanceOf[js.Any], OTHER = OTHER.asInstanceOf[js.Any], US = US.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBankAccountType]
  }
}

