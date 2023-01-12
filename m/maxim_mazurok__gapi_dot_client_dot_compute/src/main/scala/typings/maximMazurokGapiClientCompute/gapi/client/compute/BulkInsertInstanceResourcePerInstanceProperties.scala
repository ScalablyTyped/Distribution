package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulkInsertInstanceResourcePerInstanceProperties extends StObject {
  
  /** This field is only temporary. It will be removed. Do not use it. */
  var name: js.UndefOr[String] = js.undefined
}
object BulkInsertInstanceResourcePerInstanceProperties {
  
  inline def apply(): BulkInsertInstanceResourcePerInstanceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkInsertInstanceResourcePerInstanceProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BulkInsertInstanceResourcePerInstanceProperties] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
