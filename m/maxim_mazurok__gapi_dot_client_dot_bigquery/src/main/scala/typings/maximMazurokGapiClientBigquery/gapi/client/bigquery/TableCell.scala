package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableCell extends StObject {
  
  var v: js.UndefOr[Any] = js.undefined
}
object TableCell {
  
  inline def apply(): TableCell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableCell]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableCell] (val x: Self) extends AnyVal {
    
    inline def setV(value: Any): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    
    inline def setVUndefined: Self = StObject.set(x, "v", js.undefined)
  }
}
