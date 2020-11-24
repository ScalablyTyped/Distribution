package typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceV1Watch extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The `resume_marker` specifies how much of the existing underlying state
    * is delivered to the client when the watch request is received by the
    * system. The client can set this marker in one of the following ways to
    * get different semantics:  *   Parameter is not specified or has the value
    * "".     Semantics: Fetch initial state.     The client wants the entity's
    * initial state to be delivered. See the     description in "Initial
    * State".  *   Parameter is set to the string "now" (UTF-8 encoding).
    * Semantics: Fetch new changes only.     The client just wants to get the
    * changes received by the system after     the watch point. The system may
    * deliver changes from before the watch     point as well.  *   Parameter
    * is set to a value received in an earlier     `Change.resume_marker` field
    * while watching the same entity.     Semantics: Resume from a specific
    * point.     The client wants to receive the changes from a specific point;
    * this     value must correspond to a value received in the
    * `Change.resume_marker`     field. The system may deliver changes from
    * before the `resume_marker`     as well. If the system cannot resume the
    * stream from this point (e.g.,     if it is too far behind in the stream),
    * it can raise the     `FAILED_PRECONDITION` error.  An implementation MUST
    * support an unspecified parameter and the empty string "" marker (initial
    * state fetching) and the "now" marker. It need not support resuming from a
    * specific point.
    */
  var resumeMarker: js.UndefOr[String] = js.native
  
  /**
    * The `target` value **must** be a valid URL path pointing to an entity to
    * watch. Note that the service name **must** be removed from the target
    * field (e.g., the target field must say "/foo/bar", not
    * "myservice.googleapis.com/foo/bar"). A client is also allowed to pass
    * system-specific parameters in the URL that are only obeyed by some
    * implementations. Some parameters will be implementation-specific.
    * However, some have predefined meaning and are listed here:   * recursive
    * = true|false [default=false]    If set to true, indicates that the client
    * wants to watch all elements    of entities in the subtree rooted at the
    * entity's name in `target`. For    descendants that are not the immediate
    * children of the target, the    `Change.element` will contain slashes.
    * Note that some namespaces and entities will not support recursive
    * watching. When watching such an entity, a client must not set recursive
    * to true. Otherwise, it will receive an `UNIMPLEMENTED` error.  Normal URL
    * encoding must be used inside `target`.  For example, if a query parameter
    * name or value, or the non-query parameter portion of `target` contains a
    * special character, it must be %-encoded.  We recommend that clients and
    * servers use their runtime's URL library to produce and consume target
    * values.
    */
  var target: js.UndefOr[String] = js.native
}
object ParamsResourceV1Watch {
  
  @scala.inline
  def apply(): ParamsResourceV1Watch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceV1Watch]
  }
  
  @scala.inline
  implicit class ParamsResourceV1WatchOps[Self <: ParamsResourceV1Watch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setResumeMarker(value: String): Self = this.set("resumeMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResumeMarker: Self = this.set("resumeMarker", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
}
