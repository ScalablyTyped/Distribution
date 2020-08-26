package typings.mangopay2NodejsSdk.mod.eMoney

import typings.mangopay2NodejsSdk.mod.MoneyData
import typings.mangopay2NodejsSdk.mod.entityBase.EntityBaseData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EMoneyData extends EntityBaseData {
  /**
    * The amount of money that has been credited to this user
    */
  var CreditedEMoney: MoneyData = js.native
  /**
    * The amount of money that has been debited from this user
    */
  var DebitedEMoney: MoneyData = js.native
  /**
    * The object owner's UserId
    */
  var UserId: String = js.native
}

object EMoneyData {
  @scala.inline
  def apply(
    CreationDate: Double,
    CreditedEMoney: MoneyData,
    DebitedEMoney: MoneyData,
    Id: String,
    Tag: String,
    UserId: String
  ): EMoneyData = {
    val __obj = js.Dynamic.literal(CreationDate = CreationDate.asInstanceOf[js.Any], CreditedEMoney = CreditedEMoney.asInstanceOf[js.Any], DebitedEMoney = DebitedEMoney.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EMoneyData]
  }
  @scala.inline
  implicit class EMoneyDataOps[Self <: EMoneyData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreditedEMoney(value: MoneyData): Self = this.set("CreditedEMoney", value.asInstanceOf[js.Any])
    @scala.inline
    def setDebitedEMoney(value: MoneyData): Self = this.set("DebitedEMoney", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserId(value: String): Self = this.set("UserId", value.asInstanceOf[js.Any])
  }
  
}

