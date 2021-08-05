package typings.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies how to attach a disk to a Replica.
  */
trait SchemaDiskAttachment extends StObject {
  
  /**
    * The device name of this disk.
    */
  var deviceName: js.UndefOr[String] = js.undefined
  
  /**
    * A zero-based index to assign to this disk, where 0 is reserved for the
    * boot disk. If not specified, this is assigned by the server.
    */
  var index: js.UndefOr[Double] = js.undefined
}
object SchemaDiskAttachment {
  
  inline def apply(): SchemaDiskAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDiskAttachment]
  }
  
  extension [Self <: SchemaDiskAttachment](x: Self) {
    
    inline def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    inline def setDeviceNameUndefined: Self = StObject.set(x, "deviceName", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
  }
}
