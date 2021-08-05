package typings.joi.mod

import typings.joi.joiBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainOptions extends StObject {
  
  /**
    * If `true`, Unicode characters are permitted
    *
    * @default true
    */
  var allowUnicode: js.UndefOr[Boolean] = js.undefined
  
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
  
  extension [Self <: DomainOptions](x: Self) {
    
    inline def setAllowUnicode(value: Boolean): Self = StObject.set(x, "allowUnicode", value.asInstanceOf[js.Any])
    
    inline def setAllowUnicodeUndefined: Self = StObject.set(x, "allowUnicode", js.undefined)
    
    inline def setMinDomainSegments(value: Double): Self = StObject.set(x, "minDomainSegments", value.asInstanceOf[js.Any])
    
    inline def setMinDomainSegmentsUndefined: Self = StObject.set(x, "minDomainSegments", js.undefined)
    
    inline def setTlds(value: TopLevelDomainOptions | `false`): Self = StObject.set(x, "tlds", value.asInstanceOf[js.Any])
    
    inline def setTldsUndefined: Self = StObject.set(x, "tlds", js.undefined)
  }
}
