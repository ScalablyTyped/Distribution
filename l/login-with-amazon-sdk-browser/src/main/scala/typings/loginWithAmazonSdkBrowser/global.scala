package typings.loginWithAmazonSdkBrowser

import typings.loginWithAmazonSdkBrowser.amazon.Login.Region
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object amazon extends js.Object {
    @js.native
    object Login extends js.Object {
      def authorize(options: AccessTokenAuthorizeOptions): AccessTokenRequest = js.native
      def authorize(options: AccessTokenAuthorizeOptions, next: String): AccessTokenRequest = js.native
      def authorize(options: AccessTokenAuthorizeOptions, next: NextCallback[AccessTokenRequest]): AccessTokenRequest = js.native
      def authorize(options: AuthorizeOptions): AuthorizeRequest = js.native
      def authorize(options: AuthorizeOptions, next: String): AuthorizeRequest = js.native
      def authorize(options: AuthorizeOptions, next: NextCallback[AuthorizeRequest]): AuthorizeRequest = js.native
      def authorize(options: CodeAuthorizeOptions): CodeRequest = js.native
      def authorize(options: CodeAuthorizeOptions, next: String): CodeRequest = js.native
      def authorize(options: CodeAuthorizeOptions, next: NextCallback[CodeRequest]): CodeRequest = js.native
      /**
        * Gets the client identifier that will be used to request authorization.
        * You must call `setClientId` before calling this function.
        */
      def getClientId(): String = js.native
      /**
        * Logs out the current user after a call to `authorize`.
        */
      def logout(): Unit = js.native
      /**
        * Retrieves the customer profile and passes it to a callback function.
        * Uses an access token provided by `authorize`.
        * @param accessToken An access token. If this parameter is omitted, retrieveProfile will call authorize, requesting the profile scope.
        * @param callback Called with the profile data or an error string
        */
      def retrieveProfile(accessToken: String): Unit = js.native
      def retrieveProfile(accessToken: String, callback: RetrieveProfileCallback): Unit = js.native
      /**
        * Retrieves the customer profile and passes it to a callback function.
        * If no `access_token` is provided, this function will call `authorize`
        * with a `profile` scope.
        * @param callback Called with the profile data or an error string
        */
      def retrieveProfile(callback: RetrieveProfileCallback): Unit = js.native
      /**
        * Sets the client identifier that will be used to request authorization.
        * You must call this function before calling `authorize`.
        */
      def setClientId(clientId: String): Unit = js.native
      /**
        * Login With Amazon has multiple authorization and resource endpoints.
        * This API determines the region of the authorization and resource
        * endpoints Login with Amazon SDK should talk to. This needs to be
        * called before the authorize and retreiveProfile APIs.
        * When not set, it defaults to “NorthAmerica”
        */
      def setRegion(region: Region): Unit = js.native
      /**
        * Determines whether or not Login with Amazon should use the
        * Amazon Pay sandbox for requests. To use the Amazon Pay sandbox,
        * call `setSandboxMode(true)` before calling `authorize`.
        */
      def setSandboxMode(sandboxMode: Boolean): Unit = js.native
      /**
        * Sets the domain to use for saving cookies.
        * The domain must match the origin of the current page.
        * Defaults to the full domain for the current page. For example, if
        * you have two pages using the Login with Amazon SDK for JavaScript,
        * `site1.example.com` and `site2.example.com`, you would set the site
        * domain to `example.com` in the header of each site.
        * This will ensure that the cookies on both sites have access
        * to the same cached tokens.
        */
      def setSiteDomain(siteDomain: String): Unit = js.native
      /**
        * Determines whether or not Login with Amazon should use access tokens
        * written to the `amazon_Login_accessToken` cookie. You can use this
        * value to share an access token with another page. Access tokens
        * will still only grant access to the registered account for whom they
        * were created. When `true`, the Login with Amazon SDK for JavaScript
        * will check this cookie for cached tokens, and store newly granted
        * tokens in that cookie.
        */
      def setUseCookie(useCookie: Boolean): Unit = js.native
      @js.native
      object Region extends js.Object {
        /* 2 */ val AsiaPacific: typings.loginWithAmazonSdkBrowser.amazon.Login.Region.AsiaPacific with Double = js.native
        /* 1 */ val Europe: typings.loginWithAmazonSdkBrowser.amazon.Login.Region.Europe with Double = js.native
        /* 0 */ val NorthAmerica: typings.loginWithAmazonSdkBrowser.amazon.Login.Region.NorthAmerica with Double = js.native
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[typings.loginWithAmazonSdkBrowser.amazon.Login.Region with Double] = js.native
      }
      
    }
    
  }
  
}

