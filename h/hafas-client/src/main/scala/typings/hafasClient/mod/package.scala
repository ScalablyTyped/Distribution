package typings.hafasClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Facilities = org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Boolean]
  
  /**
    * Ids of a Stop, i.e. dhid as 'DELFI Haltestellen ID'
    */
  type Ids = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  /** Each public transportation network exposes its products as boolean properties. See {@link ProductType} */
  type Products = org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  
  type ScheduledDays = org.scalablytyped.runtime.StringDictionary[scala.Boolean]
}
