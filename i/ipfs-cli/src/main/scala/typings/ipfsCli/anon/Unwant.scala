package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Unwant extends StObject {
  
  def stat(): js.Promise[scala.Nothing]
  
  def unwant(): js.Promise[scala.Nothing]
  
  def wantlist(): js.Promise[scala.Nothing]
  
  def wantlistForPeer(): js.Promise[scala.Nothing]
}
object Unwant {
  
  @scala.inline
  def apply(
    stat: () => js.Promise[scala.Nothing],
    unwant: () => js.Promise[scala.Nothing],
    wantlist: () => js.Promise[scala.Nothing],
    wantlistForPeer: () => js.Promise[scala.Nothing]
  ): Unwant = {
    val __obj = js.Dynamic.literal(stat = js.Any.fromFunction0(stat), unwant = js.Any.fromFunction0(unwant), wantlist = js.Any.fromFunction0(wantlist), wantlistForPeer = js.Any.fromFunction0(wantlistForPeer))
    __obj.asInstanceOf[Unwant]
  }
  
  @scala.inline
  implicit class UnwantMutableBuilder[Self <: Unwant] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStat(value: () => js.Promise[scala.Nothing]): Self = StObject.set(x, "stat", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUnwant(value: () => js.Promise[scala.Nothing]): Self = StObject.set(x, "unwant", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWantlist(value: () => js.Promise[scala.Nothing]): Self = StObject.set(x, "wantlist", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWantlistForPeer(value: () => js.Promise[scala.Nothing]): Self = StObject.set(x, "wantlistForPeer", js.Any.fromFunction0(value))
  }
}
