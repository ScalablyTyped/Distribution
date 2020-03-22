package typings.mangopay2NodejsSdk.mod.eMoney

import typings.mangopay2NodejsSdk.mod.MoneyData
import typings.mangopay2NodejsSdk.mod.entityBase.EntityBaseData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EMoneyData extends EntityBaseData {
  /**
    * The amount of money that has been credited to this user
    */
  var CreditedEMoney: MoneyData
  /**
    * The amount of money that has been debited from this user
    */
  var DebitedEMoney: MoneyData
  /**
    * The object owner's UserId
    */
  var UserId: String
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
}

