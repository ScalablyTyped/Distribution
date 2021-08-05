package typings.lokijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Partitioned extends StObject {
  
  var delimited: js.UndefOr[Boolean] = js.undefined
  
  var delimiter: js.UndefOr[String] = js.undefined
  
  var partitioned: js.UndefOr[Boolean] = js.undefined
}
object Partitioned {
  
  inline def apply(): Partitioned = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partitioned]
  }
  
  extension [Self <: Partitioned](x: Self) {
    
    inline def setDelimited(value: Boolean): Self = StObject.set(x, "delimited", value.asInstanceOf[js.Any])
    
    inline def setDelimitedUndefined: Self = StObject.set(x, "delimited", js.undefined)
    
    inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
    
    inline def setPartitioned(value: Boolean): Self = StObject.set(x, "partitioned", value.asInstanceOf[js.Any])
    
    inline def setPartitionedUndefined: Self = StObject.set(x, "partitioned", js.undefined)
  }
}
