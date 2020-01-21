package typings.googleapis.serviceusageV1Mod.serviceusageV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@js.native
trait SchemaContext extends js.Object {
  /**
    * A list of RPC context rules that apply to individual API methods.
    * **NOTE:** All service configuration rules follow &quot;last one
    * wins&quot; order.
    */
  var rules: js.UndefOr[js.Array[SchemaContextRule]] = js.native
}

object SchemaContext {
  @scala.inline
  def apply(rules: js.Array[SchemaContextRule] = null): SchemaContext = {
    val __obj = js.Dynamic.literal()
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaContext]
  }
}

