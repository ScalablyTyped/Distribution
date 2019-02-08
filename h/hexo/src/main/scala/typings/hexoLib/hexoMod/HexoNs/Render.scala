package typings
package hexoLib.hexoMod.HexoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Render extends js.Object {
  /**
    * Get the Output Extension
    */
  def getOutput(path: java.lang.String): java.lang.String = js.native
  /**
    * Check whether a file is renderable synchronously.
    */
  def isRenderable(path: java.lang.String): scala.Boolean = js.native
  /**
    * Check whether a file is renderable.
    */
  def isRenderableSync(path: java.lang.String): scala.Boolean = js.native
  def render(data: hexoLib.hexoMod.HexoNs.RenderNs.Data): js.Promise[java.lang.String] = js.native
  def render(
    data: hexoLib.hexoMod.HexoNs.RenderNs.Data,
    fn: js.Function2[/* err */ js.Any, /* result */ java.lang.String, scala.Unit]
  ): js.Promise[java.lang.String] = js.native
  def render(data: hexoLib.hexoMod.HexoNs.RenderNs.Data, option: js.Any): js.Promise[java.lang.String] = js.native
  def render(
    data: hexoLib.hexoMod.HexoNs.RenderNs.Data,
    option: js.Any,
    fn: js.Function2[/* err */ js.Any, /* result */ java.lang.String, scala.Unit]
  ): js.Promise[java.lang.String] = js.native
  def renderSync(data: hexoLib.hexoMod.HexoNs.RenderNs.Data): java.lang.String = js.native
  def renderSync(data: hexoLib.hexoMod.HexoNs.RenderNs.Data, option: js.Any): java.lang.String = js.native
}

