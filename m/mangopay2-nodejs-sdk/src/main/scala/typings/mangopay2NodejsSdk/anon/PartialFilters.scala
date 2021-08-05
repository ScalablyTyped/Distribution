package typings.mangopay2NodejsSdk.anon

import typings.mangopay2NodejsSdk.mod.Timestamp
import typings.mangopay2NodejsSdk.mod.transaction.TransactionNature
import typings.mangopay2NodejsSdk.mod.transaction.TransactionStatus
import typings.mangopay2NodejsSdk.mod.transaction.TransactionType
import typings.mangopay2NodejsSdk.typesMod.CurrencyISO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.report.Filters> */
trait PartialFilters extends StObject {
  
  var AfterDate: js.UndefOr[Timestamp] = js.undefined
  
  var AuthorId: js.UndefOr[String] = js.undefined
  
  var BeforeDate: js.UndefOr[Timestamp] = js.undefined
  
  var MaxDebitedFundsAmount: js.UndefOr[Double] = js.undefined
  
  var MaxDebitedFundsCurrency: js.UndefOr[CurrencyISO] = js.undefined
  
  var MaxFeesAmount: js.UndefOr[Double] = js.undefined
  
  var MaxFeesCurrency: js.UndefOr[CurrencyISO] = js.undefined
  
  var MinDebitedFundsAmount: js.UndefOr[Double] = js.undefined
  
  var MinDebitedFundsCurrency: js.UndefOr[CurrencyISO] = js.undefined
  
  var MinFeesAmount: js.UndefOr[Double] = js.undefined
  
  var MinFeesCurrency: js.UndefOr[CurrencyISO] = js.undefined
  
  var Nature: js.UndefOr[js.Array[TransactionNature]] = js.undefined
  
  var Status: js.UndefOr[js.Array[TransactionStatus]] = js.undefined
  
  var Type: js.UndefOr[js.Array[TransactionType]] = js.undefined
  
  var WalletId: js.UndefOr[String] = js.undefined
}
object PartialFilters {
  
  inline def apply(): PartialFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialFilters]
  }
  
  extension [Self <: PartialFilters](x: Self) {
    
    inline def setAfterDate(value: Timestamp): Self = StObject.set(x, "AfterDate", value.asInstanceOf[js.Any])
    
    inline def setAfterDateUndefined: Self = StObject.set(x, "AfterDate", js.undefined)
    
    inline def setAuthorId(value: String): Self = StObject.set(x, "AuthorId", value.asInstanceOf[js.Any])
    
    inline def setAuthorIdUndefined: Self = StObject.set(x, "AuthorId", js.undefined)
    
    inline def setBeforeDate(value: Timestamp): Self = StObject.set(x, "BeforeDate", value.asInstanceOf[js.Any])
    
    inline def setBeforeDateUndefined: Self = StObject.set(x, "BeforeDate", js.undefined)
    
    inline def setMaxDebitedFundsAmount(value: Double): Self = StObject.set(x, "MaxDebitedFundsAmount", value.asInstanceOf[js.Any])
    
    inline def setMaxDebitedFundsAmountUndefined: Self = StObject.set(x, "MaxDebitedFundsAmount", js.undefined)
    
    inline def setMaxDebitedFundsCurrency(value: CurrencyISO): Self = StObject.set(x, "MaxDebitedFundsCurrency", value.asInstanceOf[js.Any])
    
    inline def setMaxDebitedFundsCurrencyUndefined: Self = StObject.set(x, "MaxDebitedFundsCurrency", js.undefined)
    
    inline def setMaxFeesAmount(value: Double): Self = StObject.set(x, "MaxFeesAmount", value.asInstanceOf[js.Any])
    
    inline def setMaxFeesAmountUndefined: Self = StObject.set(x, "MaxFeesAmount", js.undefined)
    
    inline def setMaxFeesCurrency(value: CurrencyISO): Self = StObject.set(x, "MaxFeesCurrency", value.asInstanceOf[js.Any])
    
    inline def setMaxFeesCurrencyUndefined: Self = StObject.set(x, "MaxFeesCurrency", js.undefined)
    
    inline def setMinDebitedFundsAmount(value: Double): Self = StObject.set(x, "MinDebitedFundsAmount", value.asInstanceOf[js.Any])
    
    inline def setMinDebitedFundsAmountUndefined: Self = StObject.set(x, "MinDebitedFundsAmount", js.undefined)
    
    inline def setMinDebitedFundsCurrency(value: CurrencyISO): Self = StObject.set(x, "MinDebitedFundsCurrency", value.asInstanceOf[js.Any])
    
    inline def setMinDebitedFundsCurrencyUndefined: Self = StObject.set(x, "MinDebitedFundsCurrency", js.undefined)
    
    inline def setMinFeesAmount(value: Double): Self = StObject.set(x, "MinFeesAmount", value.asInstanceOf[js.Any])
    
    inline def setMinFeesAmountUndefined: Self = StObject.set(x, "MinFeesAmount", js.undefined)
    
    inline def setMinFeesCurrency(value: CurrencyISO): Self = StObject.set(x, "MinFeesCurrency", value.asInstanceOf[js.Any])
    
    inline def setMinFeesCurrencyUndefined: Self = StObject.set(x, "MinFeesCurrency", js.undefined)
    
    inline def setNature(value: js.Array[TransactionNature]): Self = StObject.set(x, "Nature", value.asInstanceOf[js.Any])
    
    inline def setNatureUndefined: Self = StObject.set(x, "Nature", js.undefined)
    
    inline def setNatureVarargs(value: TransactionNature*): Self = StObject.set(x, "Nature", js.Array(value :_*))
    
    inline def setStatus(value: js.Array[TransactionStatus]): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setStatusVarargs(value: TransactionStatus*): Self = StObject.set(x, "Status", js.Array(value :_*))
    
    inline def setType(value: js.Array[TransactionType]): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setTypeVarargs(value: TransactionType*): Self = StObject.set(x, "Type", js.Array(value :_*))
    
    inline def setWalletId(value: String): Self = StObject.set(x, "WalletId", value.asInstanceOf[js.Any])
    
    inline def setWalletIdUndefined: Self = StObject.set(x, "WalletId", js.undefined)
  }
}
