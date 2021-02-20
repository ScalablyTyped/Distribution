package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for a batch update failure resource.
  */
@js.native
trait SchemaEventBatchRecordFailure extends StObject {
  
  /**
    * The cause for the update failure. Possible values are:   -
    * &quot;TOO_LARGE&quot;: A batch request was issued with more events than
    * are allowed in a single batch.  - &quot;TIME_PERIOD_EXPIRED&quot;: A
    * batch was sent with data too far in the past to record.  -
    * &quot;TIME_PERIOD_SHORT&quot;: A batch was sent with a time range that
    * was too short.  - &quot;TIME_PERIOD_LONG&quot;: A batch was sent with a
    * time range that was too long.  - &quot;ALREADY_UPDATED&quot;: An attempt
    * was made to record a batch of data which was already seen.  -
    * &quot;RECORD_RATE_HIGH&quot;: An attempt was made to record data faster
    * than the server will apply updates.
    */
  var failureCause: js.UndefOr[String] = js.native
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#eventBatchRecordFailure.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The time range which was rejected; empty for a request-wide failure.
    */
  var range: js.UndefOr[SchemaEventPeriodRange] = js.native
}
object SchemaEventBatchRecordFailure {
  
  @scala.inline
  def apply(): SchemaEventBatchRecordFailure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEventBatchRecordFailure]
  }
  
  @scala.inline
  implicit class SchemaEventBatchRecordFailureMutableBuilder[Self <: SchemaEventBatchRecordFailure] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailureCause(value: String): Self = StObject.set(x, "failureCause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureCauseUndefined: Self = StObject.set(x, "failureCause", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setRange(value: SchemaEventPeriodRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
