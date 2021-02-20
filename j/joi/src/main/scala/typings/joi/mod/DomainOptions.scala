package typings.joi.mod

import typings.joi.joiBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainOptions extends StObject {
  
  /**
    * If `true`, Unicode characters are permitted
    *
    * @default true
    */
  var allowUnicode: js.UndefOr[Boolean] = js.native
  
  /**
    * Number of segments required for the domain.
    *
    * @default 2
    */
  var minDomainSegments: js.UndefOr[Double] = js.native
  
  /**
    * Options for TLD (top level domain) validation. By default, the TLD must be a valid name listed on the [IANA registry](http://data.iana.org/TLD/tlds-alpha-by-domain.txt)
    *
    * @default { allow: true }
    */
  var tlds: js.UndefOr[TopLevelDomainOptions | `false`] = js.native
}
object DomainOptions {
  
  @scala.inline
  def apply(): DomainOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainOptions]
  }
  
  @scala.inline
  implicit class DomainOptionsMutableBuilder[Self <: DomainOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowUnicode(value: Boolean): Self = StObject.set(x, "allowUnicode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowUnicodeUndefined: Self = StObject.set(x, "allowUnicode", js.undefined)
    
    @scala.inline
    def setMinDomainSegments(value: Double): Self = StObject.set(x, "minDomainSegments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinDomainSegmentsUndefined: Self = StObject.set(x, "minDomainSegments", js.undefined)
    
    @scala.inline
    def setTlds(value: TopLevelDomainOptions | `false`): Self = StObject.set(x, "tlds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTldsUndefined: Self = StObject.set(x, "tlds", js.undefined)
  }
}
