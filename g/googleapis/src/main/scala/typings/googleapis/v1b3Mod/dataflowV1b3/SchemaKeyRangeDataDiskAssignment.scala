package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Data disk assignment information for a specific key-range of a sharded
  * computation. Currently we only support UTF-8 character splits to simplify
  * encoding into JSON.
  */
trait SchemaKeyRangeDataDiskAssignment extends StObject {
  
  /**
    * The name of the data disk where data for this range is stored. This name
    * is local to the Google Cloud Platform project and uniquely identifies the
    * disk within that project, for example
    * &quot;myproject-1014-104817-4c2-harness-0-disk-1&quot;.
    */
  var dataDisk: js.UndefOr[String] = js.undefined
  
  /**
    * The end (exclusive) of the key range.
    */
  var end: js.UndefOr[String] = js.undefined
  
  /**
    * The start (inclusive) of the key range.
    */
  var start: js.UndefOr[String] = js.undefined
}
object SchemaKeyRangeDataDiskAssignment {
  
  inline def apply(): SchemaKeyRangeDataDiskAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaKeyRangeDataDiskAssignment]
  }
  
  extension [Self <: SchemaKeyRangeDataDiskAssignment](x: Self) {
    
    inline def setDataDisk(value: String): Self = StObject.set(x, "dataDisk", value.asInstanceOf[js.Any])
    
    inline def setDataDiskUndefined: Self = StObject.set(x, "dataDisk", js.undefined)
    
    inline def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
