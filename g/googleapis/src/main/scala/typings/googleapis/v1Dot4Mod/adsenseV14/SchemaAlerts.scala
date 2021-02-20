package typings.googleapis.v1Dot4Mod.adsenseV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaAlerts extends StObject {
  
  /**
    * The alerts returned in this list response.
    */
  var items: js.UndefOr[js.Array[SchemaAlert]] = js.native
  
  /**
    * Kind of list this is, in this case adsense#alerts.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaAlerts {
  
  @scala.inline
  def apply(): SchemaAlerts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAlerts]
  }
  
  @scala.inline
  implicit class SchemaAlertsMutableBuilder[Self <: SchemaAlerts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[SchemaAlert]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaAlert*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
