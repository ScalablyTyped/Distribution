package typings.ibmDashMobilefirst

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object WLNs {
  type Filter = StringDictionary[String]
  type Headers = StringDictionary[String]
  type LoggerCallback = js.Function3[
    /* message */ String | js.Array[String], 
    /* level */ String, 
    /* package */ String, 
    Unit
  ]
  type ResponseHandler[T] = js.Function1[/* response */ T, Unit]
}
