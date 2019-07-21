package typings
package jdenticonLib.jdenticonMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a subset of `HTMLCanvasElement` to allow using incomplete canvas implementations, 
  * like `canvas-renderer`.
  */
trait JdenticonCompatibleCanvas extends js.Object {
  // HTMLCanvasElement
  val height: scala.Double
  val width: scala.Double
  @JSName("getContext")
  def getContext_2d(contextId: jdenticonLib.jdenticonLibStrings.`2d`): JdenticonCompatibleCanvasRenderingContext2D | scala.Null
}

object JdenticonCompatibleCanvas {
  @scala.inline
  def apply(
    getContext_2d: jdenticonLib.jdenticonLibStrings.`2d` => JdenticonCompatibleCanvasRenderingContext2D | scala.Null,
    height: scala.Double,
    width: scala.Double
  ): JdenticonCompatibleCanvas = {
    val __obj = js.Dynamic.literal(height = height, width = width)
    __obj.updateDynamic("getContext")(js.Any.fromFunction1(getContext_2d))
    __obj.asInstanceOf[JdenticonCompatibleCanvas]
  }
}

