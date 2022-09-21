package typings.googleapis.securitycenterV1Mod.securitycenterV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBulkMuteFindingsRequest extends StObject {
  
  /**
    * Expression that identifies findings that should be updated. The expression is a list of zero or more restrictions combined via logical operators `AND` and `OR`. Parentheses are supported, and `OR` has higher precedence than `AND`. Restrictions have the form ` ` and may have a `-` character in front of them to indicate negation. The fields map to those defined in the corresponding resource. The supported operators are: * `=` for all value types. * `\>`, `<`, `\>=`, `<=` for integer values. * `:`, meaning substring matching, for strings. The supported value types are: * string literals in quotes. * integer literals without quotes. * boolean literals `true` and `false` without quotes.
    */
  var filter: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This can be a mute configuration name or any identifier for mute/unmute of findings based on the filter.
    */
  var muteAnnotation: js.UndefOr[String | Null] = js.undefined
}
object SchemaBulkMuteFindingsRequest {
  
  inline def apply(): SchemaBulkMuteFindingsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBulkMuteFindingsRequest]
  }
  
  extension [Self <: SchemaBulkMuteFindingsRequest](x: Self) {
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterNull: Self = StObject.set(x, "filter", null)
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setMuteAnnotation(value: String): Self = StObject.set(x, "muteAnnotation", value.asInstanceOf[js.Any])
    
    inline def setMuteAnnotationNull: Self = StObject.set(x, "muteAnnotation", null)
    
    inline def setMuteAnnotationUndefined: Self = StObject.set(x, "muteAnnotation", js.undefined)
  }
}
