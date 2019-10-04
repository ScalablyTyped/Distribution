package typings.atJimpCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesEtcMod {
  import typings.atJimpCore.Anon_X
  import typings.node.Buffer
  import typings.std.Error

  type DecoderFn = js.Function1[/* data */ Buffer, Bitmap]
  type EncoderFn[ImageType /* <: Image */] = js.Function1[/* image */ ImageType, Buffer]
  type GenericCallback[T, U, TThis] = js.ThisFunction2[/* this */ TThis, /* err */ Error | Null, /* value */ T, U]
  type ImageCallback[jimp] = js.ThisFunction3[/* this */ jimp, /* err */ Error | Null, /* value */ jimp, /* coords */ Anon_X, js.Any]
}
