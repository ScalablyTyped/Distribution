package typings.keycloakConnect

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typings.express.mod.RequestHandler
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.keycloakConnect.anon.Admin
import typings.keycloakConnect.anon.Id
import typings.keycloakConnect.keycloakConnectBooleans.`false`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("keycloak-connect", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Keycloak {
    def this(options: KeycloakOptions) = this()
    def this(options: Unit, config: String) = this()
    def this(options: Unit, config: KeycloakConfig) = this()
    def this(options: KeycloakOptions, config: String) = this()
    def this(options: KeycloakOptions, config: KeycloakConfig) = this()
  }
  @JSImport("keycloak-connect", JSImport.Namespace)
  @js.native
  val ^ : js.Object & KeycloakConnectStatic = js.native
  
  trait AuthZRequest extends StObject {
    
    var audience: js.UndefOr[String] = js.undefined
    
    var claim_token: js.UndefOr[String] = js.undefined
    
    var claim_token_format: js.UndefOr[String] = js.undefined
    
    var permissions: js.Array[Id]
    
    var response_mode: js.UndefOr[String] = js.undefined
  }
  object AuthZRequest {
    
    inline def apply(permissions: js.Array[Id]): AuthZRequest = {
      val __obj = js.Dynamic.literal(permissions = permissions.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthZRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AuthZRequest] (val x: Self) extends AnyVal {
      
      inline def setAudience(value: String): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
      
      inline def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
      
      inline def setClaim_token(value: String): Self = StObject.set(x, "claim_token", value.asInstanceOf[js.Any])
      
      inline def setClaim_tokenUndefined: Self = StObject.set(x, "claim_token", js.undefined)
      
      inline def setClaim_token_format(value: String): Self = StObject.set(x, "claim_token_format", value.asInstanceOf[js.Any])
      
      inline def setClaim_token_formatUndefined: Self = StObject.set(x, "claim_token_format", js.undefined)
      
      inline def setPermissions(value: js.Array[Id]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
      
      inline def setPermissionsVarargs(value: Id*): Self = StObject.set(x, "permissions", js.Array(value*))
      
      inline def setResponse_mode(value: String): Self = StObject.set(x, "response_mode", value.asInstanceOf[js.Any])
      
      inline def setResponse_modeUndefined: Self = StObject.set(x, "response_mode", js.undefined)
    }
  }
  
  trait EnforcerOptions extends StObject {
    
    var claims: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
    
    var resource_server_id: js.UndefOr[String] = js.undefined
    
    var response_mode: js.UndefOr[String] = js.undefined
  }
  object EnforcerOptions {
    
    inline def apply(): EnforcerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EnforcerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EnforcerOptions] (val x: Self) extends AnyVal {
      
      inline def setClaims(value: /* repeated */ Any => Any): Self = StObject.set(x, "claims", js.Any.fromFunction1(value))
      
      inline def setClaimsUndefined: Self = StObject.set(x, "claims", js.undefined)
      
      inline def setResource_server_id(value: String): Self = StObject.set(x, "resource_server_id", value.asInstanceOf[js.Any])
      
      inline def setResource_server_idUndefined: Self = StObject.set(x, "resource_server_id", js.undefined)
      
      inline def setResponse_mode(value: String): Self = StObject.set(x, "response_mode", value.asInstanceOf[js.Any])
      
      inline def setResponse_modeUndefined: Self = StObject.set(x, "response_mode", js.undefined)
    }
  }
  
  trait Grant
    extends StObject
       with GrantProperties {
    
    /**
      * Determine if this grant is expired/out-of-date.
      *
      * Determination is made based upon the expiration status of the `access_token`.
      *
      * An expired grant *may* be possible to refresh, if a valid
      * `refresh_token` is available.
      *
      * @return {boolean} `true` if expired, otherwise `false`.
      */
    def isExpired(): Boolean
    
    /**
      * Update this grant in-place given data in another grant.
      *
      * This is used to avoid making client perform extra-bookkeeping
      * to maintain the up-to-date/refreshed grant-set.
      */
    def update(grant: Grant): Unit
  }
  object Grant {
    
    inline def apply(isExpired: () => Boolean, update: Grant => Unit): Grant = {
      val __obj = js.Dynamic.literal(isExpired = js.Any.fromFunction0(isExpired), update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[Grant]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Grant] (val x: Self) extends AnyVal {
      
      inline def setIsExpired(value: () => Boolean): Self = StObject.set(x, "isExpired", js.Any.fromFunction0(value))
      
      inline def setUpdate(value: Grant => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait GrantManager extends StObject {
    
    /**
      * Create a `Grant` object from a string of JSON data.
      *
      * This method creates the `Grant` object, including
      * the `access_token`, `refresh_token` and `id_token`
      * if available, and validates each for expiration and
      * against the known public-key of the server.
      *
      * @param {String|GrantProperties} rawData The raw JSON string received from the Keycloak server or from a client.
      * @return {Promise} A promise reoslving a grant.
      */
    def createGrant(data: String): js.Promise[Grant] = js.native
    def createGrant(data: GrantProperties): js.Promise[Grant] = js.native
    
    /**
      * Ensure that a grant is *fresh*, refreshing if required & possible.
      *
      * If the access_token is not expired, the grant is left untouched.
      *
      * If the access_token is expired, and a refresh_token is available,
      * the grant is refreshed, in place (no new object is created),
      * and returned.
      *
      * If the access_token is expired and no refresh_token is available,
      * an error is provided.
      *
      * @param {Grant} grant The grant object to ensure freshness of
      */
    def ensureFreshness(grant: Grant): js.Promise[Grant] = js.native
    
    /**
      * Use the direct grant API to obtain a grant from Keycloak.
      *
      * The direct grant API must be enabled for the configured realm
      * for this method to work. This function ostensibly provides a
      * non-interactive, programatic way to login to a Keycloak realm.
      *
      * @param {String} username The username.
      * @param {String} password The cleartext password.
      */
    def obtainDirectly(username: String, password: String): js.Promise[Grant] = js.native
    
    /**
      * Obtain a service account grant.
      * Client option 'Service Accounts Enabled' needs to be on.
      *
      * This method returns or promise or may optionally take a callback function.
      *
      * @param {Function} callback Optional callback, if not using promises.
      */
    def obtainFromClientCredentials(): js.Promise[Grant] = js.native
    def obtainFromClientCredentials(callback: js.Function2[/* err */ js.Error, /* grant */ Grant, Unit]): js.Promise[Grant] = js.native
    def obtainFromClientCredentials(callback: js.Function2[/* err */ js.Error, /* grant */ Grant, Unit], scopeParam: String): js.Promise[Grant] = js.native
    def obtainFromClientCredentials(callback: Unit, scopeParam: String): js.Promise[Grant] = js.native
    
    /**
      * Obtain a grant from a previous interactive login which results in a code.
      *
      * This is typically used by servers which receive the code through a
      * redirect_uri when sending a user to Keycloak for an interactive login.
      *
      * An optional session ID and host may be provided if there is desire for
      * Keycloak to be aware of this information.  They may be used by Keycloak
      * when session invalidation is triggered from the Keycloak console itself
      * during its postbacks to `/k_logout` on the server.
      *
      * @param {String} code The code from a successful login redirected from Keycloak.
      * @param {String} sessionId Optional opaque session-id.
      * @param {String} sessionHost Optional session host for targetted Keycloak console post-backs.
      */
    def obtainFromCode(code: String): js.Promise[Grant] = js.native
    def obtainFromCode(code: String, sessionid: String): js.Promise[Grant] = js.native
    def obtainFromCode(code: String, sessionid: String, sessionHost: String): js.Promise[Grant] = js.native
    def obtainFromCode(
      code: String,
      sessionid: String,
      sessionHost: String,
      callback: js.Function2[/* err */ js.Error, /* grant */ Grant, Unit]
    ): js.Promise[Grant] = js.native
    def obtainFromCode(
      code: String,
      sessionid: String,
      sessionHost: Unit,
      callback: js.Function2[/* err */ js.Error, /* grant */ Grant, Unit]
    ): js.Promise[Grant] = js.native
    def obtainFromCode(code: String, sessionid: Unit, sessionHost: String): js.Promise[Grant] = js.native
    def obtainFromCode(
      code: String,
      sessionid: Unit,
      sessionHost: String,
      callback: js.Function2[/* err */ js.Error, /* grant */ Grant, Unit]
    ): js.Promise[Grant] = js.native
    def obtainFromCode(
      code: String,
      sessionid: Unit,
      sessionHost: Unit,
      callback: js.Function2[/* err */ js.Error, /* grant */ Grant, Unit]
    ): js.Promise[Grant] = js.native
    
    def userInfo[C](token: String): js.Promise[C] = js.native
    /**
      * Returns a user info JSON Object
      * @param {Token|String} token
      */
    def userInfo[C](token: Token): js.Promise[C] = js.native
    
    def validateAccessToken(token: String): js.Promise[`false` | String] = js.native
    /**
      * Perform live validation of an `access_token` against the Keycloak server.
      *
      * @param {Token|String} token The token to validate.
      * @param {Function} callback Callback function if not using promises.
      *
      * @return {boolean} `false` if the token is invalid, or the same token if valid.
      */
    def validateAccessToken(token: Token): js.Promise[`false` | Token] = js.native
    
    /**
      * Validate the grant and all tokens contained therein.
      *
      * This method examines a grant (in place) and rejects
      * if any of the tokens are invalid. After this method
      * resolves, the passed grant is guaranteed to have
      * valid tokens.
      *
      * @param {Grant} grant The grant to validate.
      *
      * @return {Promise} That resolves to a validated grant or
      * rejects with an error if any of the tokens are invalid.
      */
    def validateGrant(grant: Grant): js.Promise[Grant] = js.native
    
    /**
      * Validate a token.
      *
      * This method accepts a token, and returns a promise
      *
      * If the token is valid the promise will be resolved with the token
      * 
      * If the token is undefined or fails validation an applicable error is returned
      * 
      * @return {Promise} That resolve a token
      */
    def validateToken(token: Token): js.Promise[Token] = js.native
    def validateToken(token: Token, expectedType: String): js.Promise[Token] = js.native
  }
  
  trait GrantProperties extends StObject {
    
    var access_token: js.UndefOr[Token] = js.undefined
    
    var expires_in: js.UndefOr[String] = js.undefined
    
    var id_token: js.UndefOr[Token] = js.undefined
    
    var refresh_token: js.UndefOr[Token] = js.undefined
    
    var token_type: js.UndefOr[String] = js.undefined
  }
  object GrantProperties {
    
    inline def apply(): GrantProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GrantProperties]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GrantProperties] (val x: Self) extends AnyVal {
      
      inline def setAccess_token(value: Token): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      inline def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
      
      inline def setExpires_in(value: String): Self = StObject.set(x, "expires_in", value.asInstanceOf[js.Any])
      
      inline def setExpires_inUndefined: Self = StObject.set(x, "expires_in", js.undefined)
      
      inline def setId_token(value: Token): Self = StObject.set(x, "id_token", value.asInstanceOf[js.Any])
      
      inline def setId_tokenUndefined: Self = StObject.set(x, "id_token", js.undefined)
      
      inline def setRefresh_token(value: Token): Self = StObject.set(x, "refresh_token", value.asInstanceOf[js.Any])
      
      inline def setRefresh_tokenUndefined: Self = StObject.set(x, "refresh_token", js.undefined)
      
      inline def setToken_type(value: String): Self = StObject.set(x, "token_type", value.asInstanceOf[js.Any])
      
      inline def setToken_typeUndefined: Self = StObject.set(x, "token_type", js.undefined)
    }
  }
  
  type GuardFn = js.Function3[
    /* accessToken */ Token, 
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* res */ Response_[Any, Record[String, Any]], 
    Boolean
  ]
  
  @js.native
  trait Keycloak extends StObject {
    
    /**
      * Replaceable function to handle access-denied responses.
      *
      * In the event the Keycloak middleware decides a user may
      * not access a resource, or has failed to authenticate at all,
      * this function will be called.
      *
      * By default, a simple string of "Access denied" along with
      * an HTTP status code for 403 is returned.  Chances are an
      * application would prefer to render a fancy template.
      * @param {Object} request The HTTP request.
      * @param {Object} response The HTTP response.
      */
    def accessDenied(
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      res: Response_[Any, Record[String, Any]]
    ): Unit = js.native
    
    def accountUrl(): String = js.native
    
    /**
      * Callback made upon successful authentication of a user.
      *
      * By default, this a no-op, but may assigned to another
      * function for application-specific login which may be useful
      * for linking authentication information from Keycloak to
      * application-maintained user information.
      *
      * The `request.kauth.grant` object contains the relevant tokens
      * which may be inspected.
      *
      * For instance, to obtain the unique subject ID:
      *
      *     request.kauth.grant.id_token.sub => bf2056df-3803-4e49-b3ba-ff2b07d86995
      *
      * @param {Object} request The HTTP request.
      */
    def authenticated(
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ]
    ): Unit = js.native
    
    def checkPermissions(
      authzRequest: AuthZRequest,
      request: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ]
    ): js.Promise[Grant] = js.native
    def checkPermissions(
      authzRequest: AuthZRequest,
      request: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      callback: js.Function1[/* json */ Any, Any]
    ): js.Promise[Grant] = js.native
    
    /**
      * Apply check SSO middleware to an application or specific URL.
      *
      * Check SSO will only authenticate the client if the user is already logged-in,
      * if the user is not logged-in the browser will be redirected back
      * to the originally-requested URL and remain unauthenticated.
      *
      */
    def checkSso(): RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ] = js.native
    
    /**
      * Callback made upon successful de-authentication of a user.
      *
      * By default, this is a no-op, but may be used by the application
      * in the case it needs to remove information from the user's session
      * or otherwise perform additional logic once a user is logged out.
      *
      * @param {Object} request The HTTP request.
      */
    def deauthenticated(
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ]
    ): Unit = js.native
    
    def enforcer(permissions: String): RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ] = js.native
    def enforcer(permissions: String, config: EnforcerOptions): RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ] = js.native
    /**
      * Enforce access based on the given permissions. This method operates in two modes, depending on the `response_mode`
      * defined for this policy enforcer.
      *
      * If `response_mode` is set to `token`, permissions are obtained using an specific grant type. As a consequence, the
      * token with the permissions granted by the server is updated and made available to the application via `request.kauth.grant.access_token`.
      * Use this mode when your application is using sessions and you want to cache previous decisions from the server, as well automatically handle
      * refresh tokens. This mode is especially useful for applications acting as client and resource server.
      *
      * If `response_mode` is set to `permissions`, the server only returns the list of granted permissions (no oauth2 response).
      * Previous decisions are not cached and the policy enforcer will query the server every time to get a decision.
      * This is the default `response_mode`.
      *
      * You can set `response_mode` as follows:
      *
      *      keycloak.enforcer('item:read', {response_mode: 'token'})
      *
      * In all cases, if the request is already populated with a valid access token (for instance, bearer tokens sent by clients to the application),
      * the policy enforcer will first try to resolve permissions from the current token before querying the server.
      *
      * By default, the policy enforcer will use the `client_id` defined to the application (for instance, via `keycloak.json`) to
      * reference a client in Keycloak that supports Keycloak Authorization Services. In this case, the client can not be public given
      * that it is actually a resource server.
      *
      * If your application is acting as a client and resource server, you can use the following configuration to specify the client
      * in Keycloak with the authorization settings:
      *
      *      keycloak.enforcer('item:read', {resource_server_id: 'nodejs-apiserver'})
      *
      * It is recommended to use separated clients in Keycloak to represent your frontend and backend.
      *
      * If the application you are protecting is enabled with Keycloak authorization services and you have defined client credentials
      * in `keycloak.json`, you can push additional claims to the server and make them available to your policies in order to make decisions.
      * For that, you can define a `claims` configuration option which expects a `function` that returns a JSON with the claims you want to push:
      *
      *      app.get('/protected/resource', keycloak.enforcer(['resource:view', 'resource:write'], {
      claims: function(request) {
      return {
      "http.uri": ["/protected/resource"],
      "user.agent": // get user agent  from request
      }
      }
      }), function (req, res) {
      // access granted
      });
      *
      * @param {string[]} permissions A single string representing a permission or an arrat of strings representing the permissions. For instance, 'item:read' or ['item:read', 'item:write'].
      */
    def enforcer(permissions: js.Array[String]): RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ] = js.native
    def enforcer(permissions: js.Array[String], config: EnforcerOptions): RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ] = js.native
    
    def getConfig(): KeycloakConfig = js.native
    
    def getGrant(
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      res: Response_[Any, Record[String, Any]]
    ): js.Promise[Grant] = js.native
    
    def getGrantFromCode(
      code: String,
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      res: Response_[Any, Record[String, Any]]
    ): js.Promise[Grant] = js.native
    
    var grantManager: GrantManager = js.native
    
    def loginUrl(uuid: String, redirectUrl: String): String = js.native
    
    def logoutUrl(redirectUrl: String): String = js.native
    def logoutUrl(redirectUrl: String, idTokenHint: String): String = js.native
    
    /**
      * Obtain an array of middleware for use in your application.
      *
      * Generally this should be installed at the root of your application,
      * as it provides general wiring for Keycloak interaction, without actually
      * causing Keycloak to get involved with any particular URL until asked
      * by using `protect(...)`.
      *
      * Example:
      *
      *     var app = express();
      *     var keycloak = new Keycloak();
      *     app.use( keycloak.middleware() );
      *
      * Options:
      *
      *  - `logout` URL for logging a user out. Defaults to `/logout`.
      *  - `admin` Root URL for Keycloak admin callbacks.  Defaults to `/`.
      *
      * @param {Object} options Optional options for specifying details.
      */
    def middleware(): js.Array[
        RequestHandler[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ]
      ] = js.native
    def middleware(options: Admin): js.Array[
        RequestHandler[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ]
      ] = js.native
    
    /**
      * Apply protection middleware to an application or specific URL.
      *
      * If no `spec` parameter is provided, the subsequent handlers will
      * be invoked if the user is authenticated, regardless of what roles
      * he or she may or may not have.
      *
      * If a user is not currently authenticated, the middleware will cause
      * the authentication workflow to begin by redirecting the user to the
      * Keycloak installation to login.  Upon successful login, the user will
      * be redirected back to the originally-requested URL, fully-authenticated.
      *
      * If a `spec` is provided, the same flow as above will occur to ensure that
      * a user it authenticated.  Once authenticated, the spec will then be evaluated
      * to determine if the user may or may not access the following resource.
      *
      * The `spec` may be either a `String`, specifying a single required role,
      * or a function to make more fine-grained determination about access-control
      *
      * If the `spec` is a `String`, then the string will be interpreted as a
      * role-specification according to the following rules:
      *
      *  - If the string starts with `realm:`, the suffix is treated as the name
      *    of a realm-level role that is required for the user to have access.
      *  - If the string contains a colon, the portion before the colon is treated
      *    as the name of an application within the realm, and the portion after the
      *    colon is treated as a role within that application.  The user then must have
      *    the named role within the named application to proceed.
      *  - If the string contains no colon, the entire string is interpreted as
      *    as the name of a role within the current application (defined through
      *    the installed `keycloak.json` as provisioned within Keycloak) that the
      *    user must have in order to proceed.
      *
      * Example
      *
      *     // Users must have the `special-people` role within this application
      *     app.get( '/special/:page', keycloak.protect( 'special-people' ), mySpecialHandler );
      *
      * If the `spec` is a function, it may take up to two parameters in order to
      * assist it in making an authorization decision: the access token, and the
      * current HTTP request.  It should return `true` if access is allowed, otherwise
      * `false`.
      *
      * The `token` object has a method `hasRole(...)` which follows the same rules
      * as above for `String`-based specs.
      *
      *     // Ensure that users have either `nicepants` realm-level role, or `mr-fancypants` app-level role.
      *     function pants(token, request) {
      *       return token.hasRole( 'realm:nicepants') || token.hasRole( 'mr-fancypants');
      *     }
      *
      *     app.get( '/fancy/:page', keycloak.protect( pants ), myPantsHandler );
      *
      * With no spec, simple authentication is all that is required:
      *
      *     app.get( '/complain', keycloak.protect(), complaintHandler );
      *
      * @param {String} spec The protection spec (optional)
      */
    def protect(): RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ] = js.native
    def protect(spec: String): RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ] = js.native
    def protect(spec: GuardFn): RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ] = js.native
    
    // Uses deprecated method
    // getAccount
    /**
      * Replaceable function to handle redirect behaviour.
      *
      * By default, all unauthorized requests will be redirected to the 
      * Keycloak login page unless your client is bearer-only. 
      * However, a confidential or public client may host both browsable and API endpoints. 
      * To prevent redirects on unauthenticated API requests and instead return an HTTP 401, 
      * you can override the redirectToLogin function.
      * 
      * For example, this override checks if the url contains /api/ and disables login redirects:
      * 
      * Keycloak.prototype.redirectToLogin = function(req) {
      *   var apiReqMatcher = /\/api\//i;
      *   return !apiReqMatcher.test(req.originalUrl || req.url);
      * };
      * 
      * @param {Object} request The HTTP request.
      */
    def redirectToLogin(
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ]
    ): Boolean = js.native
    
    def storeGrant(
      grant: Grant,
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      res: Response_[Any, Record[String, Any]]
    ): Grant = js.native
    
    def unstoreGrant(sessionId: String): Unit = js.native
  }
  
  trait KeycloakConfig extends StObject {
    
    var `auth-server-url`: String
    
    var `bearer-only`: js.UndefOr[Boolean] = js.undefined
    
    var `confidential-port`: String | Double
    
    var realm: String
    
    var resource: String
    
    var `ssl-required`: String
  }
  object KeycloakConfig {
    
    inline def apply(
      `auth-server-url`: String,
      `confidential-port`: String | Double,
      realm: String,
      resource: String,
      `ssl-required`: String
    ): KeycloakConfig = {
      val __obj = js.Dynamic.literal(realm = realm.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
      __obj.updateDynamic("auth-server-url")(`auth-server-url`.asInstanceOf[js.Any])
      __obj.updateDynamic("confidential-port")(`confidential-port`.asInstanceOf[js.Any])
      __obj.updateDynamic("ssl-required")(`ssl-required`.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeycloakConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeycloakConfig] (val x: Self) extends AnyVal {
      
      inline def `setAuth-server-url`(value: String): Self = StObject.set(x, "auth-server-url", value.asInstanceOf[js.Any])
      
      inline def `setBearer-only`(value: Boolean): Self = StObject.set(x, "bearer-only", value.asInstanceOf[js.Any])
      
      inline def `setBearer-onlyUndefined`: Self = StObject.set(x, "bearer-only", js.undefined)
      
      inline def `setConfidential-port`(value: String | Double): Self = StObject.set(x, "confidential-port", value.asInstanceOf[js.Any])
      
      inline def setRealm(value: String): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
      
      inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def `setSsl-required`(value: String): Self = StObject.set(x, "ssl-required", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait KeycloakConnectStatic
    extends StObject
       with Instantiable0[Keycloak]
       with Instantiable1[/* options */ KeycloakOptions, Keycloak]
       with Instantiable2[
          (/* options */ KeycloakOptions) | (/* options */ Unit), 
          (/* config */ KeycloakConfig) | (/* config */ String), 
          Keycloak
        ]
  
  trait KeycloakOptions extends StObject {
    
    var cookies: js.UndefOr[Boolean] = js.undefined
    
    var scope: js.UndefOr[String] = js.undefined
    
    var store: js.UndefOr[Any] = js.undefined
  }
  object KeycloakOptions {
    
    inline def apply(): KeycloakOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeycloakOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeycloakOptions] (val x: Self) extends AnyVal {
      
      inline def setCookies(value: Boolean): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
      
      inline def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setStore(value: Any): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    }
  }
  
  trait Token extends StObject {
    
    def hasApplicationRole(appName: String, roleName: String): Boolean
    
    def hasRealmRole(roleName: String): Boolean
    
    def hasRole(roleName: String): Boolean
    
    def isExpired(): Boolean
  }
  object Token {
    
    inline def apply(
      hasApplicationRole: (String, String) => Boolean,
      hasRealmRole: String => Boolean,
      hasRole: String => Boolean,
      isExpired: () => Boolean
    ): Token = {
      val __obj = js.Dynamic.literal(hasApplicationRole = js.Any.fromFunction2(hasApplicationRole), hasRealmRole = js.Any.fromFunction1(hasRealmRole), hasRole = js.Any.fromFunction1(hasRole), isExpired = js.Any.fromFunction0(isExpired))
      __obj.asInstanceOf[Token]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Token] (val x: Self) extends AnyVal {
      
      inline def setHasApplicationRole(value: (String, String) => Boolean): Self = StObject.set(x, "hasApplicationRole", js.Any.fromFunction2(value))
      
      inline def setHasRealmRole(value: String => Boolean): Self = StObject.set(x, "hasRealmRole", js.Any.fromFunction1(value))
      
      inline def setHasRole(value: String => Boolean): Self = StObject.set(x, "hasRole", js.Any.fromFunction1(value))
      
      inline def setIsExpired(value: () => Boolean): Self = StObject.set(x, "isExpired", js.Any.fromFunction0(value))
    }
  }
  
  type _To = js.Object & KeycloakConnectStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & KeycloakConnectStatic = ^
}
