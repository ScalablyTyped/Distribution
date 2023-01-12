package typings.hellosignSdk.mod

import org.scalablytyped.runtime.StringDictionary
import typings.hellosignSdk.anon.PartialUnclaimedDraftRequ
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnclaimedDraftModule extends StObject {
  
  def create(options: UnclaimedDraftRequestOptions[StringDictionary[Any]]): js.Promise[UnclaimedDraftResponse]
  
  def createEmbedded(options: UnclaimedDraftRequestOptions[StringDictionary[Any]]): js.Promise[UnclaimedDraftResponse]
  
  def createEmbeddedWithTemplate(options: UnclaimedDraftRequestOptions[StringDictionary[Any]]): js.Promise[UnclaimedDraftResponse]
  
  def editAndResend(requestId: String, options: PartialUnclaimedDraftRequ): js.Promise[UnclaimedDraftResponse]
}
object UnclaimedDraftModule {
  
  inline def apply(
    create: UnclaimedDraftRequestOptions[StringDictionary[Any]] => js.Promise[UnclaimedDraftResponse],
    createEmbedded: UnclaimedDraftRequestOptions[StringDictionary[Any]] => js.Promise[UnclaimedDraftResponse],
    createEmbeddedWithTemplate: UnclaimedDraftRequestOptions[StringDictionary[Any]] => js.Promise[UnclaimedDraftResponse],
    editAndResend: (String, PartialUnclaimedDraftRequ) => js.Promise[UnclaimedDraftResponse]
  ): UnclaimedDraftModule = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), createEmbedded = js.Any.fromFunction1(createEmbedded), createEmbeddedWithTemplate = js.Any.fromFunction1(createEmbeddedWithTemplate), editAndResend = js.Any.fromFunction2(editAndResend))
    __obj.asInstanceOf[UnclaimedDraftModule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnclaimedDraftModule] (val x: Self) extends AnyVal {
    
    inline def setCreate(value: UnclaimedDraftRequestOptions[StringDictionary[Any]] => js.Promise[UnclaimedDraftResponse]): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    
    inline def setCreateEmbedded(value: UnclaimedDraftRequestOptions[StringDictionary[Any]] => js.Promise[UnclaimedDraftResponse]): Self = StObject.set(x, "createEmbedded", js.Any.fromFunction1(value))
    
    inline def setCreateEmbeddedWithTemplate(value: UnclaimedDraftRequestOptions[StringDictionary[Any]] => js.Promise[UnclaimedDraftResponse]): Self = StObject.set(x, "createEmbeddedWithTemplate", js.Any.fromFunction1(value))
    
    inline def setEditAndResend(value: (String, PartialUnclaimedDraftRequ) => js.Promise[UnclaimedDraftResponse]): Self = StObject.set(x, "editAndResend", js.Any.fromFunction2(value))
  }
}
