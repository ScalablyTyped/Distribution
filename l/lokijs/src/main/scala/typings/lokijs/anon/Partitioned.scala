package typings.lokijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Partitioned extends StObject {
  
  var delimited: js.UndefOr[Boolean] = js.native
  
  var delimiter: js.UndefOr[String] = js.native
  
  var partitioned: js.UndefOr[Boolean] = js.native
}
object Partitioned {
  
  @scala.inline
  def apply(): Partitioned = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partitioned]
  }
  
  @scala.inline
  implicit class PartitionedMutableBuilder[Self <: Partitioned] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelimited(value: Boolean): Self = StObject.set(x, "delimited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelimitedUndefined: Self = StObject.set(x, "delimited", js.undefined)
    
    @scala.inline
    def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
    
    @scala.inline
    def setPartitioned(value: Boolean): Self = StObject.set(x, "partitioned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionedUndefined: Self = StObject.set(x, "partitioned", js.undefined)
  }
}
