package typings.googleapis.lifesciencesV2betaMod.lifesciencesV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDisk extends StObject {
  
  /**
    * A user-supplied name for the disk. Used when mounting the disk into actions. The name must contain only upper and lowercase alphanumeric characters and hyphens and cannot start with a hyphen.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The size, in GB, of the disk to attach. If the size is not specified, a default is chosen to ensure reasonable I/O performance. If the disk type is specified as `local-ssd`, multiple local drives are automatically combined to provide the requested size. Note, however, that each physical SSD is 375GB in size, and no more than 8 drives can be attached to a single instance.
    */
  var sizeGb: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * An optional image to put on the disk before attaching it to the VM.
    */
  var sourceImage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Compute Engine disk type. If unspecified, `pd-standard` is used.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaDisk {
  
  inline def apply(): SchemaDisk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDisk]
  }
  
  extension [Self <: SchemaDisk](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSizeGb(value: Double): Self = StObject.set(x, "sizeGb", value.asInstanceOf[js.Any])
    
    inline def setSizeGbNull: Self = StObject.set(x, "sizeGb", null)
    
    inline def setSizeGbUndefined: Self = StObject.set(x, "sizeGb", js.undefined)
    
    inline def setSourceImage(value: String): Self = StObject.set(x, "sourceImage", value.asInstanceOf[js.Any])
    
    inline def setSourceImageNull: Self = StObject.set(x, "sourceImage", null)
    
    inline def setSourceImageUndefined: Self = StObject.set(x, "sourceImage", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
