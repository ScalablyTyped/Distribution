package typings.libp2p.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PersistentPeerStoreOptions extends StObject {
  
  var threshold: js.UndefOr[Double] = js.undefined
}
object PersistentPeerStoreOptions {
  
  inline def apply(): PersistentPeerStoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersistentPeerStoreOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PersistentPeerStoreOptions] (val x: Self) extends AnyVal {
    
    inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
  }
}
