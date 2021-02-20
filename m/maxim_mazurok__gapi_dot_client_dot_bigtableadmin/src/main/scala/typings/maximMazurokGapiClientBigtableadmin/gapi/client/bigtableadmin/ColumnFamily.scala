package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnFamily extends StObject {
  
  /**
    * Garbage collection rule specified as a protobuf. Must serialize to at most 500 bytes. NOTE: Garbage collection executes opportunistically in the background, and so it's possible for
    * reads to return a cell even if it matches the active GC expression for its family.
    */
  var gcRule: js.UndefOr[GcRule] = js.native
}
object ColumnFamily {
  
  @scala.inline
  def apply(): ColumnFamily = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnFamily]
  }
  
  @scala.inline
  implicit class ColumnFamilyMutableBuilder[Self <: ColumnFamily] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGcRule(value: GcRule): Self = StObject.set(x, "gcRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcRuleUndefined: Self = StObject.set(x, "gcRule", js.undefined)
  }
}
