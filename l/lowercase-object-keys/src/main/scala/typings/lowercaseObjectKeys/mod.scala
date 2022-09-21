package typings.lowercaseObjectKeys

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T /* <: js.Object */](`object`: T): LowercaseObjectKeysResult[T] = ^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any]).asInstanceOf[LowercaseObjectKeysResult[T]]
  
  @JSImport("lowercase-object-keys", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type LowercaseObjectKeysResult[T /* <: js.Object */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T as K extends string? std.Lowercase<K> : K ]: T[K]}
    */ typings.lowercaseObjectKeys.lowercaseObjectKeysStrings.LowercaseObjectKeysResult & TopLevel[T]
}
