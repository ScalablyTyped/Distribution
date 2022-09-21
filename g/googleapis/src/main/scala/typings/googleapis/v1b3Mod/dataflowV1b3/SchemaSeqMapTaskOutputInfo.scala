package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSeqMapTaskOutputInfo extends StObject {
  
  /**
    * The sink to write the output value to.
    */
  var sink: js.UndefOr[SchemaSink] = js.undefined
  
  /**
    * The id of the TupleTag the user code will tag the output value by.
    */
  var tag: js.UndefOr[String | Null] = js.undefined
}
object SchemaSeqMapTaskOutputInfo {
  
  inline def apply(): SchemaSeqMapTaskOutputInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSeqMapTaskOutputInfo]
  }
  
  extension [Self <: SchemaSeqMapTaskOutputInfo](x: Self) {
    
    inline def setSink(value: SchemaSink): Self = StObject.set(x, "sink", value.asInstanceOf[js.Any])
    
    inline def setSinkUndefined: Self = StObject.set(x, "sink", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagNull: Self = StObject.set(x, "tag", null)
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
