package typings.iterateObject

import typings.iterateObject.iterateObjectInts.`1`
import typings.iterateObject.iterateObjectInts.`2`
import typings.iterateObject.iterateObjectInts.`3`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[O /* <: Record[String, Any] */](
    obj: O,
    // tslint:disable-next-line:unified-signatures
  fn: js.Function1[
      (/* args */ ArrayEntries[O, `1` | `2` | `3`]) | (/* args */ KeyValueEntries[O, `1` | `2` | `3`]), 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("iterate-object", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type ArrayEntries[T /* <: js.Array[Any] */, N /* <: `1` | `2` | `3` */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: N extends 1? [value: T[P]] : N extends 2? [value: T[P], index: P] : N extends 3? [value: T[P], index: P, arr: T] : never}[number] */ js.Any
  
  type KeyValueEntries[T /* <: Record[String, Any] */, N /* <: `1` | `2` | `3` */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: N extends 1? [value: T[P]] : N extends 2? [value: T[P], key: P] : N extends 3? [value: T[P], key: P, obj: T] : never}[keyof T] */ js.Any
}
