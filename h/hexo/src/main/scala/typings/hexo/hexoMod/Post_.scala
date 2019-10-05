package typings.hexo.hexoMod

import typings.hexo.hexoMod.Post.Data
import typings.hexo.hexoMod.Post.RenderData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("Post")
@js.native
trait Post_ extends js.Object {
  /**
    * Create a Post
    */
  def create(data: Data): js.Promise[Unit] = js.native
  def create(data: Data, fn: js.Function1[/* err */ js.Any, Unit]): js.Promise[Unit] = js.native
  def create(data: Data, replace: Boolean): js.Promise[Unit] = js.native
  def create(data: Data, replace: Boolean, fn: js.Function1[/* err */ js.Any, Unit]): js.Promise[Unit] = js.native
  /**
    * Publish a Draft
    */
  def publish(data: Data): js.Promise[Unit] = js.native
  def publish(data: Data, fn: js.Function1[/* err */ js.Any, Unit]): js.Promise[Unit] = js.native
  def publish(data: Data, replace: Boolean): js.Promise[Unit] = js.native
  def publish(data: Data, replace: Boolean, fn: js.Function1[/* err */ js.Any, Unit]): js.Promise[Unit] = js.native
  def render(source: js.UndefOr[scala.Nothing], data: RenderData, fn: js.Function1[/* err */ js.Any, Unit]): js.Promise[Unit] = js.native
  def render(source: String, data: RenderData, fn: js.Function1[/* err */ js.Any, Unit]): js.Promise[Unit] = js.native
  def render(source: Null, data: RenderData, fn: js.Function1[/* err */ js.Any, Unit]): js.Promise[Unit] = js.native
}

