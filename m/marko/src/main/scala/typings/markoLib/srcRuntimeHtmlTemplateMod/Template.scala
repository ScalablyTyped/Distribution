package typings
package markoLib.srcRuntimeHtmlTemplateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Template extends Renderable {
  var `_`: js.Any = js.native
  var ___shouldBuffer: scala.Boolean = js.native
  var meta: js.Any = js.native
  var path: java.lang.String = js.native
  def apply(path: java.lang.String, renderFunc: js.Any, options: js.Any): Template = js.native
  @JSName("createOut")
  def createOut_MTemplate(): markoLib.srcRuntimeHtmlAsyncStreamMod.AsyncStream = js.native
  @JSName("createOut")
  def createOut_MTemplate(globalData: js.Any): markoLib.srcRuntimeHtmlAsyncStreamMod.AsyncStream = js.native
  @JSName("createOut")
  def createOut_MTemplate(globalData: js.Any, writer: js.Any): markoLib.srcRuntimeHtmlAsyncStreamMod.AsyncStream = js.native
  @JSName("createOut")
  def createOut_MTemplate(globalData: js.Any, writer: js.Any, parentOut: js.Any): markoLib.srcRuntimeHtmlAsyncStreamMod.AsyncStream = js.native
  @JSName("createOut")
  def createOut_MTemplate(globalData: js.Any, writer: js.Any, parentOut: js.Any, buffer: js.Any): markoLib.srcRuntimeHtmlAsyncStreamMod.AsyncStream = js.native
  def stream(data: js.Any): Readable = js.native
}

