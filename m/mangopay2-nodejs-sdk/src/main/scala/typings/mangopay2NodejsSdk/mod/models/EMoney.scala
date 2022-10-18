package typings.mangopay2NodejsSdk.mod.models

import typings.mangopay2NodejsSdk.typingsModelsMoneyMod.money.EMoneyData
import typings.mangopay2NodejsSdk.typingsModelsMoneyMod.money.MoneyData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mangopay2-nodejs-sdk", "models.EMoney")
@js.native
open class EMoney protected ()
  extends StObject
     with EMoneyData {
  def this(data: EMoneyData) = this()
  
  /* CompleteClass */
  var CreationDate: Double = js.native
  
  /**
    * The amount of money that has been credited to this user
    */
  /* CompleteClass */
  var CreditedEMoney: MoneyData = js.native
  
  /**
    * The amount of money that has been debited from this user
    */
  /* CompleteClass */
  var DebitedEMoney: MoneyData = js.native
  
  /* CompleteClass */
  var Id: String = js.native
  
  /* CompleteClass */
  var Tag: String = js.native
  
  /**
    * The object owner's UserId
    */
  /* CompleteClass */
  var UserId: String = js.native
}
