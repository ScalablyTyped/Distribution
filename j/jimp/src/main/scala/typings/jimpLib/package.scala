package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jimpLib {
  type GenericCallback[T, U, TThis] = js.ThisFunction2[/* this */ TThis, /* err */ stdLib.Error | scala.Null, /* value */ T, U]
  type ImageCallback[U] = js.ThisFunction3[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Jimp */ /* this */ js.Any, 
    /* err */ stdLib.Error | scala.Null, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Jimp */ /* value */ js.Any, 
    /* coords */ Anon_X, 
    U
  ]
  type PrintableText = js.Any | Anon_AlignmentX
}
