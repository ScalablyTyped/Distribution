package typings.maximMazurokGapiClientBooks.gapi.client.books

import typings.maximMazurokGapiClientBooks.anon.Bannerwithcontentcontainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Discoveryclusters extends js.Object {
  
  var clusters: js.UndefOr[js.Array[Bannerwithcontentcontainer]] = js.native
  
  /** Resorce type. */
  var kind: js.UndefOr[String] = js.native
  
  var totalClusters: js.UndefOr[Double] = js.native
}
object Discoveryclusters {
  
  @scala.inline
  def apply(): Discoveryclusters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Discoveryclusters]
  }
  
  @scala.inline
  implicit class DiscoveryclustersOps[Self <: Discoveryclusters] (val x: Self) extends AnyVal {
    
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
    def setClustersVarargs(value: Bannerwithcontentcontainer*): Self = this.set("clusters", js.Array(value :_*))
    
    @scala.inline
    def setClusters(value: js.Array[Bannerwithcontentcontainer]): Self = this.set("clusters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusters: Self = this.set("clusters", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setTotalClusters(value: Double): Self = this.set("totalClusters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalClusters: Self = this.set("totalClusters", js.undefined)
  }
}
