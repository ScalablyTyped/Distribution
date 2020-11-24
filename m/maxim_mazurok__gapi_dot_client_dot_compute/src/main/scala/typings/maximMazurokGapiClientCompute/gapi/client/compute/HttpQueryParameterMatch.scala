package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpQueryParameterMatch extends js.Object {
  
  /**
    * The queryParameterMatch matches if the value of the parameter exactly matches the contents of exactMatch.
    * Only one of presentMatch, exactMatch or regexMatch must be set.
    */
  var exactMatch: js.UndefOr[String] = js.native
  
  /** The name of the query parameter to match. The query parameter must exist in the request, in the absence of which the request match fails. */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Specifies that the queryParameterMatch matches if the request contains the query parameter, irrespective of whether the parameter has a value or not.
    * Only one of presentMatch, exactMatch or regexMatch must be set.
    */
  var presentMatch: js.UndefOr[Boolean] = js.native
  
  /**
    * The queryParameterMatch matches if the value of the parameter matches the regular expression specified by regexMatch. For the regular expression grammar, please see
    * en.cppreference.com/w/cpp/regex/ecmascript
    * Only one of presentMatch, exactMatch or regexMatch must be set.
    * Note that regexMatch only applies when the loadBalancingScheme is set to INTERNAL_SELF_MANAGED.
    */
  var regexMatch: js.UndefOr[String] = js.native
}
object HttpQueryParameterMatch {
  
  @scala.inline
  def apply(): HttpQueryParameterMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpQueryParameterMatch]
  }
  
  @scala.inline
  implicit class HttpQueryParameterMatchOps[Self <: HttpQueryParameterMatch] (val x: Self) extends AnyVal {
    
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
    def setExactMatch(value: String): Self = this.set("exactMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExactMatch: Self = this.set("exactMatch", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPresentMatch(value: Boolean): Self = this.set("presentMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePresentMatch: Self = this.set("presentMatch", js.undefined)
    
    @scala.inline
    def setRegexMatch(value: String): Self = this.set("regexMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegexMatch: Self = this.set("regexMatch", js.undefined)
  }
}
