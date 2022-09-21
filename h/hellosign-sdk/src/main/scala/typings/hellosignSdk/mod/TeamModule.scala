package typings.hellosignSdk.mod

import typings.hellosignSdk.anon.PickTeamname
import typings.hellosignSdk.anon.newowneremailaddressstrin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamModule extends StObject {
  
  def addMember(options: AccountIdOrEmailRequestOptions): js.Promise[TeamResponse]
  
  def create(options: PickTeamname): js.Promise[TeamResponse]
  
  def destroy(): js.Promise[BaseResponse]
  
  def get(): js.Promise[TeamResponse]
  
  def removeMember(options: newowneremailaddressstrin): js.Promise[TeamResponse]
  
  def update(options: PickTeamname): js.Promise[TeamResponse]
}
object TeamModule {
  
  inline def apply(
    addMember: AccountIdOrEmailRequestOptions => js.Promise[TeamResponse],
    create: PickTeamname => js.Promise[TeamResponse],
    destroy: () => js.Promise[BaseResponse],
    get: () => js.Promise[TeamResponse],
    removeMember: newowneremailaddressstrin => js.Promise[TeamResponse],
    update: PickTeamname => js.Promise[TeamResponse]
  ): TeamModule = {
    val __obj = js.Dynamic.literal(addMember = js.Any.fromFunction1(addMember), create = js.Any.fromFunction1(create), destroy = js.Any.fromFunction0(destroy), get = js.Any.fromFunction0(get), removeMember = js.Any.fromFunction1(removeMember), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[TeamModule]
  }
  
  extension [Self <: TeamModule](x: Self) {
    
    inline def setAddMember(value: AccountIdOrEmailRequestOptions => js.Promise[TeamResponse]): Self = StObject.set(x, "addMember", js.Any.fromFunction1(value))
    
    inline def setCreate(value: PickTeamname => js.Promise[TeamResponse]): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    
    inline def setDestroy(value: () => js.Promise[BaseResponse]): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setGet(value: () => js.Promise[TeamResponse]): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
    
    inline def setRemoveMember(value: newowneremailaddressstrin => js.Promise[TeamResponse]): Self = StObject.set(x, "removeMember", js.Any.fromFunction1(value))
    
    inline def setUpdate(value: PickTeamname => js.Promise[TeamResponse]): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
  }
}
