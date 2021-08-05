package typings.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Initialization parameters for creating a new disk.
  */
trait SchemaNewDiskInitializeParams extends StObject {
  
  /**
    * The size of the created disk in gigabytes.
    */
  var diskSizeGb: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the disk type resource describing which disk type to use to
    * create the disk. For example &#39;pd-ssd&#39; or &#39;pd-standard&#39;.
    * Default is &#39;pd-standard&#39;
    */
  var diskType: js.UndefOr[String] = js.undefined
  
  /**
    * The name or fully-qualified URL of a source image to use to create this
    * disk. If you provide a name of the source image, Replica Pool will look
    * for an image with that name in your project. If you are specifying an
    * image provided by Compute Engine, you will need to provide the full URL
    * with the correct project, such as:
    * http://www.googleapis.com/compute/v1/projects/debian-cloud/
    * global/images/debian-wheezy-7-vYYYYMMDD
    */
  var sourceImage: js.UndefOr[String] = js.undefined
}
object SchemaNewDiskInitializeParams {
  
  inline def apply(): SchemaNewDiskInitializeParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNewDiskInitializeParams]
  }
  
  extension [Self <: SchemaNewDiskInitializeParams](x: Self) {
    
    inline def setDiskSizeGb(value: String): Self = StObject.set(x, "diskSizeGb", value.asInstanceOf[js.Any])
    
    inline def setDiskSizeGbUndefined: Self = StObject.set(x, "diskSizeGb", js.undefined)
    
    inline def setDiskType(value: String): Self = StObject.set(x, "diskType", value.asInstanceOf[js.Any])
    
    inline def setDiskTypeUndefined: Self = StObject.set(x, "diskType", js.undefined)
    
    inline def setSourceImage(value: String): Self = StObject.set(x, "sourceImage", value.asInstanceOf[js.Any])
    
    inline def setSourceImageUndefined: Self = StObject.set(x, "sourceImage", js.undefined)
  }
}
