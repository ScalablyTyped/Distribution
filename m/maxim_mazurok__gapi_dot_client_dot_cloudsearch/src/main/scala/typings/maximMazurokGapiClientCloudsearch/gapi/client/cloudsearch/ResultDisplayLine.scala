package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultDisplayLine extends StObject {
  
  var fields: js.UndefOr[js.Array[ResultDisplayField]] = js.undefined
}
object ResultDisplayLine {
  
  inline def apply(): ResultDisplayLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultDisplayLine]
  }
  
  extension [Self <: ResultDisplayLine](x: Self) {
    
    inline def setFields(value: js.Array[ResultDisplayField]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: ResultDisplayField*): Self = StObject.set(x, "fields", js.Array(value*))
  }
}
