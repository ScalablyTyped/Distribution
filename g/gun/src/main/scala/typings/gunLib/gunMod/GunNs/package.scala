package typings
package gunLib.gunMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object GunNs {
  type AccessObject[T] = T | (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in keyof T ]: any}
    */ gunLib.gunLibStrings.AccessObject with js.Any)
  type AckCallback = js.Function1[/* ack */ gunLib.Anon_Err | gunLib.Anon_ErrOk, scala.Unit]
  /** Gun does not accept Array value, so we need extract to make types correct */
  type AllowArray[T] = ArrayOf[T] | T
  /** These types cannot be stored on Gun */
  type AlwaysDisallowedType[T] = AccessObject[T]
  type ArrayAsRecord[DataType] = (stdLib.Record[java.lang.String, js.Any]) | DataType
  type ArrayOf[T] = js.Any
  /**
    * options['module name'] allows you to pass options to a 3rd party module.
    * Their project README will likely list the exposed options
    * https://github.com/amark/gun/wiki/Modules
    */
  type ConstructorOptions = stdLib.Partial[gunLib.Anon_File]
  type CryptoKeyPair = stdLib.Record[
    gunLib.gunLibStrings.pub | gunLib.gunLibStrings.priv | gunLib.gunLibStrings.epub | gunLib.gunLibStrings.epriv, 
    java.lang.String
  ]
  type DisallowArray[T] = T
  /** These types cannot be stored on Gun's root level */
  type DisallowPrimitives[Open, T] = T
  type Parameters[T /* <: js.Function1[/* repeated */ js.Any, _] */] = js.Any
  type Saveable[DataType] = stdLib.Partial[DataType] | java.lang.String | scala.Double | scala.Boolean | scala.Null | (ChainReference[DataType, js.Any, gunLib.gunLibNumbers.`false`])
}
