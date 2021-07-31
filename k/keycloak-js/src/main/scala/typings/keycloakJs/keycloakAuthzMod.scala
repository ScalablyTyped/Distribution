package typings.keycloakJs

import typings.keycloakJs.anon.Rptendpoint
import typings.keycloakJs.mod.KeycloakInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keycloakAuthzMod {
  
  /**
    * Creates a new Keycloak client instance.
    * @param config Path to a JSON config file or a plain config object.
    */
  @scala.inline
  def apply(keycloak: KeycloakInstance): KeycloakAuthorizationInstance = ^.asInstanceOf[js.Dynamic].apply(keycloak.asInstanceOf[js.Any]).asInstanceOf[KeycloakAuthorizationInstance]
  
  @JSImport("keycloak-js/dist/keycloak-authz", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait AuthorizationRequest extends StObject {
    
    /**
      * Defines whether or not this authorization request should include the current RPT. If set to true, the RPT will
      * be sent and permissions in the current RPT will be included in the new RPT. Otherwise, only the permissions referenced in this
      * authorization request will be granted in the new RPT.
      */
    var incrementalAuthorization: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defines additional information about this authorization request in order to specify how it should be processed
      * by the server.
      */
    var metadata: js.UndefOr[AuthorizationRequestMetadata] = js.undefined
    
    /**
      * An array of objects representing the resource and scopes.
      */
    var permissions: js.UndefOr[js.Array[ResourcePermission]] = js.undefined
    
    /**
      * A boolean value indicating whether the server should create permission requests to the resources
      * and scopes referenced by a permission ticket. This parameter will only take effect when used together
      * with the ticket parameter as part of a UMA authorization process.
      */
    var submitRequest: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A permission ticket obtained from a resource server when using UMA authorization protocol.
      */
    var ticket: js.UndefOr[String] = js.undefined
  }
  object AuthorizationRequest {
    
    @scala.inline
    def apply(): AuthorizationRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthorizationRequest]
    }
    
    @scala.inline
    implicit class AuthorizationRequestMutableBuilder[Self <: AuthorizationRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIncrementalAuthorization(value: Boolean): Self = StObject.set(x, "incrementalAuthorization", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncrementalAuthorizationUndefined: Self = StObject.set(x, "incrementalAuthorization", js.undefined)
      
      @scala.inline
      def setMetadata(value: AuthorizationRequestMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setPermissions(value: js.Array[ResourcePermission]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
      
      @scala.inline
      def setPermissionsVarargs(value: ResourcePermission*): Self = StObject.set(x, "permissions", js.Array(value :_*))
      
      @scala.inline
      def setSubmitRequest(value: Boolean): Self = StObject.set(x, "submitRequest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubmitRequestUndefined: Self = StObject.set(x, "submitRequest", js.undefined)
      
      @scala.inline
      def setTicket(value: String): Self = StObject.set(x, "ticket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTicketUndefined: Self = StObject.set(x, "ticket", js.undefined)
    }
  }
  
  trait AuthorizationRequestMetadata extends StObject {
    
    /**
      * A boolean value indicating to the server if resource names should be included in the RPT’s permissions.
      * If false, only the resource identifier is included.
      */
    var responseIncludeResourceName: js.UndefOr[js.Any] = js.undefined
    
    /**
      * An integer N that defines a limit for the amount of permissions an RPT can have. When used together with
      * rpt parameter, only the last N requested permissions will be kept in the RPT.
      */
    var response_permissions_limit: js.UndefOr[Double] = js.undefined
  }
  object AuthorizationRequestMetadata {
    
    @scala.inline
    def apply(): AuthorizationRequestMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthorizationRequestMetadata]
    }
    
    @scala.inline
    implicit class AuthorizationRequestMetadataMutableBuilder[Self <: AuthorizationRequestMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResponseIncludeResourceName(value: js.Any): Self = StObject.set(x, "responseIncludeResourceName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseIncludeResourceNameUndefined: Self = StObject.set(x, "responseIncludeResourceName", js.undefined)
      
      @scala.inline
      def setResponse_permissions_limit(value: Double): Self = StObject.set(x, "response_permissions_limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponse_permissions_limitUndefined: Self = StObject.set(x, "response_permissions_limit", js.undefined)
    }
  }
  
  @js.native
  trait KeycloakAuthorizationInstance extends StObject {
    
    /**
      * This method enables client applications to better integrate with resource servers protected by a Keycloak
      * policy enforcer using UMA protocol.
      *
      * The authorization request must be provided with a ticket.
      *
      * @param authorizationRequest An AuthorizationRequest instance with a valid permission ticket set.
      * @returns A promise to set functions to be invoked on grant, deny or error.
      */
    def authorize(authorizationRequest: AuthorizationRequest): KeycloakAuthorizationPromise = js.native
    
    var config: Rptendpoint = js.native
    
    /**
    		 * Obtains all entitlements from a Keycloak server based on a given resourceServerId.
      *
      * @param resourceServerId The id (client id) of the resource server to obtain permissions from.
      * @param authorizationRequest An AuthorizationRequest instance.
      * @returns A promise to set functions to be invoked on grant, deny or error.
    		 */
    def entitlement(resourceServerId: String): KeycloakAuthorizationPromise = js.native
    def entitlement(resourceServerId: String, authorizationRequest: AuthorizationRequest): KeycloakAuthorizationPromise = js.native
    
    def init(): Unit = js.native
    
    var rpt: js.Any = js.native
  }
  
  trait KeycloakAuthorizationPromise extends StObject {
    
    def `then`(
      onGrant: js.Function1[/* rpt */ String, Unit],
      onDeny: js.Function0[Unit],
      onError: js.Function0[Unit]
    ): Unit
  }
  object KeycloakAuthorizationPromise {
    
    @scala.inline
    def apply(`then`: (js.Function1[/* rpt */ String, Unit], js.Function0[Unit], js.Function0[Unit]) => Unit): KeycloakAuthorizationPromise = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("then")(js.Any.fromFunction3(`then`))
      __obj.asInstanceOf[KeycloakAuthorizationPromise]
    }
    
    @scala.inline
    implicit class KeycloakAuthorizationPromiseMutableBuilder[Self <: KeycloakAuthorizationPromise] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setThen(value: (js.Function1[/* rpt */ String, Unit], js.Function0[Unit], js.Function0[Unit]) => Unit): Self = StObject.set(x, "then", js.Any.fromFunction3(value))
    }
  }
  
  trait ResourcePermission extends StObject {
    
    /**
      * The id or name of a resource.
      */
    var id: String
    
    /**
      * An array of strings where each value is the name of a scope associated with the resource.
      */
    var scopes: js.UndefOr[js.Array[String]] = js.undefined
  }
  object ResourcePermission {
    
    @scala.inline
    def apply(id: String): ResourcePermission = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourcePermission]
    }
    
    @scala.inline
    implicit class ResourcePermissionMutableBuilder[Self <: ResourcePermission] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
      
      @scala.inline
      def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value :_*))
    }
  }
}
