package typings.hafasClient.mod

import org.scalablytyped.runtime.StringDictionary
import typings.hafasClient.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def createClient(commonProfile: Profile, userAgent: String): HafasClient = (^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(commonProfile.asInstanceOf[js.Any], userAgent.asInstanceOf[js.Any])).asInstanceOf[HafasClient]
inline def createClient(commonProfile: Profile, userAgent: String, opt: Any): HafasClient = (^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(commonProfile.asInstanceOf[js.Any], userAgent.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[HafasClient]

type Facilities = StringDictionary[String | Boolean]

type Ids = StringDictionary[String]

type Products = StringDictionary[Boolean]

type ScheduledDays = StringDictionary[Boolean]
