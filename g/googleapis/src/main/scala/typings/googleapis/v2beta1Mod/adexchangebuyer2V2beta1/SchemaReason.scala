package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A specific filtering status and how many times it occurred.
  */
trait SchemaReason extends StObject {
  
  /**
    * The number of times the creative was filtered for the status. The count
    * is aggregated across all publishers on the exchange.
    */
  var count: js.UndefOr[String] = js.undefined
  
  /**
    * The filtering status code. Please refer to the
    * [creative-status-codes.txt](https://storage.googleapis.com/adx-rtb-dictionaries/creative-status-codes.txt)
    * file for different statuses.
    */
  var status: js.UndefOr[Double] = js.undefined
}
object SchemaReason {
  
  @scala.inline
  def apply(): SchemaReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReason]
  }
  
  @scala.inline
  implicit class SchemaReasonMutableBuilder[Self <: SchemaReason] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
