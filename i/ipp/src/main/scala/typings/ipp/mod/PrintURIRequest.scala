package typings.ipp.mod

import typings.ipp.anon.Documentname
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrintURIRequest extends StObject {
  
  var `job-attributes-tag`: js.UndefOr[JobTemplateAttributes] = js.undefined
  
  var `operation-attributes-tag`: Documentname
}
object PrintURIRequest {
  
  inline def apply(`operation-attributes-tag`: Documentname): PrintURIRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("operation-attributes-tag")(`operation-attributes-tag`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintURIRequest]
  }
  
  extension [Self <: PrintURIRequest](x: Self) {
    
    inline def `setJob-attributes-tag`(value: JobTemplateAttributes): Self = StObject.set(x, "job-attributes-tag", value.asInstanceOf[js.Any])
    
    inline def `setJob-attributes-tagUndefined`: Self = StObject.set(x, "job-attributes-tag", js.undefined)
    
    inline def `setOperation-attributes-tag`(value: Documentname): Self = StObject.set(x, "operation-attributes-tag", value.asInstanceOf[js.Any])
  }
}
