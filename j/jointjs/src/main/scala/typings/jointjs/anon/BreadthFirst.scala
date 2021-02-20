package typings.jointjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BreadthFirst extends StObject {
  
  var breadthFirst: js.UndefOr[Boolean] = js.native
  
  var deep: js.UndefOr[Boolean] = js.native
}
object BreadthFirst {
  
  @scala.inline
  def apply(): BreadthFirst = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BreadthFirst]
  }
  
  @scala.inline
  implicit class BreadthFirstMutableBuilder[Self <: BreadthFirst] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBreadthFirst(value: Boolean): Self = StObject.set(x, "breadthFirst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreadthFirstUndefined: Self = StObject.set(x, "breadthFirst", js.undefined)
    
    @scala.inline
    def setDeep(value: Boolean): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeepUndefined: Self = StObject.set(x, "deep", js.undefined)
  }
}
