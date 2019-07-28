package typings.gun.gunMod

import typings.gun.Anon_Err
import typings.gun.Anon_ErrOk
import typings.gun.Anon_File
import typings.gun.gunNumbers.`false`
import typings.gun.gunStrings.epriv
import typings.gun.gunStrings.epub
import typings.gun.gunStrings.priv
import typings.gun.gunStrings.pub
import typings.std.Partial
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object GunNs {
  type AccessObject[T] = T | (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in keyof T ]: gun.gun.Gun.AlwaysDisallowedType<T[key]> extends never? never : object}
    */ typings.gun.gunStrings.AccessObject with T)
  type AckCallback = js.Function1[/* ack */ Anon_Err | Anon_ErrOk, Unit]
  /** Gun does not accept Array value, so we need extract to make types correct */
  type AllowArray[T] = ArrayOf[T] | T
  /** These types cannot be stored on Gun */
  type AlwaysDisallowedType[T] = AccessObject[T]
  type ArrayAsRecord[DataType] = (Record[String, js.Any]) | DataType
  type ArrayOf[T] = js.Any
  /**
    * options['module name'] allows you to pass options to a 3rd party module.
    * Their project README will likely list the exposed options
    * https://github.com/amark/gun/wiki/Modules
    */
  type ConstructorOptions = Partial[Anon_File]
  type CryptoKeyPair = Record[pub | priv | epub | epriv, String]
  type DisallowArray[T] = T
  /** These types cannot be stored on Gun's root level */
  type DisallowPrimitives[Open, T] = T
  type Parameters[T /* <: js.Function1[/* repeated */ js.Any, _] */] = js.Any
  type Saveable[DataType] = Partial[DataType] | String | Double | Boolean | Null | (ChainReference[DataType, js.Any, `false`])
}
