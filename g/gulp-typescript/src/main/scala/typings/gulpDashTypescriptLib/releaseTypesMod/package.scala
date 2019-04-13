package typings
package gulpDashTypescriptLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object releaseTypesMod {
  type FinalTransformers = js.UndefOr[
    js.Function1[
      /* program */ js.UndefOr[typescriptLib.typescriptMod.Program], 
      typescriptLib.typescriptMod.CustomTransformers
    ]
  ]
  type GetCustomTransformers = java.lang.String | (js.Function1[
    /* program */ js.UndefOr[typescriptLib.typescriptMod.Program], 
    js.UndefOr[typescriptLib.typescriptMod.CustomTransformers]
  ])
}
