package typings.kafkaNode.mod

import typings.kafkaNode.kafkaNodeStrings.buffer
import typings.kafkaNode.kafkaNodeStrings.utf8
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConsumerOptions extends StObject {
  
  var autoCommit: js.UndefOr[Boolean] = js.native
  
  var autoCommitIntervalMs: js.UndefOr[Double] = js.native
  
  var encoding: js.UndefOr[buffer | utf8] = js.native
  
  var fetchMaxBytes: js.UndefOr[Double] = js.native
  
  var fetchMaxWaitMs: js.UndefOr[Double] = js.native
  
  var fetchMinBytes: js.UndefOr[Double] = js.native
  
  var fromOffset: js.UndefOr[Boolean] = js.native
  
  var groupId: js.UndefOr[String] = js.native
  
  var keyEncoding: js.UndefOr[buffer | utf8] = js.native
}
object ConsumerOptions {
  
  @scala.inline
  def apply(): ConsumerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsumerOptions]
  }
  
  @scala.inline
  implicit class ConsumerOptionsMutableBuilder[Self <: ConsumerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoCommit(value: Boolean): Self = StObject.set(x, "autoCommit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCommitIntervalMs(value: Double): Self = StObject.set(x, "autoCommitIntervalMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCommitIntervalMsUndefined: Self = StObject.set(x, "autoCommitIntervalMs", js.undefined)
    
    @scala.inline
    def setAutoCommitUndefined: Self = StObject.set(x, "autoCommit", js.undefined)
    
    @scala.inline
    def setEncoding(value: buffer | utf8): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    @scala.inline
    def setFetchMaxBytes(value: Double): Self = StObject.set(x, "fetchMaxBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetchMaxBytesUndefined: Self = StObject.set(x, "fetchMaxBytes", js.undefined)
    
    @scala.inline
    def setFetchMaxWaitMs(value: Double): Self = StObject.set(x, "fetchMaxWaitMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetchMaxWaitMsUndefined: Self = StObject.set(x, "fetchMaxWaitMs", js.undefined)
    
    @scala.inline
    def setFetchMinBytes(value: Double): Self = StObject.set(x, "fetchMinBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetchMinBytesUndefined: Self = StObject.set(x, "fetchMinBytes", js.undefined)
    
    @scala.inline
    def setFromOffset(value: Boolean): Self = StObject.set(x, "fromOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromOffsetUndefined: Self = StObject.set(x, "fromOffset", js.undefined)
    
    @scala.inline
    def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
    
    @scala.inline
    def setKeyEncoding(value: buffer | utf8): Self = StObject.set(x, "keyEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyEncodingUndefined: Self = StObject.set(x, "keyEncoding", js.undefined)
  }
}
