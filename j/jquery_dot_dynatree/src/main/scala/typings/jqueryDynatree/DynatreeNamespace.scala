package typings.jqueryDynatree

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DynatreeNamespace extends StObject {
  
  def getNode(element: HTMLElement): DynaTreeNode
  
  def getPersistData(cookieId: String, cookieOpts: DynaTreeCookieOptions): js.Any
  
  var version: Double
}
object DynatreeNamespace {
  
  inline def apply(
    getNode: HTMLElement => DynaTreeNode,
    getPersistData: (String, DynaTreeCookieOptions) => js.Any,
    version: Double
  ): DynatreeNamespace = {
    val __obj = js.Dynamic.literal(getNode = js.Any.fromFunction1(getNode), getPersistData = js.Any.fromFunction2(getPersistData), version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynatreeNamespace]
  }
  
  extension [Self <: DynatreeNamespace](x: Self) {
    
    inline def setGetNode(value: HTMLElement => DynaTreeNode): Self = StObject.set(x, "getNode", js.Any.fromFunction1(value))
    
    inline def setGetPersistData(value: (String, DynaTreeCookieOptions) => js.Any): Self = StObject.set(x, "getPersistData", js.Any.fromFunction2(value))
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
