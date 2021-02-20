package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrintObjects extends StObject {
  
  var `document-number`: js.UndefOr[Double] = js.native
  
  var `object-offset`: js.UndefOr[ObjectOffset] = js.native
  
  var `object-size`: js.UndefOr[ObjectSize] = js.native
  
  var `object-uuid`: js.UndefOr[String] = js.native
}
object PrintObjects {
  
  @scala.inline
  def apply(): PrintObjects = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrintObjects]
  }
  
  @scala.inline
  implicit class PrintObjectsMutableBuilder[Self <: PrintObjects] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setDocument-number`(value: Double): Self = StObject.set(x, "document-number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDocument-numberUndefined`: Self = StObject.set(x, "document-number", js.undefined)
    
    @scala.inline
    def `setObject-offset`(value: ObjectOffset): Self = StObject.set(x, "object-offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setObject-offsetUndefined`: Self = StObject.set(x, "object-offset", js.undefined)
    
    @scala.inline
    def `setObject-size`(value: ObjectSize): Self = StObject.set(x, "object-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setObject-sizeUndefined`: Self = StObject.set(x, "object-size", js.undefined)
    
    @scala.inline
    def `setObject-uuid`(value: String): Self = StObject.set(x, "object-uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setObject-uuidUndefined`: Self = StObject.set(x, "object-uuid", js.undefined)
  }
}
