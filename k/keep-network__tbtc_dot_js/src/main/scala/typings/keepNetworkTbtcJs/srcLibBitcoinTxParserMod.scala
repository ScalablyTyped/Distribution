package typings.keepNetworkTbtcJs

import typings.keepNetworkTbtcJs.anon.Locktime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLibBitcoinTxParserMod {
  
  object BitcoinTxParser {
    
    @JSImport("@keep-network/tbtc.js/src/lib/BitcoinTxParser", "BitcoinTxParser")
    @js.native
    val ^ : js.Any = js.native
    
    inline def parse(rawTx: Any): Locktime = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(rawTx.asInstanceOf[js.Any]).asInstanceOf[Locktime]
  }
}
