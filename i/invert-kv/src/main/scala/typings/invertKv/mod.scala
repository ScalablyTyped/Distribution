package typings.invertKv

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[KeyType /* <: String | Double */, ValueType /* <: String | Double | js.Symbol */](
    `object`: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in KeyType ]: ValueType}
    */ typings.invertKv.invertKvStrings.^ & TopLevel[js.Any]
  ): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in ValueType ]: KeyType extends number? std.Exclude<KeyType, number> | string : KeyType}
    */ typings.invertKv.invertKvStrings.^ & TopLevel[js.Any] = ^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in ValueType ]: KeyType extends number? std.Exclude<KeyType, number> | string : KeyType}
    */ typings.invertKv.invertKvStrings.^ & TopLevel[js.Any]]
  
  @JSImport("invert-kv", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
