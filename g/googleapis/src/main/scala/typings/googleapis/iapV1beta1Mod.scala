package typings.googleapis

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import typings.googleapis.googleapisStrings.v1beta1
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iapV1beta1Mod {
  
  object iapV1beta1 {
    
    /**
      * Cloud Identity-Aware Proxy API
      *
      * Controls access to cloud applications running on Google Cloud Platform.
      *
      * @example
      * const {google} = require('googleapis');
      * const iap = google.iap('v1beta1');
      *
      * @namespace iap
      * @type {Function}
      * @version v1beta1
      * @variation v1beta1
      * @param {object=} options Options for Iap
      */
    @JSImport("googleapis/build/src/apis/iap/v1beta1", "iap_v1beta1.Iap")
    @js.native
    class Iap protected () extends StObject {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
      
      var context: APIRequestContext = js.native
      
      var v1beta1: ResourceV1beta1 = js.native
    }
    
    @JSImport("googleapis/build/src/apis/iap/v1beta1", "iap_v1beta1.Resource$V1beta1")
    @js.native
    class ResourceV1beta1 protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      /**
        * iap.getIamPolicy
        * @desc Gets the access control policy for an Identity-Aware Proxy
        * protected resource. More information about managing access via IAP can be
        * found at:
        * https://cloud.google.com/iap/docs/managing-access#managing_access_via_the_api
        * @alias iap.getIamPolicy
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {string} params.resource_ REQUIRED: The resource for which the policy is being requested. See the operation documentation for the appropriate value for this field.
        * @param {().GetIamPolicyRequest} params.resource Request body data
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def getIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
      def getIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
      def getIamPolicy(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
      def getIamPolicy(params: ParamsResourceV1beta1Getiampolicy): GaxiosPromise[SchemaPolicy] = js.native
      def getIamPolicy(params: ParamsResourceV1beta1Getiampolicy, callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
      def getIamPolicy(
        params: ParamsResourceV1beta1Getiampolicy,
        options: BodyResponseCallback[SchemaPolicy],
        callback: BodyResponseCallback[SchemaPolicy]
      ): Unit = js.native
      def getIamPolicy(params: ParamsResourceV1beta1Getiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
      def getIamPolicy(
        params: ParamsResourceV1beta1Getiampolicy,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaPolicy]
      ): Unit = js.native
      
      /**
        * iap.setIamPolicy
        * @desc Sets the access control policy for an Identity-Aware Proxy
        * protected resource. Replaces any existing policy. More information about
        * managing access via IAP can be found at:
        * https://cloud.google.com/iap/docs/managing-access#managing_access_via_the_api
        * @alias iap.setIamPolicy
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {string} params.resource_ REQUIRED: The resource for which the policy is being specified. See the operation documentation for the appropriate value for this field.
        * @param {().SetIamPolicyRequest} params.resource Request body data
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def setIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
      def setIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
      def setIamPolicy(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
      def setIamPolicy(params: ParamsResourceV1beta1Setiampolicy): GaxiosPromise[SchemaPolicy] = js.native
      def setIamPolicy(params: ParamsResourceV1beta1Setiampolicy, callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
      def setIamPolicy(
        params: ParamsResourceV1beta1Setiampolicy,
        options: BodyResponseCallback[SchemaPolicy],
        callback: BodyResponseCallback[SchemaPolicy]
      ): Unit = js.native
      def setIamPolicy(params: ParamsResourceV1beta1Setiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
      def setIamPolicy(
        params: ParamsResourceV1beta1Setiampolicy,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaPolicy]
      ): Unit = js.native
      
      /**
        * iap.testIamPermissions
        * @desc Returns permissions that a caller has on the Identity-Aware Proxy
        * protected resource. If the resource does not exist or the caller does not
        * have Identity-Aware Proxy permissions a
        * [google.rpc.Code.PERMISSION_DENIED] will be returned. More information
        * about managing access via IAP can be found at:
        * https://cloud.google.com/iap/docs/managing-access#managing_access_via_the_api
        * @alias iap.testIamPermissions
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {string} params.resource_ REQUIRED: The resource for which the policy detail is being requested. See the operation documentation for the appropriate value for this field.
        * @param {().TestIamPermissionsRequest} params.resource Request body data
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def testIamPermissions(): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
      def testIamPermissions(callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]): Unit = js.native
      def testIamPermissions(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
      def testIamPermissions(params: ParamsResourceV1beta1Testiampermissions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
      def testIamPermissions(
        params: ParamsResourceV1beta1Testiampermissions,
        callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
      ): Unit = js.native
      def testIamPermissions(
        params: ParamsResourceV1beta1Testiampermissions,
        options: BodyResponseCallback[SchemaTestIamPermissionsResponse],
        callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
      ): Unit = js.native
      def testIamPermissions(params: ParamsResourceV1beta1Testiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
      def testIamPermissions(
        params: ParamsResourceV1beta1Testiampermissions,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
      ): Unit = js.native
    }
    
    @js.native
    trait Options extends GlobalOptions {
      
      var version: v1beta1 = js.native
    }
    object Options {
      
      @scala.inline
      def apply(version: v1beta1): Options = {
        val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setVersion(value: v1beta1): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait ParamsResourceV1beta1Getiampolicy extends StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
      
      /**
        * Request body metadata
        */
      var requestBody: js.UndefOr[SchemaGetIamPolicyRequest] = js.native
      
      /**
        * REQUIRED: The resource for which the policy is being requested. See the
        * operation documentation for the appropriate value for this field.
        */
      var resource: js.UndefOr[String] = js.native
    }
    object ParamsResourceV1beta1Getiampolicy {
      
      @scala.inline
      def apply(): ParamsResourceV1beta1Getiampolicy = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceV1beta1Getiampolicy]
      }
      
      @scala.inline
      implicit class ParamsResourceV1beta1GetiampolicyMutableBuilder[Self <: ParamsResourceV1beta1Getiampolicy] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        @scala.inline
        def setRequestBody(value: SchemaGetIamPolicyRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
        
        @scala.inline
        def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      }
    }
    
    @js.native
    trait ParamsResourceV1beta1Setiampolicy extends StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
      
      /**
        * Request body metadata
        */
      var requestBody: js.UndefOr[SchemaSetIamPolicyRequest] = js.native
      
      /**
        * REQUIRED: The resource for which the policy is being specified. See the
        * operation documentation for the appropriate value for this field.
        */
      var resource: js.UndefOr[String] = js.native
    }
    object ParamsResourceV1beta1Setiampolicy {
      
      @scala.inline
      def apply(): ParamsResourceV1beta1Setiampolicy = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceV1beta1Setiampolicy]
      }
      
      @scala.inline
      implicit class ParamsResourceV1beta1SetiampolicyMutableBuilder[Self <: ParamsResourceV1beta1Setiampolicy] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        @scala.inline
        def setRequestBody(value: SchemaSetIamPolicyRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
        
        @scala.inline
        def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      }
    }
    
    @js.native
    trait ParamsResourceV1beta1Testiampermissions extends StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
      
      /**
        * Request body metadata
        */
      var requestBody: js.UndefOr[SchemaTestIamPermissionsRequest] = js.native
      
      /**
        * REQUIRED: The resource for which the policy detail is being requested.
        * See the operation documentation for the appropriate value for this field.
        */
      var resource: js.UndefOr[String] = js.native
    }
    object ParamsResourceV1beta1Testiampermissions {
      
      @scala.inline
      def apply(): ParamsResourceV1beta1Testiampermissions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceV1beta1Testiampermissions]
      }
      
      @scala.inline
      implicit class ParamsResourceV1beta1TestiampermissionsMutableBuilder[Self <: ParamsResourceV1beta1Testiampermissions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        @scala.inline
        def setRequestBody(value: SchemaTestIamPermissionsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
        
        @scala.inline
        def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      }
    }
    
    /**
      * Associates `members` with a `role`.
      */
    @js.native
    trait SchemaBinding extends StObject {
      
      /**
        * The condition that is associated with this binding. NOTE: an unsatisfied
        * condition will not allow user access via current binding. Different
        * bindings, including their conditions, are examined independently.
        */
      var condition: js.UndefOr[SchemaExpr] = js.native
      
      /**
        * Specifies the identities requesting access for a Cloud Platform resource.
        * `members` can have the following values:  * `allUsers`: A special
        * identifier that represents anyone who is    on the internet; with or
        * without a Google account.  * `allAuthenticatedUsers`: A special
        * identifier that represents anyone    who is authenticated with a Google
        * account or a service account.  * `user:{emailid}`: An email address that
        * represents a specific Google    account. For example, `alice@gmail.com` .
        * * `serviceAccount:{emailid}`: An email address that represents a service
        * account. For example, `my-other-app@appspot.gserviceaccount.com`.  *
        * `group:{emailid}`: An email address that represents a Google group. For
        * example, `admins@example.com`.   * `domain:{domain}`: The G Suite domain
        * (primary) that represents all the    users of that domain. For example,
        * `google.com` or `example.com`.
        */
      var members: js.UndefOr[js.Array[String]] = js.native
      
      /**
        * Role that is assigned to `members`. For example, `roles/viewer`,
        * `roles/editor`, or `roles/owner`.
        */
      var role: js.UndefOr[String] = js.native
    }
    object SchemaBinding {
      
      @scala.inline
      def apply(): SchemaBinding = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaBinding]
      }
      
      @scala.inline
      implicit class SchemaBindingMutableBuilder[Self <: SchemaBinding] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCondition(value: SchemaExpr): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
        
        @scala.inline
        def setMembers(value: js.Array[String]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
        
        @scala.inline
        def setMembersVarargs(value: String*): Self = StObject.set(x, "members", js.Array(value :_*))
        
        @scala.inline
        def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      }
    }
    
    /**
      * Represents an expression text. Example:      title: &quot;User account
      * presence&quot;     description: &quot;Determines whether the request has a
      * user account&quot;     expression: &quot;size(request.user) &gt; 0&quot;
      */
    @js.native
    trait SchemaExpr extends StObject {
      
      /**
        * An optional description of the expression. This is a longer text which
        * describes the expression, e.g. when hovered over it in a UI.
        */
      var description: js.UndefOr[String] = js.native
      
      /**
        * Textual representation of an expression in Common Expression Language
        * syntax.  The application context of the containing message determines
        * which well-known feature set of CEL is supported.
        */
      var expression: js.UndefOr[String] = js.native
      
      /**
        * An optional string indicating the location of the expression for error
        * reporting, e.g. a file name and a position in the file.
        */
      var location: js.UndefOr[String] = js.native
      
      /**
        * An optional title for the expression, i.e. a short string describing its
        * purpose. This can be used e.g. in UIs which allow to enter the
        * expression.
        */
      var title: js.UndefOr[String] = js.native
    }
    object SchemaExpr {
      
      @scala.inline
      def apply(): SchemaExpr = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaExpr]
      }
      
      @scala.inline
      implicit class SchemaExprMutableBuilder[Self <: SchemaExpr] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        @scala.inline
        def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
        
        @scala.inline
        def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    /**
      * Request message for `GetIamPolicy` method.
      */
    @js.native
    trait SchemaGetIamPolicyRequest extends StObject
    
    /**
      * Defines an Identity and Access Management (IAM) policy. It is used to
      * specify access control policies for Cloud Platform resources.   A `Policy`
      * consists of a list of `bindings`. A `binding` binds a list of `members` to
      * a `role`, where the members can be user accounts, Google groups, Google
      * domains, and service accounts. A `role` is a named list of permissions
      * defined by IAM.  **JSON Example**      {       &quot;bindings&quot;: [ {
      * &quot;role&quot;: &quot;roles/owner&quot;,           &quot;members&quot;: [
      * &quot;user:mike@example.com&quot;, &quot;group:admins@example.com&quot;,
      * &quot;domain:google.com&quot;,
      * &quot;serviceAccount:my-other-app@appspot.gserviceaccount.com&quot; ] }, {
      * &quot;role&quot;: &quot;roles/viewer&quot;,           &quot;members&quot;:
      * [&quot;user:sean@example.com&quot;]         }       ]     }  **YAML
      * Example**      bindings:     - members:       - user:mike@example.com -
      * group:admins@example.com       - domain:google.com       -
      * serviceAccount:my-other-app@appspot.gserviceaccount.com       role:
      * roles/owner     - members:       - user:sean@example.com       role:
      * roles/viewer   For a description of IAM and its features, see the [IAM
      * developer&#39;s guide](https://cloud.google.com/iam/docs).
      */
    @js.native
    trait SchemaPolicy extends StObject {
      
      /**
        * Associates a list of `members` to a `role`. `bindings` with no members
        * will result in an error.
        */
      var bindings: js.UndefOr[js.Array[SchemaBinding]] = js.native
      
      /**
        * `etag` is used for optimistic concurrency control as a way to help
        * prevent simultaneous updates of a policy from overwriting each other. It
        * is strongly suggested that systems make use of the `etag` in the
        * read-modify-write cycle to perform policy updates in order to avoid race
        * conditions: An `etag` is returned in the response to `getIamPolicy`, and
        * systems are expected to put that etag in the request to `setIamPolicy` to
        * ensure that their change will be applied to the same version of the
        * policy.  If no `etag` is provided in the call to `setIamPolicy`, then the
        * existing policy is overwritten blindly.
        */
      var etag: js.UndefOr[String] = js.native
      
      /**
        * Deprecated.
        */
      var version: js.UndefOr[Double] = js.native
    }
    object SchemaPolicy {
      
      @scala.inline
      def apply(): SchemaPolicy = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaPolicy]
      }
      
      @scala.inline
      implicit class SchemaPolicyMutableBuilder[Self <: SchemaPolicy] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBindings(value: js.Array[SchemaBinding]): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBindingsUndefined: Self = StObject.set(x, "bindings", js.undefined)
        
        @scala.inline
        def setBindingsVarargs(value: SchemaBinding*): Self = StObject.set(x, "bindings", js.Array(value :_*))
        
        @scala.inline
        def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        @scala.inline
        def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      }
    }
    
    /**
      * Request message for `SetIamPolicy` method.
      */
    @js.native
    trait SchemaSetIamPolicyRequest extends StObject {
      
      /**
        * REQUIRED: The complete policy to be applied to the `resource`. The size
        * of the policy is limited to a few 10s of KB. An empty policy is a valid
        * policy but certain Cloud Platform services (such as Projects) might
        * reject them.
        */
      var policy: js.UndefOr[SchemaPolicy] = js.native
    }
    object SchemaSetIamPolicyRequest {
      
      @scala.inline
      def apply(): SchemaSetIamPolicyRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaSetIamPolicyRequest]
      }
      
      @scala.inline
      implicit class SchemaSetIamPolicyRequestMutableBuilder[Self <: SchemaSetIamPolicyRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPolicy(value: SchemaPolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
      }
    }
    
    /**
      * Request message for `TestIamPermissions` method.
      */
    @js.native
    trait SchemaTestIamPermissionsRequest extends StObject {
      
      /**
        * The set of permissions to check for the `resource`. Permissions with
        * wildcards (such as &#39;*&#39; or &#39;storage.*&#39;) are not allowed.
        * For more information see [IAM
        * Overview](https://cloud.google.com/iam/docs/overview#permissions).
        */
      var permissions: js.UndefOr[js.Array[String]] = js.native
    }
    object SchemaTestIamPermissionsRequest {
      
      @scala.inline
      def apply(): SchemaTestIamPermissionsRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaTestIamPermissionsRequest]
      }
      
      @scala.inline
      implicit class SchemaTestIamPermissionsRequestMutableBuilder[Self <: SchemaTestIamPermissionsRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPermissions(value: js.Array[String]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
        
        @scala.inline
        def setPermissionsVarargs(value: String*): Self = StObject.set(x, "permissions", js.Array(value :_*))
      }
    }
    
    /**
      * Response message for `TestIamPermissions` method.
      */
    @js.native
    trait SchemaTestIamPermissionsResponse extends StObject {
      
      /**
        * A subset of `TestPermissionsRequest.permissions` that the caller is
        * allowed.
        */
      var permissions: js.UndefOr[js.Array[String]] = js.native
    }
    object SchemaTestIamPermissionsResponse {
      
      @scala.inline
      def apply(): SchemaTestIamPermissionsResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaTestIamPermissionsResponse]
      }
      
      @scala.inline
      implicit class SchemaTestIamPermissionsResponseMutableBuilder[Self <: SchemaTestIamPermissionsResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPermissions(value: js.Array[String]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
        
        @scala.inline
        def setPermissionsVarargs(value: String*): Self = StObject.set(x, "permissions", js.Array(value :_*))
      }
    }
    
    @js.native
    trait StandardParameters extends StObject {
      
      /**
        * V1 error format.
        */
      @JSName("$.xgafv")
      var $Dotxgafv: js.UndefOr[String] = js.native
      
      /**
        * OAuth access token.
        */
      var access_token: js.UndefOr[String] = js.native
      
      /**
        * Data format for response.
        */
      var alt: js.UndefOr[String] = js.native
      
      /**
        * JSONP
        */
      var callback: js.UndefOr[String] = js.native
      
      /**
        * Selector specifying which fields to include in a partial response.
        */
      var fields: js.UndefOr[String] = js.native
      
      /**
        * API key. Your API key identifies your project and provides you with API
        * access, quota, and reports. Required unless you provide an OAuth 2.0
        * token.
        */
      var key: js.UndefOr[String] = js.native
      
      /**
        * OAuth 2.0 token for the current user.
        */
      var oauth_token: js.UndefOr[String] = js.native
      
      /**
        * Returns response with indentations and line breaks.
        */
      var prettyPrint: js.UndefOr[Boolean] = js.native
      
      /**
        * Available to use for quota purposes for server-side applications. Can be
        * any arbitrary string assigned to a user, but should not exceed 40
        * characters.
        */
      var quotaUser: js.UndefOr[String] = js.native
      
      /**
        * Legacy upload protocol for media (e.g. "media", "multipart").
        */
      var uploadType: js.UndefOr[String] = js.native
      
      /**
        * Upload protocol for media (e.g. "raw", "multipart").
        */
      var upload_protocol: js.UndefOr[String] = js.native
    }
    object StandardParameters {
      
      @scala.inline
      def apply(): StandardParameters = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[StandardParameters]
      }
      
      @scala.inline
      implicit class StandardParametersMutableBuilder[Self <: StandardParameters] (val x: Self) extends AnyVal {
        
        @scala.inline
        def set$Dotxgafv(value: String): Self = StObject.set(x, "$.xgafv", value.asInstanceOf[js.Any])
        
        @scala.inline
        def set$DotxgafvUndefined: Self = StObject.set(x, "$.xgafv", js.undefined)
        
        @scala.inline
        def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
        
        @scala.inline
        def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
        
        @scala.inline
        def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
        
        @scala.inline
        def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        @scala.inline
        def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
        
        @scala.inline
        def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
        
        @scala.inline
        def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
        
        @scala.inline
        def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
        
        @scala.inline
        def setUploadType(value: String): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
        
        @scala.inline
        def setUpload_protocol(value: String): Self = StObject.set(x, "upload_protocol", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpload_protocolUndefined: Self = StObject.set(x, "upload_protocol", js.undefined)
      }
    }
  }
}
