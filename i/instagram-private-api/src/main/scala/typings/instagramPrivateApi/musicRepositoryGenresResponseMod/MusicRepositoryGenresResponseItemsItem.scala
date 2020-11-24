package typings.instagramPrivateApi.musicRepositoryGenresResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MusicRepositoryGenresResponseItemsItem extends js.Object {
  
  var genre: MusicRepositoryGenresResponseGenre = js.native
}
object MusicRepositoryGenresResponseItemsItem {
  
  @scala.inline
  def apply(genre: MusicRepositoryGenresResponseGenre): MusicRepositoryGenresResponseItemsItem = {
    val __obj = js.Dynamic.literal(genre = genre.asInstanceOf[js.Any])
    __obj.asInstanceOf[MusicRepositoryGenresResponseItemsItem]
  }
  
  @scala.inline
  implicit class MusicRepositoryGenresResponseItemsItemOps[Self <: MusicRepositoryGenresResponseItemsItem] (val x: Self) extends AnyVal {
    
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
    def setGenre(value: MusicRepositoryGenresResponseGenre): Self = this.set("genre", value.asInstanceOf[js.Any])
  }
}
