package typings.googleapis.jobsV3Mod.jobsV3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMendelDebugInput extends StObject {
  
  /**
    * When a request spans multiple servers, a MendelDebugInput may travel with the request and take effect in all the servers. This field is a map of namespaces to NamespacedMendelDebugInput protos. In a single server, up to two NamespacedMendelDebugInput protos are applied: 1. NamespacedMendelDebugInput with the global namespace (key == ""). 2. NamespacedMendelDebugInput with the server's namespace. When both NamespacedMendelDebugInput protos are present, they are merged. See go/mendel-debug-forcing for more details.
    */
  var namespacedDebugInput: js.UndefOr[StringDictionary[SchemaNamespacedDebugInput] | Null] = js.undefined
}
object SchemaMendelDebugInput {
  
  inline def apply(): SchemaMendelDebugInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMendelDebugInput]
  }
  
  extension [Self <: SchemaMendelDebugInput](x: Self) {
    
    inline def setNamespacedDebugInput(value: StringDictionary[SchemaNamespacedDebugInput]): Self = StObject.set(x, "namespacedDebugInput", value.asInstanceOf[js.Any])
    
    inline def setNamespacedDebugInputNull: Self = StObject.set(x, "namespacedDebugInput", null)
    
    inline def setNamespacedDebugInputUndefined: Self = StObject.set(x, "namespacedDebugInput", js.undefined)
  }
}
