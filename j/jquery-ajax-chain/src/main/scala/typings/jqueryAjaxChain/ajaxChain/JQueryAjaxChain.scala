package typings.jqueryAjaxChain.ajaxChain

import typings.jquery.JQuery.PromiseBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Instance members of JQueryAjaxChain
  */
@js.native
trait JQueryAjaxChain
  extends PromiseBase[js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any] {
  
  /**
    * Clears the currently queued configuration objects.
    */
  def clearQueue(): JQueryAjaxChain = js.native
  
  /**
    * Sequentially and synchronously dequeues the configuration objects enqueued via enqueue() method
    * in the order they were added, triggering the related Ajax calls.
    */
  def dequeue(): JQueryAjaxChain = js.native
  
  def enqueue(confObj: js.Array[AjaxChainConfiguration]): JQueryAjaxChain = js.native
  /**
    * Enqueues one or more configuration objects for later processing.
    */
  def enqueue(confObj: AjaxChainConfiguration): JQueryAjaxChain = js.native
}
