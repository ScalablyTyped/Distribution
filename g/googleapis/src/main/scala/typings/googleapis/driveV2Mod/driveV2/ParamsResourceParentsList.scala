package typings.googleapis.driveV2Mod.driveV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceParentsList
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the file.
    */
  var fileId: js.UndefOr[String] = js.undefined
}
object ParamsResourceParentsList {
  
  inline def apply(): ParamsResourceParentsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceParentsList]
  }
  
  extension [Self <: ParamsResourceParentsList](x: Self) {
    
    inline def setFileId(value: String): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
    
    inline def setFileIdUndefined: Self = StObject.set(x, "fileId", js.undefined)
  }
}
