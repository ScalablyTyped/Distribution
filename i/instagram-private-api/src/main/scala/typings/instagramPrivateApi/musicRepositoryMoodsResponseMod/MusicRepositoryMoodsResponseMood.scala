package typings.instagramPrivateApi.musicRepositoryMoodsResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MusicRepositoryMoodsResponseMood extends js.Object {
  
  var cover_artwork_uri: String = js.native
  
  var id: String = js.native
  
  var name: String = js.native
}
object MusicRepositoryMoodsResponseMood {
  
  @scala.inline
  def apply(cover_artwork_uri: String, id: String, name: String): MusicRepositoryMoodsResponseMood = {
    val __obj = js.Dynamic.literal(cover_artwork_uri = cover_artwork_uri.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MusicRepositoryMoodsResponseMood]
  }
  
  @scala.inline
  implicit class MusicRepositoryMoodsResponseMoodOps[Self <: MusicRepositoryMoodsResponseMood] (val x: Self) extends AnyVal {
    
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
    def setCover_artwork_uri(value: String): Self = this.set("cover_artwork_uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
