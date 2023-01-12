package typings.lokijs.anon

import typings.lokijs.DeserializeOptions
import typings.lokijs.lokijsBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Delimited
  extends StObject
     with DeserializeOptions {
  
  var delimited: `false`
  
  var delimiter: js.UndefOr[String] = js.undefined
  
  var partition: js.UndefOr[Double] = js.undefined
  
  var partitioned: js.UndefOr[Boolean] = js.undefined
}
object Delimited {
  
  inline def apply(): Delimited = {
    val __obj = js.Dynamic.literal(delimited = false)
    __obj.asInstanceOf[Delimited]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Delimited] (val x: Self) extends AnyVal {
    
    inline def setDelimited(value: `false`): Self = StObject.set(x, "delimited", value.asInstanceOf[js.Any])
    
    inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
    
    inline def setPartition(value: Double): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
    
    inline def setPartitionUndefined: Self = StObject.set(x, "partition", js.undefined)
    
    inline def setPartitioned(value: Boolean): Self = StObject.set(x, "partitioned", value.asInstanceOf[js.Any])
    
    inline def setPartitionedUndefined: Self = StObject.set(x, "partitioned", js.undefined)
  }
}
