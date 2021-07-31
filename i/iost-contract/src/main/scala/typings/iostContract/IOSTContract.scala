package typings.iostContract

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IOSTContract {
  
  trait Block extends StObject {
    
    var number: Double
    
    var parent_hash: String
    
    var time: Double
    
    var witness: String
  }
  object Block {
    
    @scala.inline
    def apply(number: Double, parent_hash: String, time: Double, witness: String): Block = {
      val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any], parent_hash = parent_hash.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], witness = witness.asInstanceOf[js.Any])
      __obj.asInstanceOf[Block]
    }
    
    @scala.inline
    implicit class BlockMutableBuilder[Self <: Block] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParent_hash(value: String): Self = StObject.set(x, "parent_hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWitness(value: String): Self = StObject.set(x, "witness", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Blockchain extends StObject {
    
    def call(contract: String, abi: String, args: String): js.Array[String] = js.native
    def call(contract: String, abi: String, args: js.Array[String]): js.Array[String] = js.native
    
    def callWithAuth(contract: String, abi: String, args: String): js.Array[String] = js.native
    def callWithAuth(contract: String, abi: String, args: js.Array[String]): js.Array[String] = js.native
    
    def contractName(): String = js.native
    
    def contractOwner(): String = js.native
    
    def deposit(from: String, amount: String, memo: String): Unit = js.native
    
    def event(data: String): Unit = js.native
    
    def publisher(): String = js.native
    
    def receipt(data: String): Unit = js.native
    
    def requireAuth(account: String, permission: String): Boolean = js.native
    
    def transfer(from: String, to: String, amount: String, memo: String): Unit = js.native
    
    def withdraw(to: String, amount: String, memo: String): Unit = js.native
  }
  
  trait GlobalStorage extends StObject {
    
    def globalGet(contract: String, key: String): String | Null
    
    def globalHas(contract: String, key: String): Boolean
    
    def globalMapGet(contract: String, key: String, field: String): String | Null
    
    def globalMapHas(contract: String, key: String, field: String): Boolean
    
    def globalMapKeys(contract: String, key: String): js.Array[String]
    
    def globalMapLen(contract: String, key: String): Double
  }
  object GlobalStorage {
    
    @scala.inline
    def apply(
      globalGet: (String, String) => String | Null,
      globalHas: (String, String) => Boolean,
      globalMapGet: (String, String, String) => String | Null,
      globalMapHas: (String, String, String) => Boolean,
      globalMapKeys: (String, String) => js.Array[String],
      globalMapLen: (String, String) => Double
    ): GlobalStorage = {
      val __obj = js.Dynamic.literal(globalGet = js.Any.fromFunction2(globalGet), globalHas = js.Any.fromFunction2(globalHas), globalMapGet = js.Any.fromFunction3(globalMapGet), globalMapHas = js.Any.fromFunction3(globalMapHas), globalMapKeys = js.Any.fromFunction2(globalMapKeys), globalMapLen = js.Any.fromFunction2(globalMapLen))
      __obj.asInstanceOf[GlobalStorage]
    }
    
    @scala.inline
    implicit class GlobalStorageMutableBuilder[Self <: GlobalStorage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGlobalGet(value: (String, String) => String | Null): Self = StObject.set(x, "globalGet", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGlobalHas(value: (String, String) => Boolean): Self = StObject.set(x, "globalHas", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGlobalMapGet(value: (String, String, String) => String | Null): Self = StObject.set(x, "globalMapGet", js.Any.fromFunction3(value))
      
      @scala.inline
      def setGlobalMapHas(value: (String, String, String) => Boolean): Self = StObject.set(x, "globalMapHas", js.Any.fromFunction3(value))
      
      @scala.inline
      def setGlobalMapKeys(value: (String, String) => js.Array[String]): Self = StObject.set(x, "globalMapKeys", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGlobalMapLen(value: (String, String) => Double): Self = StObject.set(x, "globalMapLen", js.Any.fromFunction2(value))
    }
  }
  
  trait IOSTCrypto extends StObject {
    
    def sha3(data: String): String
    
    def verify(algo: String, message: String, signature: String, pubkey: String): Double
  }
  object IOSTCrypto {
    
    @scala.inline
    def apply(sha3: String => String, verify: (String, String, String, String) => Double): IOSTCrypto = {
      val __obj = js.Dynamic.literal(sha3 = js.Any.fromFunction1(sha3), verify = js.Any.fromFunction4(verify))
      __obj.asInstanceOf[IOSTCrypto]
    }
    
    @scala.inline
    implicit class IOSTCryptoMutableBuilder[Self <: IOSTCrypto] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSha3(value: String => String): Self = StObject.set(x, "sha3", js.Any.fromFunction1(value))
      
      @scala.inline
      def setVerify(value: (String, String, String, String) => Double): Self = StObject.set(x, "verify", js.Any.fromFunction4(value))
    }
  }
  
  @js.native
  trait LocalStorage extends StObject {
    
    def del(key: String): Unit = js.native
    
    def get(key: String): String | Null = js.native
    
    def has(key: String): Boolean = js.native
    
    def mapDel(key: String, field: String): Unit = js.native
    
    def mapGet(key: String, field: String): String | Null = js.native
    
    def mapHas(key: String, field: String): Boolean = js.native
    
    def mapKeys(key: String): js.Array[String] = js.native
    
    def mapLen(key: String): Double = js.native
    
    def mapPut(key: String, field: String, value: String): Unit = js.native
    def mapPut(key: String, field: String, value: String, payer: String): Unit = js.native
    
    def put(key: String, value: String): js.Any = js.native
    def put(key: String, value: String, payer: String): js.Any = js.native
  }
  
  @js.native
  trait Storage
    extends StObject
       with LocalStorage
       with GlobalStorage
  
  trait Tx extends StObject {
    
    var auth_list: js.Object
    
    var expiration: Double
    
    var gas_limit: Double
    
    var gas_ratio: Double
    
    var hash: String
    
    var publisher: String
    
    var time: Double
  }
  object Tx {
    
    @scala.inline
    def apply(
      auth_list: js.Object,
      expiration: Double,
      gas_limit: Double,
      gas_ratio: Double,
      hash: String,
      publisher: String,
      time: Double
    ): Tx = {
      val __obj = js.Dynamic.literal(auth_list = auth_list.asInstanceOf[js.Any], expiration = expiration.asInstanceOf[js.Any], gas_limit = gas_limit.asInstanceOf[js.Any], gas_ratio = gas_ratio.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tx]
    }
    
    @scala.inline
    implicit class TxMutableBuilder[Self <: Tx] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuth_list(value: js.Object): Self = StObject.set(x, "auth_list", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiration(value: Double): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGas_limit(value: Double): Self = StObject.set(x, "gas_limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGas_ratio(value: Double): Self = StObject.set(x, "gas_ratio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
}
