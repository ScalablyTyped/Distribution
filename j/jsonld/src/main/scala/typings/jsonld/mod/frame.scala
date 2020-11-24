package typings.jsonld.mod

import typings.jsonld.jsonldSpecMod.Document
import typings.jsonld.jsonldSpecMod.Frame
import typings.jsonld.jsonldSpecMod.JsonLdObj
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsonld", "frame")
@js.native
object frame extends js.Object {
  
  def apply(input: Document, frame: Frame): js.Promise[JsonLdObj] = js.native
  def apply(input: Document, frame: Frame, callback: Callback[JsonLdObj]): Unit = js.native
  def apply(input: Document, frame: Frame, options: typings.jsonld.mod.Options.Frame): js.Promise[JsonLdObj] = js.native
  def apply(
    input: Document,
    frame: Frame,
    options: typings.jsonld.mod.Options.Frame,
    callback: Callback[JsonLdObj]
  ): Unit = js.native
}
