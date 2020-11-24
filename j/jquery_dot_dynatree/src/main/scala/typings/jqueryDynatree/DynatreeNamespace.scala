package typings.jqueryDynatree

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DynatreeNamespace extends js.Object {
  
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
  implicit class DynatreeNamespaceOps[Self <: DynatreeNamespace] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetNode(value: HTMLElement => DynaTreeNode): Self = this.set("getNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPersistData(value: (String, DynaTreeCookieOptions) => js.Any): Self = this.set("getPersistData", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
  }
}
