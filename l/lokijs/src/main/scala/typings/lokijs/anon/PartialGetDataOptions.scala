package typings.lokijs.anon

import typings.lokijs.lokijsStrings.`jquery-extend-deep`
import typings.lokijs.lokijsStrings.`parse-stringify`
import typings.lokijs.lokijsStrings.`shallow-assign`
import typings.lokijs.lokijsStrings.`shallow-recurse-objects`
import typings.lokijs.lokijsStrings.shallow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<lokijs.GetDataOptions> */
trait PartialGetDataOptions extends StObject {
  
  var forceCloneMethod: js.UndefOr[
    `parse-stringify` | `jquery-extend-deep` | shallow | `shallow-assign` | `shallow-recurse-objects` | Null
  ] = js.undefined
  
  var forceClones: js.UndefOr[Boolean] = js.undefined
  
  var removeMeta: js.UndefOr[Boolean] = js.undefined
}
object PartialGetDataOptions {
  
  inline def apply(): PartialGetDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialGetDataOptions]
  }
  
  extension [Self <: PartialGetDataOptions](x: Self) {
    
    inline def setForceCloneMethod(
      value: `parse-stringify` | `jquery-extend-deep` | shallow | `shallow-assign` | `shallow-recurse-objects`
    ): Self = StObject.set(x, "forceCloneMethod", value.asInstanceOf[js.Any])
    
    inline def setForceCloneMethodNull: Self = StObject.set(x, "forceCloneMethod", null)
    
    inline def setForceCloneMethodUndefined: Self = StObject.set(x, "forceCloneMethod", js.undefined)
    
    inline def setForceClones(value: Boolean): Self = StObject.set(x, "forceClones", value.asInstanceOf[js.Any])
    
    inline def setForceClonesUndefined: Self = StObject.set(x, "forceClones", js.undefined)
    
    inline def setRemoveMeta(value: Boolean): Self = StObject.set(x, "removeMeta", value.asInstanceOf[js.Any])
    
    inline def setRemoveMetaUndefined: Self = StObject.set(x, "removeMeta", js.undefined)
  }
}
