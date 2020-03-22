package typings.mangopay2NodejsSdk.mod.models

import typings.mangopay2NodejsSdk.mod.MoneyData
import typings.mangopay2NodejsSdk.mod.eMoney.EMoneyData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mangopay2-nodejs-sdk", "models.EMoney")
@js.native
class EMoney protected () extends EMoneyData {
  def this(data: EMoneyData) = this()
  /* CompleteClass */
  override var CreationDate: Double = js.native
  /**
    * The amount of money that has been credited to this user
    */
  /* CompleteClass */
  override var CreditedEMoney: MoneyData = js.native
  /**
    * The amount of money that has been debited from this user
    */
  /* CompleteClass */
  override var DebitedEMoney: MoneyData = js.native
  /* CompleteClass */
  override var Id: String = js.native
  /* CompleteClass */
  override var Tag: String = js.native
  /**
    * The object owner's UserId
    */
  /* CompleteClass */
  override var UserId: String = js.native
}

