package typings.ioredis

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.ioredis.ioredisStrings.all_
import typings.ioredis.ioredisStrings.master_
import typings.node.dnsMod.SrvRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("ioredis/built/cluster/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getConnectionName(component: Any, nodeConnectionName: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getConnectionName")(component.asInstanceOf[js.Any], nodeConnectionName.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getNodeKey(node: RedisOptions): NodeKey = ^.asInstanceOf[js.Dynamic].applyDynamic("getNodeKey")(node.asInstanceOf[js.Any]).asInstanceOf[NodeKey]
  
  inline def getUniqueHostnamesFromOptions(nodes: js.Array[RedisOptions]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUniqueHostnamesFromOptions")(nodes.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def groupSrvRecords(records: js.Array[SrvRecord]): GroupedSrvRecords = ^.asInstanceOf[js.Dynamic].applyDynamic("groupSrvRecords")(records.asInstanceOf[js.Any]).asInstanceOf[GroupedSrvRecords]
  
  inline def nodeKeyToRedisOptions(nodeKey: NodeKey): RedisOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeKeyToRedisOptions")(nodeKey.asInstanceOf[js.Any]).asInstanceOf[RedisOptions]
  
  inline def normalizeNodeOptions(nodes: js.Array[String | Double | js.Object]): js.Array[RedisOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeNodeOptions")(nodes.asInstanceOf[js.Any]).asInstanceOf[js.Array[RedisOptions]]
  
  inline def weightSrvRecords(recordsGroup: SrvRecordsGroup): SrvRecord = ^.asInstanceOf[js.Dynamic].applyDynamic("weightSrvRecords")(recordsGroup.asInstanceOf[js.Any]).asInstanceOf[SrvRecord]
  
  type GroupedSrvRecords = NumberDictionary[SrvRecordsGroup]
  
  type NodeKey = String
  
  /* Rewritten from type alias, can be one of: 
    - typings.ioredis.ioredisStrings.master_
    - typings.ioredis.ioredisStrings.slave
    - typings.ioredis.ioredisStrings.all_
  */
  trait NodeRole extends StObject
  object NodeRole {
    
    inline def all: all_ = "all".asInstanceOf[all_]
    
    inline def master: master_ = "master".asInstanceOf[master_]
    
    inline def slave: typings.ioredis.ioredisStrings.slave = "slave".asInstanceOf[typings.ioredis.ioredisStrings.slave]
  }
  
  trait RedisOptions
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var host: String
    
    var password: js.UndefOr[String] = js.undefined
    
    var port: Double
    
    var username: js.UndefOr[String] = js.undefined
  }
  object RedisOptions {
    
    inline def apply(host: String, port: Double): RedisOptions = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[RedisOptions]
    }
    
    extension [Self <: RedisOptions](x: Self) {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
  
  trait SrvRecordsGroup extends StObject {
    
    var records: js.Array[SrvRecord]
    
    var totalWeight: Double
  }
  object SrvRecordsGroup {
    
    inline def apply(records: js.Array[SrvRecord], totalWeight: Double): SrvRecordsGroup = {
      val __obj = js.Dynamic.literal(records = records.asInstanceOf[js.Any], totalWeight = totalWeight.asInstanceOf[js.Any])
      __obj.asInstanceOf[SrvRecordsGroup]
    }
    
    extension [Self <: SrvRecordsGroup](x: Self) {
      
      inline def setRecords(value: js.Array[SrvRecord]): Self = StObject.set(x, "records", value.asInstanceOf[js.Any])
      
      inline def setRecordsVarargs(value: SrvRecord*): Self = StObject.set(x, "records", js.Array(value*))
      
      inline def setTotalWeight(value: Double): Self = StObject.set(x, "totalWeight", value.asInstanceOf[js.Any])
    }
  }
}
