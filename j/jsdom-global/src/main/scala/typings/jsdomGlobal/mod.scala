package typings.jsdomGlobal

import typings.jsdom.mod.ConstructorOptions
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsdom-global", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(): js.Function0[Unit] = js.native
  def apply(html: String): js.Function0[Unit] = js.native
  def apply(html: String, options: ConstructorOptions): js.Function0[Unit] = js.native
  def apply(html: Buffer): js.Function0[Unit] = js.native
  def apply(html: Buffer, options: ConstructorOptions): js.Function0[Unit] = js.native
}

