package typings.jupyterlabCompleter.handlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object CompletionHandler {
  
  /**
    * Type alias for ICompletionItem list.
    * Implementers of this interface should be responsible for
    * deduping and sorting the items in the list.
    */
  type ICompletionItems = js.Array[typings.jupyterlabCompleter.handlerMod.CompletionHandler.ICompletionItem]
  
  type ICompletionItemsConnector = (typings.jupyterlabStatedb.interfacesMod.IDataConnector[
    typings.jupyterlabCompleter.handlerMod.CompletionHandler.ICompletionItemsReply, 
    scala.Unit, 
    typings.jupyterlabCompleter.handlerMod.CompletionHandler.IRequest, 
    java.lang.String
  ]) with typings.jupyterlabCompleter.handlerMod.CompletionHandler.ICompleterConnecterResponseType
}
