package typings.hafasClient.mod

import org.scalablytyped.runtime.StringDictionary
import typings.hafasClient.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def apply(commonProfile: Profile, userAgent: String): HafasClient = (^.asInstanceOf[js.Dynamic].apply(commonProfile.asInstanceOf[js.Any], userAgent.asInstanceOf[js.Any])).asInstanceOf[HafasClient]
inline def apply(commonProfile: Profile, userAgent: String, opt: Any): HafasClient = (^.asInstanceOf[js.Dynamic].apply(commonProfile.asInstanceOf[js.Any], userAgent.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[HafasClient]

type Facilities = StringDictionary[String | Boolean]

/**
  * Ids of a Stop, i.e. dhid as 'DELFI Haltestellen ID'
  */
type Ids = StringDictionary[String]

/** Each public transportation network exposes its products as boolean properties. See {@link ProductType} */
type Products = StringDictionary[Boolean]

type ScheduledDays = StringDictionary[Boolean]
