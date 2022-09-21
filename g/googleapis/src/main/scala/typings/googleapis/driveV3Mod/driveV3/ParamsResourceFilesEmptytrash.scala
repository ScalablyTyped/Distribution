package typings.googleapis.driveV3Mod.driveV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFilesEmptytrash
  extends StObject
     with StandardParameters {
  
  /**
    * Deprecated. If an item is not in a shared drive and its last parent is deleted but the item itself is not, the item will be placed under its owner's root.
    */
  var enforceSingleParent: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourceFilesEmptytrash {
  
  inline def apply(): ParamsResourceFilesEmptytrash = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFilesEmptytrash]
  }
  
  extension [Self <: ParamsResourceFilesEmptytrash](x: Self) {
    
    inline def setEnforceSingleParent(value: Boolean): Self = StObject.set(x, "enforceSingleParent", value.asInstanceOf[js.Any])
    
    inline def setEnforceSingleParentUndefined: Self = StObject.set(x, "enforceSingleParent", js.undefined)
  }
}
