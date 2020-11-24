package typings.heremaps.H.service.MapTileService

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @property maps {Object<string, Object>} -
  * @property schemes {Object<string, Object>} -
  * @property tiletypes {Object<string, Object>} -
  * @property formats {Object<string, Object>} -
  * @property resolutions {Object<string, Object>} -
  * @property languages {Object<string, Object>} -
  */
@js.native
trait Info extends js.Object {
  
  var formats: StringDictionary[js.Any] = js.native
  
  var languages: StringDictionary[js.Any] = js.native
  
  var maps: StringDictionary[js.Any] = js.native
  
  var resolutions: StringDictionary[js.Any] = js.native
  
  var schemes: StringDictionary[js.Any] = js.native
  
  var tiletypes: StringDictionary[js.Any] = js.native
}
object Info {
  
  @scala.inline
  def apply(
    formats: StringDictionary[js.Any],
    languages: StringDictionary[js.Any],
    maps: StringDictionary[js.Any],
    resolutions: StringDictionary[js.Any],
    schemes: StringDictionary[js.Any],
    tiletypes: StringDictionary[js.Any]
  ): Info = {
    val __obj = js.Dynamic.literal(formats = formats.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], maps = maps.asInstanceOf[js.Any], resolutions = resolutions.asInstanceOf[js.Any], schemes = schemes.asInstanceOf[js.Any], tiletypes = tiletypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Info]
  }
  
  @scala.inline
  implicit class InfoOps[Self <: Info] (val x: Self) extends AnyVal {
    
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
    def setFormats(value: StringDictionary[js.Any]): Self = this.set("formats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguages(value: StringDictionary[js.Any]): Self = this.set("languages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaps(value: StringDictionary[js.Any]): Self = this.set("maps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolutions(value: StringDictionary[js.Any]): Self = this.set("resolutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemes(value: StringDictionary[js.Any]): Self = this.set("schemes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTiletypes(value: StringDictionary[js.Any]): Self = this.set("tiletypes", value.asInstanceOf[js.Any])
  }
}
