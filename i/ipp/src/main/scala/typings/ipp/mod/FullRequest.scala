package typings.ipp.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FullRequest extends StObject {
  
  var data: js.UndefOr[Buffer] = js.undefined
  
  var `job-attributes-tag`: js.UndefOr[JobTemplateAttributes] = js.undefined
  
  var `operation-attributes-tag`: js.UndefOr[OperationAttributes] = js.undefined
}
object FullRequest {
  
  inline def apply(): FullRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FullRequest]
  }
  
  extension [Self <: FullRequest](x: Self) {
    
    inline def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def `setJob-attributes-tag`(value: JobTemplateAttributes): Self = StObject.set(x, "job-attributes-tag", value.asInstanceOf[js.Any])
    
    inline def `setJob-attributes-tagUndefined`: Self = StObject.set(x, "job-attributes-tag", js.undefined)
    
    inline def `setOperation-attributes-tag`(value: OperationAttributes): Self = StObject.set(x, "operation-attributes-tag", value.asInstanceOf[js.Any])
    
    inline def `setOperation-attributes-tagUndefined`: Self = StObject.set(x, "operation-attributes-tag", js.undefined)
  }
}
