package typings.jsmediatags.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadCallbackType extends StObject {
  
  var onError: js.UndefOr[js.Function1[/* error */ jsmediatagsError, Unit]] = js.native
  
  def onSuccess(): Unit = js.native
}
object LoadCallbackType {
  
  @scala.inline
  def apply(onSuccess: () => Unit): LoadCallbackType = {
    val __obj = js.Dynamic.literal(onSuccess = js.Any.fromFunction0(onSuccess))
    __obj.asInstanceOf[LoadCallbackType]
  }
  
  @scala.inline
  implicit class LoadCallbackTypeMutableBuilder[Self <: LoadCallbackType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnError(value: /* error */ jsmediatagsError => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    @scala.inline
    def setOnSuccess(value: () => Unit): Self = StObject.set(x, "onSuccess", js.Any.fromFunction0(value))
  }
}
