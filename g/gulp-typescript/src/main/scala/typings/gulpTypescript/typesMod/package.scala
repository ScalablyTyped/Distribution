package typings.gulpTypescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type FinalTransformers = js.UndefOr[
    js.Function1[
      /* program */ js.UndefOr[typings.typescript.mod.Program], 
      typings.typescript.mod.CustomTransformers
    ]
  ]
  type GetCustomTransformers = java.lang.String | (js.Function1[
    /* program */ js.UndefOr[typings.typescript.mod.Program], 
    js.UndefOr[typings.typescript.mod.CustomTransformers]
  ])
}
