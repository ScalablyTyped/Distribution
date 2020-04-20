package typings.markdownIt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object rendererMod {
  type RenderRule = js.Function5[
    /* tokens */ js.Array[typings.markdownIt.tokenMod.^], 
    /* idx */ scala.Double, 
    /* options */ typings.markdownIt.libMod.Options, 
    /* env */ js.Any, 
    /* self */ typings.markdownIt.rendererMod.Renderer, 
    java.lang.String
  ]
}
