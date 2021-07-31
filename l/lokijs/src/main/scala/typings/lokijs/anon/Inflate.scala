package typings.lokijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Inflate extends StObject {
  
  var inflate: js.UndefOr[js.Function2[/* src */ js.Object, /* dest */ js.UndefOr[js.Object], Unit]] = js.undefined
  
  var proto: js.UndefOr[js.Any] = js.undefined
}
object Inflate {
  
  @scala.inline
  def apply(): Inflate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Inflate]
  }
  
  @scala.inline
  implicit class InflateMutableBuilder[Self <: Inflate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInflate(value: (/* src */ js.Object, /* dest */ js.UndefOr[js.Object]) => Unit): Self = StObject.set(x, "inflate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInflateUndefined: Self = StObject.set(x, "inflate", js.undefined)
    
    @scala.inline
    def setProto(value: js.Any): Self = StObject.set(x, "proto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtoUndefined: Self = StObject.set(x, "proto", js.undefined)
  }
}
