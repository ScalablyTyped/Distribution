package typings
package gulpDashTypescriptLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object releaseTypesMod {
  type FinalTransformers = js.UndefOr[
    js.Function1[
      /* program */ js.UndefOr[typescriptLib.typescriptMod.tsNs.Program], 
      typescriptLib.typescriptMod.tsNs.CustomTransformers
    ]
  ]
  type GetCustomTransformers = java.lang.String | (js.Function1[
    /* program */ js.UndefOr[typescriptLib.typescriptMod.tsNs.Program], 
    js.UndefOr[typescriptLib.typescriptMod.tsNs.CustomTransformers]
  ])
}
