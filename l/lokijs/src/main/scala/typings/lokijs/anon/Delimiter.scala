package typings.lokijs.anon

import typings.lokijs.DeserializeOptions
import typings.lokijs.lokijsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Delimiter
  extends StObject
     with DeserializeOptions {
  
  var delimited: js.UndefOr[`true`] = js.undefined
  
  var delimiter: String
  
  var partition: js.UndefOr[Double] = js.undefined
  
  var partitioned: js.UndefOr[Boolean] = js.undefined
}
object Delimiter {
  
  @scala.inline
  def apply(delimiter: String): Delimiter = {
    val __obj = js.Dynamic.literal(delimiter = delimiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delimiter]
  }
  
  @scala.inline
  implicit class DelimiterMutableBuilder[Self <: Delimiter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelimited(value: `true`): Self = StObject.set(x, "delimited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelimitedUndefined: Self = StObject.set(x, "delimited", js.undefined)
    
    @scala.inline
    def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
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
