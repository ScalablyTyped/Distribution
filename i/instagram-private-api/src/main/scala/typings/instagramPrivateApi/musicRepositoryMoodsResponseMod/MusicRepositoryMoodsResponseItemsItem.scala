package typings.instagramPrivateApi.musicRepositoryMoodsResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MusicRepositoryMoodsResponseItemsItem extends js.Object {
  
  var mood: MusicRepositoryMoodsResponseMood = js.native
}
object MusicRepositoryMoodsResponseItemsItem {
  
  @scala.inline
  def apply(mood: MusicRepositoryMoodsResponseMood): MusicRepositoryMoodsResponseItemsItem = {
    val __obj = js.Dynamic.literal(mood = mood.asInstanceOf[js.Any])
    __obj.asInstanceOf[MusicRepositoryMoodsResponseItemsItem]
  }
  
  @scala.inline
  implicit class MusicRepositoryMoodsResponseItemsItemOps[Self <: MusicRepositoryMoodsResponseItemsItem] (val x: Self) extends AnyVal {
    
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
    def setMood(value: MusicRepositoryMoodsResponseMood): Self = this.set("mood", value.asInstanceOf[js.Any])
  }
}
