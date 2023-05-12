package typings.mailchimpMailchimpMarketing.mod.lists

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchListMembersOpts extends StObject {
  
  var skipDuplicateCheck: js.UndefOr[Boolean] = js.undefined
  
  var skipMergeValidation: js.UndefOr[Boolean] = js.undefined
}
object BatchListMembersOpts {
  
  inline def apply(): BatchListMembersOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchListMembersOpts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchListMembersOpts] (val x: Self) extends AnyVal {
    
    inline def setSkipDuplicateCheck(value: Boolean): Self = StObject.set(x, "skipDuplicateCheck", value.asInstanceOf[js.Any])
    
    inline def setSkipDuplicateCheckUndefined: Self = StObject.set(x, "skipDuplicateCheck", js.undefined)
    
    inline def setSkipMergeValidation(value: Boolean): Self = StObject.set(x, "skipMergeValidation", value.asInstanceOf[js.Any])
    
    inline def setSkipMergeValidationUndefined: Self = StObject.set(x, "skipMergeValidation", js.undefined)
  }
}
