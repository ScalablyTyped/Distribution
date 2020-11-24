package typings.googleapis.v2Mod.androidpublisherV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaTesters extends js.Object {
  
  var googleGroups: js.UndefOr[js.Array[String]] = js.native
  
  var googlePlusCommunities: js.UndefOr[js.Array[String]] = js.native
}
object SchemaTesters {
  
  @scala.inline
  def apply(): SchemaTesters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTesters]
  }
  
  @scala.inline
  implicit class SchemaTestersOps[Self <: SchemaTesters] (val x: Self) extends AnyVal {
    
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
    def setGoogleGroupsVarargs(value: String*): Self = this.set("googleGroups", js.Array(value :_*))
    
    @scala.inline
    def setGoogleGroups(value: js.Array[String]): Self = this.set("googleGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoogleGroups: Self = this.set("googleGroups", js.undefined)
    
    @scala.inline
    def setGooglePlusCommunitiesVarargs(value: String*): Self = this.set("googlePlusCommunities", js.Array(value :_*))
    
    @scala.inline
    def setGooglePlusCommunities(value: js.Array[String]): Self = this.set("googlePlusCommunities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGooglePlusCommunities: Self = this.set("googlePlusCommunities", js.undefined)
  }
}
