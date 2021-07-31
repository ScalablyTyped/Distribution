package typings.grommet.anon

import typings.grommet.baseMod.ExtendProps
import typings.grommet.baseMod.ExtendType
import typings.grommet.baseMod.ExtendValue
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Thumb extends StObject {
  
  var extend: js.UndefOr[ExtendType[Record[String, js.Any]]] = js.undefined
  
  var thumb: js.UndefOr[`3`] = js.undefined
  
  var track: js.UndefOr[Upper] = js.undefined
}
object Thumb {
  
  @scala.inline
  def apply(): Thumb = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Thumb]
  }
  
  @scala.inline
  implicit class ThumbMutableBuilder[Self <: Thumb] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: ExtendType[Record[String, js.Any]]): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendFunction1(value: /* props */ ExtendProps[Record[String, js.Any]] => ExtendValue[Record[String, js.Any]]): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
    
    @scala.inline
    def setThumb(value: `3`): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbUndefined: Self = StObject.set(x, "thumb", js.undefined)
    
    @scala.inline
    def setTrack(value: Upper): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
  }
}
