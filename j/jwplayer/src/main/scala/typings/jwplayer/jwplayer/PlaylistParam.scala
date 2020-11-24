package typings.jwplayer.jwplayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaylistParam extends js.Object {
  
  var playlist: js.Array[_] = js.native
}
object PlaylistParam {
  
  @scala.inline
  def apply(playlist: js.Array[_]): PlaylistParam = {
    val __obj = js.Dynamic.literal(playlist = playlist.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaylistParam]
  }
  
  @scala.inline
  implicit class PlaylistParamOps[Self <: PlaylistParam] (val x: Self) extends AnyVal {
    
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
    def setPlaylistVarargs(value: js.Any*): Self = this.set("playlist", js.Array(value :_*))
    
    @scala.inline
    def setPlaylist(value: js.Array[_]): Self = this.set("playlist", value.asInstanceOf[js.Any])
  }
}
