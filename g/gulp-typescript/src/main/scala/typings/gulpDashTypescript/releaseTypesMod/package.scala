package typings.gulpDashTypescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object releaseTypesMod {
  import typings.typescript.typescriptMod.CustomTransformers
  import typings.typescript.typescriptMod.Program

  type FinalTransformers = js.UndefOr[js.Function1[/* program */ js.UndefOr[Program], CustomTransformers]]
  type GetCustomTransformers = String | (js.Function1[/* program */ js.UndefOr[Program], js.UndefOr[CustomTransformers]])
}
