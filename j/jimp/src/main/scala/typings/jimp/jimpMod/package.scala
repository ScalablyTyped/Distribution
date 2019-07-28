package typings.jimp

import typings.jimp.Anon_AlignmentX
import typings.jimp.Anon_X
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jimpMod {
  type GenericCallback[T, U, TThis] = js.ThisFunction2[/* this */ TThis, /* err */ Error | Null, /* value */ T, U]
  type ImageCallback[U] = js.ThisFunction3[/* this */ Jimp, /* err */ Error | Null, /* value */ Jimp, /* coords */ Anon_X, U]
  type PrintableText = js.Any | Anon_AlignmentX
}
