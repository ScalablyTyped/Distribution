package typings.mangopay2NodejsSdk.anon

import typings.mangopay2NodejsSdk.mod.Timestamp
import typings.mangopay2NodejsSdk.mod.transaction.TransactionNature
import typings.mangopay2NodejsSdk.mod.transaction.TransactionStatus
import typings.mangopay2NodejsSdk.mod.transaction.TransactionType
import typings.mangopay2NodejsSdk.typesMod.CurrencyISO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.report.Filters> */
@js.native
trait PartialFilters extends StObject {
  
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
  implicit class PartialFiltersMutableBuilder[Self <: PartialFilters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterDate(value: Timestamp): Self = StObject.set(x, "AfterDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterDateUndefined: Self = StObject.set(x, "AfterDate", js.undefined)
    
    @scala.inline
    def setAuthorId(value: String): Self = StObject.set(x, "AuthorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorIdUndefined: Self = StObject.set(x, "AuthorId", js.undefined)
    
    @scala.inline
    def setBeforeDate(value: Timestamp): Self = StObject.set(x, "BeforeDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeDateUndefined: Self = StObject.set(x, "BeforeDate", js.undefined)
    
    @scala.inline
    def setMaxDebitedFundsAmount(value: Double): Self = StObject.set(x, "MaxDebitedFundsAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDebitedFundsAmountUndefined: Self = StObject.set(x, "MaxDebitedFundsAmount", js.undefined)
    
    @scala.inline
    def setMaxDebitedFundsCurrency(value: CurrencyISO): Self = StObject.set(x, "MaxDebitedFundsCurrency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDebitedFundsCurrencyUndefined: Self = StObject.set(x, "MaxDebitedFundsCurrency", js.undefined)
    
    @scala.inline
    def setMaxFeesAmount(value: Double): Self = StObject.set(x, "MaxFeesAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxFeesAmountUndefined: Self = StObject.set(x, "MaxFeesAmount", js.undefined)
    
    @scala.inline
    def setMaxFeesCurrency(value: CurrencyISO): Self = StObject.set(x, "MaxFeesCurrency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxFeesCurrencyUndefined: Self = StObject.set(x, "MaxFeesCurrency", js.undefined)
    
    @scala.inline
    def setMinDebitedFundsAmount(value: Double): Self = StObject.set(x, "MinDebitedFundsAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinDebitedFundsAmountUndefined: Self = StObject.set(x, "MinDebitedFundsAmount", js.undefined)
    
    @scala.inline
    def setMinDebitedFundsCurrency(value: CurrencyISO): Self = StObject.set(x, "MinDebitedFundsCurrency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinDebitedFundsCurrencyUndefined: Self = StObject.set(x, "MinDebitedFundsCurrency", js.undefined)
    
    @scala.inline
    def setMinFeesAmount(value: Double): Self = StObject.set(x, "MinFeesAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinFeesAmountUndefined: Self = StObject.set(x, "MinFeesAmount", js.undefined)
    
    @scala.inline
    def setMinFeesCurrency(value: CurrencyISO): Self = StObject.set(x, "MinFeesCurrency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinFeesCurrencyUndefined: Self = StObject.set(x, "MinFeesCurrency", js.undefined)
    
    @scala.inline
    def setNature(value: js.Array[TransactionNature]): Self = StObject.set(x, "Nature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNatureUndefined: Self = StObject.set(x, "Nature", js.undefined)
    
    @scala.inline
    def setNatureVarargs(value: TransactionNature*): Self = StObject.set(x, "Nature", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: js.Array[TransactionStatus]): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setStatusVarargs(value: TransactionStatus*): Self = StObject.set(x, "Status", js.Array(value :_*))
    
    @scala.inline
    def setType(value: js.Array[TransactionType]): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    @scala.inline
    def setTypeVarargs(value: TransactionType*): Self = StObject.set(x, "Type", js.Array(value :_*))
    
    @scala.inline
    def setWalletId(value: String): Self = StObject.set(x, "WalletId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWalletIdUndefined: Self = StObject.set(x, "WalletId", js.undefined)
  }
}
