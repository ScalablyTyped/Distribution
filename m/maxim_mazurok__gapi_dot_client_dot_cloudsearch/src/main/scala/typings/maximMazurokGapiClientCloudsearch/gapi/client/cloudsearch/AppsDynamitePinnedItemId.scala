package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamitePinnedItemId extends StObject {
  
  /** Identifier for a Drive file (e.g. Docs, Sheets, Slides). */
  var driveId: js.UndefOr[String] = js.undefined
}
object AppsDynamitePinnedItemId {
  
  inline def apply(): AppsDynamitePinnedItemId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamitePinnedItemId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppsDynamitePinnedItemId] (val x: Self) extends AnyVal {
    
    inline def setDriveId(value: String): Self = StObject.set(x, "driveId", value.asInstanceOf[js.Any])
    
    inline def setDriveIdUndefined: Self = StObject.set(x, "driveId", js.undefined)
  }
}
