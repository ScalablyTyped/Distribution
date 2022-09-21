package typings.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePhotosequenceDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. ID of the PhotoSequence.
    */
  var sequenceId: js.UndefOr[String] = js.undefined
}
object ParamsResourcePhotosequenceDelete {
  
  inline def apply(): ParamsResourcePhotosequenceDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePhotosequenceDelete]
  }
  
  extension [Self <: ParamsResourcePhotosequenceDelete](x: Self) {
    
    inline def setSequenceId(value: String): Self = StObject.set(x, "sequenceId", value.asInstanceOf[js.Any])
    
    inline def setSequenceIdUndefined: Self = StObject.set(x, "sequenceId", js.undefined)
  }
}
