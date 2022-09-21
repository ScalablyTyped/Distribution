package typings.googleapis.genomicsV1Mod.genomicsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Carries information about a particular disk mount inside a container.
  */
trait SchemaMount extends StObject {
  
  /**
    * The name of the disk to mount, as specified in the resources section.
    */
  var disk: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The path to mount the disk inside the container.
    */
  var path: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If true, the disk is mounted read-only inside the container.
    */
  var readOnly: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaMount {
  
  inline def apply(): SchemaMount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMount]
  }
  
  extension [Self <: SchemaMount](x: Self) {
    
    inline def setDisk(value: String): Self = StObject.set(x, "disk", value.asInstanceOf[js.Any])
    
    inline def setDiskNull: Self = StObject.set(x, "disk", null)
    
    inline def setDiskUndefined: Self = StObject.set(x, "disk", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathNull: Self = StObject.set(x, "path", null)
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyNull: Self = StObject.set(x, "readOnly", null)
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
  }
}
