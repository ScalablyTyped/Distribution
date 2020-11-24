package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HostRule extends js.Object {
  
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The list of host patterns to match. They must be valid hostnames with optional port numbers in the format host:port. * matches any string of ([a-z0-9-.]*). In that case, * must be
    * the first character and must be followed in the pattern by either - or ..
    * * based matching is not supported when the URL map is bound to target gRPC proxy that has validateForProxyless field set to true.
    */
  var hosts: js.UndefOr[js.Array[String]] = js.native
  
  /** The name of the PathMatcher to use to match the path portion of the URL if the hostRule matches the URL's host portion. */
  var pathMatcher: js.UndefOr[String] = js.native
}
object HostRule {
  
  @scala.inline
  def apply(): HostRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostRule]
  }
  
  @scala.inline
  implicit class HostRuleOps[Self <: HostRule] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setHostsVarargs(value: String*): Self = this.set("hosts", js.Array(value :_*))
    
    @scala.inline
    def setHosts(value: js.Array[String]): Self = this.set("hosts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHosts: Self = this.set("hosts", js.undefined)
    
    @scala.inline
    def setPathMatcher(value: String): Self = this.set("pathMatcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePathMatcher: Self = this.set("pathMatcher", js.undefined)
  }
}
