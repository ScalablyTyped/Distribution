package typings.hyphen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object commonMod {
  type HyphenationFunctionAsync = js.Function2[
    /* text */ java.lang.String, 
    /* options */ js.UndefOr[typings.hyphen.anon.ReadonlyHyphenationOption], 
    js.Promise[java.lang.String]
  ]
  type HyphenationFunctionSync = js.Function2[
    /* text */ java.lang.String, 
    /* options */ js.UndefOr[typings.hyphen.anon.ReadonlyHyphenationOption], 
    java.lang.String
  ]
}
