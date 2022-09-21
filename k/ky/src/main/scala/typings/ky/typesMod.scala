package typings.ky

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type Mutable[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {-readonly [ P in keyof T ]: T[P]}
    */ typings.ky.kyStrings.Mutable & TopLevel[T]
  
  type ObjectEntries[T] = js.Array[
    (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: [K, T[K]]}[keyof T] */ js.Any) | (js.Tuple2[String, Any])
  ]
}
