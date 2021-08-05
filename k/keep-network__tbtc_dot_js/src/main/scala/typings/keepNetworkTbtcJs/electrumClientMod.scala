package typings.keepNetworkTbtcJs

import typings.keepNetworkTbtcJs.keepNetworkTbtcJsStrings.ssl
import typings.keepNetworkTbtcJs.keepNetworkTbtcJsStrings.tls
import typings.keepNetworkTbtcJs.keepNetworkTbtcJsStrings.ws
import typings.keepNetworkTbtcJs.keepNetworkTbtcJsStrings.wss
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object electrumClientMod {
  
  @JSImport("@keep-network/tbtc.js/src/lib/ElectrumClient", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with Client {
    def this(config: Config) = this()
    
    /* CompleteClass */
    override def broadcastTransaction(rawTX: String): String = js.native
    
    /* CompleteClass */
    override def close(): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def connect(): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    var electrumClient: js.Any = js.native
    
    /* CompleteClass */
    override def findOutputForAddress(txHash: String, address: String): Double = js.native
    
    /* CompleteClass */
    override def getBalanceOfScript(script: String): js.Any = js.native
    
    /* CompleteClass */
    override def getHeadersChain(blockHeight: Double, confirmations: Double): String = js.native
    
    /* CompleteClass */
    override def getMerkleProof(txHash: String, blockHeight: Double): String = js.native
    
    /* CompleteClass */
    override def getMerkleRoot(blockHeight: Double): String = js.native
    
    /* CompleteClass */
    override def getTransaction(txHash: String): js.Any = js.native
    
    /* CompleteClass */
    override def getTransactionsForScript(script: String): js.Any = js.native
    
    /* CompleteClass */
    override def getUnspentToScript(script: String): js.Any = js.native
    
    /* CompleteClass */
    override def latestBlockHeight(): Double = js.native
    
    /* CompleteClass */
    override def onNewBlock(callback: js.Function1[/* block */ js.Any, Unit]): js.Any = js.native
    
    /* CompleteClass */
    override def onTransactionToScript(script: String, callback: js.Function1[/* state */ js.Any, Unit]): js.Any = js.native
  }
  
  trait Client extends StObject {
    
    def broadcastTransaction(rawTX: String): String
    
    def close(): js.Promise[Unit]
    
    def connect(): js.Promise[Unit]
    
    var electrumClient: js.Any
    
    def findOutputForAddress(txHash: String, address: String): Double
    
    def getBalanceOfScript(script: String): js.Any
    
    def getHeadersChain(blockHeight: Double, confirmations: Double): String
    
    def getMerkleProof(txHash: String, blockHeight: Double): String
    
    def getMerkleRoot(blockHeight: Double): String
    
    def getTransaction(txHash: String): js.Any
    
    def getTransactionsForScript(script: String): js.Any
    
    def getUnspentToScript(script: String): js.Any
    
    def latestBlockHeight(): Double
    
    def onNewBlock(callback: js.Function1[/* block */ js.Any, Unit]): js.Any
    
    def onTransactionToScript(script: String, callback: js.Function1[/* state */ js.Any, Unit]): js.Any
  }
  object Client {
    
    inline def apply(
      broadcastTransaction: String => String,
      close: () => js.Promise[Unit],
      connect: () => js.Promise[Unit],
      electrumClient: js.Any,
      findOutputForAddress: (String, String) => Double,
      getBalanceOfScript: String => js.Any,
      getHeadersChain: (Double, Double) => String,
      getMerkleProof: (String, Double) => String,
      getMerkleRoot: Double => String,
      getTransaction: String => js.Any,
      getTransactionsForScript: String => js.Any,
      getUnspentToScript: String => js.Any,
      latestBlockHeight: () => Double,
      onNewBlock: js.Function1[/* block */ js.Any, Unit] => js.Any,
      onTransactionToScript: (String, js.Function1[/* state */ js.Any, Unit]) => js.Any
    ): Client = {
      val __obj = js.Dynamic.literal(broadcastTransaction = js.Any.fromFunction1(broadcastTransaction), close = js.Any.fromFunction0(close), connect = js.Any.fromFunction0(connect), electrumClient = electrumClient.asInstanceOf[js.Any], findOutputForAddress = js.Any.fromFunction2(findOutputForAddress), getBalanceOfScript = js.Any.fromFunction1(getBalanceOfScript), getHeadersChain = js.Any.fromFunction2(getHeadersChain), getMerkleProof = js.Any.fromFunction2(getMerkleProof), getMerkleRoot = js.Any.fromFunction1(getMerkleRoot), getTransaction = js.Any.fromFunction1(getTransaction), getTransactionsForScript = js.Any.fromFunction1(getTransactionsForScript), getUnspentToScript = js.Any.fromFunction1(getUnspentToScript), latestBlockHeight = js.Any.fromFunction0(latestBlockHeight), onNewBlock = js.Any.fromFunction1(onNewBlock), onTransactionToScript = js.Any.fromFunction2(onTransactionToScript))
      __obj.asInstanceOf[Client]
    }
    
    extension [Self <: Client](x: Self) {
      
      inline def setBroadcastTransaction(value: String => String): Self = StObject.set(x, "broadcastTransaction", js.Any.fromFunction1(value))
      
      inline def setClose(value: () => js.Promise[Unit]): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setConnect(value: () => js.Promise[Unit]): Self = StObject.set(x, "connect", js.Any.fromFunction0(value))
      
      inline def setElectrumClient(value: js.Any): Self = StObject.set(x, "electrumClient", value.asInstanceOf[js.Any])
      
      inline def setFindOutputForAddress(value: (String, String) => Double): Self = StObject.set(x, "findOutputForAddress", js.Any.fromFunction2(value))
      
      inline def setGetBalanceOfScript(value: String => js.Any): Self = StObject.set(x, "getBalanceOfScript", js.Any.fromFunction1(value))
      
      inline def setGetHeadersChain(value: (Double, Double) => String): Self = StObject.set(x, "getHeadersChain", js.Any.fromFunction2(value))
      
      inline def setGetMerkleProof(value: (String, Double) => String): Self = StObject.set(x, "getMerkleProof", js.Any.fromFunction2(value))
      
      inline def setGetMerkleRoot(value: Double => String): Self = StObject.set(x, "getMerkleRoot", js.Any.fromFunction1(value))
      
      inline def setGetTransaction(value: String => js.Any): Self = StObject.set(x, "getTransaction", js.Any.fromFunction1(value))
      
      inline def setGetTransactionsForScript(value: String => js.Any): Self = StObject.set(x, "getTransactionsForScript", js.Any.fromFunction1(value))
      
      inline def setGetUnspentToScript(value: String => js.Any): Self = StObject.set(x, "getUnspentToScript", js.Any.fromFunction1(value))
      
      inline def setLatestBlockHeight(value: () => Double): Self = StObject.set(x, "latestBlockHeight", js.Any.fromFunction0(value))
      
      inline def setOnNewBlock(value: js.Function1[/* block */ js.Any, Unit] => js.Any): Self = StObject.set(x, "onNewBlock", js.Any.fromFunction1(value))
      
      inline def setOnTransactionToScript(value: (String, js.Function1[/* state */ js.Any, Unit]) => js.Any): Self = StObject.set(x, "onTransactionToScript", js.Any.fromFunction2(value))
    }
  }
  
  trait Config extends StObject {
    
    var options: js.UndefOr[js.Any] = js.undefined
    
    var port: Double
    
    var protocol: ssl | tls | ws | wss
    
    var server: String
  }
  object Config {
    
    inline def apply(port: Double, protocol: ssl | tls | ws | wss, server: String): Config = {
      val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: ssl | tls | ws | wss): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setServer(value: String): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    }
  }
}
