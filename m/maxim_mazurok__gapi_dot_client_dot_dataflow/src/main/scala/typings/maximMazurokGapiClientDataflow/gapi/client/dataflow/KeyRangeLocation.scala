package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyRangeLocation extends StObject {
  
  /**
    * The name of the data disk where data for this range is stored. This name is local to the Google Cloud Platform project and uniquely identifies the disk within that project, for
    * example "myproject-1014-104817-4c2-harness-0-disk-1".
    */
  var dataDisk: js.UndefOr[String] = js.undefined
  
  /** The physical location of this range assignment to be used for streaming computation cross-worker message delivery. */
  var deliveryEndpoint: js.UndefOr[String] = js.undefined
  
  /** DEPRECATED. The location of the persistent state for this range, as a persistent directory in the worker local filesystem. */
  var deprecatedPersistentDirectory: js.UndefOr[String] = js.undefined
  
  /** The end (exclusive) of the key range. */
  var end: js.UndefOr[String] = js.undefined
  
  /** The start (inclusive) of the key range. */
  var start: js.UndefOr[String] = js.undefined
}
object KeyRangeLocation {
  
  inline def apply(): KeyRangeLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyRangeLocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyRangeLocation] (val x: Self) extends AnyVal {
    
    inline def setDataDisk(value: String): Self = StObject.set(x, "dataDisk", value.asInstanceOf[js.Any])
    
    inline def setDataDiskUndefined: Self = StObject.set(x, "dataDisk", js.undefined)
    
    inline def setDeliveryEndpoint(value: String): Self = StObject.set(x, "deliveryEndpoint", value.asInstanceOf[js.Any])
    
    inline def setDeliveryEndpointUndefined: Self = StObject.set(x, "deliveryEndpoint", js.undefined)
    
    inline def setDeprecatedPersistentDirectory(value: String): Self = StObject.set(x, "deprecatedPersistentDirectory", value.asInstanceOf[js.Any])
    
    inline def setDeprecatedPersistentDirectoryUndefined: Self = StObject.set(x, "deprecatedPersistentDirectory", js.undefined)
    
    inline def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
