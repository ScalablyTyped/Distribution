package typings.inAppPurchase

import typings.inAppPurchase.anon.ClientEmail
import typings.inAppPurchase.anon.Data
import typings.inAppPurchase.anon.IgnoreCanceled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
  
  @JSImport("in-app-purchase", "config")
  @js.native
  def config(params: Config_): Unit = js.native
  
  @JSImport("in-app-purchase", "getPurchaseData")
  @js.native
  def getPurchaseData(): js.Array[PurchasedItem] | Null = js.native
  @JSImport("in-app-purchase", "getPurchaseData")
  @js.native
  def getPurchaseData(purchaseData: js.UndefOr[scala.Nothing], options: IgnoreCanceled): js.Array[PurchasedItem] | Null = js.native
  @JSImport("in-app-purchase", "getPurchaseData")
  @js.native
  def getPurchaseData(purchaseData: ValidationResponse): js.Array[PurchasedItem] | Null = js.native
  @JSImport("in-app-purchase", "getPurchaseData")
  @js.native
  def getPurchaseData(purchaseData: ValidationResponse, options: IgnoreCanceled): js.Array[PurchasedItem] | Null = js.native
  
  @JSImport("in-app-purchase", "getService")
  @js.native
  def getService(receipt: Receipt): Service = js.native
  
  @JSImport("in-app-purchase", "isCanceled")
  @js.native
  def isCanceled(item: PurchasedItem): Boolean = js.native
  
  @JSImport("in-app-purchase", "isExpired")
  @js.native
  def isExpired(item: PurchasedItem): Boolean = js.native
  
  @JSImport("in-app-purchase", "isValidated")
  @js.native
  def isValidated(response: ValidationResponse): Boolean = js.native
  
  @JSImport("in-app-purchase", "refreshGoogleToken")
  @js.native
  def refreshGoogleToken(): js.Promise[Unit] = js.native
  @JSImport("in-app-purchase", "refreshGoogleToken")
  @js.native
  def refreshGoogleToken(callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  
  @JSImport("in-app-purchase", "reset")
  @js.native
  def reset(): Unit = js.native
  
  @JSImport("in-app-purchase", "setup")
  @js.native
  def setup(): js.Promise[Unit] = js.native
  @JSImport("in-app-purchase", "setup")
  @js.native
  def setup(callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  
  @JSImport("in-app-purchase", "validate")
  @js.native
  def validate(receipt: Receipt): js.Promise[ValidationResponse] = js.native
  @JSImport("in-app-purchase", "validate")
  @js.native
  def validate(receipt: Receipt, callback: js.Function2[/* err */ js.Any, /* res */ ValidationResponse, Unit]): Unit = js.native
  @JSImport("in-app-purchase", "validate")
  @js.native
  def validate(
    service: Service,
    receipt: Receipt,
    callback: js.Function2[/* err */ js.Any, /* res */ ValidationResponse, Unit]
  ): Unit = js.native
  
  @JSImport("in-app-purchase", "validateOnce")
  @js.native
  def validateOnce(receipt: Receipt, secretOrPubKey: js.Any): js.Promise[ValidationResponse] = js.native
  @JSImport("in-app-purchase", "validateOnce")
  @js.native
  def validateOnce(
    receipt: Receipt,
    secretOrPubKey: js.Any,
    callback: js.Function2[/* err */ js.Any, /* res */ ValidationResponse, Unit]
  ): Unit = js.native
  @JSImport("in-app-purchase", "validateOnce")
  @js.native
  def validateOnce(
    service: Service,
    secretOrPubKey: js.Any,
    receipt: Receipt,
    callback: js.Function2[/* err */ js.Any, /* res */ ValidationResponse, Unit]
  ): Unit = js.native
  
  type AmazonReceipt = js.Object | String
  
  type AppleReceipt = String
  
  @js.native
  trait Config_ extends StObject {
    
    /* Configurations for Amazon Store */
    var amazonAPIVersion: js.UndefOr[Double] = js.native
    
    /* Configurations for Apple */
    // if you want to exclude old transaction, set this to true. Default is false
    var appleExcludeOldTransactions: js.UndefOr[Boolean] = js.native
    
    // this comes from iTunes Connect (You need this to valiate subscriptions)
    var applePassword: js.UndefOr[String] = js.native
    
    /* Configurations for Facebook (Payments Lite) */
    var facebookAppId: js.UndefOr[String] = js.native
    
    var facebookAppSecret: js.UndefOr[String] = js.native
    
    // optional, for Google Play subscriptions
    var googleAccToken: js.UndefOr[String] = js.native
    
    // optional, for Google Play subscriptions
    var googleClientID: js.UndefOr[String] = js.native
    
    // optional, for Google Play subscriptions
    var googleClientSecret: js.UndefOr[String] = js.native
    
    /* Configurations for Google Play */
    // this is the path to the directory containing iap-sanbox/iap-live files
    var googlePublicKeyPath: js.UndefOr[String] = js.native
    
    // this is the google iap-live public key string
    var googlePublicKeyStrLive: js.UndefOr[String] = js.native
    
    // this is the google iap-sandbox public key string
    var googlePublicKeyStrSandBox: js.UndefOr[String] = js.native
    
    // optional, for Google Play subscritions
    var googleRefToken: js.UndefOr[String] = js.native
    
    // optional, for Google Play subscriptions
    var googleRefreshToken: js.UndefOr[String] = js.native
    
    // Configurations for Google Service Account validation: You can validate with just packageName, productId, and purchaseToken
    var googleServiceAccount: js.UndefOr[ClientEmail] = js.native
    
    /* Configurations for Roku */
    // this comes from Roku Developer Dashboard
    var rokuApiKey: js.UndefOr[String] = js.native
    
    var secret: js.UndefOr[String] = js.native
    
    /* Configurations all platforms */
    // For Apple and Googl Play to force Sandbox validation only
    var test: js.UndefOr[Boolean] = js.native
    
    // Output debug logs to stdout stream
    var verbose: js.UndefOr[Boolean] = js.native
  }
  object Config_ {
    
    @scala.inline
    def apply(): Config_ = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config_]
    }
    
    @scala.inline
    implicit class Config_MutableBuilder[Self <: Config_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmazonAPIVersion(value: Double): Self = StObject.set(x, "amazonAPIVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmazonAPIVersionUndefined: Self = StObject.set(x, "amazonAPIVersion", js.undefined)
      
      @scala.inline
      def setAppleExcludeOldTransactions(value: Boolean): Self = StObject.set(x, "appleExcludeOldTransactions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppleExcludeOldTransactionsUndefined: Self = StObject.set(x, "appleExcludeOldTransactions", js.undefined)
      
      @scala.inline
      def setApplePassword(value: String): Self = StObject.set(x, "applePassword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplePasswordUndefined: Self = StObject.set(x, "applePassword", js.undefined)
      
      @scala.inline
      def setFacebookAppId(value: String): Self = StObject.set(x, "facebookAppId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFacebookAppIdUndefined: Self = StObject.set(x, "facebookAppId", js.undefined)
      
      @scala.inline
      def setFacebookAppSecret(value: String): Self = StObject.set(x, "facebookAppSecret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFacebookAppSecretUndefined: Self = StObject.set(x, "facebookAppSecret", js.undefined)
      
      @scala.inline
      def setGoogleAccToken(value: String): Self = StObject.set(x, "googleAccToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGoogleAccTokenUndefined: Self = StObject.set(x, "googleAccToken", js.undefined)
      
      @scala.inline
      def setGoogleClientID(value: String): Self = StObject.set(x, "googleClientID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGoogleClientIDUndefined: Self = StObject.set(x, "googleClientID", js.undefined)
      
      @scala.inline
      def setGoogleClientSecret(value: String): Self = StObject.set(x, "googleClientSecret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGoogleClientSecretUndefined: Self = StObject.set(x, "googleClientSecret", js.undefined)
      
      @scala.inline
      def setGooglePublicKeyPath(value: String): Self = StObject.set(x, "googlePublicKeyPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGooglePublicKeyPathUndefined: Self = StObject.set(x, "googlePublicKeyPath", js.undefined)
      
      @scala.inline
      def setGooglePublicKeyStrLive(value: String): Self = StObject.set(x, "googlePublicKeyStrLive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGooglePublicKeyStrLiveUndefined: Self = StObject.set(x, "googlePublicKeyStrLive", js.undefined)
      
      @scala.inline
      def setGooglePublicKeyStrSandBox(value: String): Self = StObject.set(x, "googlePublicKeyStrSandBox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGooglePublicKeyStrSandBoxUndefined: Self = StObject.set(x, "googlePublicKeyStrSandBox", js.undefined)
      
      @scala.inline
      def setGoogleRefToken(value: String): Self = StObject.set(x, "googleRefToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGoogleRefTokenUndefined: Self = StObject.set(x, "googleRefToken", js.undefined)
      
      @scala.inline
      def setGoogleRefreshToken(value: String): Self = StObject.set(x, "googleRefreshToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGoogleRefreshTokenUndefined: Self = StObject.set(x, "googleRefreshToken", js.undefined)
      
      @scala.inline
      def setGoogleServiceAccount(value: ClientEmail): Self = StObject.set(x, "googleServiceAccount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGoogleServiceAccountUndefined: Self = StObject.set(x, "googleServiceAccount", js.undefined)
      
      @scala.inline
      def setRokuApiKey(value: String): Self = StObject.set(x, "rokuApiKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRokuApiKeyUndefined: Self = StObject.set(x, "rokuApiKey", js.undefined)
      
      @scala.inline
      def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
      
      @scala.inline
      def setTest(value: Boolean): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
      
      @scala.inline
      def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  type FacebookReceipt = String
  
  type GoogleReceipt = Data | String
  
  @js.native
  trait PurchasedItem extends StObject {
    
    // only Apple
    var appItemId: js.UndefOr[String] = js.native
    
    var bundleId: js.UndefOr[String] = js.native
    
    // only Apple
    var cancellationDate: js.UndefOr[Double] = js.native
    
    // only Apple/Google
    // iTunes, windows and amazon subscription only
    // Google subscriptions only with google play store api info
    var expirationDate: js.UndefOr[Double | String] = js.native
    
    var isTrial: js.UndefOr[Boolean] = js.native
    
    var orderId: js.UndefOr[String] = js.native
    
    var originalPurchaseDate: js.UndefOr[String] = js.native
    
    // only Google
    var originalTransactionId: js.UndefOr[String] = js.native
    
    var productId: String = js.native
    
    // only Apple
    var purchaseDate: Double | String = js.native
    
    var quantity: Double = js.native
    
    // only Apple
    var transactionId: String = js.native
  }
  object PurchasedItem {
    
    @scala.inline
    def apply(productId: String, purchaseDate: Double | String, quantity: Double, transactionId: String): PurchasedItem = {
      val __obj = js.Dynamic.literal(productId = productId.asInstanceOf[js.Any], purchaseDate = purchaseDate.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], transactionId = transactionId.asInstanceOf[js.Any])
      __obj.asInstanceOf[PurchasedItem]
    }
    
    @scala.inline
    implicit class PurchasedItemMutableBuilder[Self <: PurchasedItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppItemId(value: String): Self = StObject.set(x, "appItemId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppItemIdUndefined: Self = StObject.set(x, "appItemId", js.undefined)
      
      @scala.inline
      def setBundleId(value: String): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBundleIdUndefined: Self = StObject.set(x, "bundleId", js.undefined)
      
      @scala.inline
      def setCancellationDate(value: Double): Self = StObject.set(x, "cancellationDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancellationDateUndefined: Self = StObject.set(x, "cancellationDate", js.undefined)
      
      @scala.inline
      def setExpirationDate(value: Double | String): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpirationDateUndefined: Self = StObject.set(x, "expirationDate", js.undefined)
      
      @scala.inline
      def setIsTrial(value: Boolean): Self = StObject.set(x, "isTrial", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsTrialUndefined: Self = StObject.set(x, "isTrial", js.undefined)
      
      @scala.inline
      def setOrderId(value: String): Self = StObject.set(x, "orderId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderIdUndefined: Self = StObject.set(x, "orderId", js.undefined)
      
      @scala.inline
      def setOriginalPurchaseDate(value: String): Self = StObject.set(x, "originalPurchaseDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalPurchaseDateUndefined: Self = StObject.set(x, "originalPurchaseDate", js.undefined)
      
      @scala.inline
      def setOriginalTransactionId(value: String): Self = StObject.set(x, "originalTransactionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalTransactionIdUndefined: Self = StObject.set(x, "originalTransactionId", js.undefined)
      
      @scala.inline
      def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPurchaseDate(value: Double | String): Self = StObject.set(x, "purchaseDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransactionId(value: String): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
    }
  }
  
  type Receipt = UnityReceipt | AppleReceipt | GoogleReceipt | WindowsReceipt | AmazonReceipt | FacebookReceipt | RokuReceipt
  
  type RokuReceipt = String
  
  type Service = /* "unity" */ String
  
  type UnityReceipt = js.Object | String
  
  @js.native
  trait ValidationResponse extends StObject {
    
    var service: Service = js.native
    
    var status: Double = js.native
  }
  object ValidationResponse {
    
    @scala.inline
    def apply(service: Service, status: Double): ValidationResponse = {
      val __obj = js.Dynamic.literal(service = service.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidationResponse]
    }
    
    @scala.inline
    implicit class ValidationResponseMutableBuilder[Self <: ValidationResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setService(value: Service): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  type WindowsReceipt = String
}
