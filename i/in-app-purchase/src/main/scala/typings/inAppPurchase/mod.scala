package typings.inAppPurchase

import typings.inAppPurchase.anon.ClientEmail
import typings.inAppPurchase.anon.Data
import typings.inAppPurchase.anon.IgnoreCanceled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("in-app-purchase", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("in-app-purchase", "AMAZON")
  @js.native
  val AMAZON: /* "amazon" */ String = js.native
  
  @JSImport("in-app-purchase", "APPLE")
  @js.native
  val APPLE: /* "apple" */ String = js.native
  
  @JSImport("in-app-purchase", "FACEBOOK")
  @js.native
  val FACEBOOK: /* "facebook" */ String = js.native
  
  @JSImport("in-app-purchase", "GOOGLE")
  @js.native
  val GOOGLE: /* "google" */ String = js.native
  
  @JSImport("in-app-purchase", "ROKU")
  @js.native
  val ROKU: /* "roku" */ String = js.native
  
  @JSImport("in-app-purchase", "UNITY")
  @js.native
  val UNITY: /* "unity" */ String = js.native
  
  @JSImport("in-app-purchase", "WINDOWS")
  @js.native
  val WINDOWS: /* "windows" */ String = js.native
  
  inline def config(params: Config_): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("config")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getPurchaseData(): js.Array[PurchasedItem] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getPurchaseData")().asInstanceOf[js.Array[PurchasedItem] | Null]
  inline def getPurchaseData(purchaseData: Unit, options: IgnoreCanceled): js.Array[PurchasedItem] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getPurchaseData")(purchaseData.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[PurchasedItem] | Null]
  inline def getPurchaseData(purchaseData: ValidationResponse): js.Array[PurchasedItem] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getPurchaseData")(purchaseData.asInstanceOf[js.Any]).asInstanceOf[js.Array[PurchasedItem] | Null]
  inline def getPurchaseData(purchaseData: ValidationResponse, options: IgnoreCanceled): js.Array[PurchasedItem] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getPurchaseData")(purchaseData.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[PurchasedItem] | Null]
  
  inline def getService(receipt: Receipt): Service = ^.asInstanceOf[js.Dynamic].applyDynamic("getService")(receipt.asInstanceOf[js.Any]).asInstanceOf[Service]
  
  inline def isCanceled(item: PurchasedItem): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCanceled")(item.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isExpired(item: PurchasedItem): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExpired")(item.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidated(response: ValidationResponse): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidated")(response.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def refreshGoogleToken(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("refreshGoogleToken")().asInstanceOf[js.Promise[Unit]]
  inline def refreshGoogleToken(callback: js.Function1[/* err */ Any, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("refreshGoogleToken")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Unit]
  
  inline def setup(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setup")().asInstanceOf[js.Promise[Unit]]
  inline def setup(callback: js.Function1[/* err */ Any, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setup")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def validate(receipt: Receipt): js.Promise[ValidationResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("validate")(receipt.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ValidationResponse]]
  inline def validate(receipt: Receipt, callback: js.Function2[/* err */ Any, /* res */ ValidationResponse, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(receipt.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def validate(
    service: Service,
    receipt: Receipt,
    callback: js.Function2[/* err */ Any, /* res */ ValidationResponse, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(service.asInstanceOf[js.Any], receipt.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validateOnce(receipt: Receipt, secretOrPubKey: Any): js.Promise[ValidationResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("validateOnce")(receipt.asInstanceOf[js.Any], secretOrPubKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ValidationResponse]]
  inline def validateOnce(
    receipt: Receipt,
    secretOrPubKey: Any,
    callback: js.Function2[/* err */ Any, /* res */ ValidationResponse, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateOnce")(receipt.asInstanceOf[js.Any], secretOrPubKey.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def validateOnce(
    service: Service,
    secretOrPubKey: Any,
    receipt: Receipt,
    callback: js.Function2[/* err */ Any, /* res */ ValidationResponse, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateOnce")(service.asInstanceOf[js.Any], secretOrPubKey.asInstanceOf[js.Any], receipt.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type AmazonReceipt = js.Object | String
  
  type AppleReceipt = String
  
  trait Config_ extends StObject {
    
    /* Configurations for Amazon Store */
    var amazonAPIVersion: js.UndefOr[Double] = js.undefined
    
    /* Configurations for Apple */
    // if you want to exclude old transaction, set this to true. Default is false
    var appleExcludeOldTransactions: js.UndefOr[Boolean] = js.undefined
    
    // this comes from iTunes Connect (You need this to valiate subscriptions)
    var applePassword: js.UndefOr[String] = js.undefined
    
    /* Configurations for Facebook (Payments Lite) */
    var facebookAppId: js.UndefOr[String] = js.undefined
    
    var facebookAppSecret: js.UndefOr[String] = js.undefined
    
    // optional, for Google Play subscriptions
    var googleAccToken: js.UndefOr[String] = js.undefined
    
    // optional, for Google Play subscriptions
    var googleClientID: js.UndefOr[String] = js.undefined
    
    // optional, for Google Play subscriptions
    var googleClientSecret: js.UndefOr[String] = js.undefined
    
    /* Configurations for Google Play */
    // this is the path to the directory containing iap-sanbox/iap-live files
    var googlePublicKeyPath: js.UndefOr[String] = js.undefined
    
    // this is the google iap-live public key string
    var googlePublicKeyStrLive: js.UndefOr[String] = js.undefined
    
    // this is the google iap-sandbox public key string
    var googlePublicKeyStrSandBox: js.UndefOr[String] = js.undefined
    
    // optional, for Google Play subscritions
    var googleRefToken: js.UndefOr[String] = js.undefined
    
    // optional, for Google Play subscriptions
    var googleRefreshToken: js.UndefOr[String] = js.undefined
    
    // Configurations for Google Service Account validation: You can validate with just packageName, productId, and purchaseToken
    var googleServiceAccount: js.UndefOr[ClientEmail] = js.undefined
    
    /* Configurations for Roku */
    // this comes from Roku Developer Dashboard
    var rokuApiKey: js.UndefOr[String] = js.undefined
    
    var secret: js.UndefOr[String] = js.undefined
    
    /* Configurations all platforms */
    // For Apple and Googl Play to force Sandbox validation only
    var test: js.UndefOr[Boolean] = js.undefined
    
    // Output debug logs to stdout stream
    var verbose: js.UndefOr[Boolean] = js.undefined
  }
  object Config_ {
    
    inline def apply(): Config_ = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config_]
    }
    
    extension [Self <: Config_](x: Self) {
      
      inline def setAmazonAPIVersion(value: Double): Self = StObject.set(x, "amazonAPIVersion", value.asInstanceOf[js.Any])
      
      inline def setAmazonAPIVersionUndefined: Self = StObject.set(x, "amazonAPIVersion", js.undefined)
      
      inline def setAppleExcludeOldTransactions(value: Boolean): Self = StObject.set(x, "appleExcludeOldTransactions", value.asInstanceOf[js.Any])
      
      inline def setAppleExcludeOldTransactionsUndefined: Self = StObject.set(x, "appleExcludeOldTransactions", js.undefined)
      
      inline def setApplePassword(value: String): Self = StObject.set(x, "applePassword", value.asInstanceOf[js.Any])
      
      inline def setApplePasswordUndefined: Self = StObject.set(x, "applePassword", js.undefined)
      
      inline def setFacebookAppId(value: String): Self = StObject.set(x, "facebookAppId", value.asInstanceOf[js.Any])
      
      inline def setFacebookAppIdUndefined: Self = StObject.set(x, "facebookAppId", js.undefined)
      
      inline def setFacebookAppSecret(value: String): Self = StObject.set(x, "facebookAppSecret", value.asInstanceOf[js.Any])
      
      inline def setFacebookAppSecretUndefined: Self = StObject.set(x, "facebookAppSecret", js.undefined)
      
      inline def setGoogleAccToken(value: String): Self = StObject.set(x, "googleAccToken", value.asInstanceOf[js.Any])
      
      inline def setGoogleAccTokenUndefined: Self = StObject.set(x, "googleAccToken", js.undefined)
      
      inline def setGoogleClientID(value: String): Self = StObject.set(x, "googleClientID", value.asInstanceOf[js.Any])
      
      inline def setGoogleClientIDUndefined: Self = StObject.set(x, "googleClientID", js.undefined)
      
      inline def setGoogleClientSecret(value: String): Self = StObject.set(x, "googleClientSecret", value.asInstanceOf[js.Any])
      
      inline def setGoogleClientSecretUndefined: Self = StObject.set(x, "googleClientSecret", js.undefined)
      
      inline def setGooglePublicKeyPath(value: String): Self = StObject.set(x, "googlePublicKeyPath", value.asInstanceOf[js.Any])
      
      inline def setGooglePublicKeyPathUndefined: Self = StObject.set(x, "googlePublicKeyPath", js.undefined)
      
      inline def setGooglePublicKeyStrLive(value: String): Self = StObject.set(x, "googlePublicKeyStrLive", value.asInstanceOf[js.Any])
      
      inline def setGooglePublicKeyStrLiveUndefined: Self = StObject.set(x, "googlePublicKeyStrLive", js.undefined)
      
      inline def setGooglePublicKeyStrSandBox(value: String): Self = StObject.set(x, "googlePublicKeyStrSandBox", value.asInstanceOf[js.Any])
      
      inline def setGooglePublicKeyStrSandBoxUndefined: Self = StObject.set(x, "googlePublicKeyStrSandBox", js.undefined)
      
      inline def setGoogleRefToken(value: String): Self = StObject.set(x, "googleRefToken", value.asInstanceOf[js.Any])
      
      inline def setGoogleRefTokenUndefined: Self = StObject.set(x, "googleRefToken", js.undefined)
      
      inline def setGoogleRefreshToken(value: String): Self = StObject.set(x, "googleRefreshToken", value.asInstanceOf[js.Any])
      
      inline def setGoogleRefreshTokenUndefined: Self = StObject.set(x, "googleRefreshToken", js.undefined)
      
      inline def setGoogleServiceAccount(value: ClientEmail): Self = StObject.set(x, "googleServiceAccount", value.asInstanceOf[js.Any])
      
      inline def setGoogleServiceAccountUndefined: Self = StObject.set(x, "googleServiceAccount", js.undefined)
      
      inline def setRokuApiKey(value: String): Self = StObject.set(x, "rokuApiKey", value.asInstanceOf[js.Any])
      
      inline def setRokuApiKeyUndefined: Self = StObject.set(x, "rokuApiKey", js.undefined)
      
      inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
      
      inline def setTest(value: Boolean): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  type FacebookReceipt = String
  
  type GoogleReceipt = Data | String
  
  trait PurchasedItem extends StObject {
    
    // only Apple
    var appItemId: js.UndefOr[String] = js.undefined
    
    var bundleId: js.UndefOr[String] = js.undefined
    
    // only Apple
    var cancellationDate: js.UndefOr[Double] = js.undefined
    
    // only Apple/Google
    // iTunes, windows and amazon subscription only
    // Google subscriptions only with google play store api info
    var expirationDate: js.UndefOr[Double | String] = js.undefined
    
    var isTrial: js.UndefOr[Boolean] = js.undefined
    
    var orderId: js.UndefOr[String] = js.undefined
    
    var originalPurchaseDate: js.UndefOr[String] = js.undefined
    
    // only Google
    var originalTransactionId: js.UndefOr[String] = js.undefined
    
    var productId: String
    
    // only Apple
    var purchaseDate: Double | String
    
    var quantity: Double
    
    // only Apple
    var transactionId: String
  }
  object PurchasedItem {
    
    inline def apply(productId: String, purchaseDate: Double | String, quantity: Double, transactionId: String): PurchasedItem = {
      val __obj = js.Dynamic.literal(productId = productId.asInstanceOf[js.Any], purchaseDate = purchaseDate.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], transactionId = transactionId.asInstanceOf[js.Any])
      __obj.asInstanceOf[PurchasedItem]
    }
    
    extension [Self <: PurchasedItem](x: Self) {
      
      inline def setAppItemId(value: String): Self = StObject.set(x, "appItemId", value.asInstanceOf[js.Any])
      
      inline def setAppItemIdUndefined: Self = StObject.set(x, "appItemId", js.undefined)
      
      inline def setBundleId(value: String): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
      
      inline def setBundleIdUndefined: Self = StObject.set(x, "bundleId", js.undefined)
      
      inline def setCancellationDate(value: Double): Self = StObject.set(x, "cancellationDate", value.asInstanceOf[js.Any])
      
      inline def setCancellationDateUndefined: Self = StObject.set(x, "cancellationDate", js.undefined)
      
      inline def setExpirationDate(value: Double | String): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
      
      inline def setExpirationDateUndefined: Self = StObject.set(x, "expirationDate", js.undefined)
      
      inline def setIsTrial(value: Boolean): Self = StObject.set(x, "isTrial", value.asInstanceOf[js.Any])
      
      inline def setIsTrialUndefined: Self = StObject.set(x, "isTrial", js.undefined)
      
      inline def setOrderId(value: String): Self = StObject.set(x, "orderId", value.asInstanceOf[js.Any])
      
      inline def setOrderIdUndefined: Self = StObject.set(x, "orderId", js.undefined)
      
      inline def setOriginalPurchaseDate(value: String): Self = StObject.set(x, "originalPurchaseDate", value.asInstanceOf[js.Any])
      
      inline def setOriginalPurchaseDateUndefined: Self = StObject.set(x, "originalPurchaseDate", js.undefined)
      
      inline def setOriginalTransactionId(value: String): Self = StObject.set(x, "originalTransactionId", value.asInstanceOf[js.Any])
      
      inline def setOriginalTransactionIdUndefined: Self = StObject.set(x, "originalTransactionId", js.undefined)
      
      inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
      
      inline def setPurchaseDate(value: Double | String): Self = StObject.set(x, "purchaseDate", value.asInstanceOf[js.Any])
      
      inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
      
      inline def setTransactionId(value: String): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
    }
  }
  
  type Receipt = UnityReceipt | AppleReceipt | GoogleReceipt | WindowsReceipt | AmazonReceipt | FacebookReceipt | RokuReceipt
  
  type RokuReceipt = String
  
  type Service = /* "unity" */ String
  
  type UnityReceipt = js.Object | String
  
  trait ValidationResponse extends StObject {
    
    var service: Service
    
    var status: Double
  }
  object ValidationResponse {
    
    inline def apply(service: Service, status: Double): ValidationResponse = {
      val __obj = js.Dynamic.literal(service = service.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidationResponse]
    }
    
    extension [Self <: ValidationResponse](x: Self) {
      
      inline def setService(value: Service): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  type WindowsReceipt = String
}
