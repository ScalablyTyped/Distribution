package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Argument extends StObject {
  
  /** Optional. Defaults to FIXED_TYPE. */
  var argumentKind: js.UndefOr[String] = js.undefined
  
  /** Required unless argument_kind = ANY_TYPE. */
  var dataType: js.UndefOr[StandardSqlDataType] = js.undefined
  
  /** Optional. Specifies whether the argument is input or output. Can be set for procedures only. */
  var mode: js.UndefOr[String] = js.undefined
  
  /** Optional. The name of this argument. Can be absent for function return argument. */
  var name: js.UndefOr[String] = js.undefined
}
object Argument {
  
  inline def apply(): Argument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Argument]
  }
  
  extension [Self <: Argument](x: Self) {
    
    inline def setArgumentKind(value: String): Self = StObject.set(x, "argumentKind", value.asInstanceOf[js.Any])
    
    inline def setArgumentKindUndefined: Self = StObject.set(x, "argumentKind", js.undefined)
    
    inline def setDataType(value: StandardSqlDataType): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
