package typings.googleapis.genomicsV1alpha2Mod.genomicsV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLocalCopy extends StObject {
  
  /**
    * Required. The name of the disk where this parameter is located. Can be the name of one of the disks specified in the Resources field, or "boot", which represents the Docker instance's boot disk and has a mount point of `/`.
    */
  var disk: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The path within the user's docker container where this input should be localized to and from, relative to the specified disk's mount point. For example: file.txt,
    */
  var path: js.UndefOr[String | Null] = js.undefined
}
object SchemaLocalCopy {
  
  inline def apply(): SchemaLocalCopy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLocalCopy]
  }
  
  extension [Self <: SchemaLocalCopy](x: Self) {
    
    inline def setDisk(value: String): Self = StObject.set(x, "disk", value.asInstanceOf[js.Any])
    
    inline def setDiskNull: Self = StObject.set(x, "disk", null)
    
    inline def setDiskUndefined: Self = StObject.set(x, "disk", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathNull: Self = StObject.set(x, "path", null)
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
