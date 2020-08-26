package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * UrlMaps A host-matching rule for a URL. If matched, will use the named
  * PathMatcher to select the BackendService.
  */
@js.native
trait SchemaHostRule extends js.Object {
  /**
    * An optional description of this resource. Provide this property when you
    * create the resource.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The list of host patterns to match. They must be valid hostnames, except
    * * will match any string of ([a-z0-9-.]*). In that case, * must be the
    * first character and must be followed in the pattern by either - or ..
    */
  var hosts: js.UndefOr[js.Array[String]] = js.native
  /**
    * The name of the PathMatcher to use to match the path portion of the URL
    * if the hostRule matches the URL&#39;s host portion.
    */
  var pathMatcher: js.UndefOr[String] = js.native
}

object SchemaHostRule {
  @scala.inline
  def apply(): SchemaHostRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHostRule]
  }
  @scala.inline
  implicit class SchemaHostRuleOps[Self <: SchemaHostRule] (val x: Self) extends AnyVal {
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

