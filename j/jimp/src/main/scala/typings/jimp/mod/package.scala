package typings.jimp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type GenericCallback[T, U, TThis] = js.ThisFunction2[/* this */ TThis, /* err */ typings.std.Error | scala.Null, /* value */ T, U]
  type ImageCallback[U] = js.ThisFunction3[
    /* this */ typings.jimp.mod.DepreciatedJimp, 
    /* err */ typings.std.Error | scala.Null, 
    /* value */ typings.jimp.mod.DepreciatedJimp, 
    /* coords */ typings.jimp.anon.X, 
    U
  ]
  type PrintableText = js.Any | typings.jimp.anon.AlignmentX
}
