package typings
package heremapsLib.HNs.serviceNs.metaInfoNs.ServiceNs

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
  var formats: org.scalablytyped.runtime.StringDictionary[js.Any]
  var languages: org.scalablytyped.runtime.StringDictionary[js.Any]
  var maps: org.scalablytyped.runtime.StringDictionary[js.Any]
  var resolutions: org.scalablytyped.runtime.StringDictionary[js.Any]
  var schemes: org.scalablytyped.runtime.StringDictionary[js.Any]
  var tiletypes: org.scalablytyped.runtime.StringDictionary[js.Any]
}

object Info {
  @scala.inline
  def apply(
    formats: org.scalablytyped.runtime.StringDictionary[js.Any],
    languages: org.scalablytyped.runtime.StringDictionary[js.Any],
    maps: org.scalablytyped.runtime.StringDictionary[js.Any],
    resolutions: org.scalablytyped.runtime.StringDictionary[js.Any],
    schemes: org.scalablytyped.runtime.StringDictionary[js.Any],
    tiletypes: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): Info = {
    val __obj = js.Dynamic.literal(formats = formats, languages = languages, maps = maps, resolutions = resolutions, schemes = schemes, tiletypes = tiletypes)
  
    __obj.asInstanceOf[Info]
  }
}

