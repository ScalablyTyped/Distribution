package typings.gun.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Gun {
  type AccessObject[T] = T | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof T ]: gun.gun.Gun.AlwaysDisallowedType<T[key]> extends never? never : / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias gun.gun.Gun.AccessObject<T[key]> * / object}
    */ typings.gun.gunStrings.AccessObject with org.scalablytyped.runtime.TopLevel[T])
  type AckCallback = js.Function1[/* ack */ typings.gun.anon.Err | typings.gun.anon.Ok, scala.Unit]
  /** Gun does not accept Array value, so we need extract to make types correct */
  type AllowArray[T] = typings.gun.mod.Gun.ArrayOf[T] | T
  /** These types cannot be stored on Gun */
  type AlwaysDisallowedType[T] = typings.gun.mod.Gun.AccessObject[T]
  type ArrayAsRecord[DataType] = (typings.std.Record[java.lang.String, js.Any]) | DataType
  type ArrayOf[T] = js.Any
  type DisallowArray[T] = T
  /** These types cannot be stored on Gun's root level */
  type DisallowPrimitives[Open, T] = T
  type Parameters[T /* <: js.Function1[/* repeated */ js.Any, _] */] = js.Any
  type Saveable[DataType] = typings.std.Partial[DataType] | java.lang.String | scala.Double | scala.Boolean | scala.Null | (typings.gun.mod.Gun.ChainReference[DataType, js.Any, typings.gun.gunBooleans.`false`])
}
