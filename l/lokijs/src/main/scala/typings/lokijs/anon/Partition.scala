package typings.lokijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Partition extends StObject {
  
  var delimited: js.UndefOr[Boolean] = js.undefined
  
  var delimiter: js.UndefOr[String] = js.undefined
  
  var partition: js.UndefOr[Double] = js.undefined
  
  var partitioned: js.UndefOr[Boolean] = js.undefined
}
object Partition {
  
  @scala.inline
  def apply(): Partition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partition]
  }
  
  @scala.inline
  implicit class PartitionMutableBuilder[Self <: Partition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelimited(value: Boolean): Self = StObject.set(x, "delimited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelimitedUndefined: Self = StObject.set(x, "delimited", js.undefined)
    
    @scala.inline
    def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
    
    @scala.inline
    def setPartition(value: Double): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionUndefined: Self = StObject.set(x, "partition", js.undefined)
    
    @scala.inline
    def setPartitioned(value: Boolean): Self = StObject.set(x, "partitioned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionedUndefined: Self = StObject.set(x, "partitioned", js.undefined)
  }
}
