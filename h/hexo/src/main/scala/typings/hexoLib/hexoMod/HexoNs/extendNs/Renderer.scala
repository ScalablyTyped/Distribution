package typings
package hexoLib.hexoMod.HexoNs.extendNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Renderer extends js.Object {
  def register(
    srcExt: java.lang.String,
    outExt: java.lang.String,
    fn: js.Function2[
      /* data */ hexoLib.hexoMod.HexoRendererData, 
      /* options */ js.Any, 
      js.Promise[java.lang.String]
    ]
  ): scala.Unit = js.native
  def register(
    srcExt: java.lang.String,
    outExt: java.lang.String,
    fn: js.Function2[
      /* data */ hexoLib.hexoMod.HexoRendererData, 
      /* options */ js.Any, 
      js.Promise[java.lang.String]
    ],
    sync: hexoLib.hexoLibNumbers.`false`
  ): scala.Unit = js.native
  def register(
    srcExt: java.lang.String,
    outExt: java.lang.String,
    fn: js.Function2[/* data */ hexoLib.hexoMod.HexoRendererData, /* options */ js.Any, java.lang.String],
    sync: hexoLib.hexoLibNumbers.`true`
  ): scala.Unit = js.native
}

