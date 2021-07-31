package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyRangeDataDiskAssignment extends StObject {
  
  /**
    * The name of the data disk where data for this range is stored. This name is local to the Google Cloud Platform project and uniquely identifies the disk within that project, for
    * example "myproject-1014-104817-4c2-harness-0-disk-1".
    */
  var dataDisk: js.UndefOr[String] = js.undefined
  
  /** The end (exclusive) of the key range. */
  var end: js.UndefOr[String] = js.undefined
  
  /** The start (inclusive) of the key range. */
  var start: js.UndefOr[String] = js.undefined
}
object KeyRangeDataDiskAssignment {
  
  @scala.inline
  def apply(): KeyRangeDataDiskAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyRangeDataDiskAssignment]
  }
  
  @scala.inline
  implicit class KeyRangeDataDiskAssignmentMutableBuilder[Self <: KeyRangeDataDiskAssignment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataDisk(value: String): Self = StObject.set(x, "dataDisk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataDiskUndefined: Self = StObject.set(x, "dataDisk", js.undefined)
    
    @scala.inline
    def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
