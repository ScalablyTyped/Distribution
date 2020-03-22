package typings.mangopay2NodejsSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object bankAccount {
  type CAData = typings.mangopay2NodejsSdk.mod.bankAccount.BaseData with typings.mangopay2NodejsSdk.mod.bankAccount.CADetails
  type Data = typings.mangopay2NodejsSdk.mod.bankAccount.OtherData | typings.mangopay2NodejsSdk.mod.bankAccount.CAData | typings.mangopay2NodejsSdk.mod.bankAccount.GBData | typings.mangopay2NodejsSdk.mod.bankAccount.IBANData | typings.mangopay2NodejsSdk.mod.bankAccount.USData
  type GBData = typings.mangopay2NodejsSdk.mod.bankAccount.BaseData with typings.mangopay2NodejsSdk.mod.bankAccount.GBDetails
  type IBANData = typings.mangopay2NodejsSdk.mod.bankAccount.BaseData with typings.mangopay2NodejsSdk.mod.bankAccount.IBANDetails
  type OtherData = typings.mangopay2NodejsSdk.mod.bankAccount.BaseData with typings.mangopay2NodejsSdk.mod.bankAccount.OtherDetails
  type USData = typings.mangopay2NodejsSdk.mod.bankAccount.BaseData with typings.mangopay2NodejsSdk.mod.bankAccount.USDetails
}
