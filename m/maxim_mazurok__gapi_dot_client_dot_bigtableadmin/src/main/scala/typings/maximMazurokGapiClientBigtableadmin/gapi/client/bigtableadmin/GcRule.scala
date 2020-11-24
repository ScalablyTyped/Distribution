package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GcRule extends js.Object {
  
  /** Delete cells that would be deleted by every nested rule. */
  var intersection: js.UndefOr[Intersection] = js.native
  
  /** Delete cells in a column older than the given age. Values must be at least one millisecond, and will be truncated to microsecond granularity. */
  var maxAge: js.UndefOr[String] = js.native
  
  /** Delete all cells in a column except the most recent N. */
  var maxNumVersions: js.UndefOr[Double] = js.native
  
  /** Delete cells that would be deleted by any nested rule. */
  var union: js.UndefOr[Union] = js.native
}
object GcRule {
  
  @scala.inline
  def apply(): GcRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GcRule]
  }
  
  @scala.inline
  implicit class GcRuleOps[Self <: GcRule] (val x: Self) extends AnyVal {
    
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
    def setIntersection(value: Intersection): Self = this.set("intersection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntersection: Self = this.set("intersection", js.undefined)
    
    @scala.inline
    def setMaxAge(value: String): Self = this.set("maxAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAge: Self = this.set("maxAge", js.undefined)
    
    @scala.inline
    def setMaxNumVersions(value: Double): Self = this.set("maxNumVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxNumVersions: Self = this.set("maxNumVersions", js.undefined)
    
    @scala.inline
    def setUnion(value: Union): Self = this.set("union", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnion: Self = this.set("union", js.undefined)
  }
}
