package typings.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * `Context` defines which contexts an API requests.  Example:      context:
  * rules:       - selector: &quot;*&quot;         requested:         -
  * google.rpc.context.ProjectContext         -
  * google.rpc.context.OriginContext  The above specifies that all methods in
  * the API request `google.rpc.context.ProjectContext` and
  * `google.rpc.context.OriginContext`.  Available context types are defined in
  * package `google.rpc.context`.  This also provides mechanism to whitelist
  * any protobuf message extension that can be sent in grpc metadata using
  * “x-goog-ext-&lt;extension_id&gt;-bin” and
  * “x-goog-ext-&lt;extension_id&gt;-jspb” format. For example, list any
  * service specific protobuf types that can appear in grpc metadata as follows
  * in your yaml file:  Example:      context:       rules:        - selector:
  * &quot;google.example.library.v1.LibraryService.CreateBook&quot;
  * allowed_request_extensions:          - google.foo.v1.NewExtension
  * allowed_response_extensions:          - google.foo.v1.NewExtension  You can
  * also specify extension ID instead of fully qualified extension name here.
  */
trait SchemaContext extends StObject {
  
  /**
    * A list of RPC context rules that apply to individual API methods.
    * **NOTE:** All service configuration rules follow &quot;last one
    * wins&quot; order.
    */
  var rules: js.UndefOr[js.Array[SchemaContextRule]] = js.undefined
}
object SchemaContext {
  
  @scala.inline
  def apply(): SchemaContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContext]
  }
  
  @scala.inline
  implicit class SchemaContextMutableBuilder[Self <: SchemaContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRules(value: js.Array[SchemaContextRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: SchemaContextRule*): Self = StObject.set(x, "rules", js.Array(value :_*))
  }
}
