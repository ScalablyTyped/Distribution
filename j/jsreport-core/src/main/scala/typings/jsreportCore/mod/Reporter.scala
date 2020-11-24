package typings.jsreportCore.mod

import typings.jsreportCore.anon.PartialRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Reporter extends js.Object {
  
  var afterRenderListeners: ListenerCollection = js.native
  
  var afterTemplatingEnginesExecutedListeners: ListenerCollection = js.native
  
  var beforeRenderListeners: ListenerCollection = js.native
  
  def close(): js.Promise[Unit] = js.native
  
  def createListenerCollection(): ListenerCollection = js.native
  
  def discover(): Reporter = js.native
  
  var documentStore: DocumentStore = js.native
  
  def init(): js.Promise[Reporter] = js.native
  
  var initializeListeners: ListenerCollection = js.native
  
  // it would be nice to add winston.LoggerInstance here
  // however adding import winston = require('winston') breaks exported enums
  var logger: js.Any = js.native
  
  def render(options: PartialRequest): js.Promise[Response] = js.native
  
  def use(extension: Extension): Reporter = js.native
  def use(extension: ExtensionDefinition): Reporter = js.native
  
  var validateRenderListeners: ListenerCollection = js.native
  
  var version: String = js.native
}
