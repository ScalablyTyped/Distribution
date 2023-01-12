package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteMessageAttributes extends StObject {
  
  /** If true: message is a tombstone in the client. Default false. */
  var isTombstone: js.UndefOr[Boolean] = js.undefined
}
object AppsDynamiteMessageAttributes {
  
  inline def apply(): AppsDynamiteMessageAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteMessageAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppsDynamiteMessageAttributes] (val x: Self) extends AnyVal {
    
    inline def setIsTombstone(value: Boolean): Self = StObject.set(x, "isTombstone", value.asInstanceOf[js.Any])
    
    inline def setIsTombstoneUndefined: Self = StObject.set(x, "isTombstone", js.undefined)
  }
}
