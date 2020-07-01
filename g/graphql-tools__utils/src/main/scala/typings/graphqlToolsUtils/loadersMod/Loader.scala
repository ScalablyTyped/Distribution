package typings.graphqlToolsUtils.loadersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Loader[TPointer, TOptions /* <: SingleFileOptions */] extends js.Object {
  var canLoadSync: js.UndefOr[
    js.Function2[/* pointer */ TPointer, /* options */ js.UndefOr[TOptions], Boolean]
  ] = js.native
  var loadSync: js.UndefOr[
    js.Function2[/* pointer */ TPointer, /* options */ js.UndefOr[TOptions], Source | scala.Nothing]
  ] = js.native
  def canLoad(pointer: TPointer): js.Promise[Boolean] = js.native
  def canLoad(pointer: TPointer, options: TOptions): js.Promise[Boolean] = js.native
  def load(pointer: TPointer): js.Promise[Source | scala.Nothing] = js.native
  def load(pointer: TPointer, options: TOptions): js.Promise[Source | scala.Nothing] = js.native
  def loaderId(): String = js.native
}

