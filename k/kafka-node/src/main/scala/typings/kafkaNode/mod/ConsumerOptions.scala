package typings.kafkaNode.mod

import typings.kafkaNode.kafkaNodeStrings.buffer
import typings.kafkaNode.kafkaNodeStrings.utf8
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsumerOptions extends StObject {
  
  var autoCommit: js.UndefOr[Boolean] = js.undefined
  
  var autoCommitIntervalMs: js.UndefOr[Double] = js.undefined
  
  var encoding: js.UndefOr[buffer | utf8] = js.undefined
  
  var fetchMaxBytes: js.UndefOr[Double] = js.undefined
  
  var fetchMaxWaitMs: js.UndefOr[Double] = js.undefined
  
  var fetchMinBytes: js.UndefOr[Double] = js.undefined
  
  var fromOffset: js.UndefOr[Boolean] = js.undefined
  
  var groupId: js.UndefOr[String] = js.undefined
  
  var keyEncoding: js.UndefOr[buffer | utf8] = js.undefined
}
object ConsumerOptions {
  
  inline def apply(): ConsumerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsumerOptions]
  }
  
  extension [Self <: ConsumerOptions](x: Self) {
    
    inline def setAutoCommit(value: Boolean): Self = StObject.set(x, "autoCommit", value.asInstanceOf[js.Any])
    
    inline def setAutoCommitIntervalMs(value: Double): Self = StObject.set(x, "autoCommitIntervalMs", value.asInstanceOf[js.Any])
    
    inline def setAutoCommitIntervalMsUndefined: Self = StObject.set(x, "autoCommitIntervalMs", js.undefined)
    
    inline def setAutoCommitUndefined: Self = StObject.set(x, "autoCommit", js.undefined)
    
    inline def setEncoding(value: buffer | utf8): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setFetchMaxBytes(value: Double): Self = StObject.set(x, "fetchMaxBytes", value.asInstanceOf[js.Any])
    
    inline def setFetchMaxBytesUndefined: Self = StObject.set(x, "fetchMaxBytes", js.undefined)
    
    inline def setFetchMaxWaitMs(value: Double): Self = StObject.set(x, "fetchMaxWaitMs", value.asInstanceOf[js.Any])
    
    inline def setFetchMaxWaitMsUndefined: Self = StObject.set(x, "fetchMaxWaitMs", js.undefined)
    
    inline def setFetchMinBytes(value: Double): Self = StObject.set(x, "fetchMinBytes", value.asInstanceOf[js.Any])
    
    inline def setFetchMinBytesUndefined: Self = StObject.set(x, "fetchMinBytes", js.undefined)
    
    inline def setFromOffset(value: Boolean): Self = StObject.set(x, "fromOffset", value.asInstanceOf[js.Any])
    
    inline def setFromOffsetUndefined: Self = StObject.set(x, "fromOffset", js.undefined)
    
    inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
    
    inline def setKeyEncoding(value: buffer | utf8): Self = StObject.set(x, "keyEncoding", value.asInstanceOf[js.Any])
    
    inline def setKeyEncodingUndefined: Self = StObject.set(x, "keyEncoding", js.undefined)
  }
}
