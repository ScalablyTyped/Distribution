package typings.heremaps.HNs.serviceNs.metaInfoNs.ServiceNs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @property maps {Object<string, Object>} -
  * @property schemes {Object<string, Object>} -
  * @property tiletypes {Object<string, Object>} -
  * @property formats {Object<string, Object>} -
  * @property resolutions {Object<string, Object>} -
  * @property languages {Object<string, Object>} -
  */
trait Info extends js.Object {
  var formats: StringDictionary[js.Any]
  var languages: StringDictionary[js.Any]
  var maps: StringDictionary[js.Any]
  var resolutions: StringDictionary[js.Any]
  var schemes: StringDictionary[js.Any]
  var tiletypes: StringDictionary[js.Any]
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
    val __obj = js.Dynamic.literal(formats = formats, languages = languages, maps = maps, resolutions = resolutions, schemes = schemes, tiletypes = tiletypes)
  
    __obj.asInstanceOf[Info]
  }
}

