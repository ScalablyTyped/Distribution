package typings.jspdf.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Outline extends StObject {
  
  def add(parent: Any, title: String, options: OutlineOptions): OutlineItem
}
object Outline {
  
  inline def apply(add: (Any, String, OutlineOptions) => OutlineItem): Outline = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction3(add))
    __obj.asInstanceOf[Outline]
  }
  
  extension [Self <: Outline](x: Self) {
    
    inline def setAdd(value: (Any, String, OutlineOptions) => OutlineItem): Self = StObject.set(x, "add", js.Any.fromFunction3(value))
  }
}
