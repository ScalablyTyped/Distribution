package typings.marko.srcRuntimeHtmlTemplateMod

import typings.marko.srcRuntimeHtmlAsyncStreamMod.AsyncStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Template extends Renderable {
  var `_`: js.Any = js.native
  var ___shouldBuffer: Boolean = js.native
  var meta: js.Any = js.native
  var path: String = js.native
  def apply(path: String, renderFunc: js.Any, options: js.Any): Template = js.native
  @JSName("createOut")
  def createOut_MTemplate(): AsyncStream = js.native
  @JSName("createOut")
  def createOut_MTemplate(globalData: js.Any): AsyncStream = js.native
  @JSName("createOut")
  def createOut_MTemplate(globalData: js.Any, writer: js.Any): AsyncStream = js.native
  @JSName("createOut")
  def createOut_MTemplate(globalData: js.Any, writer: js.Any, parentOut: js.Any): AsyncStream = js.native
  @JSName("createOut")
  def createOut_MTemplate(globalData: js.Any, writer: js.Any, parentOut: js.Any, buffer: js.Any): AsyncStream = js.native
  def stream(data: js.Any): Readable = js.native
}

