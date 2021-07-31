package typings.limeJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Envelope extends StObject {
  
  var from: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var metadata: js.UndefOr[js.Any] = js.undefined
  
  var pp: js.UndefOr[String] = js.undefined
  
  var to: js.UndefOr[String] = js.undefined
}
object Envelope {
  
  @scala.inline
  def apply(): Envelope = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Envelope]
  }
  
  @scala.inline
  implicit class EnvelopeMutableBuilder[Self <: Envelope] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setMetadata(value: js.Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setPp(value: String): Self = StObject.set(x, "pp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPpUndefined: Self = StObject.set(x, "pp", js.undefined)
    
    @scala.inline
    def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
