package typings.ibmDashMobilefirst

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object WL {
  import org.scalablytyped.runtime.StringDictionary

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
