package typings.invertKv

import org.scalablytyped.runtime.TopLevel
import typings.invertKv.invertKvStrings.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("invert-kv", JSImport.Namespace)
  @js.native
  def apply[KeyType /* <: String | Double */, ValueType /* <: String | Double | js.Symbol */](
    `object`: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in KeyType ]: ValueType}
    */ ^ with TopLevel[js.Any]
  ): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in ValueType ]: KeyType extends number? std.Exclude<KeyType, number> | string : KeyType}
    */ ^ with TopLevel[js.Any] = js.native
}
