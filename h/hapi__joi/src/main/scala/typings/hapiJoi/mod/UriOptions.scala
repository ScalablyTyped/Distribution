package typings.hapiJoi.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UriOptions extends js.Object {
  
  /**
    * Allows unencoded square brackets inside the query string.
    * This is NOT RFC 3986 compliant but query strings like abc[]=123&abc[]=456 are very common these days.
    *
    * @default false
    */
  var allowQuerySquareBrackets: js.UndefOr[Boolean] = js.native
  
  /**
    * Allow relative URIs.
    *
    * @default false
    */
  var allowRelative: js.UndefOr[Boolean] = js.native
  
  /**
    * Validate the domain component using the options specified in `string.domain()`.
    */
  var domain: js.UndefOr[DomainOptions] = js.native
  
  /**
    * Restrict only relative URIs.
    *
    * @default false
    */
  var relativeOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies one or more acceptable Schemes, should only include the scheme name.
    * Can be an Array or String (strings are automatically escaped for use in a Regular Expression).
    */
  var scheme: js.UndefOr[String | RegExp | (js.Array[String | RegExp])] = js.native
}
object UriOptions {
  
  @scala.inline
  def apply(): UriOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UriOptions]
  }
  
  @scala.inline
  implicit class UriOptionsOps[Self <: UriOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowQuerySquareBrackets(value: Boolean): Self = this.set("allowQuerySquareBrackets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowQuerySquareBrackets: Self = this.set("allowQuerySquareBrackets", js.undefined)
    
    @scala.inline
    def setAllowRelative(value: Boolean): Self = this.set("allowRelative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowRelative: Self = this.set("allowRelative", js.undefined)
    
    @scala.inline
    def setDomain(value: DomainOptions): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    
    @scala.inline
    def setRelativeOnly(value: Boolean): Self = this.set("relativeOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelativeOnly: Self = this.set("relativeOnly", js.undefined)
    
    @scala.inline
    def setSchemeVarargs(value: (String | RegExp)*): Self = this.set("scheme", js.Array(value :_*))
    
    @scala.inline
    def setScheme(value: String | RegExp | (js.Array[String | RegExp])): Self = this.set("scheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheme: Self = this.set("scheme", js.undefined)
  }
}
