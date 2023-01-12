package typings.joi.mod

import typings.joi.joiBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainOptions extends StObject {
  
  /**
    * if `true`, domains ending with a `.` character are permitted
    *
    * @default false
    */
  var allowFullyQualified: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, Unicode characters are permitted
    *
    * @default true
    */
  var allowUnicode: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The maximum number of domain segments (e.g. `x.y.z` has 3 segments) allowed. Defaults to no limit.
    *
    * @default Infinity
    */
  var maxDomainSegments: js.UndefOr[Double] = js.undefined
  
  /**
    * Number of segments required for the domain.
    *
    * @default 2
    */
  var minDomainSegments: js.UndefOr[Double] = js.undefined
  
  /**
    * Options for TLD (top level domain) validation. By default, the TLD must be a valid name listed on the [IANA registry](http://data.iana.org/TLD/tlds-alpha-by-domain.txt)
    *
    * @default { allow: true }
    */
  var tlds: js.UndefOr[TopLevelDomainOptions | `false`] = js.undefined
}
object DomainOptions {
  
  inline def apply(): DomainOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DomainOptions] (val x: Self) extends AnyVal {
    
    inline def setAllowFullyQualified(value: Boolean): Self = StObject.set(x, "allowFullyQualified", value.asInstanceOf[js.Any])
    
    inline def setAllowFullyQualifiedUndefined: Self = StObject.set(x, "allowFullyQualified", js.undefined)
    
    inline def setAllowUnicode(value: Boolean): Self = StObject.set(x, "allowUnicode", value.asInstanceOf[js.Any])
    
    inline def setAllowUnicodeUndefined: Self = StObject.set(x, "allowUnicode", js.undefined)
    
    inline def setMaxDomainSegments(value: Double): Self = StObject.set(x, "maxDomainSegments", value.asInstanceOf[js.Any])
    
    inline def setMaxDomainSegmentsUndefined: Self = StObject.set(x, "maxDomainSegments", js.undefined)
    
    inline def setMinDomainSegments(value: Double): Self = StObject.set(x, "minDomainSegments", value.asInstanceOf[js.Any])
    
    inline def setMinDomainSegmentsUndefined: Self = StObject.set(x, "minDomainSegments", js.undefined)
    
    inline def setTlds(value: TopLevelDomainOptions | `false`): Self = StObject.set(x, "tlds", value.asInstanceOf[js.Any])
    
    inline def setTldsUndefined: Self = StObject.set(x, "tlds", js.undefined)
  }
}
