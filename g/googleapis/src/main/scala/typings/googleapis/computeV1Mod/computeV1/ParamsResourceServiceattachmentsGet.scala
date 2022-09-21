package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceServiceattachmentsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the region of this request.
    */
  var region: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the ServiceAttachment resource to return.
    */
  var serviceAttachment: js.UndefOr[String] = js.undefined
}
object ParamsResourceServiceattachmentsGet {
  
  inline def apply(): ParamsResourceServiceattachmentsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceServiceattachmentsGet]
  }
  
  extension [Self <: ParamsResourceServiceattachmentsGet](x: Self) {
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setServiceAttachment(value: String): Self = StObject.set(x, "serviceAttachment", value.asInstanceOf[js.Any])
    
    inline def setServiceAttachmentUndefined: Self = StObject.set(x, "serviceAttachment", js.undefined)
  }
}
