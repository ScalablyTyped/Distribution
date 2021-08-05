package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileSelectingEventUIParam extends StObject {
  
  /**
    * Gets the igUpload widget object.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object FileSelectingEventUIParam {
  
  inline def apply(): FileSelectingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileSelectingEventUIParam]
  }
  
  extension [Self <: FileSelectingEventUIParam](x: Self) {
    
    inline def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
