package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Argument extends StObject {
  
  /** Optional. Defaults to FIXED_TYPE. */
  var argumentKind: js.UndefOr[String] = js.native
  
  /** Required unless argument_kind = ANY_TYPE. */
  var dataType: js.UndefOr[StandardSqlDataType] = js.native
  
  /** Optional. Specifies whether the argument is input or output. Can be set for procedures only. */
  var mode: js.UndefOr[String] = js.native
  
  /** Optional. The name of this argument. Can be absent for function return argument. */
  var name: js.UndefOr[String] = js.native
}
object Argument {
  
  @scala.inline
  def apply(): Argument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Argument]
  }
  
  @scala.inline
  implicit class ArgumentMutableBuilder[Self <: Argument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgumentKind(value: String): Self = StObject.set(x, "argumentKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgumentKindUndefined: Self = StObject.set(x, "argumentKind", js.undefined)
    
    @scala.inline
    def setDataType(value: StandardSqlDataType): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
