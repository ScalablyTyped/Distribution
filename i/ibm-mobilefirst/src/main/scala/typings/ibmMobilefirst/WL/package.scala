package typings.ibmMobilefirst

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object WL {
  type Filter = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type Headers = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type LoggerCallback = js.Function3[
    /* message */ java.lang.String | js.Array[java.lang.String], 
    /* level */ java.lang.String, 
    /* package */ java.lang.String, 
    scala.Unit
  ]
  type ResponseHandler[T] = js.Function1[/* response */ T, scala.Unit]
}
