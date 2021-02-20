package typings.jsmediatags.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallbackType extends StObject {
  
  var onError: js.UndefOr[js.Function1[/* error */ jsmediatagsError, Unit]] = js.native
  
  def onSuccess(data: TagType): Unit = js.native
}
object CallbackType {
  
  @scala.inline
  def apply(onSuccess: TagType => Unit): CallbackType = {
    val __obj = js.Dynamic.literal(onSuccess = js.Any.fromFunction1(onSuccess))
    __obj.asInstanceOf[CallbackType]
  }
  
  @scala.inline
  implicit class CallbackTypeMutableBuilder[Self <: CallbackType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnError(value: /* error */ jsmediatagsError => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    @scala.inline
    def setOnSuccess(value: TagType => Unit): Self = StObject.set(x, "onSuccess", js.Any.fromFunction1(value))
  }
}
