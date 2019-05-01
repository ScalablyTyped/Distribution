package typings
package jimpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jimpMod {
  type GenericCallback[T, U, TThis] = js.ThisFunction2[/* this */ TThis, /* err */ stdLib.Error | scala.Null, /* value */ T, U]
  type ImageCallback[U] = js.ThisFunction3[
    /* this */ Jimp, 
    /* err */ stdLib.Error | scala.Null, 
    /* value */ Jimp, 
    /* coords */ jimpLib.Anon_X, 
    U
  ]
  type PrintableText = js.Any | jimpLib.Anon_AlignmentX
}
