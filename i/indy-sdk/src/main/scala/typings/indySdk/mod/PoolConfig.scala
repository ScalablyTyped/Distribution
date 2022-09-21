package typings.indySdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PoolConfig extends StObject {
  
  var genesis_txn: String
}
object PoolConfig {
  
  inline def apply(genesis_txn: String): PoolConfig = {
    val __obj = js.Dynamic.literal(genesis_txn = genesis_txn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PoolConfig]
  }
  
  extension [Self <: PoolConfig](x: Self) {
    
    inline def setGenesis_txn(value: String): Self = StObject.set(x, "genesis_txn", value.asInstanceOf[js.Any])
  }
}
