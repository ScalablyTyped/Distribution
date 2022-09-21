package typings.googleapis.driveV3Mod.driveV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFilesGenerateids
  extends StObject
     with StandardParameters {
  
  /**
    * The number of IDs to return.
    */
  var count: js.UndefOr[Double] = js.undefined
  
  /**
    * The space in which the IDs can be used to create new files. Supported values are 'drive' and 'appDataFolder'. (Default: 'drive')
    */
  var space: js.UndefOr[String] = js.undefined
  
  /**
    * The type of items which the IDs can be used for. Supported values are 'files' and 'shortcuts'. Note that 'shortcuts' are only supported in the drive 'space'. (Default: 'files')
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object ParamsResourceFilesGenerateids {
  
  inline def apply(): ParamsResourceFilesGenerateids = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFilesGenerateids]
  }
  
  extension [Self <: ParamsResourceFilesGenerateids](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setSpace(value: String): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
    
    inline def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
