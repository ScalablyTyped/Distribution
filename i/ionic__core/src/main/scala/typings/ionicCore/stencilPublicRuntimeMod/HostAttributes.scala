package typings.ionicCore.stencilPublicRuntimeMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Host
  */
@js.native
trait HostAttributes
  extends /* prop */ StringDictionary[js.Any] {
  
  var `class`: js.UndefOr[String | StringDictionary[Boolean]] = js.native
  
  var ref: js.UndefOr[js.Function1[/* el */ HTMLElement | Null, Unit]] = js.native
  
  var style: js.UndefOr[StringDictionary[js.UndefOr[String]]] = js.native
}
object HostAttributes {
  
  @scala.inline
  def apply(): HostAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostAttributes]
  }
  
  @scala.inline
  implicit class HostAttributesMutableBuilder[Self <: HostAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClass(value: String | StringDictionary[Boolean]): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
    
    @scala.inline
    def setRef(value: /* el */ HTMLElement | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    @scala.inline
    def setStyle(value: StringDictionary[js.UndefOr[String]]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
