package typings.lokijs.anon

import typings.lokijs.lokijsStrings.`jquery-extend-deep`
import typings.lokijs.lokijsStrings.`parse-stringify`
import typings.lokijs.lokijsStrings.`shallow-assign`
import typings.lokijs.lokijsStrings.`shallow-recurse-objects`
import typings.lokijs.lokijsStrings.shallow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<lokijs.GetDataOptions> */
@js.native
trait PartialGetDataOptions extends StObject {
  
  var forceCloneMethod: js.UndefOr[
    `parse-stringify` | `jquery-extend-deep` | shallow | `shallow-assign` | `shallow-recurse-objects` | Null
  ] = js.native
  
  var forceClones: js.UndefOr[Boolean] = js.native
  
  var removeMeta: js.UndefOr[Boolean] = js.native
}
object PartialGetDataOptions {
  
  @scala.inline
  def apply(): PartialGetDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialGetDataOptions]
  }
  
  @scala.inline
  implicit class PartialGetDataOptionsMutableBuilder[Self <: PartialGetDataOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForceCloneMethod(
      value: `parse-stringify` | `jquery-extend-deep` | shallow | `shallow-assign` | `shallow-recurse-objects`
    ): Self = StObject.set(x, "forceCloneMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceCloneMethodNull: Self = StObject.set(x, "forceCloneMethod", null)
    
    @scala.inline
    def setForceCloneMethodUndefined: Self = StObject.set(x, "forceCloneMethod", js.undefined)
    
    @scala.inline
    def setForceClones(value: Boolean): Self = StObject.set(x, "forceClones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceClonesUndefined: Self = StObject.set(x, "forceClones", js.undefined)
    
    @scala.inline
    def setRemoveMeta(value: Boolean): Self = StObject.set(x, "removeMeta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveMetaUndefined: Self = StObject.set(x, "removeMeta", js.undefined)
  }
}
