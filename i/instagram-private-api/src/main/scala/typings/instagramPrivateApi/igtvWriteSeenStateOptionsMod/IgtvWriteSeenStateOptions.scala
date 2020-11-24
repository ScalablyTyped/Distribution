package typings.instagramPrivateApi.igtvWriteSeenStateOptionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.instagramPrivateApi.anon.Viewprogresss
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgtvWriteSeenStateOptions extends js.Object {
  
  var grid_impressions: js.UndefOr[js.Array[String]] = js.native
  
  var impressions: js.UndefOr[StringDictionary[Viewprogresss]] = js.native
}
object IgtvWriteSeenStateOptions {
  
  @scala.inline
  def apply(): IgtvWriteSeenStateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgtvWriteSeenStateOptions]
  }
  
  @scala.inline
  implicit class IgtvWriteSeenStateOptionsOps[Self <: IgtvWriteSeenStateOptions] (val x: Self) extends AnyVal {
    
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
    def setGrid_impressionsVarargs(value: String*): Self = this.set("grid_impressions", js.Array(value :_*))
    
    @scala.inline
    def setGrid_impressions(value: js.Array[String]): Self = this.set("grid_impressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrid_impressions: Self = this.set("grid_impressions", js.undefined)
    
    @scala.inline
    def setImpressions(value: StringDictionary[Viewprogresss]): Self = this.set("impressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImpressions: Self = this.set("impressions", js.undefined)
  }
}
