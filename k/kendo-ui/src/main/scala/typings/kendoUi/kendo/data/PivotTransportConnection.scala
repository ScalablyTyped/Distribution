package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotTransportConnection extends StObject {
  
  var catalog: js.UndefOr[String] = js.undefined
  
  var cube: js.UndefOr[String] = js.undefined
}
object PivotTransportConnection {
  
  @scala.inline
  def apply(): PivotTransportConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotTransportConnection]
  }
  
  @scala.inline
  implicit class PivotTransportConnectionMutableBuilder[Self <: PivotTransportConnection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatalog(value: String): Self = StObject.set(x, "catalog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogUndefined: Self = StObject.set(x, "catalog", js.undefined)
    
    @scala.inline
    def setCube(value: String): Self = StObject.set(x, "cube", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCubeUndefined: Self = StObject.set(x, "cube", js.undefined)
  }
}
