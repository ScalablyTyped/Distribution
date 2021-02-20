package typings.jqueryDynatree

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DynatreeNamespace extends StObject {
  
  def getNode(element: HTMLElement): DynaTreeNode = js.native
  
  def getPersistData(cookieId: String, cookieOpts: DynaTreeCookieOptions): js.Any = js.native
  
  var version: Double = js.native
}
object DynatreeNamespace {
  
  @scala.inline
  def apply(
    getNode: HTMLElement => DynaTreeNode,
    getPersistData: (String, DynaTreeCookieOptions) => js.Any,
    version: Double
  ): DynatreeNamespace = {
    val __obj = js.Dynamic.literal(getNode = js.Any.fromFunction1(getNode), getPersistData = js.Any.fromFunction2(getPersistData), version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynatreeNamespace]
  }
  
  @scala.inline
  implicit class DynatreeNamespaceMutableBuilder[Self <: DynatreeNamespace] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetNode(value: HTMLElement => DynaTreeNode): Self = StObject.set(x, "getNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPersistData(value: (String, DynaTreeCookieOptions) => js.Any): Self = StObject.set(x, "getPersistData", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
