package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Expand extends StObject {
  
  var expand: js.Array[String]
  
  def onExpand(expandedKeys: js.Array[String]): Unit
  
  var property: String
}
object Expand {
  
  @scala.inline
  def apply(expand: js.Array[String], onExpand: js.Array[String] => Unit, property: String): Expand = {
    val __obj = js.Dynamic.literal(expand = expand.asInstanceOf[js.Any], onExpand = js.Any.fromFunction1(onExpand), property = property.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expand]
  }
  
  @scala.inline
  implicit class ExpandMutableBuilder[Self <: Expand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpand(value: js.Array[String]): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandVarargs(value: String*): Self = StObject.set(x, "expand", js.Array(value :_*))
    
    @scala.inline
    def setOnExpand(value: js.Array[String] => Unit): Self = StObject.set(x, "onExpand", js.Any.fromFunction1(value))
    
    @scala.inline
    def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
  }
}
