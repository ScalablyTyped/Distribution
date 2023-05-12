package typings.hapiHapi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Remote extends StObject {
  
  /**
    * @default false.
    * If true, the request.info.remoteAddress and request.info.remotePort are populated when the request is received which can consume more resource (but is ok if the information is needed,
    * especially for aborted requests). When false, the fields are only populated upon demand (but will be undefined if accessed after the request is aborted).
    */
  var remote: js.UndefOr[Boolean] = js.undefined
}
object Remote {
  
  inline def apply(): Remote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Remote]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Remote] (val x: Self) extends AnyVal {
    
    inline def setRemote(value: Boolean): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
    
    inline def setRemoteUndefined: Self = StObject.set(x, "remote", js.undefined)
  }
}
