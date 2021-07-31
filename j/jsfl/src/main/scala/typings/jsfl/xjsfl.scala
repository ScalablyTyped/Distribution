package typings.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait xjsfl extends StObject {
  
  def init(_this: js.Any): Unit
  
  var uri: String
}
object xjsfl {
  
  @scala.inline
  def apply(init: js.Any => Unit, uri: String): xjsfl = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction1(init), uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[xjsfl]
  }
  
  @scala.inline
  implicit class xjsflMutableBuilder[Self <: xjsfl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInit(value: js.Any => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
