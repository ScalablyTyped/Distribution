package typings.hapiHapi

import typings.hapiHapi.anon.Default
import typings.hapiHapi.anon.Payload
import typings.hapiHapi.libTypesRequestMod.AppCredentials
import typings.hapiHapi.libTypesRequestMod.AuthArtifacts
import typings.hapiHapi.libTypesRequestMod.ReqRef
import typings.hapiHapi.libTypesRequestMod.ReqRefDefaults
import typings.hapiHapi.libTypesRequestMod.Request
import typings.hapiHapi.libTypesRequestMod.RequestAuth
import typings.hapiHapi.libTypesRequestMod.UserCredentials
import typings.hapiHapi.libTypesResponseMod.AuthenticationData
import typings.hapiHapi.libTypesResponseMod.ResponseToolkit
import typings.hapiHapi.libTypesRouteMod.RouteOptionsAccess
import typings.hapiHapi.libTypesServerServerMod.ServerApplicationState
import typings.hapiHapi.libTypesServerServerMod.Server_
import typings.hapiHapi.libTypesUtilsMod.Lifecycle.ReturnValue
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesServerAuthMod {
  
  @js.native
  trait ServerAuth extends StObject {
    
    /**
      * Sets a default strategy which is applied to every route where:
      * @param options - one of:
      * * a string with the default strategy name
      * * an authentication configuration object using the same format as the route auth handler options.
      * @return void.
      * The default does not apply when a route config specifies auth as false, or has an authentication strategy
      * configured (contains the strategy or strategies authentication settings). Otherwise, the route authentication
      * config is applied to the defaults.
      * Note that if the route has authentication configured, the default only applies at the time of adding the route,
      * not at runtime. This means that calling server.auth.default() after adding a route with some authentication
      * config will have no impact on the routes added prior. However, the default will apply to routes added
      * before server.auth.default() is called if those routes lack any authentication config.
      * The default auth strategy configuration can be accessed via server.auth.settings.default. To obtain the active
      * authentication configuration of a route, use server.auth.lookup(request.route).
      * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-serverauthdefaultoptions)
      */
    def default(options: String): Unit = js.native
    def default(options: ServerAuthConfig): Unit = js.native
    
    /**
      * An object where each key is an authentication strategy name and the value is the exposed strategy API.
      * Available only when the authentication scheme exposes an API by returning an api key in the object
      * returned from its implementation function.
      * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-serverauthapi)
      */
    var api: Record[String, ServerAuthSchemeObjectApi] = js.native
    
    /**
      * Registers an authentication scheme where:
      * @param name the scheme name.
      * @param scheme - the method implementing the scheme with signature function(server, options) where:
      * * server - a reference to the server object the scheme is added to.
      * * options - (optional) the scheme options argument passed to server.auth.strategy() when instantiation a strategy.
      * @return void.
      * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-serverauthschemename-scheme)
      */
    def scheme[Refs /* <: ReqRef */, Options /* <: js.Object */](name: String, scheme: ServerAuthScheme[Options, Refs]): Unit = js.native
    
    /**
      * Contains the default authentication configuration is a default strategy was set via
      * [server.auth.default()](https://github.com/hapijs/hapi/blob/master/API.md#server.auth.default()).
      */
    val settings: Default = js.native
    
    /**
      * Registers an authentication strategy where:
      * @param name - the strategy name.
      * @param scheme - the scheme name (must be previously registered using server.auth.scheme()).
      * @param options - scheme options based on the scheme requirements.
      * @return Return value: none.
      * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-serverauthstrategyname-scheme-options)
      */
    def strategy(name: String, scheme: String): Unit = js.native
    def strategy(name: String, scheme: String, options: js.Object): Unit = js.native
    
    /**
      * Tests a request against an authentication strategy where:
      * @param strategy - the strategy name registered with server.auth.strategy().
      * @param request - the request object.
      * @return an object containing the authentication credentials and artifacts if authentication was successful, otherwise throws an error.
      * Note that the test() method does not take into account the route authentication configuration. It also does not
      * perform payload authentication. It is limited to the basic strategy authentication execution. It does not
      * include verifying scope, entity, or other route properties.
      * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-await-serverauthteststrategy-request)
      */
    def test(strategy: String, request: Request[ReqRefDefaults]): js.Promise[
        AuthenticationData[UserCredentials, AppCredentials, Record[String, Any], AuthArtifacts]
      ] = js.native
    
    /**
      * Verify a request's authentication credentials against an authentication strategy.
      * Returns nothing if verification was successful, otherwise throws an error.
      *
      * Note that the `verify()` method does not take into account the route authentication configuration
      * or any other information from the request other than the `request.auth` object. It also does not
      * perform payload authentication. It is limited to verifying that the previously valid credentials
      * are still valid (e.g. have not been revoked or expired). It does not include verifying scope,
      * entity, or other route properties.
      */
    // tslint:disable-next-line no-unnecessary-generics
    def verify[Refs /* <: ReqRef */](request: Request[Refs]): js.Promise[Unit] = js.native
  }
  
  type ServerAuthConfig = RouteOptionsAccess
  
  type ServerAuthScheme[// tslint:disable-next-line no-unnecessary-generics
  Options /* <: ServerAuthSchemeOptions */, // tslint:disable-next-line no-unnecessary-generics
  Refs /* <: ReqRef */] = js.Function2[
    /* server */ Server_[ServerApplicationState], 
    /* options */ js.UndefOr[Options], 
    ServerAuthSchemeObject[Refs]
  ]
  
  trait ServerAuthSchemeObject[Refs /* <: ReqRef */] extends StObject {
    
    /**
      * optional object which is exposed via the [server.auth.api](https://github.com/hapijs/hapi/blob/master/API.md#server.auth.api) object.
      */
    var api: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: @hapi/hapi.@hapi/hapi/lib/types/request.MergeRefs<Refs>['AuthApi'] */ js.Any
      ] = js.undefined
    
    /**
      * A lifecycle method function called for each incoming request configured with the authentication scheme. The
      * method is provided with two special toolkit methods for returning an authenticated or an unauthenticated result:
      * * h.authenticated() - indicate request authenticated successfully.
      * * h.unauthenticated() - indicate request failed to authenticate.
      * @param request the request object.
      * @param h the ResponseToolkit
      * @return the Lifecycle.ReturnValue
      */
    def authenticate(request: Request[Refs], h: ResponseToolkit[Refs]): ReturnValue[Refs]
    
    /**
      * An object with the following keys:
      * * payload
      */
    var options: js.UndefOr[Payload] = js.undefined
    
    /**
      * A lifecycle method to authenticate the request payload.
      * When the scheme payload() method returns an error with a message, it means payload validation failed due to bad
      * payload. If the error has no message but includes a scheme name (e.g. Boom.unauthorized(null, 'Custom')),
      * authentication may still be successful if the route auth.payload configuration is set to 'optional'.
      * @param request the request object.
      * @param h the ResponseToolkit
      * @return the Lifecycle.ReturnValue
      */
    var payload: js.UndefOr[
        js.Function2[/* request */ Request[Refs], /* h */ ResponseToolkit[Refs], ReturnValue[Refs]]
      ] = js.undefined
    
    /**
      * A lifecycle method to decorate the response with authentication headers before the response headers or payload is written.
      * @param request the request object.
      * @param h the ResponseToolkit
      * @return the Lifecycle.ReturnValue
      */
    var response: js.UndefOr[
        js.Function2[/* request */ Request[Refs], /* h */ ResponseToolkit[Refs], ReturnValue[Refs]]
      ] = js.undefined
    
    /**
      * a method used to verify the authentication credentials provided
      * are still valid (e.g. not expired or revoked after the initial authentication).
      * the method throws an `Error` when the credentials passed are no longer valid (e.g. expired or
      * revoked). Note that the method does not have access to the original request, only to the
      * credentials and artifacts produced by the `authenticate()` method.
      */
    var verify: js.UndefOr[
        js.Function1[
          /* auth */ RequestAuth[
            /* import warning: importer.ImportType#apply Failed type conversion: @hapi/hapi.@hapi/hapi/lib/types/request.MergeRefs<Refs>['AuthUser'] */ js.Any, 
            /* import warning: importer.ImportType#apply Failed type conversion: @hapi/hapi.@hapi/hapi/lib/types/request.MergeRefs<Refs>['AuthApp'] */ js.Any, 
            /* import warning: importer.ImportType#apply Failed type conversion: @hapi/hapi.@hapi/hapi/lib/types/request.MergeRefs<Refs>['AuthCredentialsExtra'] */ js.Any, 
            /* import warning: importer.ImportType#apply Failed type conversion: @hapi/hapi.@hapi/hapi/lib/types/request.MergeRefs<Refs>['AuthArtifactsExtra'] */ js.Any
          ], 
          js.Promise[Unit]
        ]
      ] = js.undefined
  }
  object ServerAuthSchemeObject {
    
    inline def apply[Refs /* <: ReqRef */](authenticate: (Request[Refs], ResponseToolkit[Refs]) => ReturnValue[Refs]): ServerAuthSchemeObject[Refs] = {
      val __obj = js.Dynamic.literal(authenticate = js.Any.fromFunction2(authenticate))
      __obj.asInstanceOf[ServerAuthSchemeObject[Refs]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ServerAuthSchemeObject[?], Refs /* <: ReqRef */] (val x: Self & ServerAuthSchemeObject[Refs]) extends AnyVal {
      
      inline def setApi(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @hapi/hapi.@hapi/hapi/lib/types/request.MergeRefs<Refs>['AuthApi'] */ js.Any
      ): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      inline def setApiUndefined: Self = StObject.set(x, "api", js.undefined)
      
      inline def setAuthenticate(value: (Request[Refs], ResponseToolkit[Refs]) => ReturnValue[Refs]): Self = StObject.set(x, "authenticate", js.Any.fromFunction2(value))
      
      inline def setOptions(value: Payload): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setPayload(value: (/* request */ Request[Refs], /* h */ ResponseToolkit[Refs]) => ReturnValue[Refs]): Self = StObject.set(x, "payload", js.Any.fromFunction2(value))
      
      inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
      
      inline def setResponse(value: (/* request */ Request[Refs], /* h */ ResponseToolkit[Refs]) => ReturnValue[Refs]): Self = StObject.set(x, "response", js.Any.fromFunction2(value))
      
      inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
      
      inline def setVerify(
        value: /* auth */ RequestAuth[
              /* import warning: importer.ImportType#apply Failed type conversion: @hapi/hapi.@hapi/hapi/lib/types/request.MergeRefs<Refs>['AuthUser'] */ js.Any, 
              /* import warning: importer.ImportType#apply Failed type conversion: @hapi/hapi.@hapi/hapi/lib/types/request.MergeRefs<Refs>['AuthApp'] */ js.Any, 
              /* import warning: importer.ImportType#apply Failed type conversion: @hapi/hapi.@hapi/hapi/lib/types/request.MergeRefs<Refs>['AuthCredentialsExtra'] */ js.Any, 
              /* import warning: importer.ImportType#apply Failed type conversion: @hapi/hapi.@hapi/hapi/lib/types/request.MergeRefs<Refs>['AuthArtifactsExtra'] */ js.Any
            ] => js.Promise[Unit]
      ): Self = StObject.set(x, "verify", js.Any.fromFunction1(value))
      
      inline def setVerifyUndefined: Self = StObject.set(x, "verify", js.undefined)
    }
  }
  
  trait ServerAuthSchemeObjectApi extends StObject
  
  type ServerAuthSchemeOptions = js.Object
}
