package typings.invertKv

import typings.std.PropertyKey
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("invert-kv", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T /* <: Record[PropertyKey, PropertyKey] */](`object`: T): /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T as T[P] ]: keyof T extends number? std.Exclude<keyof T, number> | string : P} */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T as T[P] ]: keyof T extends number? std.Exclude<keyof T, number> | string : P} */ js.Any]
}
