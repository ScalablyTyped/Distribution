package typings.libp2p.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PeerStoreConfig extends StObject {
  
  var persistence: js.UndefOr[Boolean] = js.undefined
  
  var threshold: js.UndefOr[Double] = js.undefined
}
object PeerStoreConfig {
  
  inline def apply(): PeerStoreConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PeerStoreConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PeerStoreConfig] (val x: Self) extends AnyVal {
    
    inline def setPersistence(value: Boolean): Self = StObject.set(x, "persistence", value.asInstanceOf[js.Any])
    
    inline def setPersistenceUndefined: Self = StObject.set(x, "persistence", js.undefined)
    
    inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
  }
}
