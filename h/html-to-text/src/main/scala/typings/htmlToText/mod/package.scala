package typings.htmlToText

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Formatter[T] = js.Function3[
    /* el */ T, 
    /* walk */ js.Function2[
      /* dom */ js.Array[js.Any], 
      /* options */ typings.htmlToText.mod.HtmlToTextOptions, 
      java.lang.String
    ], 
    /* options */ typings.htmlToText.mod.HtmlToTextOptions, 
    java.lang.String
  ]
  type LeafFormatter[T] = js.Function2[/* el */ T, /* options */ typings.htmlToText.mod.HtmlToTextOptions, java.lang.String]
}
