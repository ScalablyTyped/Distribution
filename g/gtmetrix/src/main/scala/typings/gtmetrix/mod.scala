package typings.gtmetrix

import org.scalablytyped.runtime.StringDictionary
import typings.gtmetrix.anon.ReadonlyAccountStatus
import typings.gtmetrix.anon.ReadonlyBrowserFeatures
import typings.gtmetrix.anon.ReadonlyBuffer
import typings.gtmetrix.anon.ReadonlyTestBasicInfo
import typings.gtmetrix.anon.ReadonlyTestDetails
import typings.node.Buffer
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): GTmetrix = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[GTmetrix]
  @scala.inline
  def apply(opts: Options): GTmetrix = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[GTmetrix]
  
  @JSImport("gtmetrix", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait AccountApi extends StObject {
    
    /**
      * Get account status
      */
    def status(): Unit = js.native
    def status(callback: js.Function2[/* err */ MetricsError, /* data */ ReadonlyAccountStatus, Unit]): Unit = js.native
    @JSName("status")
    def status_Promise(): js.Promise[ReadonlyAccountStatus] = js.native
  }
  
  trait AccountStatus extends StObject {
    
    var api_credits: Double
    
    var api_refill: Double
  }
  object AccountStatus {
    
    @scala.inline
    def apply(api_credits: Double, api_refill: Double): AccountStatus = {
      val __obj = js.Dynamic.literal(api_credits = api_credits.asInstanceOf[js.Any], api_refill = api_refill.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccountStatus]
    }
    
    @scala.inline
    implicit class AccountStatusMutableBuilder[Self <: AccountStatus] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApi_credits(value: Double): Self = StObject.set(x, "api_credits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApi_refill(value: Double): Self = StObject.set(x, "api_refill", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * API returned an error
    */
  trait ApiError
    extends StObject
       with Error
       with _MetricsError {
    
    val contentType: String
    
    val statusCode: Double
  }
  object ApiError {
    
    @scala.inline
    def apply(contentType: String, message: String, name: String, statusCode: Double): ApiError = {
      val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApiError]
    }
    
    @scala.inline
    implicit class ApiErrorMutableBuilder[Self <: ApiError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * https://github.com/fvdm/nodejs-gtmetrix#resources
    */
  /* Rewritten from type alias, can be one of: 
    - typings.gtmetrix.gtmetrixStrings.filmstrip
    - typings.gtmetrix.gtmetrixStrings.`pagespeed-files`
    - typings.gtmetrix.gtmetrixStrings.`report-pdf`
    - typings.gtmetrix.gtmetrixStrings.`report-pdf-full`
    - typings.gtmetrix.gtmetrixStrings.screenshot
    - typings.gtmetrix.gtmetrixStrings.video
  */
  trait BinaryResourceType extends StObject
  object BinaryResourceType {
    
    @scala.inline
    def filmstrip: typings.gtmetrix.gtmetrixStrings.filmstrip = "filmstrip".asInstanceOf[typings.gtmetrix.gtmetrixStrings.filmstrip]
    
    @scala.inline
    def `pagespeed-files`: typings.gtmetrix.gtmetrixStrings.`pagespeed-files` = "pagespeed-files".asInstanceOf[typings.gtmetrix.gtmetrixStrings.`pagespeed-files`]
    
    @scala.inline
    def `report-pdf`: typings.gtmetrix.gtmetrixStrings.`report-pdf` = "report-pdf".asInstanceOf[typings.gtmetrix.gtmetrixStrings.`report-pdf`]
    
    @scala.inline
    def `report-pdf-full`: typings.gtmetrix.gtmetrixStrings.`report-pdf-full` = "report-pdf-full".asInstanceOf[typings.gtmetrix.gtmetrixStrings.`report-pdf-full`]
    
    @scala.inline
    def screenshot: typings.gtmetrix.gtmetrixStrings.screenshot = "screenshot".asInstanceOf[typings.gtmetrix.gtmetrixStrings.screenshot]
    
    @scala.inline
    def video: typings.gtmetrix.gtmetrixStrings.video = "video".asInstanceOf[typings.gtmetrix.gtmetrixStrings.video]
  }
  
  trait BrowserFeatures extends StObject {
    
    var browser: String
    
    var device: js.UndefOr[String] = js.undefined
    
    var features: StringDictionary[Boolean]
    
    var id: Double
    
    var name: String
    
    var platform: String
  }
  object BrowserFeatures {
    
    @scala.inline
    def apply(browser: String, features: StringDictionary[Boolean], id: Double, name: String, platform: String): BrowserFeatures = {
      val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
      __obj.asInstanceOf[BrowserFeatures]
    }
    
    @scala.inline
    implicit class BrowserFeaturesMutableBuilder[Self <: BrowserFeatures] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBrowser(value: String): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevice(value: String): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
      
      @scala.inline
      def setFeatures(value: StringDictionary[Boolean]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BrowsersApi extends StObject {
    
    def get(browserId: Double): js.Promise[ReadonlyBrowserFeatures] = js.native
    /**
      * Get details about a test browser
      */
    def get(
      browserId: Double,
      callback: js.Function2[/* error */ MetricsError, /* data */ ReadonlyBrowserFeatures, Unit]
    ): Unit = js.native
    
    def list(): js.Promise[js.Array[BrowserFeatures]] = js.native
    /**
      * Get a list of available test browsers.
      */
    def list(callback: js.Function2[/* error */ MetricsError, /* data */ js.Array[BrowserFeatures], Unit]): Unit = js.native
  }
  
  /**
    * {@link https://github.com/fvdm/nodejs-gtmetrix#methods}
    */
  trait GTmetrix extends StObject {
    
    var account: AccountApi
    
    var browsers: BrowsersApi
    
    var locations: LocationsApi
    
    var test: TestApi
  }
  object GTmetrix {
    
    @scala.inline
    def apply(account: AccountApi, browsers: BrowsersApi, locations: LocationsApi, test: TestApi): GTmetrix = {
      val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], browsers = browsers.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
      __obj.asInstanceOf[GTmetrix]
    }
    
    @scala.inline
    implicit class GTmetrixMutableBuilder[Self <: GTmetrix] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccount(value: AccountApi): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrowsers(value: BrowsersApi): Self = StObject.set(x, "browsers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocations(value: LocationsApi): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTest(value: TestApi): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Can't process response
    */
  trait InvalidResponseError
    extends StObject
       with Error
       with _MetricsError {
    
    val contentType: String
    
    val statusCode: Double
  }
  object InvalidResponseError {
    
    @scala.inline
    def apply(contentType: String, message: String, name: String, statusCode: Double): InvalidResponseError = {
      val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[InvalidResponseError]
    }
    
    @scala.inline
    implicit class InvalidResponseErrorMutableBuilder[Self <: InvalidResponseError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
  
  trait LocationInfo extends StObject {
    
    var default: Boolean
    
    var browsers: js.Array[Double]
    
    var id: String
    
    var name: String
  }
  object LocationInfo {
    
    @scala.inline
    def apply(browsers: js.Array[Double], default: Boolean, id: String, name: String): LocationInfo = {
      val __obj = js.Dynamic.literal(browsers = browsers.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocationInfo]
    }
    
    @scala.inline
    implicit class LocationInfoMutableBuilder[Self <: LocationInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBrowsers(value: js.Array[Double]): Self = StObject.set(x, "browsers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrowsersVarargs(value: Double*): Self = StObject.set(x, "browsers", js.Array(value :_*))
      
      @scala.inline
      def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LocationsApi extends StObject {
    
    def list(): js.Promise[js.Array[LocationInfo]] = js.native
    /**
      * Get a list of available test locations.
      */
    def list(callback: js.Function2[/* error */ MetricsError, /* data */ js.Array[LocationInfo], Unit]): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.std.Error
    - typings.gtmetrix.mod.InvalidResponseError
    - typings.gtmetrix.mod.ApiError
  */
  type MetricsError = _MetricsError | Error
  
  /**
    * https://github.com/fvdm/nodejs-gtmetrix#resources
    */
  /* Rewritten from type alias, can be one of: 
    - typings.gtmetrix.gtmetrixStrings.har
    - typings.gtmetrix.gtmetrixStrings.pagespeed
    - typings.gtmetrix.gtmetrixStrings.yslow
  */
  trait NonBinaryResourceType extends StObject
  object NonBinaryResourceType {
    
    @scala.inline
    def har: typings.gtmetrix.gtmetrixStrings.har = "har".asInstanceOf[typings.gtmetrix.gtmetrixStrings.har]
    
    @scala.inline
    def pagespeed: typings.gtmetrix.gtmetrixStrings.pagespeed = "pagespeed".asInstanceOf[typings.gtmetrix.gtmetrixStrings.pagespeed]
    
    @scala.inline
    def yslow: typings.gtmetrix.gtmetrixStrings.yslow = "yslow".asInstanceOf[typings.gtmetrix.gtmetrixStrings.yslow]
  }
  
  /**
    * {@link https://github.com/fvdm/nodejs-gtmetrix#configuration}
    */
  trait Options extends StObject {
    
    /**
      * API key
      * @default null
      */
    var apikey: js.UndefOr[String] = js.undefined
    
    /**
      * API email
      * @default null
      */
    var email: js.UndefOr[String] = js.undefined
    
    /**
      * Request timeout in ms
      * @default 5000
      */
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApikey(value: String): Self = StObject.set(x, "apikey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApikeyUndefined: Self = StObject.set(x, "apikey", js.undefined)
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  @js.native
  trait TestApi extends StObject {
    
    def create(params: StringDictionary[js.Any]): js.Promise[ReadonlyTestBasicInfo] = js.native
    /**
      * Run a test.
      * {@link https://github.com/fvdm/nodejs-gtmetrix#testcreate}
      */
    def create(
      params: StringDictionary[js.Any],
      callback: js.Function2[/* error */ MetricsError, /* data */ ReadonlyTestBasicInfo, Unit]
    ): Unit = js.native
    
    def get(testId: String): js.Promise[ReadonlyTestDetails] = js.native
    def get(
      testId: String,
      callback: js.Function2[/* error */ MetricsError, /* data */ ReadonlyTestDetails, Unit]
    ): Unit = js.native
    def get(testId: String, resource: BinaryResourceType): js.Promise[ReadonlyBuffer] = js.native
    def get(
      testId: String,
      resource: BinaryResourceType,
      callback: js.Function2[/* error */ MetricsError, /* data */ Buffer, Unit]
    ): Unit = js.native
    def get(testId: String, resource: BinaryResourceType, polling: Double): js.Promise[Buffer] = js.native
    /**
      * Get details about a test or one of its resources.
      * When you specify a binary resource, i.e. screenshot,
      * the callback data will be a Buffer instance, so you can post-process the binary data however you like.
      */
    def get(
      testId: String,
      resource: BinaryResourceType,
      polling: Double,
      callback: js.Function2[/* error */ MetricsError, /* data */ Buffer, Unit]
    ): Unit = js.native
    def get(
      testId: String,
      resource: NonBinaryResourceType,
      callback: js.Function2[/* error */ MetricsError, /* data */ ReadonlyTestDetails, Unit]
    ): Unit = js.native
    def get(testId: String, resource: NonBinaryResourceType, polling: Double): js.Promise[ReadonlyTestDetails] = js.native
    def get(
      testId: String,
      resource: NonBinaryResourceType,
      polling: Double,
      callback: js.Function2[/* error */ MetricsError, /* data */ ReadonlyTestDetails, Unit]
    ): Unit = js.native
  }
  
  trait TestBasicInfo extends StObject {
    
    var credits_left: Double
    
    var poll_state_url: String
    
    var test_id: String
  }
  object TestBasicInfo {
    
    @scala.inline
    def apply(credits_left: Double, poll_state_url: String, test_id: String): TestBasicInfo = {
      val __obj = js.Dynamic.literal(credits_left = credits_left.asInstanceOf[js.Any], poll_state_url = poll_state_url.asInstanceOf[js.Any], test_id = test_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestBasicInfo]
    }
    
    @scala.inline
    implicit class TestBasicInfoMutableBuilder[Self <: TestBasicInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCredits_left(value: Double): Self = StObject.set(x, "credits_left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoll_state_url(value: String): Self = StObject.set(x, "poll_state_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTest_id(value: String): Self = StObject.set(x, "test_id", value.asInstanceOf[js.Any])
    }
  }
  
  trait TestDetails extends StObject {
    
    var error: js.UndefOr[String] = js.undefined
    
    var resources: StringDictionary[String]
    
    var results: StringDictionary[js.Any]
    
    var state: String
  }
  object TestDetails {
    
    @scala.inline
    def apply(resources: StringDictionary[String], results: StringDictionary[js.Any], state: String): TestDetails = {
      val __obj = js.Dynamic.literal(resources = resources.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestDetails]
    }
    
    @scala.inline
    implicit class TestDetailsMutableBuilder[Self <: TestDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setResources(value: StringDictionary[String]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResults(value: StringDictionary[js.Any]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  trait _MetricsError extends StObject
  object _MetricsError {
    
    @scala.inline
    def ApiError(contentType: String, message: String, name: String, statusCode: Double): typings.gtmetrix.mod.ApiError = {
      val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.gtmetrix.mod.ApiError]
    }
    
    @scala.inline
    def InvalidResponseError(contentType: String, message: String, name: String, statusCode: Double): typings.gtmetrix.mod.InvalidResponseError = {
      val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.gtmetrix.mod.InvalidResponseError]
    }
  }
}
