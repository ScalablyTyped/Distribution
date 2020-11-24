package typings.looksSame.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result obtained from the function.
*/
@js.native
trait LooksSameResult extends js.Object {
  
  /**
    * diff bounds for not equal images
    */
  var diffBounds: js.UndefOr[CoordBounds] = js.native
  
  /**
    * diff clusters for not equal images
    */
  var diffClusters: js.UndefOr[js.Array[CoordBounds]] = js.native
  
  /**
    * true if images are equal, false - otherwise
    */
  var equal: js.UndefOr[Boolean] = js.native
}
object LooksSameResult {
  
  @scala.inline
  def apply(): LooksSameResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LooksSameResult]
  }
  
  @scala.inline
  implicit class LooksSameResultOps[Self <: LooksSameResult] (val x: Self) extends AnyVal {
    
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
    def setDiffBounds(value: CoordBounds): Self = this.set("diffBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiffBounds: Self = this.set("diffBounds", js.undefined)
    
    @scala.inline
    def setDiffClustersVarargs(value: CoordBounds*): Self = this.set("diffClusters", js.Array(value :_*))
    
    @scala.inline
    def setDiffClusters(value: js.Array[CoordBounds]): Self = this.set("diffClusters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiffClusters: Self = this.set("diffClusters", js.undefined)
    
    @scala.inline
    def setEqual(value: Boolean): Self = this.set("equal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEqual: Self = this.set("equal", js.undefined)
  }
}
