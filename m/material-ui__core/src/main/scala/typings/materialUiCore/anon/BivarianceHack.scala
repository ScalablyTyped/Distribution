package typings.materialUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BivarianceHack extends StObject {
  
  @JSName("bivarianceHack")
  @scala.annotation.targetName("bivarianceHack_backdropClick_escapeKeyDown")
  def bivarianceHack(event: js.Object, reason: "backdropClick" | "escapeKeyDown"): Unit
}
object BivarianceHack {
  
  inline def apply(bivarianceHack: (js.Object, "backdropClick" | "escapeKeyDown") => Unit): BivarianceHack = {
    val __obj = js.Dynamic.literal(bivarianceHack = js.Any.fromFunction2(bivarianceHack))
    __obj.asInstanceOf[BivarianceHack]
  }
  
  extension [Self <: BivarianceHack](x: Self) {
    
    inline def setBivarianceHack(value: (js.Object, "backdropClick" | "escapeKeyDown") => Unit): Self = StObject.set(x, "bivarianceHack", js.Any.fromFunction2(value))
  }
}
