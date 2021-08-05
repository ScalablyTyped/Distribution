package typings.ibmMobilefirst.WL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Item extends StObject {
  
  def setEnabled(isEnable: String): Unit
  
  def setImagePath(imagePath: String): Unit
  
  def setTitle(title: String): Unit
}
object Item {
  
  inline def apply(setEnabled: String => Unit, setImagePath: String => Unit, setTitle: String => Unit): Item = {
    val __obj = js.Dynamic.literal(setEnabled = js.Any.fromFunction1(setEnabled), setImagePath = js.Any.fromFunction1(setImagePath), setTitle = js.Any.fromFunction1(setTitle))
    __obj.asInstanceOf[Item]
  }
  
  extension [Self <: Item](x: Self) {
    
    inline def setSetEnabled(value: String => Unit): Self = StObject.set(x, "setEnabled", js.Any.fromFunction1(value))
    
    inline def setSetImagePath(value: String => Unit): Self = StObject.set(x, "setImagePath", js.Any.fromFunction1(value))
    
    inline def setSetTitle(value: String => Unit): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
  }
}
