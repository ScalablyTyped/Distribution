package typings.matrixAppserviceBridge

import typings.matrixAppserviceBridge.requestMod.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientFactoryMod {
  
  @JSImport("matrix-appservice-bridge/lib/components/client-factory", "ClientFactory")
  @js.native
  class ClientFactory () extends StObject {
    def this(opts: ClientFactoryOpts) = this()
    
    var _getClient: js.Any = js.native
    
    var botUserId: js.Any = js.native
    
    var clientSchedulerBuilder: js.Any = js.native
    
    var clients: js.Any = js.native
    
    /**
      * Configure the factory for generating clients.
      * @param baseUrl The base URL to create clients with.
      * @param appServiceToken The AS token to use as the access_token
      * @param appServiceUserId The AS's user_id
      */
    def configure(baseUrl: String, appServiceToken: String, appServiceUserId: String): Unit = js.native
    
    /**
      * Construct a new Matrix JS SDK Client. Calling this twice with the same args
      * will return the *same* client instance.
      * @param userId The user_id to scope the client to. A new
      * client will be created per user ID. If this is null, a client scoped to the
      * application service *itself* will be created.
      * @param request The request ID to additionally scope the
      * client to. If set, this will create a new client per user ID / request combo.
      * This factory will dispose the created client instance when the request is
      * resolved.
      */
    def getClientAs(): js.Any = js.native
    def getClientAs(userId: String): js.Any = js.native
    def getClientAs(userId: String, request: Unit, urlOverride: String): js.Any = js.native
    def getClientAs(userId: String, request: Unit, urlOverride: String, usingE2E: Boolean): js.Any = js.native
    def getClientAs(userId: String, request: Unit, urlOverride: Unit, usingE2E: Boolean): js.Any = js.native
    def getClientAs(userId: String, request: Request[js.Any]): js.Any = js.native
    def getClientAs(userId: String, request: Request[js.Any], urlOverride: String): js.Any = js.native
    def getClientAs(userId: String, request: Request[js.Any], urlOverride: String, usingE2E: Boolean): js.Any = js.native
    def getClientAs(userId: String, request: Request[js.Any], urlOverride: Unit, usingE2E: Boolean): js.Any = js.native
    def getClientAs(userId: Unit, request: Unit, urlOverride: String): js.Any = js.native
    def getClientAs(userId: Unit, request: Unit, urlOverride: String, usingE2E: Boolean): js.Any = js.native
    def getClientAs(userId: Unit, request: Unit, urlOverride: Unit, usingE2E: Boolean): js.Any = js.native
    def getClientAs(userId: Unit, request: Request[js.Any]): js.Any = js.native
    def getClientAs(userId: Unit, request: Request[js.Any], urlOverride: String): js.Any = js.native
    def getClientAs(userId: Unit, request: Request[js.Any], urlOverride: String, usingE2E: Boolean): js.Any = js.native
    def getClientAs(userId: Unit, request: Request[js.Any], urlOverride: Unit, usingE2E: Boolean): js.Any = js.native
    
    var sdk: js.Any = js.native
    
    /**
      * Set a function to be called when logging requests and responses.
      * @param func The function to invoke. The first arg is the string to
      * log. The second arg is a boolean which is 'true' if the log is an error.
      */
    def setLogFunction(func: js.Function2[/* msg */ String, /* error */ js.UndefOr[Boolean], Unit]): Unit = js.native
    
    var token: js.Any = js.native
    
    var url: js.Any = js.native
  }
  
  /**
    * @constructor
    * @param opts Options for this factory
    * @param opts.sdk The Matrix JS SDK require() to use.
    * @param opts.url The Client-Server base HTTP URL. This must be set
    * prior to calling getClientAs(). See configure() to set this after instantiation.
    * @param opts.token The application service token to use. This must
    * be set prior to calling getClientAs(). See configure() to set this after
    * instantiation.
    * @param opts.appServiceUserId The application service's user ID. Must
    * be set prior to calling getClientAs(). See configure() to set this after
    * instantiation.
    * @param opts.clientSchedulerBuilder A function that
    * returns a new client scheduler to use in place of the default event
    * scheduler that schedules events to be sent to the HS.
    */
  trait ClientFactoryOpts extends StObject {
    
    var appServiceUserId: js.UndefOr[String] = js.undefined
    
    var clientSchedulerBuilder: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    var sdk: js.UndefOr[js.Any] = js.undefined
    
    var token: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object ClientFactoryOpts {
    
    @scala.inline
    def apply(): ClientFactoryOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientFactoryOpts]
    }
    
    @scala.inline
    implicit class ClientFactoryOptsMutableBuilder[Self <: ClientFactoryOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppServiceUserId(value: String): Self = StObject.set(x, "appServiceUserId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppServiceUserIdUndefined: Self = StObject.set(x, "appServiceUserId", js.undefined)
      
      @scala.inline
      def setClientSchedulerBuilder(value: () => js.Any): Self = StObject.set(x, "clientSchedulerBuilder", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClientSchedulerBuilderUndefined: Self = StObject.set(x, "clientSchedulerBuilder", js.undefined)
      
      @scala.inline
      def setSdk(value: js.Any): Self = StObject.set(x, "sdk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSdkUndefined: Self = StObject.set(x, "sdk", js.undefined)
      
      @scala.inline
      def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
