package typings.mangopay2NodejsSdk.anon

import typings.mangopay2NodejsSdk.mod.Timestamp
import typings.mangopay2NodejsSdk.mod.transaction.TransactionNature
import typings.mangopay2NodejsSdk.mod.transaction.TransactionStatus
import typings.mangopay2NodejsSdk.mod.transaction.TransactionType
import typings.mangopay2NodejsSdk.typesMod.CurrencyISO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.report.Filters> */
@js.native
trait PartialFilters extends js.Object {
  
  var AfterDate: js.UndefOr[Timestamp] = js.native
  
  var AuthorId: js.UndefOr[String] = js.native
  
  var BeforeDate: js.UndefOr[Timestamp] = js.native
  
  var MaxDebitedFundsAmount: js.UndefOr[Double] = js.native
  
  var MaxDebitedFundsCurrency: js.UndefOr[CurrencyISO] = js.native
  
  var MaxFeesAmount: js.UndefOr[Double] = js.native
  
  var MaxFeesCurrency: js.UndefOr[CurrencyISO] = js.native
  
  var MinDebitedFundsAmount: js.UndefOr[Double] = js.native
  
  var MinDebitedFundsCurrency: js.UndefOr[CurrencyISO] = js.native
  
  var MinFeesAmount: js.UndefOr[Double] = js.native
  
  var MinFeesCurrency: js.UndefOr[CurrencyISO] = js.native
  
  var Nature: js.UndefOr[js.Array[TransactionNature]] = js.native
  
  var Status: js.UndefOr[js.Array[TransactionStatus]] = js.native
  
  var Type: js.UndefOr[js.Array[TransactionType]] = js.native
  
  var WalletId: js.UndefOr[String] = js.native
}
object PartialFilters {
  
  @scala.inline
  def apply(): PartialFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialFilters]
  }
  
  @scala.inline
  implicit class PartialFiltersOps[Self <: PartialFilters] (val x: Self) extends AnyVal {
    
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
    def setAfterDate(value: Timestamp): Self = this.set("AfterDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfterDate: Self = this.set("AfterDate", js.undefined)
    
    @scala.inline
    def setAuthorId(value: String): Self = this.set("AuthorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorId: Self = this.set("AuthorId", js.undefined)
    
    @scala.inline
    def setBeforeDate(value: Timestamp): Self = this.set("BeforeDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeforeDate: Self = this.set("BeforeDate", js.undefined)
    
    @scala.inline
    def setMaxDebitedFundsAmount(value: Double): Self = this.set("MaxDebitedFundsAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDebitedFundsAmount: Self = this.set("MaxDebitedFundsAmount", js.undefined)
    
    @scala.inline
    def setMaxDebitedFundsCurrency(value: CurrencyISO): Self = this.set("MaxDebitedFundsCurrency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDebitedFundsCurrency: Self = this.set("MaxDebitedFundsCurrency", js.undefined)
    
    @scala.inline
    def setMaxFeesAmount(value: Double): Self = this.set("MaxFeesAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxFeesAmount: Self = this.set("MaxFeesAmount", js.undefined)
    
    @scala.inline
    def setMaxFeesCurrency(value: CurrencyISO): Self = this.set("MaxFeesCurrency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxFeesCurrency: Self = this.set("MaxFeesCurrency", js.undefined)
    
    @scala.inline
    def setMinDebitedFundsAmount(value: Double): Self = this.set("MinDebitedFundsAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinDebitedFundsAmount: Self = this.set("MinDebitedFundsAmount", js.undefined)
    
    @scala.inline
    def setMinDebitedFundsCurrency(value: CurrencyISO): Self = this.set("MinDebitedFundsCurrency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinDebitedFundsCurrency: Self = this.set("MinDebitedFundsCurrency", js.undefined)
    
    @scala.inline
    def setMinFeesAmount(value: Double): Self = this.set("MinFeesAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinFeesAmount: Self = this.set("MinFeesAmount", js.undefined)
    
    @scala.inline
    def setMinFeesCurrency(value: CurrencyISO): Self = this.set("MinFeesCurrency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinFeesCurrency: Self = this.set("MinFeesCurrency", js.undefined)
    
    @scala.inline
    def setNatureVarargs(value: TransactionNature*): Self = this.set("Nature", js.Array(value :_*))
    
    @scala.inline
    def setNature(value: js.Array[TransactionNature]): Self = this.set("Nature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNature: Self = this.set("Nature", js.undefined)
    
    @scala.inline
    def setStatusVarargs(value: TransactionStatus*): Self = this.set("Status", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: js.Array[TransactionStatus]): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setTypeVarargs(value: TransactionType*): Self = this.set("Type", js.Array(value :_*))
    
    @scala.inline
    def setType(value: js.Array[TransactionType]): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
    
    @scala.inline
    def setWalletId(value: String): Self = this.set("WalletId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWalletId: Self = this.set("WalletId", js.undefined)
  }
}
