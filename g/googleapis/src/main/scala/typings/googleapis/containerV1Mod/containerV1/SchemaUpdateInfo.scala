package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUpdateInfo extends StObject {
  
  /**
    * Information of a blue-green upgrade.
    */
  var blueGreenInfo: js.UndefOr[SchemaBlueGreenInfo] = js.undefined
}
object SchemaUpdateInfo {
  
  inline def apply(): SchemaUpdateInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateInfo]
  }
  
  extension [Self <: SchemaUpdateInfo](x: Self) {
    
    inline def setBlueGreenInfo(value: SchemaBlueGreenInfo): Self = StObject.set(x, "blueGreenInfo", value.asInstanceOf[js.Any])
    
    inline def setBlueGreenInfoUndefined: Self = StObject.set(x, "blueGreenInfo", js.undefined)
  }
}
