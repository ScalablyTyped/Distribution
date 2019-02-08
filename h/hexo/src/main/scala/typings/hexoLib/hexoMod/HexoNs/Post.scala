package typings
package hexoLib.hexoMod.HexoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Post extends js.Object {
  /**
    * Create a Post
    */
  def create(data: hexoLib.hexoMod.HexoNs.PostNs.Data): js.Promise[scala.Unit] = js.native
  def create(data: hexoLib.hexoMod.HexoNs.PostNs.Data, fn: js.Function1[/* err */ js.Any, scala.Unit]): js.Promise[scala.Unit] = js.native
  def create(data: hexoLib.hexoMod.HexoNs.PostNs.Data, replace: scala.Boolean): js.Promise[scala.Unit] = js.native
  def create(
    data: hexoLib.hexoMod.HexoNs.PostNs.Data,
    replace: scala.Boolean,
    fn: js.Function1[/* err */ js.Any, scala.Unit]
  ): js.Promise[scala.Unit] = js.native
  /**
    * Publish a Draft
    */
  def publish(data: hexoLib.hexoMod.HexoNs.PostNs.Data): js.Promise[scala.Unit] = js.native
  def publish(data: hexoLib.hexoMod.HexoNs.PostNs.Data, fn: js.Function1[/* err */ js.Any, scala.Unit]): js.Promise[scala.Unit] = js.native
  def publish(data: hexoLib.hexoMod.HexoNs.PostNs.Data, replace: scala.Boolean): js.Promise[scala.Unit] = js.native
  def publish(
    data: hexoLib.hexoMod.HexoNs.PostNs.Data,
    replace: scala.Boolean,
    fn: js.Function1[/* err */ js.Any, scala.Unit]
  ): js.Promise[scala.Unit] = js.native
  def render(
    source: java.lang.String,
    data: hexoLib.hexoMod.HexoNs.PostNs.RenderData,
    fn: js.Function1[/* err */ js.Any, scala.Unit]
  ): js.Promise[scala.Unit] = js.native
  def render(
    source: js.UndefOr[scala.Nothing],
    data: hexoLib.hexoMod.HexoNs.PostNs.RenderData,
    fn: js.Function1[/* err */ js.Any, scala.Unit]
  ): js.Promise[scala.Unit] = js.native
  def render(
    source: scala.Null,
    data: hexoLib.hexoMod.HexoNs.PostNs.RenderData,
    fn: js.Function1[/* err */ js.Any, scala.Unit]
  ): js.Promise[scala.Unit] = js.native
}

