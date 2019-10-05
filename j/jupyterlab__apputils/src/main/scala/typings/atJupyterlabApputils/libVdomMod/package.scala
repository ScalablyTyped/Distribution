package typings.atJupyterlabApputils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libVdomMod {
  import typings.atJupyterlabApputils.libVdomMod.VDomRenderer.IModel
  import typings.react.reactMod.ReactElement

  type ReactRenderElement = js.Array[ReactElement] | ReactElement
  type VDomRenderer[T /* <: IModel | Null */] = VDomRenderer_[T]
}
